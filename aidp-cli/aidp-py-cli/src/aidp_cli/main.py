# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

from __future__ import annotations

import difflib
import inspect
import json
import os
import re
import sys
import textwrap
import uuid
import warnings
from importlib.metadata import PackageNotFoundError, version as package_version
from json import JSONDecodeError
from pathlib import Path
from types import SimpleNamespace
from typing import Any, Callable
from urllib.parse import quote

import oci
from oci.auth.signers import SecurityTokenSigner
from oci.exceptions import ConfigFileNotFound, InvalidConfig, RequestException, ServiceError
from oci.signer import Signer, load_private_key_from_file
from oci.util import to_dict
from oci._vendor.requests.exceptions import RequestException as VendorRequestException

from aidp_cli.body_security import (
    body_contains_sensitive_field,
    command_has_sensitive_body_fields,
    json_body_argument_source,
)
from aidp_cli.discovery import discover_clients
from aidp_cli.manifest import (
    BodyField,
    BodyModel,
    CommandDefinition,
    CommandField,
    CommandGroup,
    CommandManifest,
    find_command,
    find_command_group,
    load_command_manifest,
)


warnings.filterwarnings(
    "ignore",
    message=r"The 'strict' parameter is no longer needed on Python 3\+.",
    category=FutureWarning,
)

DEFAULT_PROFILE = "DEFAULT"
DEFAULT_AUTH = "security_token"
PACKAGE_NAME = "aidp-cli"
DEFAULT_ENVIRONMENT_PREFIX = "aidp"
DEFAULT_ENVIRONMENT_DOMAIN = "oraclecloud.com"
DEFAULT_AIDP_CONFIG_FILE = "~/.aidp/config"
AIDP_CONFIG_DIR_MODE = 0o700
AIDP_CONFIG_FILE_MODE = 0o600
GROUP_OR_WORLD_PERMISSIONS = 0o077
MAX_BODY_EXAMPLE_DEPTH = 12
AUTH_CHOICES = ("api_key", "security_token", "instance_principal", "resource_principal")
SEARCH_ACTION_PREFIXES = (
    "checkout",
    "commit",
    "create",
    "delete",
    "deploy",
    "download",
    "export",
    "generate",
    "head",
    "list",
    "manage",
    "merge",
    "patch",
    "pull",
    "push",
    "rebase",
    "remove",
    "restart",
    "restore",
    "search",
    "start",
    "stop",
    "summarize",
    "update",
    "upload",
    "get",
)
CONFIG_ENV_OVERRIDES = {
    "OCI_CLI_USER": "user",
    "OCI_CLI_FINGERPRINT": "fingerprint",
    "OCI_CLI_KEY_FILE": "key_file",
    "OCI_CLI_KEY_CONTENT": "key_content",
    "OCI_CLI_TENANCY": "tenancy",
    "OCI_CLI_PASSPHRASE": "pass_phrase",
    "OCI_CLI_SECURITY_TOKEN_FILE": "security_token_file",
}
GLOBAL_VALUE_OPTIONS = {
    "--config-file": "config_file",
    "--profile": "profile",
    "-p": "profile",
    "--auth": "auth",
    "--region": "region",
    "--endpoint": "endpoint",
    "--environment-prefix": "environment_prefix",
    "--environmentprefix": "environment_prefix",
    "--environment-domain": "environment_domain",
    "--environment-host": "environment_host",
    "--timeout": "timeout",
    "--instance-id": "ai_data_platform_id",
}
GLOBAL_BOOLEAN_OPTIONS = {
    "--debug": "debug",
}
SKIPPED_COMMAND_FIELDS = {"opc_request_id"}
STRICT_URL_ENCODING_CLIENTS = {"NotebookClient"}
UTILITY_COMMANDS = (
    ("command-groups", "List API command groups."),
    ("search", "Search command groups and command names."),
    ("configure", "Configure local AIDP CLI defaults."),
    ("help", "Help about any command."),
    ("version", "Show CLI version."),
)
CLIENTS: dict[str, type] = {}
MANIFEST: CommandManifest | None = None
AIDP_DP_MODULE: Any = None


class CliError(Exception):
    pass


def main(argv: list[str] | None = None) -> int:
    raw_argv = sys.argv[1:] if argv is None else argv
    try:
        globals_ns, args, help_requested, version_requested = parse_global_options(raw_argv)
        if version_requested:
            print_version()
            return 0
        ensure_manifest_loaded()
        if not args:
            print_root_help()
            return 0
        return dispatch(args, globals_ns, help_requested)
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
    except VendorRequestException as exc:
        print(f"aidp: error: request failed: {exc}", file=sys.stderr)
        return 1
    except RequestException as exc:
        print(f"aidp: error: request failed: {exc}", file=sys.stderr)
        return 1
    except OSError as exc:
        print(f"aidp: error: file error: {exc}", file=sys.stderr)
        return 2
    except ValueError as exc:
        print(f"aidp: error: {exc}", file=sys.stderr)
        return 2
    except ServiceError as exc:
        print_error_response(
            {
                "status": exc.status,
                "code": exc.code,
                "message": exc.message,
                "opc-request-id": exc.request_id,
            }
        )
        return int(exc.status or 1)


def ensure_manifest_loaded() -> None:
    global MANIFEST
    if MANIFEST is not None:
        return
    try:
        MANIFEST = load_command_manifest()
    except RuntimeError as exc:
        raise CliError(str(exc)) from exc


def ensure_clients_loaded() -> None:
    global AIDP_DP_MODULE, CLIENTS
    if AIDP_DP_MODULE is not None:
        return
    try:
        from aidp_python_client import aidataplatform_dp as sdk_module
    except ImportError as exc:
        raise CliError(
            f"Unable to import aidp-python-client SDK: {exc}. Install the generated SDK wheel with aidp-cli."
        ) from exc
    AIDP_DP_MODULE = sdk_module
    CLIENTS = discover_clients(sdk_module)


def command_manifest() -> CommandManifest:
    if MANIFEST is None:
        raise CliError("AIDP command manifest is not loaded.")
    return MANIFEST


def dispatch(args: list[str], globals_ns: SimpleNamespace, help_requested: bool) -> int:
    command = args[0]
    tail = args[1:]

    if command == "help":
        return handle_help(tail, globals_ns)
    if command == "version":
        print_version()
        return 0
    if command == "command-groups":
        if help_requested:
            print_command_groups_help()
        else:
            print_command_groups()
        return 0
    if command == "search":
        if help_requested or not tail:
            print_search_help()
        else:
            handle_search(tail)
        return 0
    if command == "configure":
        if help_requested or not tail:
            print_configure_help()
        else:
            handle_configure(tail)
        return 0

    group = find_command_group(command_manifest(), command)
    if group is None:
        raise unknown_command_group(command)
    globals_ns, tail = consume_leading_global_options(tail, globals_ns)
    if not tail:
        print_group_help(group)
        return 0

    command_name = tail[0]
    command_def = find_command(group, command_name)
    if command_def is None:
        raise unknown_command_name(group, command_name)
    if help_requested:
        print_command_help(group, command_def)
        return 0
    return handle_command(group, command_def, tail[1:], globals_ns)


def handle_help(args: list[str], globals_ns: SimpleNamespace) -> int:
    if not args:
        print_root_help()
        return 0
    group = find_command_group(command_manifest(), args[0])
    if group is None:
        if args[0] == "command-groups":
            print_command_groups_help()
            return 0
        if args[0] == "search":
            print_search_help()
            return 0
        if args[0] == "configure":
            print_configure_help()
            return 0
        if args[0] == "version":
            print_version()
            return 0
        raise unknown_command_group(args[0])
    if len(args) == 1:
        print_group_help(group)
        return 0
    command_def = find_command(group, args[1])
    if command_def is None:
        raise unknown_command_name(group, args[1])
    print_command_help(group, command_def)
    return 0


def parse_global_options(argv: list[str]) -> tuple[SimpleNamespace, list[str], bool, bool]:
    values = global_defaults()
    remaining: list[str] = []
    help_requested = False
    version_requested = False
    index = 0
    command_seen = False

    while index < len(argv):
        token = argv[index]
        if token in {"-h", "--help"}:
            help_requested = True
            index += 1
            continue
        if token in {"-v", "--version"}:
            version_requested = True
            index += 1
            continue
        if not command_seen and token in GLOBAL_BOOLEAN_OPTIONS:
            values[GLOBAL_BOOLEAN_OPTIONS[token]] = True
            index += 1
            continue

        option_name, inline_value = split_inline_option(token)
        if not command_seen and option_name in GLOBAL_VALUE_OPTIONS:
            value = inline_value
            if value is None:
                if index + 1 >= len(argv):
                    raise CliError(f"{option_name} requires a value.")
                value = argv[index + 1]
                index += 1
            apply_global_option(values, option_name, value)
            index += 1
            continue
        if not command_seen and token.startswith("-"):
            raise CliError(f"Unknown option {option_name!r}.")

        remaining.append(token)
        if not token.startswith("-"):
            command_seen = True
        index += 1

    validate_global_options(values)
    return SimpleNamespace(**values), remaining, help_requested, version_requested


def validate_global_options(values: dict[str, Any]) -> None:
    if values["auth"] not in AUTH_CHOICES:
        raise CliError(
            f"argument --auth: invalid choice: {values['auth']!r} "
            f"(choose from {', '.join(AUTH_CHOICES)})"
        )


def consume_leading_global_options(
    tokens: list[str],
    globals_ns: SimpleNamespace,
) -> tuple[SimpleNamespace, list[str]]:
    values = vars(globals_ns).copy()
    remaining: list[str] = []
    index = 0

    while index < len(tokens):
        token = tokens[index]
        if token in GLOBAL_BOOLEAN_OPTIONS:
            values[GLOBAL_BOOLEAN_OPTIONS[token]] = True
            index += 1
            continue

        option_name, inline_value = split_inline_option(token)
        if option_name in GLOBAL_VALUE_OPTIONS:
            value = inline_value
            if value is None:
                if index + 1 >= len(tokens):
                    raise CliError(f"{option_name} requires a value.")
                value = tokens[index + 1]
                index += 1
            apply_global_option(values, option_name, value)
            index += 1
            continue

        remaining.extend(tokens[index:])
        break

    validate_global_options(values)
    return SimpleNamespace(**values), remaining


def global_defaults() -> dict[str, Any]:
    return {
        "config_file": os.getenv("OCI_CLI_CONFIG_FILE", "~/.oci/config"),
        "profile": os.getenv("OCI_CLI_PROFILE", DEFAULT_PROFILE),
        "auth": os.getenv("OCI_CLI_AUTH", DEFAULT_AUTH),
        "region": os.getenv("OCI_CLI_REGION"),
        "endpoint": os.getenv("OCI_CLI_ENDPOINT"),
        "environment_prefix": DEFAULT_ENVIRONMENT_PREFIX,
        "environment_domain": DEFAULT_ENVIRONMENT_DOMAIN,
        "environment_host": None,
        "timeout": None,
        "ai_data_platform_id": configured_instance_id(),
        "debug": False,
    }


def apply_global_option(values: dict[str, Any], option_name: str, value: str) -> None:
    key = GLOBAL_VALUE_OPTIONS[option_name]
    if key == "timeout":
        try:
            timeout = float(value)
        except ValueError as exc:
            raise CliError("--timeout must be a positive number of seconds.") from exc
        if timeout <= 0:
            raise CliError("--timeout must be a positive number of seconds.")
        values[key] = timeout
        return
    values[key] = value


def split_inline_option(token: str) -> tuple[str, str | None]:
    if "=" not in token:
        return token, None
    name, value = token.split("=", 1)
    return name, value


def print_root_help() -> None:
    lines = [
        "AIDP CLI",
        "",
        "Usage:",
        "  aidp <command-group> <command-name> [flags]",
        "",
        "API Command Groups:",
        *format_table((group.name, group.description) for group in command_manifest().command_groups),
        "",
        "Utility Commands:",
        *format_table(UTILITY_COMMANDS),
        "",
        "Flags:",
        *format_flags(root_flag_rows()),
        "",
        'Use "aidp <command-group> --help" for more information about a command group.',
    ]
    print("\n".join(lines))


def print_command_groups_help() -> None:
    lines = [
        "List AIDP API command groups.",
        "",
        "Usage:",
        "  aidp command-groups [flags]",
        "",
        "Flags:",
        *format_flags([("-h, --help", "help for command-groups")]),
        "",
        "Global Flags:",
        *format_flags(global_flag_rows()),
    ]
    print("\n".join(lines))


def print_command_groups() -> None:
    rows = [
        (group.name, group.description)
        for group in command_manifest().command_groups
    ]
    print("Command Groups:")
    print("\n".join(format_table(rows)))
    print()
    print('Use "aidp <command-group> --help" for command names and examples.')
    example = runnable_command_groups_example()
    if example:
        print()
        print("Example:")
        print(example)


def print_group_help(group: CommandGroup) -> None:
    lines = [
        group.description,
        "",
        "Usage:",
        f"  aidp {group.name} [flags]",
        f"  aidp {group.name} <command-name> [arguments] [flags]",
        "",
    ]
    for section, commands in grouped_commands(group).items():
        lines.append(section + ":")
        lines.extend(
            format_table((command.name, command_summary(command)) for command in commands)
        )
        lines.append("")
    lines.extend(
        [
            "Flags:",
            *format_flags([("-h, --help", f"help for {group.name}")]),
            "",
            "Global Flags:",
            *format_flags(global_flag_rows()),
            "",
            f'Use "aidp {group.name} <command-name> --help" for more information about a command.',
        ]
    )
    print("\n".join(lines))


def print_command_help(group: CommandGroup, command: CommandDefinition) -> None:
    description = command_description(command)
    lines = []
    if description:
        lines.extend(wrap_paragraph(description))
        lines.append("")

    argument_fields = command_argument_fields(command)
    usage_args = " ".join(argument_metavar(field) for field in argument_fields)
    usage_args = f" {usage_args}" if usage_args else ""
    lines.extend(
        [
            "Usage:",
            f"  aidp {group.name} {command.name}{usage_args} [flags]",
            "",
        ]
    )

    if argument_fields:
        lines.append("Arguments:")
        for field in argument_fields:
            lines.extend(format_argument(field))
        lines.append("")

    lines.append("Flags:")
    lines.extend(format_flags(command_flag_rows(command)))
    lines.append("")
    lines.append("Global Flags:")
    lines.extend(format_flags(global_flag_rows()))
    lines.append("")
    lines.append("Examples:")
    lines.extend(format_examples(group, command))

    body_sample = example_body(command)
    if body_sample is not None:
        lines.extend(["", "Example JSON:", json.dumps(body_sample, indent=2)])
    body_variants = root_body_variant_examples(command)
    if body_variants:
        lines.extend(["", "Body variants:"])
        for label, sample in body_variants:
            lines.extend(["", f"Example JSON - {label}:", json.dumps(sample, indent=2)])
    nested_variants = nested_body_variant_examples(command)
    if nested_variants:
        lines.extend(["", "Nested body variants:"])
        for path, label, sample in nested_variants:
            lines.extend(["", f"Example JSON for {path} - {label}:", json.dumps(sample, indent=2)])
    required_fields = body_required_fields(command)
    if required_fields:
        lines.extend(["", "Required JSON fields:"])
        lines.extend(f"  {field}" for field in required_fields)
    enum_fields = body_enum_fields(command)
    if enum_fields:
        lines.extend(["", "Allowed JSON values:"])
        for field, values in sorted(enum_fields.items()):
            lines.append(f"  {field}: {', '.join(str(value) for value in values)}")
    print("\n".join(lines))


def grouped_commands(group: CommandGroup) -> dict[str, list[CommandDefinition]]:
    sections: dict[str, list[CommandDefinition]] = {}
    for command in group.commands:
        sections.setdefault(command.section or "Available Commands", []).append(command)
    if "Available Commands" in sections:
        ordered = {"Available Commands": sections.pop("Available Commands")}
        ordered.update(dict(sorted(sections.items())))
        return ordered
    return dict(sorted(sections.items()))


def command_summary(command: CommandDefinition) -> str:
    summary = command.summary or command.description
    return first_sentence(summary)


def command_description(command: CommandDefinition) -> str:
    description = command.description or command.summary
    if not description:
        return ""
    description = description if description.endswith((".", "!", "?")) else f"{description}."
    if command.deprecated and not description.lower().startswith("deprecated"):
        description = f"Deprecated. {description}"
    return description


def first_sentence(value: str) -> str:
    cleaned = " ".join(str(value or "").split())
    if not cleaned:
        return ""
    for delimiter in (". ", "! ", "? "):
        if delimiter in cleaned:
            return cleaned.split(delimiter, 1)[0].rstrip(".!?") + "."
    return cleaned if cleaned.endswith((".", "!", "?")) else f"{cleaned}."


def command_argument_fields(command: CommandDefinition) -> list[CommandField]:
    return [
        field
        for field in command.fields
        if field.location == "path" and field.required and field.name != "ai_data_platform_id"
    ]


def command_option_fields(command: CommandDefinition) -> list[CommandField]:
    argument_names = {field.name for field in command_argument_fields(command)}
    return [
        field
        for field in command.fields
        if field.location != "body"
        and field.name not in SKIPPED_COMMAND_FIELDS
        and field.name != "ai_data_platform_id"
        and field.name not in argument_names
    ]


def command_flag_rows(command: CommandDefinition) -> list[tuple[str, str]]:
    rows = [("-h, --help", f"help for {command.name}")]
    for field in command_option_fields(command):
        rows.append((f"--{field.cli_name}", field_help(field)))
    if command.body_field is not None:
        body_help = (
            "inline string, @path/to/file, file:///path, or - for stdin"
            if command_uses_raw_body(command)
            else (
                "@path/to/file.json, file:///path/request.json, or - for stdin; inline JSON is blocked when it contains sensitive fields"
                if command_has_sensitive_body_fields(command)
                else "inline JSON string, @path/to/file.json, file:///path/request.json, or - for stdin"
            )
        )
        rows.append(
            (
                "--body",
                body_help,
            )
        )
    rows.extend(
        [
            ("--opc-request-id", "request ID; generated automatically when omitted"),
            ("--no-request-id", "do not add opc_request_id automatically"),
        ]
    )
    return rows


def root_flag_rows() -> list[tuple[str, str]]:
    return [
        ("--debug", "enable debug logging"),
        ("-h, --help", "help for aidp"),
        ("-p, --profile", "OCI config profile; the default profile: DEFAULT"),
        ("--auth", "OCI authentication mode; options: api_key, security_token, instance_principal, resource_principal; default: security_token"),
        ("--config-file", "OCI config file path"),
        ("--region", "OCI region"),
        ("--endpoint", "AIDP data plane endpoint override; default endpoint points to https://aidp.<region>.oci.oraclecloud.com"),
        ("--instance-id", "AIDP instance OCID"),
        ("--timeout", "connection/read timeout in seconds"),
        ("-v, --version", "version for aidp"),
    ]


def global_flag_rows() -> list[tuple[str, str]]:
    return [
        ("--debug", "enable debug logging"),
        ("-p, --profile", "OCI config profile; the default profile: DEFAULT"),
        ("--auth", "OCI authentication mode; options: api_key, security_token, instance_principal, resource_principal; default: security_token"),
        ("--config-file", "OCI config file path"),
        ("--region", "OCI region"),
        ("--endpoint", "AIDP data plane endpoint override; default endpoint points to https://aidp.<region>.oci.oraclecloud.com"),
        ("--instance-id", "AIDP instance OCID"),
        ("--timeout", "connection/read timeout in seconds"),
    ]


def format_table(rows: Any, indent: int = 2, gap: int = 2) -> list[str]:
    rows = [(name, description) for name, description in rows]
    if not rows:
        return []
    width = max(len(name) for name, _description in rows)
    formatted = []
    for name, description in rows:
        padding = " " * max(gap, width - len(name) + gap)
        formatted.append(f"{' ' * indent}{name}{padding}{description}")
    return formatted


def format_flags(rows: list[tuple[str, str]]) -> list[str]:
    return format_table(rows, indent=2, gap=2)


def wrap_paragraph(value: str, indent: int = 0) -> list[str]:
    prefix = " " * indent
    return textwrap.wrap(value, width=88, initial_indent=prefix, subsequent_indent=prefix) or [prefix]


def format_argument(field: CommandField) -> list[str]:
    label = f"  {argument_metavar(field)}:"
    description = field.description or "Required command argument."
    wrapped = textwrap.wrap(description, width=78, initial_indent=label + " ", subsequent_indent=" " * len(label) + " ")
    return wrapped or [label]


def field_help(field: CommandField) -> str:
    parts = []
    description = field.description
    if field.enum_values:
        description = strip_allowed_values_description(description)
    if description:
        parts.append(description.rstrip(".") + ".")
    if field.required:
        parts.append("Required.")
    if field.enum_values:
        parts.append("Allowed values: " + ", ".join(str(value) for value in field.enum_values) + ".")
    return " ".join(parts) if parts else ("Required." if field.required else "")


def strip_allowed_values_description(value: str) -> str:
    return re.sub(
        r"\s*Allowed values(?:\s+are)?:\s*[^.]+\.?$",
        "",
        value.strip(),
        flags=re.IGNORECASE,
    ).strip()


def argument_metavar(field: CommandField) -> str:
    return field.cli_name.replace("-", "_").upper()


def format_examples(group: CommandGroup, command: CommandDefinition) -> list[str]:
    base = f"  aidp {group.name} {command.name}"
    for field in command_argument_fields(command):
        base += f" <{field.cli_name.replace('-', '_')}>"
    if command_requires_instance_id(command):
        base += " --instance-id <ocid>"
    if command.body_field is not None:
        base += " --body @request.json"
    return [base]


def runnable_command_groups_example() -> str:
    candidates: list[tuple[tuple[int, int, int, str, str], CommandGroup, CommandDefinition]] = []
    for group in command_manifest().command_groups:
        for command in group.commands:
            argument_count = len(command_argument_fields(command))
            body_count = 1 if command.body_field is not None else 0
            action_rank = 0 if command.name.startswith("list-") else 1
            candidates.append(
                (
                    (body_count, argument_count, action_rank, group.name, command.name),
                    group,
                    command,
                )
            )

    if not candidates:
        return ""
    _rank, group, command = min(candidates, key=lambda candidate: candidate[0])
    return format_examples(group, command)[0]


def command_requires_instance_id(command: CommandDefinition) -> bool:
    return any(field.name == "ai_data_platform_id" and field.required for field in command.fields)


def handle_command(
    group: CommandGroup,
    command: CommandDefinition,
    tokens: list[str],
    globals_ns: SimpleNamespace,
) -> int:
    try:
        invocation = parse_command_options(group, command, tokens, globals_ns)
    except CliError as exc:
        raise with_command_usage_hint(group, command, exc) from exc

    ensure_clients_loaded()
    client_cls = CLIENTS.get(group.name)
    if client_cls is None:
        client_cls = getattr(AIDP_DP_MODULE, group.client_class_name, None)
    if client_cls is None:
        raise CliError(f"Unknown command group {group.name!r}. Run 'aidp command-groups'.")
    sdk_method = getattr(client_cls, command.sdk_method_name, None)
    if sdk_method is None:
        raise CliError(f"{group.name} has no command-name {command.name!r}.")

    try:
        call_args, call_kwargs = bind_command_args(
            sdk_method=sdk_method,
            params=invocation.params,
            body=invocation.body,
            body_param_name=command.body_field.name if command.body_field else None,
        )
    except CliError as exc:
        raise with_command_usage_hint(group, command, exc) from exc
    add_request_id(sdk_method, command.name, call_kwargs, invocation)
    client = build_client(client_cls, invocation)
    if invocation.debug:
        enable_request_debug(client, group.name, command.name)
    try:
        response = sdk_method(client, *call_args, **call_kwargs)
        print_response(response)
    finally:
        close_client(client)
    return 0


def parse_command_options(
    group: CommandGroup,
    command: CommandDefinition,
    tokens: list[str],
    globals_ns: SimpleNamespace,
) -> SimpleNamespace:
    params: dict[str, Any] = {}
    body = None
    opc_request_id = None
    no_request_id = False
    positionals: list[str] = []
    option_fields = {f"--{field.cli_name}": field for field in command_option_fields(command)}
    global_values = vars(globals_ns).copy()
    index = 0

    while index < len(tokens):
        token = tokens[index]
        option_name, inline_value = split_inline_option(token)
        if option_name == "--body":
            if command.body_field is None:
                raise command_usage_error(group, command, f"{command.name} does not accept --body.")
            value, index = command_option_value(tokens, index, option_name, inline_value)
            body = load_body_input(command, value)
            if (
                not command_uses_raw_body(command)
                and json_body_argument_source(value) == "inline"
                and body_contains_sensitive_field(command, body)
            ):
                raise command_usage_error(
                    group,
                    command,
                    "Inline --body JSON is blocked because this request body contains sensitive fields. "
                    "Use --body @request.json, --body file:///path/request.json, or --body -.",
                )
            continue
        if option_name == "--opc-request-id":
            opc_request_id, index = command_option_value(tokens, index, option_name, inline_value)
            continue
        if option_name == "--no-request-id":
            no_request_id = True
            index += 1
            continue
        if option_name in option_fields:
            field = option_fields[option_name]
            value, index = field_option_value(tokens, index, option_name, inline_value, field)
            params[field.name] = parse_value(str(value))
            continue
        if option_name in GLOBAL_VALUE_OPTIONS:
            value, index = command_option_value(tokens, index, option_name, inline_value)
            apply_global_option(global_values, option_name, value)
            continue
        if option_name in GLOBAL_BOOLEAN_OPTIONS:
            global_values[GLOBAL_BOOLEAN_OPTIONS[option_name]] = True
            index += 1
            continue
        if token.startswith("-"):
            raise unknown_option(group, command, option_name, option_fields)
        positionals.append(token)
        index += 1

    validate_global_options(global_values)

    argument_fields = command_argument_fields(command)
    if len(positionals) < len(argument_fields):
        missing = argument_metavar(argument_fields[len(positionals)])
        raise command_usage_error(group, command, f"Missing required argument {missing}.")
    if len(positionals) > len(argument_fields):
        raise command_usage_error(group, command, f"Unexpected argument {positionals[len(argument_fields)]!r}.")
    for field, value in zip(argument_fields, positionals):
        params[field.name] = parse_value(value)

    for field in command_option_fields(command):
        if field.required and field.name not in params:
            raise command_usage_error(group, command, f"Missing required flag --{field.cli_name}.")
    if command.body_field is not None and command.body_field.required and body is None:
        raise command_usage_error(group, command, "Missing required flag --body.")
    if command_requires_instance_id(command):
        if not global_values["ai_data_platform_id"]:
            raise command_usage_error(
                group,
                command,
                "Missing AIDP instance OCID. Set --instance-id, "
                "INSTANCE_ID, or run 'aidp configure set instance-id <ocid>'.",
            )
        params["ai_data_platform_id"] = global_values["ai_data_platform_id"]

    values = global_values.copy()
    values.update(
        {
            "params": params,
            "body": body,
            "opc_request_id": opc_request_id,
            "no_request_id": no_request_id,
        }
    )
    return SimpleNamespace(**values)


def command_usage_error(group: CommandGroup, command: CommandDefinition, message: str) -> CliError:
    return CliError(
        f'{message}\n\nUse "aidp {group.name} {command.name} -h" '
        f'or "aidp {group.name} {command.name} --help" for command help.'
    )


def with_command_usage_hint(group: CommandGroup, command: CommandDefinition, error: CliError) -> CliError:
    message = str(error)
    if "\n\nUse " in message:
        return error
    return command_usage_error(group, command, message)


def command_option_value(
    tokens: list[str],
    index: int,
    option_name: str,
    inline_value: str | None,
) -> tuple[str, int]:
    if inline_value is not None:
        return inline_value, index + 1
    if index + 1 >= len(tokens):
        raise CliError(f"{option_name} requires a value.")
    return tokens[index + 1], index + 2


def field_option_value(
    tokens: list[str],
    index: int,
    option_name: str,
    inline_value: str | None,
    field: CommandField,
) -> tuple[Any, int]:
    if inline_value is not None:
        return inline_value, index + 1
    if field.type_name in {"boolean", "bool"}:
        return True, index + 1
    return command_option_value(tokens, index, option_name, inline_value)


def bind_command_args(
    sdk_method: Callable[..., Any],
    params: dict[str, Any],
    body: Any,
    body_param_name: str | None,
) -> tuple[list[Any], dict[str, Any]]:
    signature = inspect.signature(sdk_method)
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
        elif body is not None and not body_consumed and parameter.name == body_param_name:
            value = body
            body_consumed = True
        elif parameter.default is inspect.Parameter.empty:
            raise CliError(f"Missing required parameter {parameter_option_name(parameter.name, body_param_name)}.")
        else:
            continue

        if parameter.kind in (inspect.Parameter.POSITIONAL_ONLY, inspect.Parameter.POSITIONAL_OR_KEYWORD):
            positional.append(value)
        else:
            kwargs[parameter.name] = value

    if body is not None and not body_consumed:
        raise CliError("A request body was provided, but this command has no body parameter.")
    if params:
        kwargs.update(params)
    return positional, kwargs


def parameter_option_name(parameter_name: str, body_param_name: str | None) -> str:
    if parameter_name == body_param_name:
        return "--body"
    return f"--{parameter_name.replace('_', '-')}"


def add_request_id(
    sdk_method: Callable[..., Any],
    command_name: str,
    call_kwargs: dict[str, Any],
    args: SimpleNamespace,
) -> None:
    if args.opc_request_id and not sdk_method_accepts_kwarg(sdk_method, "opc_request_id"):
        raise CliError(f"{command_name} does not accept opc_request_id.")
    if (
        not args.no_request_id
        and "opc_request_id" not in call_kwargs
        and sdk_method_accepts_kwarg(sdk_method, "opc_request_id")
    ):
        call_kwargs["opc_request_id"] = args.opc_request_id or f"aidp-cli-{uuid.uuid4()}"


def sdk_method_accepts_kwarg(sdk_method: Callable[..., Any], name: str) -> bool:
    try:
        source = inspect.getsource(sdk_method)
    except OSError:
        return False
    return f'"{name}"' in source or f"'{name}'" in source


def parse_value(value: str) -> Any:
    stripped = value.strip()
    if stripped == "":
        return ""
    try:
        return json.loads(stripped)
    except json.JSONDecodeError:
        return value


def load_body_input(command: CommandDefinition, value: str | None) -> Any:
    if command_uses_raw_body(command):
        return read_raw_body_argument(value)
    return load_json_input(value)


def command_uses_raw_body(command: CommandDefinition) -> bool:
    return (
        command.body_field is not None
        and not command.body_model
        and not command.body_fields
        and not command.body_models
    )


def load_json_input(value: str | None) -> Any:
    if value is None:
        return None
    raw = read_json_argument(value)
    try:
        parsed = json.loads(raw)
    except json.JSONDecodeError as exc:
        raise CliError(f"--body is not valid JSON: {exc}") from exc
    if not isinstance(parsed, (dict, list)):
        raise CliError("--body must contain a JSON object or array.")
    return parsed


def read_raw_body_argument(value: str | None) -> bytes | str | None:
    if value is None:
        return None
    if value == "-":
        stdin_buffer = getattr(sys.stdin, "buffer", None)
        if stdin_buffer is not None:
            return stdin_buffer.read()
        return sys.stdin.read()
    if value.startswith("@"):
        return Path(value[1:]).expanduser().read_bytes()
    if value.startswith("file://"):
        return Path(value.removeprefix("file://")).expanduser().read_bytes()
    return value


def read_json_argument(value: str) -> str:
    if value == "-":
        return sys.stdin.read()
    if value.startswith("@"):
        return Path(value[1:]).expanduser().read_text(encoding="utf-8")
    if value.startswith("file://"):
        return Path(value.removeprefix("file://")).expanduser().read_text(encoding="utf-8")
    return value


def handle_search(args: list[str]) -> None:
    query = " ".join(args).strip()
    if not query:
        print_search_help()
        return
    results: list[tuple[int, str, str, str]] = []
    for group in command_manifest().command_groups:
        group_score = search_score(query, [group.name, group.description], [], group.name)
        if group_score:
            results.append((group_score, group.name, "", group.description))
        for command in group.commands:
            fields = " ".join(field.cli_name for field in command.fields)
            command_score = search_score(
                query,
                [group.name, command.name],
                [command.summary, command.description, fields],
                f"{group.name} {command.name}",
            )
            if command_score:
                results.append((command_score, group.name, command.name, command_summary(command)))

    if not results:
        print(f"No results for {query!r}.")
        return
    results = filter_search_results(results)
    print(f"Search results for {query!r}:")
    rows = []
    for _score, group_name, command_name, description in sorted(results, key=search_result_sort_key)[:30]:
        name = f"{group_name} {command_name}".strip()
        rows.append((name, description))
    print("\n".join(format_table(rows)))
    if len(results) > 30:
        print(f"\nShowing 30 of {len(results)} results.")


def filter_search_results(results: list[tuple[int, str, str, str]]) -> list[tuple[int, str, str, str]]:
    top_score = max(score for score, _group_name, _command_name, _description in results)
    if top_score < 850:
        return results
    cutoff = int(top_score * 0.5)
    return [
        result
        for result in results
        if result[0] >= cutoff
    ]


def search_result_sort_key(result: tuple[int, str, str, str]) -> tuple[int, str, str]:
    score, group_name, command_name, _description = result
    return (-score, group_name, command_name)


def search_score(
    query: str,
    primary_values: list[str],
    secondary_values: list[str],
    sort_value: str,
) -> int:
    query_tokens = search_tokens(query)
    if not query_tokens:
        return 0

    primary_value = " ".join(item for item in primary_values if item)
    secondary_value = " ".join(item for item in secondary_values if item)
    primary_tokens = search_tokens(primary_value)
    secondary_tokens = search_tokens(secondary_value)
    if not primary_tokens and not secondary_tokens:
        return 0

    compact_query = compact_search_text(query)
    compact_primary = compact_search_text(primary_value)
    compact_secondary = compact_search_text(secondary_value)
    compact_sort = compact_search_text(sort_value)
    compact_sort_variants = compact_sort_value_variants(sort_value)
    expanded_primary_tokens = expand_search_tokens(primary_tokens)
    expanded_secondary_tokens = expand_search_tokens(secondary_tokens)

    if is_compact_action_query(query_tokens, compact_query):
        return max(
            compact_identity_search_score(compact_query, sort_variant)
            for sort_variant in compact_sort_variants
        )

    score = 0
    matched = False

    sort_identity_score = max(
        compact_identity_search_score(compact_query, sort_variant)
        for sort_variant in compact_sort_variants
    )
    if sort_identity_score >= 850:
        score += sort_identity_score
        matched = True
    elif compact_query == compact_sort:
        score += 1000
        matched = True
    elif compact_sort.startswith(compact_query):
        score += 900
        matched = True
    elif compact_query in compact_sort:
        score += 850
        matched = True
    elif compact_query in compact_primary:
        score += 700
        matched = True
    elif compact_query in compact_secondary:
        score += 350
        matched = True

    if all(query_token_matches(token, expanded_primary_tokens) for token in query_tokens):
        score += 500
        matched = True
        if search_tokens_in_order(query_tokens, primary_tokens):
            score += 150
    elif len(query_tokens) == 1 and query_token_matches(query_tokens[0], expanded_secondary_tokens):
        score += 150
        matched = True

    for token in query_tokens:
        if token in expanded_primary_tokens:
            score += 25
        elif len(query_tokens) == 1 and token in expanded_secondary_tokens:
            score += 10

    fuzzy_ratio = max(
        difflib.SequenceMatcher(None, compact_query, sort_variant).ratio()
        for sort_variant in compact_sort_variants
    )
    if fuzzy_ratio >= 0.72 and compact_length_ratio(compact_query, compact_sort) >= 0.8:
        score += int(fuzzy_ratio * 250)
        matched = True

    return score if matched else 0


def is_compact_action_query(query_tokens: list[str], compact_query: str) -> bool:
    if len(query_tokens) != 1:
        return False
    return any(
        compact_query.startswith(action) and len(compact_query) > len(action) + 2
        for action in SEARCH_ACTION_PREFIXES
    )


def compact_identity_search_score(compact_query: str, compact_sort: str) -> int:
    for query_variant in compact_search_variants(compact_query):
        if query_variant == compact_sort:
            return 1000
        if compact_sort.startswith(query_variant):
            return 900
        if query_variant in compact_sort:
            return 850
    return 0


def compact_search_variants(value: str) -> tuple[str, ...]:
    variants = [value]
    if len(value) > 4 and value.endswith("ies"):
        variants.append(value[:-3] + "y")
    if len(value) > 3 and value.endswith("s"):
        variants.append(value[:-1])
    return tuple(dict.fromkeys(variants))


def compact_sort_value_variants(value: str) -> tuple[str, ...]:
    tokens = search_tokens(value)
    variants = [compact_search_text(value)]
    if len(tokens) >= 2 and tokens[-1] in SEARCH_ACTION_PREFIXES:
        variants.append("".join([tokens[-1], *tokens[:-1]]))
    return tuple(dict.fromkeys(variants))


def compact_length_ratio(left: str, right: str) -> float:
    if not left or not right:
        return 0
    return min(len(left), len(right)) / max(len(left), len(right))


def search_tokens(value: str) -> list[str]:
    return re.findall(r"[a-z0-9]+", value.lower())


def compact_search_text(value: str) -> str:
    return "".join(search_tokens(value))


def expand_search_tokens(tokens: list[str]) -> set[str]:
    expanded: set[str] = set()
    for token in tokens:
        expanded.update(search_token_variants(token))
    return expanded


def search_token_variants(token: str) -> set[str]:
    variants = {token}
    if len(token) > 4 and token.endswith("ies"):
        variants.add(token[:-3] + "y")
    if len(token) > 3 and token.endswith("s"):
        variants.add(token[:-1])
    return variants


def query_token_matches(query_token: str, value_tokens: set[str]) -> bool:
    if search_token_variants(query_token) & value_tokens:
        return True
    if len(query_token) < 5:
        return False
    return bool(difflib.get_close_matches(query_token, value_tokens, n=1, cutoff=0.82))


def search_tokens_in_order(query_tokens: list[str], value_tokens: list[str]) -> bool:
    value_index = 0
    expanded_values = [search_token_variants(token) for token in value_tokens]
    for query_token in query_tokens:
        query_variants = search_token_variants(query_token)
        while value_index < len(expanded_values):
            if query_variants & expanded_values[value_index]:
                value_index += 1
                break
            value_index += 1
        else:
            return False
    return True


def print_search_help() -> None:
    lines = [
        "Search AIDP command groups, command names, descriptions, and flags.",
        "",
        "Usage:",
        "  aidp search QUERY [flags]",
        "",
        "Examples:",
        "  aidp search workspace",
        "  aidp search list workspaces",
        "  aidp search permission",
        "",
        "Flags:",
        *format_flags([("-h, --help", "help for search")]),
        "",
        "Global Flags:",
        *format_flags(global_flag_rows()),
    ]
    print("\n".join(lines))


def handle_configure(args: list[str]) -> None:
    action = args[0]
    if action == "get":
        config = read_aidp_config()
        print("AIDP CLI configuration:")
        print(f"  file: {aidp_config_path()}")
        print(f"  instance-id: {config.get('instance-id') or '(not set)'}")
        return
    if action == "set":
        if len(args) != 3:
            raise CliError("Usage: aidp configure set instance-id <ocid>")
        key, value = args[1], args[2]
        if key != "instance-id":
            raise CliError("Only instance-id can be configured.")
        config = read_aidp_config()
        config["instance-id"] = value
        write_aidp_config(config)
        print(f"Set instance-id in {aidp_config_path()}")
        return
    raise CliError(f"Unknown configure command {action!r}. Run 'aidp configure --help'.")


def print_configure_help() -> None:
    lines = [
        "Configure local AIDP CLI defaults.",
        "",
        "Usage:",
        "  aidp configure get",
        "  aidp configure set instance-id <ocid>",
        "",
        "Flags:",
        *format_flags([("-h, --help", "help for configure")]),
    ]
    print("\n".join(lines))


def configured_instance_id() -> str | None:
    env_value = os.getenv("INSTANCE_ID")
    if env_value:
        return env_value
    try:
        return read_aidp_config().get("instance-id")
    except (OSError, JSONDecodeError):
        return None


def aidp_config_path() -> Path:
    return Path(os.getenv("AIDP_CLI_CONFIG_FILE", DEFAULT_AIDP_CONFIG_FILE)).expanduser()


def read_aidp_config() -> dict[str, Any]:
    path = aidp_config_path()
    if not path.exists():
        return {}
    validate_aidp_config_permissions(path)
    raw = path.read_text(encoding="utf-8")
    if not raw.strip():
        return {}
    value = json.loads(raw)
    if not isinstance(value, dict):
        raise CliError(f"{path} must contain a JSON object.")
    return {str(key): item for key, item in value.items()}


def write_aidp_config(config: dict[str, Any]) -> None:
    path = aidp_config_path()
    ensure_aidp_config_parent_directory(path)
    validate_aidp_config_permissions(path)
    write_aidp_config_atomically(path, json.dumps(config, indent=2, sort_keys=True) + "\n")


def ensure_aidp_config_parent_directory(path: Path) -> None:
    path.parent.mkdir(mode=AIDP_CONFIG_DIR_MODE, parents=True, exist_ok=True)
    if should_enforce_aidp_config_parent_permissions():
        os.chmod(path.parent, AIDP_CONFIG_DIR_MODE)


def validate_aidp_config_permissions(path: Path) -> None:
    if os.name == "nt":
        return

    if should_enforce_aidp_config_parent_permissions() and path.parent.exists():
        assert_owner_only_mode(path.parent, AIDP_CONFIG_DIR_MODE, "directory")
    if path.exists():
        assert_owner_only_mode(path, AIDP_CONFIG_FILE_MODE, "file")


def should_enforce_aidp_config_parent_permissions() -> bool:
    return "AIDP_CLI_CONFIG_FILE" not in os.environ


def assert_owner_only_mode(path: Path, expected_mode: int, kind: str) -> None:
    mode = path.stat().st_mode & 0o777
    if mode & GROUP_OR_WORLD_PERMISSIONS:
        raise CliError(
            f"{path} permissions are too open for the AIDP config {kind}. "
            f"Run 'chmod {expected_mode:o} {path}' and try again."
        )


def write_aidp_config_atomically(path: Path, content: str) -> None:
    tmp_path = path.with_name(f".{uuid.uuid4()}.tmp")
    fd: int | None = None
    try:
        fd = os.open(str(tmp_path), os.O_WRONLY | os.O_CREAT | os.O_EXCL, AIDP_CONFIG_FILE_MODE)
        with os.fdopen(fd, "w", encoding="utf-8") as handle:
            fd = None
            handle.write(content)
            handle.flush()
            os.fsync(handle.fileno())
        os.replace(tmp_path, path)
        os.chmod(path, AIDP_CONFIG_FILE_MODE)
    except Exception:
        if fd is not None:
            os.close(fd)
        try:
            tmp_path.unlink()
        except OSError:
            pass
        raise


def unknown_command_group(name: str) -> CliError:
    candidates = ["command-groups", "search", "configure", "help", "version"] + [
        group.name for group in command_manifest().command_groups
    ]
    return CliError(unknown_message("command group", name, candidates, "aidp command-groups"))


def unknown_command_name(group: CommandGroup, name: str) -> CliError:
    candidates = [command.name for command in group.commands]
    matches = command_name_suggestions(group, name, candidates)
    return CliError(unknown_message("command name", name, candidates, f"aidp {group.name} --help", matches))


def command_name_suggestions(group: CommandGroup, name: str, candidates: list[str]) -> list[str]:
    matches = difflib.get_close_matches(name, candidates, n=3)
    if matches:
        return matches

    normalized = compact_search_text(name)
    alias_matches = []
    for command in group.commands:
        aliases = {
            command.sdk_method_name.replace("_", "-"),
            command.operation_id,
        }
        if any(normalized == compact_search_text(alias) for alias in aliases):
            alias_matches.append(command.name)
    if alias_matches:
        return list(dict.fromkeys(alias_matches))[:3]

    scored = [
        (search_score(name, [group.name, command.name, command.sdk_method_name], [command.summary], command.name), command.name)
        for command in group.commands
    ]
    best_score = max((score for score, _command_name in scored), default=0)
    if best_score < 500:
        return []
    cutoff = max(500, int(best_score * 0.75))
    return [
        command_name
        for score, command_name in sorted(scored, key=lambda item: (-item[0], item[1]))
        if score >= cutoff
    ][:3]


def unknown_option(
    group: CommandGroup,
    command: CommandDefinition,
    name: str,
    option_fields: dict[str, CommandField],
) -> CliError:
    candidates = (
        ["--body", "--opc-request-id", "--no-request-id"]
        + list(option_fields)
        + list(GLOBAL_VALUE_OPTIONS)
        + list(GLOBAL_BOOLEAN_OPTIONS)
    )
    return CliError(
        unknown_message("option", name, candidates, f"aidp help {group.name} {command.name}")
    )


def unknown_message(
    kind: str,
    name: str,
    candidates: list[str],
    help_command: str,
    matches: list[str] | None = None,
) -> str:
    message = f"Unknown {kind} {name!r}."
    matches = matches if matches is not None else difflib.get_close_matches(name, candidates, n=3)
    if matches:
        message += "\n\nDid you mean this?\n"
        message += "\n".join(f"  {match}" for match in matches)
    message += f'\n\nUse "{help_command}" for more information.'
    return message


def print_version() -> None:
    print(f"aidp python cli version-{cli_version()}")


def cli_version() -> str:
    try:
        return package_version(PACKAGE_NAME)
    except PackageNotFoundError:
        return "unknown"


def example_body(command: CommandDefinition) -> dict[str, Any] | None:
    if command.body_field is None:
        return None
    model = root_body_model(command)
    fields = model.fields if model is not None else command.body_fields
    return sample_object_for_fields(fields, command, seen_models=set(), depth=0)


def root_body_variant_examples(command: CommandDefinition) -> list[tuple[str, dict[str, Any]]]:
    root_model = root_body_model(command)
    if root_model is None or not root_model.variants:
        return []
    examples = []
    for variant in root_model.variants:
        if variant.model_name not in command.body_models:
            continue
        label = (
            f"{variant.model_name} "
            f"({variant.discriminator_field}={variant.discriminator_value})"
        )
        examples.append((label, variant_body_sample(command, command.body_model, variant)))
    return examples


def nested_body_variant_examples(command: CommandDefinition) -> list[tuple[str, str, dict[str, Any]]]:
    root_model = root_body_model(command)
    if root_model is None:
        return []
    examples = collect_nested_body_variant_examples(
        root_model.fields,
        command,
        parent_path="",
        seen_models={command.body_model},
        depth=0,
    )
    for variant in root_model.variants:
        variant_model = command.body_models.get(variant.model_name)
        if variant_model is None:
            continue
        examples.extend(
            collect_nested_body_variant_examples(
                variant_model.fields,
                command,
                parent_path="",
                seen_models={command.body_model, variant.model_name},
                depth=0,
            )
        )

    unique_examples = []
    seen = set()
    for path, label, sample in examples:
        key = (path, label)
        if key in seen:
            continue
        seen.add(key)
        unique_examples.append((path, label, sample))
    return unique_examples


def collect_nested_body_variant_examples(
    fields: tuple[BodyField, ...],
    command: CommandDefinition,
    parent_path: str,
    seen_models: set[str],
    depth: int,
) -> list[tuple[str, str, dict[str, Any]]]:
    if depth >= MAX_BODY_EXAMPLE_DEPTH:
        return []

    examples = []
    for field in fields:
        if not field.model_name:
            continue
        model = command.body_models.get(field.model_name)
        if model is None:
            continue

        path = f"{parent_path}.{field.name}" if parent_path else field.name
        model_path = f"{path}[]" if field.type_name == "array" else path
        for variant in model.variants:
            if variant.model_name not in command.body_models:
                continue
            label = (
                f"{variant.model_name} "
                f"({variant.discriminator_field}={variant.discriminator_value})"
            )
            examples.append((model_path, label, variant_body_sample(command, field.model_name, variant)))

        if field.model_name not in seen_models:
            next_seen_models = set(seen_models)
            next_seen_models.add(field.model_name)
            examples.extend(
                collect_nested_body_variant_examples(
                    model.fields,
                    command,
                    parent_path=model_path,
                    seen_models=next_seen_models,
                    depth=depth + 1,
                )
            )
    return examples


def variant_body_sample(
    command: CommandDefinition,
    base_model_name: str,
    variant: Any,
) -> dict[str, Any]:
    base_model = command.body_models[base_model_name]
    variant_model = command.body_models[variant.model_name]
    sample = sample_object_for_fields(base_model.fields, command, seen_models=set(), depth=0)
    variant_sample = sample_object_for_fields(
        variant_model.fields,
        command,
        seen_models={base_model_name},
        depth=0,
    )
    for name, value in variant_sample.items():
        if name not in sample:
            sample[name] = value
    sample[variant.discriminator_field] = variant.discriminator_value
    return sample


def sample_object_for_fields(
    fields: tuple[BodyField, ...],
    command: CommandDefinition,
    seen_models: set[str],
    depth: int,
) -> dict[str, Any]:
    return {
        field.name: sample_body_value(field, command, seen_models=seen_models, depth=depth)
        for field in fields
    }


def root_body_fields(command: CommandDefinition) -> tuple[BodyField, ...]:
    model = root_body_model(command)
    return model.fields if model is not None else command.body_fields


def root_body_model(command: CommandDefinition) -> BodyModel | None:
    if command.body_model and command.body_model in command.body_models:
        return command.body_models[command.body_model]
    return None


def sample_body_value(
    field: BodyField,
    command: CommandDefinition,
    seen_models: set[str],
    depth: int,
) -> Any:
    if field.type_name == "array":
        return [sample_array_item(field, command, seen_models, depth)]
    if field.model_name:
        return sample_model_value(field.model_name, command, seen_models, depth)
    return sample_scalar_value(field.type_name, field.enum_values)


def sample_array_item(
    field: BodyField,
    command: CommandDefinition,
    seen_models: set[str],
    depth: int,
) -> Any:
    if field.model_name:
        return sample_model_value(field.model_name, command, seen_models, depth)
    return sample_scalar_value(field.item_type or "string", field.enum_values)


def sample_model_value(
    model_name: str,
    command: CommandDefinition,
    seen_models: set[str],
    depth: int,
) -> dict[str, Any]:
    if depth >= MAX_BODY_EXAMPLE_DEPTH or model_name in seen_models:
        return {}
    model = command.body_models.get(model_name)
    if model is None:
        return {}
    next_seen_models = set(seen_models)
    next_seen_models.add(model_name)
    return {
        field.name: sample_body_value(field, command, next_seen_models, depth + 1)
        for field in model.fields
    }


def sample_scalar_value(type_name: str, enum_values: tuple[Any, ...]) -> Any:
    if enum_values:
        return enum_values[0]
    if type_name in {"boolean", "bool"}:
        return False
    if type_name in {"integer", "number", "int", "float"}:
        return 0
    if type_name == "array":
        return []
    if type_name == "object":
        return {}
    return "<string>"


def body_required_fields(command: CommandDefinition) -> tuple[str, ...]:
    if not command.body_models:
        return command.body_required_fields
    return tuple(
        collect_required_body_paths(
            root_body_fields(command),
            command,
            parent_path="",
            parent_required=True,
            seen_models=set(),
            depth=0,
        )
    )


def collect_required_body_paths(
    fields: tuple[BodyField, ...],
    command: CommandDefinition,
    parent_path: str,
    parent_required: bool,
    seen_models: set[str],
    depth: int,
) -> list[str]:
    if depth >= MAX_BODY_EXAMPLE_DEPTH:
        return []

    required_paths = []
    for field in fields:
        path = f"{parent_path}.{field.name}" if parent_path else field.name
        is_unconditionally_required = parent_required and field.required
        if is_unconditionally_required:
            required_paths.append(path)

        nested_path = f"{path}[]" if field.type_name == "array" else path
        if field.model_name and field.model_name not in seen_models:
            model = command.body_models.get(field.model_name)
            if model is None:
                continue
            next_seen_models = set(seen_models)
            next_seen_models.add(field.model_name)
            required_paths.extend(
                collect_required_body_paths(
                    model.fields,
                    command,
                    nested_path,
                    is_unconditionally_required,
                    next_seen_models,
                    depth + 1,
                )
            )
    return required_paths


def body_enum_fields(command: CommandDefinition) -> dict[str, tuple[Any, ...]]:
    if not command.body_models:
        return command.body_enum_fields
    return collect_body_enum_paths(
        root_body_fields(command),
        command,
        parent_path="",
        seen_models=set(),
        depth=0,
    )


def collect_body_enum_paths(
    fields: tuple[BodyField, ...],
    command: CommandDefinition,
    parent_path: str,
    seen_models: set[str],
    depth: int,
) -> dict[str, tuple[Any, ...]]:
    if depth >= MAX_BODY_EXAMPLE_DEPTH:
        return {}

    enum_paths: dict[str, tuple[Any, ...]] = {}
    for field in fields:
        path = f"{parent_path}.{field.name}" if parent_path else field.name
        if field.enum_values:
            enum_paths[path] = field.enum_values

        nested_path = f"{path}[]" if field.type_name == "array" else path
        if field.model_name and field.model_name not in seen_models:
            model = command.body_models.get(field.model_name)
            if model is None:
                continue
            next_seen_models = set(seen_models)
            next_seen_models.add(field.model_name)
            enum_paths.update(
                collect_body_enum_paths(
                    model.fields,
                    command,
                    nested_path,
                    next_seen_models,
                    depth + 1,
                )
            )
    return enum_paths


def load_config(args: SimpleNamespace) -> dict[str, Any]:
    if args.auth in {"instance_principal", "resource_principal"}:
        return {"region": args.region} if args.region else {}
    config = oci.config.from_file(
        file_location=os.path.expanduser(args.config_file),
        profile_name=args.profile,
    )
    apply_config_env_overrides(config)
    return config


def build_signer(config: dict[str, Any], args: SimpleNamespace) -> Any:
    if args.auth == "instance_principal":
        return oci.auth.signers.InstancePrincipalsSecurityTokenSigner()
    if args.auth == "resource_principal":
        return oci.auth.signers.get_resource_principals_signer()
    if args.auth == "security_token":
        token_file = expand_path(config.get("security_token_file"))
        if not token_file:
            raise CliError("security_token auth requires security_token_file in the OCI config profile.")
        key_file = expand_path(config.get("key_file"))
        if not key_file:
            raise CliError("security_token auth requires key_file in the OCI config profile.")
        token = Path(token_file).read_text(encoding="utf-8").strip()
        private_key = load_private_key_from_file(key_file, config.get("pass_phrase"))
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


def build_client(client_cls: type, args: SimpleNamespace) -> Any:
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
    client = client_cls(config, **kwargs)
    apply_client_overrides(client)
    return client


def apply_client_overrides(client: Any) -> None:
    if client.__class__.__name__ not in STRICT_URL_ENCODING_CLIENTS:
        return
    base_client = getattr(client, "base_client", None)
    if base_client is None:
        return
    if hasattr(base_client, "enable_strict_url_encoding"):
        base_client.enable_strict_url_encoding = True
    else:
        setattr(base_client, "_enable_strict_url_encoding", True)


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
    if str(region).startswith(("https://", "http://")):
        raise CliError(
            "Region must be an OCI region identifier. For a full service URL, use --endpoint or OCI_CLI_ENDPOINT."
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


def enable_request_debug(client: Any, command_group: str, command_name: str) -> None:
    base_client = getattr(client, "base_client", None)
    if base_client is None:
        return

    original_call_api = base_client.call_api

    def debug_call_api(*args: Any, **kwargs: Any) -> Any:
        debug_request(base_client, command_group, command_name, *args, **kwargs)
        return original_call_api(*args, **kwargs)

    base_client.call_api = debug_call_api


def debug_request(base_client: Any, command_group: str, command_name: str, *args: Any, **kwargs: Any) -> None:
    resource_path = get_call_value("resource_path", 0, args, kwargs) or ""
    method = get_call_value("method", 1, args, kwargs) or ""
    path_params = get_call_value("path_params", 2, args, kwargs) or {}
    query_params = get_call_value("query_params", 3, args, kwargs) or {}
    header_params = get_call_value("header_params", 4, args, kwargs) or {}
    body = get_call_value("body", 5, args, kwargs)
    base_path = getattr(base_client, "base_path", "") or ""
    endpoint = getattr(base_client, "endpoint", "") or ""
    enable_strict_url_encoding = get_call_value("enable_strict_url_encoding", 9, args, kwargs)
    rendered_path = render_resource_path(
        resource_path,
        path_params,
        strict_url_encoding=should_render_strict_url_encoding(
            base_client,
            enable_strict_url_encoding,
        ),
    )
    url = build_debug_url(endpoint, base_path, rendered_path)

    print("AIDP CLI debug request:", file=sys.stderr)
    print(f"  command_group: {command_group}", file=sys.stderr)
    print(f"  command_name: {command_name}", file=sys.stderr)
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


def render_resource_path(
    resource_path: str,
    path_params: dict[str, Any],
    *,
    strict_url_encoding: bool = False,
) -> str:
    rendered = resource_path
    safe_chars = "" if strict_url_encoding else "/"
    for name, value in path_params.items():
        rendered = rendered.replace("{" + name + "}", quote(str(value), safe=safe_chars))
    return rendered


def should_render_strict_url_encoding(base_client: Any, request_value: Any) -> bool:
    should_enable = getattr(base_client, "should_enable_strict_url_encoding", None)
    if callable(should_enable):
        return bool(should_enable(request_value))
    if request_value is not None:
        return bool(request_value)
    return bool(getattr(base_client, "enable_strict_url_encoding", None))


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
        return "json object"
    if isinstance(body, list):
        return "json array"
    return type(body).__name__


def print_response(response: Any) -> None:
    data = getattr(response, "data", response)
    payload = {
        "data": to_dict(data),
        "headers": dict(getattr(response, "headers", {}) or {}),
        "status": getattr(response, "status", None),
    }
    print("Response:")
    print(json.dumps(payload, indent=2, default=str))


def print_error_response(payload: dict[str, Any]) -> None:
    print("Response:", file=sys.stderr)
    print(json.dumps(payload, indent=2, default=str), file=sys.stderr)


if __name__ == "__main__":
    raise SystemExit(main())
