from __future__ import annotations

import argparse
import inspect
import json
import os
import re
import sys
import uuid
from json import JSONDecodeError
from importlib.metadata import PackageNotFoundError, version as package_version
from pathlib import Path
from typing import Any, Callable
from urllib.parse import quote

import oci
from oci.auth.signers import SecurityTokenSigner
from oci.exceptions import ConfigFileNotFound, InvalidConfig, RequestException, ServiceError
from oci.signer import Signer, load_private_key_from_file
from oci.util import to_dict

from aidp_cli.discovery import discover_clients
from aidp_python_client import aidataplatform_dp
from aidp_python_client.aidataplatform_dp import models


DEFAULT_PROFILE = "DEFAULT"
DEFAULT_AUTH = "api_key"
PACKAGE_NAME = "aidp-cli"
DEFAULT_ENVIRONMENT_PREFIX = "aidp"
DEFAULT_ENVIRONMENT_DOMAIN = "oraclecloud.com"
ANSI_BOLD_GREEN = "\033[1;32m"
ANSI_RESET = "\033[0m"
AUTH_CHOICES = ("api_key", "security_token", "instance_principal", "resource_principal")
CONFIG_ENV_OVERRIDES = {
    "OCI_CLI_USER": "user",
    "OCI_CLI_FINGERPRINT": "fingerprint",
    "OCI_CLI_KEY_FILE": "key_file",
    "OCI_CLI_KEY_CONTENT": "key_content",
    "OCI_CLI_TENANCY": "tenancy",
    "OCI_CLI_PASSPHRASE": "pass_phrase",
    "OCI_CLI_SECURITY_TOKEN_FILE": "security_token_file",
}
CLIENTS: dict[str, type] = discover_clients(aidataplatform_dp)
SERVICE_DESCRIPTIONS: dict[str, str] = {
    "audit": "Search and manage AIDP audit logs.",
    "bundle": "Create, deploy, inspect deployment status, and purge AIDP bundles.",
    "catalog": "Create, list, refresh, update, delete, test, and manage permissions for catalogs.",
    "cluster": "Create, list, inspect, start, stop, restart, update, delete, and manage Spark clusters.",
    "credential-store": "Create, list, inspect, update, and delete data lake credentials.",
    "delta-share": "Manage delta sharing recipients, shares, permissions, recipients, and shared data assets.",
    "git-service": "Manage workspace Git repositories, branches, diffs, pull, merge, rebase, reset, and conflict resolution.",
    "ml-ops": "Manage experiments, experiment runs, registered models, model versions, metrics, parameters, tags, and artifacts.",
    "notebook": "Manage notebook content and interactive sessions inside a workspace.",
    "role": "Create, list, inspect, update, delete roles and manage role members and permissions.",
    "schema": "Manage catalogs' schemas, tables, views, permissions, refresh, inference, and PAR access.",
    "user-setting": "Create, list, inspect, update, and delete user settings.",
    "volume": "Manage volumes, directories, files, uploads, downloads, and volume permissions.",
    "workflow": "Manage jobs, job runs, task runs, output export, repair, cancel, and job permissions.",
    "workspace": "Create, list, inspect, update, delete workspaces and manage workspace permissions.",
    "workspace-object": "Manage workspace objects, object movement, upload/download PAR, listing, and permissions.",
    "wrapper": "Search and download cluster logs and summarize cluster metrics.",
}
GLOBAL_OPTIONS_REQUIRING_VALUE = {
    "--config-file",
    "--profile",
    "--auth",
    "--region",
    "--endpoint",
    "--environment-prefix",
    "--environmentprefix",
    "--environment-domain",
    "--environment-host",
    "--timeout",
    "--ai-data-platform-id",
}


class AidpHelpFormatter(argparse.RawDescriptionHelpFormatter):
    pass


class AidpArgumentParser(argparse.ArgumentParser):
    def error(self, message: str) -> None:
        if "expected one argument" in message and help_requested_after_option_value(sys.argv[1:]):
            self.print_help(sys.stdout)
            raise SystemExit(0)
        super().error(message)


class CliError(Exception):
    pass


def main(argv: list[str] | None = None) -> int:
    parser = build_parser()
    raw_argv = sys.argv[1:] if argv is None else argv
    if help_requested_after_option_value(raw_argv):
        parser.print_help(sys.stdout)
        return 0
    args = parser.parse_args(raw_argv)
    if args.auth not in AUTH_CHOICES:
        parser.error(
            f"argument --auth: invalid choice: {args.auth!r} "
            f"(choose from {', '.join(AUTH_CHOICES)})"
        )
    try:
        return args.handler(args)
    except CliError as exc:
        print(f"aidp: error: {exc}", file=sys.stderr)
        return 2
    except (ConfigFileNotFound, InvalidConfig) as exc:
        print(f"aidp: error: OCI config error: {exc}", file=sys.stderr)
        return 2
    except FileNotFoundError as exc:
        print(f"aidp: error: file not found: {exc.filename}", file=sys.stderr)
        return 2
    except PermissionError as exc:
        print(f"aidp: error: permission denied: {exc.filename}", file=sys.stderr)
        return 2
    except JSONDecodeError as exc:
        print(f"aidp: error: invalid JSON: {exc}", file=sys.stderr)
        return 2
    except RequestException as exc:
        print(f"aidp: error: request failed: {exc}", file=sys.stderr)
        return 1
    except ValueError as exc:
        print(f"aidp: error: {exc}", file=sys.stderr)
        return 2
    except ServiceError as exc:
        print(
            json.dumps(
                {
                    "status": exc.status,
                    "code": exc.code,
                    "message": exc.message,
                    "opc-request-id": exc.request_id,
                },
                indent=2,
                sort_keys=True,
            ),
            file=sys.stderr,
        )
        return int(exc.status or 1)


def build_parser() -> argparse.ArgumentParser:
    parser = AidpArgumentParser(
        prog="aidp",
        description="Call AI Data Platform data plane public APIs.",
        usage="aidp [global options] <command> [command options]",
        formatter_class=AidpHelpFormatter,
        epilog="""Examples:
  aidp services
  aidp operations workspace
  aidp --auth security_token --profile DEFAULT --region us-phoenix-1 \\
    --ai-data-platform-id <ai_data_platform_ocid> \\
    invoke workspace get_ai_data_platform_workspace \\
    --param workspace_key=<workspace_key>

Use 'aidp <command> --help' for command-specific options.""",
    )
    parser.set_defaults(handler=handle_root_help)
    parser.add_argument("--config-file", metavar="FILE", default=os.getenv("OCI_CLI_CONFIG_FILE", "~/.oci/config"), help="OCI config file path.")
    parser.add_argument("--profile", metavar="PROFILE", default=os.getenv("OCI_CLI_PROFILE", DEFAULT_PROFILE), help="OCI config profile.")
    parser.add_argument("--auth", metavar="MODE", choices=AUTH_CHOICES, default=os.getenv("OCI_CLI_AUTH", DEFAULT_AUTH), help="OCI authentication mode. Choices: api_key, security_token, instance_principal, resource_principal. Defaults to api_key.")
    parser.add_argument("--region", metavar="REGION", default=os.getenv("OCI_CLI_REGION"), help="OCI region. Defaults to the OCI config region.")
    parser.add_argument("--endpoint", metavar="URL", default=os.getenv("OCI_CLI_ENDPOINT"), help="AIDP data plane endpoint override. If scheme is omitted, https:// is used. Takes precedence over environment options.")
    parser.add_argument(
        "--environment-prefix",
        "--environmentprefix",
        metavar="PREFIX",
        default=DEFAULT_ENVIRONMENT_PREFIX,
        help=argparse.SUPPRESS,
    )
    parser.add_argument(
        "--environment-domain",
        metavar="DOMAIN",
        default=DEFAULT_ENVIRONMENT_DOMAIN,
        help=argparse.SUPPRESS,
    )
    parser.add_argument(
        "--environment-host",
        metavar="HOST",
        help=argparse.SUPPRESS,
    )
    parser.add_argument("--timeout", metavar="SECONDS", type=float, help="Connection/read timeout in seconds.")
    parser.add_argument("--ai-data-platform-id", metavar="OCID", help="Default value for operation parameter ai_data_platform_id.")
    parser.add_argument("--debug", action="store_true", help="Print request debug details to stderr before invoking the API.")
    parser.add_argument("-v", "--version", action="version", version=f"%(prog)s {cli_version()}")

    subparsers = parser.add_subparsers(dest="command", title="commands", metavar="<command>")

    services = subparsers.add_parser(
        "services",
        help="List available API services.",
        description="List available AIDP API services.",
        usage="aidp services",
    )
    services.set_defaults(handler=handle_services)

    operations = subparsers.add_parser(
        "operations",
        add_help=False,
        help="List operations for a service.",
        description="List callable operations for an AIDP service.",
        usage="aidp operations <service> [operation]",
        epilog="""Examples:
  aidp operations workspace
  aidp operations workspace get_ai_data_platform_workspace
  aidp operations workspace get_ai_data_platform_workspace --help""",
        formatter_class=AidpHelpFormatter,
    )
    operations.add_argument("service", metavar="SERVICE", nargs="?", choices=sorted(CLIENTS), help="Service name. Run 'aidp services' to list available services.")
    operations.add_argument("operation", metavar="OPERATION", nargs="?", help="Generated SDK method name.")
    operations.add_argument("-h", "--help", action="store_true", dest="operation_help", help="Show help for the service or specified operation.")
    operations.set_defaults(handler=handle_operations, parser=operations)

    invoke = subparsers.add_parser(
        "invoke",
        help="Invoke an API operation.",
        description="Invoke a generated AIDP SDK operation.",
        usage="aidp [global options] invoke <service> <operation> [operation options]",
        epilog="""Example:
  aidp --auth security_token --profile DEFAULT --region us-phoenix-1 \\
    --ai-data-platform-id <ai_data_platform_ocid> \\
    invoke workspace get_ai_data_platform_workspace \\
    --param workspace_key=<workspace_key>""",
        formatter_class=AidpHelpFormatter,
    )
    invoke.add_argument("service", metavar="SERVICE", choices=sorted(CLIENTS), help="Service name. Run 'aidp services' to list available services.")
    invoke.add_argument("operation", metavar="OPERATION", help="Generated SDK method name, for example list_ai_data_platform_workspaces.")
    invoke.add_argument(
        "--param",
        action="append",
        default=[],
        metavar="NAME=VALUE",
        help="Operation argument or optional SDK kwarg. May be repeated.",
    )
    invoke.add_argument("--body", help="JSON object used for the operation body/details parameter.")
    invoke.add_argument("--body-file", help="Path to a JSON file used for the operation body/details parameter. Use '-' for stdin.")
    invoke.add_argument("--from-json", dest="from_json", help="JSON input or file:// path containing operation parameters.")
    invoke.add_argument("--opc-request-id", help="Request ID. Generated automatically when omitted.")
    invoke.add_argument("--no-request-id", action="store_true", help="Do not add an opc_request_id kwarg automatically.")
    invoke.add_argument("--output", choices=["json", "data", "headers"], default="json")
    invoke.set_defaults(handler=handle_invoke)

    return parser


def help_requested_after_option_value(argv: list[str]) -> bool:
    for index, token in enumerate(argv):
        if token not in {"-h", "--help"} or index == 0:
            continue
        if argv[index - 1] in GLOBAL_OPTIONS_REQUIRING_VALUE:
            return True
    return False


def handle_root_help(args: argparse.Namespace) -> int:
    parser = build_parser()
    parser.print_help(sys.stdout)
    return 0


def cli_version() -> str:
    try:
        return package_version(PACKAGE_NAME)
    except PackageNotFoundError:
        return "unknown"


def handle_services(_args: argparse.Namespace) -> int:
    print("Available services:")
    for index, (service, client_cls) in enumerate(sorted(CLIENTS.items()), start=1):
        print(f"{index}. service: {format_service_name(service)} - {SERVICE_DESCRIPTIONS.get(service, class_description(client_cls))}")
    print()
    print("Hint: Start by listing generated workspace operations:")
    print("  aidp operations workspace")
    return 0


def handle_operations(args: argparse.Namespace) -> int:
    if not args.service:
        args.parser.print_help(sys.stdout)
        return 0
    client_cls = CLIENTS[args.service]
    operations = public_operations(client_cls)
    if args.operation:
        print_operation_help(args.service, args.operation)
        return 0
    if args.operation_help:
        args.parser.print_help(sys.stdout)
        return 0

    print(f"Available operations for {args.service}:")
    for index, (name, method) in enumerate(operations.items(), start=1):
        print(f"{index}. operation: {format_operation_name(name)} - {operation_description(method)}")
        parameters = operation_parameters(method)
        if parameters:
            print(f"   Params: {', '.join(parameters)}")
        print()
    print()
    print("Hint: Invoke an operation with required parameters:")
    print(invoke_example(args.service, operations))
    print()
    print("For operation-specific help and a sample command:")
    print(f"  aidp operations {args.service} {example_operation_name(operations)} --help")
    return 0


def print_operation_help(service: str, operation_name: str) -> None:
    client_cls = CLIENTS.get(service)
    if client_cls is None:
        raise CliError(f"Unknown service {service!r}. Run 'aidp services' to list available services.")
    operation = public_operations(client_cls).get(operation_name)
    if operation is None:
        raise CliError(f"{service} has no operation {operation_name!r}. Run 'aidp operations {service}'.")

    description = operation_description(operation)
    print(f"Operation: {service}.{operation_name}")
    if description:
        print(f"Description: {description}")
    print()
    print("Parameters:")
    parameters = operation_parameters(operation)
    if parameters:
        for parameter in parameters:
            print(f"  {parameter}")
    else:
        print("  none")
    print()
    print("Example:")
    print(invoke_example_for_operation(service, operation_name, operation))
    body_sample = operation_body_sample(operation)
    if body_sample is not None:
        print()
        print("Example body:")
        print(json.dumps(body_sample, indent=2))
        required_fields = operation_body_required_fields(operation)
        if required_fields:
            print()
            print("Required body fields:")
            for field in required_fields:
                print(f"  {field}")
        enum_fields = operation_body_enum_fields(operation)
        if enum_fields:
            print()
            print("Allowed body values:")
            for field, values in enum_fields.items():
                print(f"  {field}: {', '.join(str(value) for value in values)}")


def handle_invoke(args: argparse.Namespace) -> int:
    client_cls = CLIENTS[args.service]
    operation = public_operations(client_cls).get(args.operation)
    if operation is None:
        raise CliError(f"{args.service} has no operation {args.operation!r}")

    params = load_from_json_params(args.from_json)
    params.update(parse_params(args.param))
    if args.ai_data_platform_id and "ai_data_platform_id" not in params:
        params["ai_data_platform_id"] = args.ai_data_platform_id

    body = load_body(args.body, args.body_file)
    body = extract_body_from_params(operation, params, body)
    call_args, call_kwargs = bind_operation_args(operation, params, body)
    add_request_id(operation, args.operation, call_kwargs, args)
    client = build_client(client_cls, args)
    if args.debug:
        enable_request_debug(client, args.service, args.operation)
    try:
        response = operation(client, *call_args, **call_kwargs)
        print_response(response, args.output)
    finally:
        close_client(client)
    return 0


def add_request_id(
    operation: Callable[..., Any],
    operation_name: str,
    call_kwargs: dict[str, Any],
    args: argparse.Namespace,
) -> None:
    if args.opc_request_id and not operation_accepts_kwarg(operation, "opc_request_id"):
        raise CliError(f"{operation_name} does not accept opc_request_id.")
    if (
        not args.no_request_id
        and "opc_request_id" not in call_kwargs
        and operation_accepts_kwarg(operation, "opc_request_id")
    ):
        call_kwargs["opc_request_id"] = args.opc_request_id or f"aidp-cli-{uuid.uuid4()}"


def public_operations(client_cls: type) -> dict[str, Callable[..., Any]]:
    return {
        name: method
        for name, method in inspect.getmembers(client_cls, inspect.isfunction)
        if not name.startswith("_") and name != "__init__"
    }


def operation_description(operation: Callable[..., Any]) -> str:
    doc = inspect.getdoc(operation) or ""
    for line in doc.splitlines():
        stripped = line.strip()
        if not stripped:
            continue
        if stripped.startswith(":"):
            break
        return stripped.rstrip(".") + "."
    return ""


def class_description(client_cls: type) -> str:
    doc = inspect.getdoc(client_cls) or ""
    for line in doc.splitlines():
        stripped = line.strip()
        if stripped:
            return stripped.rstrip(".") + "."
    return ""


def format_service_name(service: str) -> str:
    if not sys.stdout.isatty():
        return service
    return f"{ANSI_BOLD_GREEN}{service}{ANSI_RESET}"


def format_operation_name(operation: str) -> str:
    if not sys.stdout.isatty():
        return operation
    return f"{ANSI_BOLD_GREEN}{operation}{ANSI_RESET}"


def operation_parameters(operation: Callable[..., Any]) -> list[str]:
    parameters = []
    for parameter in inspect.signature(operation).parameters.values():
        if parameter.name == "self" or parameter.kind == inspect.Parameter.VAR_KEYWORD:
            continue
        prefix = "*" if parameter.default is inspect.Parameter.empty else ""
        parameters.append(f"{prefix}{parameter.name}")
    return parameters


def invoke_example(service: str, operations: dict[str, Callable[..., Any]]) -> str:
    if not operations:
        return f"  aidp invoke {service} <operation>"

    operation_name = example_operation_name(operations)
    operation = operations[operation_name]
    lines = [
        "  aidp \\",
        "    --auth security_token \\",
        "    --profile DEFAULT \\",
        "    --region us-phoenix-1 \\",
        "    --ai-data-platform-id <ai_data_platform_ocid> \\",
        f"    invoke {service} {operation_name}",
    ]
    append_required_params(lines, operation)
    return "\n".join(lines)


def example_operation_name(operations: dict[str, Callable[..., Any]]) -> str:
    return next((name for name in operations if name.startswith("list_")), next(iter(operations)))


def invoke_example_for_operation(service: str, operation_name: str, operation: Callable[..., Any]) -> str:
    lines = [
        "  aidp \\",
        "    --auth security_token \\",
        "    --profile DEFAULT \\",
        "    --region us-phoenix-1 \\",
        "    --ai-data-platform-id <ai_data_platform_ocid> \\",
        f"    invoke {service} {operation_name}",
    ]
    append_required_params(lines, operation)
    return "\n".join(lines)


def append_required_params(lines: list[str], operation: Callable[..., Any]) -> None:
    for parameter_name in required_operation_parameters(operation):
        if parameter_name == "ai_data_platform_id":
            continue
        if is_body_parameter(parameter_name):
            lines[-1] += " \\"
            lines.append("    --body-file request.json")
            continue
        lines[-1] += " \\"
        lines.append(f"    --param {parameter_name}=<{parameter_name}>")


def operation_body_sample(operation: Callable[..., Any]) -> dict[str, Any] | list[Any] | None:
    body_parameter = operation_body_parameter(operation)
    if body_parameter is None:
        return None
    model_cls_name = body_parameter_model_name(body_parameter.name)
    return sample_for_model_name(model_cls_name)


def operation_body_required_fields(operation: Callable[..., Any]) -> list[str]:
    body_parameter = operation_body_parameter(operation)
    if body_parameter is None:
        return []
    model_cls = getattr(models, body_parameter_model_name(body_parameter.name), None)
    if model_cls is None:
        return []
    try:
        instance = model_cls()
    except Exception:
        return []
    swagger_types = getattr(instance, "swagger_types", {})
    attribute_map = getattr(instance, "attribute_map", {})
    required_attrs = required_model_attributes(model_cls, swagger_types)
    return [attribute_map.get(attr_name, attr_name) for attr_name in swagger_types if attr_name in required_attrs]


def operation_body_enum_fields(operation: Callable[..., Any]) -> dict[str, list[Any]]:
    body_parameter = operation_body_parameter(operation)
    if body_parameter is None:
        return {}
    model_cls = getattr(models, body_parameter_model_name(body_parameter.name), None)
    if model_cls is None:
        return {}
    try:
        instance = model_cls()
    except Exception:
        return {}
    attribute_map = getattr(instance, "attribute_map", {})
    enum_values = model_enum_values(model_cls)
    return {
        attribute_map.get(attr_name, attr_name): values
        for attr_name, values in enum_values.items()
    }


def operation_body_parameter(operation: Callable[..., Any]) -> inspect.Parameter | None:
    body_parameter = next(
        (
            parameter
            for parameter in inspect.signature(operation).parameters.values()
            if parameter.name != "self" and is_body_parameter(parameter.name)
        ),
        None,
    )
    return body_parameter


def body_parameter_model_name(parameter_name: str) -> str:
    model_name = parameter_name.removesuffix("_details")
    return snake_to_pascal(model_name) + "Details"


def sample_for_model_name(model_name: str, depth: int = 0, seen: set[str] | None = None) -> Any:
    if depth > 6:
        return {}
    seen = seen or set()
    if model_name in seen:
        return {}
    model_cls = getattr(models, model_name, None)
    if model_cls is None:
        return sample_for_type(model_name, depth, seen)

    try:
        instance = model_cls()
    except Exception:
        return {}

    seen.add(model_name)
    sample: dict[str, Any] = {}
    swagger_types = getattr(instance, "swagger_types", {})
    attribute_map = getattr(instance, "attribute_map", {})
    enum_values = model_enum_values(model_cls)
    for attr_name, attr_type in swagger_types.items():
        json_name = attribute_map.get(attr_name, attr_name)
        sample[json_name] = sample_for_type(
            attr_type,
            depth + 1,
            seen.copy(),
            enum_values.get(attr_name),
        )
    return sample


def sample_for_type(
    type_name: str,
    depth: int,
    seen: set[str],
    enum_values: list[Any] | None = None,
) -> Any:
    if enum_values:
        return enum_values[0]
    normalized = type_name.strip()
    if normalized.startswith("list[") and normalized.endswith("]"):
        inner_type = normalized[5:-1]
        return [sample_for_type(inner_type, depth + 1, seen)]
    if normalized.startswith("dict(") or normalized.startswith("dict["):
        return {"key": "value"}
    if normalized in {"str", "datetime"}:
        return "<string>"
    if normalized in {"int", "float"}:
        return 0
    if normalized == "bool":
        return True
    if normalized in {"object", "Any"}:
        return {}
    return sample_for_model_name(normalized, depth + 1, seen)


def required_model_attributes(model_cls: type, swagger_types: dict[str, str]) -> set[str]:
    required = set()
    for attr_name in swagger_types:
        property_obj = getattr(model_cls, attr_name, None)
        doc = inspect.getdoc(property_obj.fget) if isinstance(property_obj, property) else ""
        if "**[Required]**" in doc:
            required.add(attr_name)
    return required


def model_enum_values(model_cls: type) -> dict[str, list[Any]]:
    values_by_attr: dict[str, list[Any]] = {}
    for attr_name in dir(model_cls):
        property_obj = getattr(model_cls, attr_name, None)
        if not isinstance(property_obj, property) or property_obj.fset is None:
            continue
        try:
            source = inspect.getsource(property_obj.fset)
        except OSError:
            continue
        match = re.search(r"allowed_values\s*=\s*(\[[^\]]*\])", source)
        if not match:
            continue
        try:
            values = json.loads(match.group(1).replace("'", '"'))
        except json.JSONDecodeError:
            continue
        if isinstance(values, list) and values:
            values_by_attr[attr_name] = values
    return values_by_attr


def snake_to_pascal(value: str) -> str:
    return "".join(part.capitalize() for part in value.split("_") if part)


def required_operation_parameters(operation: Callable[..., Any]) -> list[str]:
    required = []
    for parameter in inspect.signature(operation).parameters.values():
        if parameter.name == "self" or parameter.kind == inspect.Parameter.VAR_KEYWORD:
            continue
        if parameter.default is inspect.Parameter.empty:
            required.append(parameter.name)
    return required


def parse_params(raw_params: list[str]) -> dict[str, Any]:
    params: dict[str, Any] = {}
    for raw in raw_params:
        if "=" not in raw:
            raise CliError(f"--param must be NAME=VALUE, got {raw!r}")
        name, value = raw.split("=", 1)
        name = name.strip().replace("-", "_")
        if not name:
            raise CliError(f"--param has an empty name: {raw!r}")
        params[name] = parse_value(value)
    return params


def parse_value(value: str) -> Any:
    stripped = value.strip()
    if stripped == "":
        return ""
    try:
        return json.loads(stripped)
    except json.JSONDecodeError:
        return value


def load_body(body: str | None, body_file: str | None) -> Any:
    if body and body_file:
        raise CliError("Use either --body or --body-file, not both.")
    if body_file:
        raw = sys.stdin.read() if body_file == "-" else Path(body_file).read_text(encoding="utf-8")
    elif body:
        raw = body
    else:
        return None
    try:
        return json.loads(raw)
    except json.JSONDecodeError as exc:
        raise CliError(f"Body is not valid JSON: {exc}") from exc


def load_from_json_params(from_json: str | None) -> dict[str, Any]:
    if not from_json:
        return {}
    raw = read_json_argument(from_json)
    try:
        value = json.loads(raw)
    except json.JSONDecodeError as exc:
        raise CliError(f"--from-json is not valid JSON: {exc}") from exc
    if not isinstance(value, dict):
        raise CliError("--from-json must contain a JSON object.")
    return {str(key).replace("-", "_"): item for key, item in value.items()}


def read_json_argument(value: str) -> str:
    if value == "-":
        return sys.stdin.read()
    if value.startswith("file://"):
        return Path(value.removeprefix("file://")).expanduser().read_text(encoding="utf-8")
    return value


def extract_body_from_params(operation: Callable[..., Any], params: dict[str, Any], body: Any) -> Any:
    body_param_names = [
        parameter.name
        for parameter in inspect.signature(operation).parameters.values()
        if is_body_parameter(parameter.name)
    ]
    for name in body_param_names:
        if name not in params:
            continue
        if body is not None:
            raise CliError(f"Use either --body/--body-file or --{name.replace('_', '-')}, not both.")
        return params.pop(name)
    if "body" in params:
        if body is not None:
            raise CliError("Use either --body/--body-file or body in --from-json, not both.")
        return params.pop("body")
    return body


def bind_operation_args(
    operation: Callable[..., Any],
    params: dict[str, Any],
    body: Any,
) -> tuple[list[Any], dict[str, Any]]:
    signature = inspect.signature(operation)
    positional: list[Any] = []
    kwargs: dict[str, Any] = {}
    body_consumed = False

    for parameter in signature.parameters.values():
        if parameter.name == "self":
            continue
        if parameter.kind == inspect.Parameter.VAR_KEYWORD:
            kwargs.update(params)
            params = {}
            continue

        value_present = parameter.name in params
        if value_present:
            value = params.pop(parameter.name)
        elif body is not None and not body_consumed and is_body_parameter(parameter.name):
            value = body
            body_consumed = True
        elif parameter.default is inspect.Parameter.empty:
            raise CliError(f"Missing required parameter --{parameter.name.replace('_', '-')}")
        else:
            continue

        if parameter.kind in (inspect.Parameter.POSITIONAL_ONLY, inspect.Parameter.POSITIONAL_OR_KEYWORD):
            positional.append(value)
        else:
            kwargs[parameter.name] = value

    if body is not None and not body_consumed:
        raise CliError("A body was provided, but this operation has no details/body parameter.")
    if params:
        kwargs.update(params)
    return positional, kwargs


def is_body_parameter(name: str) -> bool:
    return name.endswith("_details") or name in {"upload_file_details", "patch_session_details"}


def operation_accepts_kwarg(operation: Callable[..., Any], name: str) -> bool:
    try:
        source = inspect.getsource(operation)
    except OSError:
        return False
    return f'"{name}"' in source or f"'{name}'" in source


def load_config(args: argparse.Namespace) -> dict[str, Any]:
    if args.auth in {"instance_principal", "resource_principal"}:
        return {"region": args.region} if args.region else {}
    config = oci.config.from_file(
        file_location=os.path.expanduser(args.config_file),
        profile_name=args.profile,
    )
    apply_config_env_overrides(config)
    return config


def build_signer(config: dict[str, Any], args: argparse.Namespace) -> Any:
    if args.auth == "instance_principal":
        return oci.auth.signers.InstancePrincipalsSecurityTokenSigner()
    if args.auth == "resource_principal":
        return oci.auth.signers.get_resource_principals_signer()
    if args.auth == "security_token":
        token_file = expand_path(config.get("security_token_file"))
        if not token_file:
            raise CliError("security_token auth requires security_token_file in the OCI config profile.")
        token = Path(token_file).read_text(encoding="utf-8").strip()
        private_key = load_private_key_from_file(expand_path(config.get("key_file")), config.get("pass_phrase"))
        return SecurityTokenSigner(token=token, private_key=private_key)
    require_config_keys(config, ["tenancy", "user", "fingerprint", "key_file"], "api_key")
    return Signer(
        tenancy=config["tenancy"],
        user=config["user"],
        fingerprint=config["fingerprint"],
        private_key_file_location=expand_path(config.get("key_file")),
        pass_phrase=config.get("pass_phrase"),
        private_key_content=config.get("key_content"),
    )


def require_config_keys(config: dict[str, Any], keys: list[str], auth: str) -> None:
    missing_keys = [key for key in keys if not config.get(key)]
    if not missing_keys:
        return
    hint = ""
    if auth == "api_key" and config.get("security_token_file"):
        hint = " This profile looks like a security_token profile; retry with --auth security_token."
    raise CliError(
        f"{auth} auth requires {', '.join(keys)} in the OCI config profile. "
        f"Missing: {', '.join(missing_keys)}.{hint}"
    )


def apply_config_env_overrides(config: dict[str, Any]) -> None:
    for env_name, config_key in CONFIG_ENV_OVERRIDES.items():
        value = os.getenv(env_name)
        if value:
            config[config_key] = value


def build_client(client_cls: type, args: argparse.Namespace) -> Any:
    config = load_config(args)
    signer = build_signer(config, args)
    region = args.region or getattr(signer, "region", None) or config.get("region")
    endpoint = resolve_endpoint(
        region=region,
        endpoint=args.endpoint,
        environment_prefix=args.environment_prefix,
        environment_domain=args.environment_domain,
        environment_host=args.environment_host,
    )
    kwargs: dict[str, Any] = {"signer": signer, "service_endpoint": endpoint}
    if args.timeout is not None:
        kwargs["timeout"] = args.timeout
    return client_cls(config, **kwargs)


def resolve_endpoint(
    region: str | None,
    endpoint: str | None,
    environment_prefix: str,
    environment_domain: str,
    environment_host: str | None,
) -> str:
    if endpoint:
        return normalize_endpoint(endpoint)
    if environment_host:
        return f"https://{environment_host.strip().removeprefix('https://').removeprefix('http://').rstrip('/')}"
    if not region:
        raise CliError(
            "Set --region, --endpoint, --environment-host, or region in the OCI config profile."
        )
    return f"https://{environment_prefix}.{region}.oci.{environment_domain}".rstrip("/")


def normalize_endpoint(endpoint: str) -> str:
    stripped = endpoint.strip().rstrip("/")
    if not stripped:
        raise CliError("--endpoint cannot be empty.")
    if stripped.startswith(("https://", "http://")):
        return stripped
    return f"https://{stripped}"


def expand_path(value: str | None) -> str | None:
    return os.path.expanduser(value) if value else value


def close_client(client: Any) -> None:
    close = getattr(client, "close", None)
    if callable(close):
        close()
        return
    base_client = getattr(client, "base_client", None)
    session = getattr(base_client, "session", None)
    session_close = getattr(session, "close", None)
    if callable(session_close):
        session_close()


def enable_request_debug(client: Any, service: str, operation: str) -> None:
    base_client = getattr(client, "base_client", None)
    if base_client is None:
        return

    original_call_api = base_client.call_api

    def debug_call_api(*args: Any, **kwargs: Any) -> Any:
        debug_request(base_client, service, operation, *args, **kwargs)
        return original_call_api(*args, **kwargs)

    base_client.call_api = debug_call_api


def debug_request(base_client: Any, service: str, operation: str, *args: Any, **kwargs: Any) -> None:
    resource_path = get_call_value("resource_path", 0, args, kwargs) or ""
    method = get_call_value("method", 1, args, kwargs) or ""
    path_params = get_call_value("path_params", 2, args, kwargs) or {}
    query_params = get_call_value("query_params", 3, args, kwargs) or {}
    header_params = get_call_value("header_params", 4, args, kwargs) or {}
    body = get_call_value("body", 5, args, kwargs)

    endpoint = getattr(base_client, "endpoint", "") or ""
    base_path = getattr(base_client, "_base_path", "") or ""
    rendered_path = render_resource_path(resource_path, path_params)
    url = build_debug_url(endpoint, base_path, rendered_path)

    print("AIDP CLI debug request:", file=sys.stderr)
    print(f"  service: {service}", file=sys.stderr)
    print(f"  operation: {operation}", file=sys.stderr)
    print(f"  method: {method}", file=sys.stderr)
    print(f"  endpoint: {endpoint}", file=sys.stderr)
    print(f"  base_path: {base_path}", file=sys.stderr)
    print(f"  url: {url}", file=sys.stderr)
    print(f"  resource_path: {resource_path}", file=sys.stderr)
    print(f"  path_params: {json.dumps(path_params, sort_keys=True, default=str)}", file=sys.stderr)
    print(f"  query_params: {json.dumps(query_params, sort_keys=True, default=str)}", file=sys.stderr)
    print(f"  headers: {json.dumps(safe_headers(header_params), sort_keys=True, default=str)}", file=sys.stderr)
    print(f"  body: {body_debug_summary(body)}", file=sys.stderr)


def get_call_value(name: str, position: int, args: tuple[Any, ...], kwargs: dict[str, Any]) -> Any:
    if name in kwargs:
        return kwargs[name]
    if len(args) > position:
        return args[position]
    return None


def render_resource_path(resource_path: str, path_params: dict[str, Any]) -> str:
    rendered = resource_path
    for name, value in path_params.items():
        rendered = rendered.replace("{" + name + "}", quote(str(value), safe=""))
    return rendered


def build_debug_url(endpoint: str, base_path: str, rendered_path: str) -> str:
    endpoint = endpoint.rstrip("/")
    if base_path and endpoint.endswith(base_path):
        return f"{endpoint}{rendered_path}"
    return f"{endpoint}{base_path}{rendered_path}"


def safe_headers(header_params: dict[str, Any]) -> dict[str, Any]:
    sensitive = {"authorization", "x-content-sha256", "security-token"}
    return {
        name: ("<redacted>" if name.lower() in sensitive else value)
        for name, value in header_params.items()
    }


def body_debug_summary(body: Any) -> str:
    if body is None:
        return "none"
    if isinstance(body, dict):
        return f"json object keys={sorted(body)}"
    return type(body).__name__


def print_response(response: Any, output: str) -> None:
    print("Response:")
    if output == "headers":
        print(json.dumps(dict(getattr(response, "headers", {}) or {}), indent=2, sort_keys=True, default=str))
        return

    data = getattr(response, "data", response)
    if output == "data":
        print(json.dumps(to_dict(data), indent=2, sort_keys=True, default=str))
        return

    payload = {
        "data": to_dict(data),
        "headers": dict(getattr(response, "headers", {}) or {}),
        "status": getattr(response, "status", None),
    }
    print(json.dumps(payload, indent=2, sort_keys=True, default=str))


if __name__ == "__main__":
    raise SystemExit(main())
