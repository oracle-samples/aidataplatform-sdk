# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

from __future__ import annotations

import argparse
import ast
import hashlib
import json
import os
import re
from pathlib import Path
from typing import Any


PACKAGE_ROOT = Path(__file__).resolve().parents[1]
SOURCE_ROOT = PACKAGE_ROOT / "src"
DEFAULT_SDK_SOURCE_ROOT = PACKAGE_ROOT.parents[1] / "aidp-python-client" / "src"
DEFAULT_SDK_BUILD_ROOT = DEFAULT_SDK_SOURCE_ROOT / "build" / "lib"
DEFAULT_OUTPUT_PATH = PACKAGE_ROOT / "src" / "aidp_cli" / "operation_manifest.json"
SDK_PACKAGE_PARTS = ("aidp_python_client", "aidataplatform_dp")
COMMAND_GROUP_NAME_OVERRIDES = [
    ("ml-ops", "mlops"),
]
WORD_PATTERN = re.compile(r"[A-Z]+(?=[A-Z][a-z]|\d|$)|[A-Z]?[a-z]+|\d+")
PROVIDER_TOKEN_PATTERN = re.compile(r"(^|_)ai_data_platform(_|$)")
PARAM_BLOCK_PATTERN = re.compile(
    r"^\s*:param\s+(.+?)\s+([A-Za-z_][A-Za-z0-9_]*):\s*(.*?)(?=^\s*:param\s+|^\s*:return:|^\s*:rtype:|\Z)",
    re.MULTILINE | re.DOTALL,
)
ACTION_WORDS = {
    "add",
    "cancel",
    "checkout",
    "commit",
    "copy",
    "create",
    "delete",
    "deploy",
    "download",
    "export",
    "fetch",
    "generate",
    "get",
    "head",
    "infer",
    "list",
    "log",
    "make",
    "manage",
    "merge",
    "modify",
    "move",
    "patch",
    "perform",
    "pull",
    "push",
    "purge",
    "rebase",
    "refresh",
    "remove",
    "rename",
    "repair",
    "reset",
    "resolve",
    "restart",
    "restore",
    "retrieve",
    "search",
    "set",
    "start",
    "stop",
    "summarize",
    "test",
    "transition",
    "update",
    "upload",
}
SHORT_NAME_ACTIONS = {
    "add",
    "copy",
    "create",
    "delete",
    "deploy",
    "get",
    "head",
    "infer",
    "list",
    "move",
    "purge",
    "refresh",
    "remove",
    "rename",
    "restart",
    "start",
    "stop",
    "update",
}
DANGLING_CONNECTORS = {"by", "for", "from", "in", "of", "on", "to", "with"}
SKIPPED_KWARGS = {"retry_strategy"}
RESOURCE_WORD_REPLACEMENTS = {
    "dir": "directory",
    "dirs": "directory",
}
RESOURCE_NOISE_WORDS = {
    "a",
    "all",
    "an",
    "available",
    "by",
    "details",
    "detail",
    "new",
    "specified",
    "the",
}
UNCOUNTABLE_RESOURCE_WORDS = {
    "access",
    "content",
    "data",
    "metadata",
    "output",
    "status",
    "state",
}


def main() -> int:
    parser = argparse.ArgumentParser(description="Generate the AIDP CLI command manifest.")
    parser.add_argument(
        "--sdk-source",
        help="Path to the generated aidp-python-client src directory. Defaults to AIDP_SDK_SOURCE_ROOT or the local generated SDK source.",
    )
    parser.add_argument("--output", default=str(DEFAULT_OUTPUT_PATH), help="Manifest output path.")
    args = parser.parse_args()

    sdk_source_root = resolve_sdk_source_root(args.sdk_source)
    output_path = Path(args.output).resolve()
    manifest = write_manifest(sdk_source_root=sdk_source_root, output_path=output_path)
    print(
        f"Generated {output_path} from {sdk_source_root} "
        f"({len(manifest['commandGroups'])} command groups, {count_commands(manifest)} commands)"
    )
    return 0


def generate_manifest(sdk_source_root: Path | None = None) -> dict[str, Any]:
    sdk_source_root = resolve_sdk_source_root(str(sdk_source_root) if sdk_source_root else None)
    command_groups = build_command_groups(sdk_source_root)
    return {
        "version": 4,
        "sourceSpec": os.path.relpath(sdk_source_root, PACKAGE_ROOT),
        "sourceSpecSha256": hash_sdk_sources(sdk_source_root),
        "commandGroups": command_groups,
    }


def write_manifest(
    sdk_source_root: Path | None = None,
    output_path: Path | None = None,
) -> dict[str, Any]:
    sdk_source_root = resolve_sdk_source_root(str(sdk_source_root) if sdk_source_root else None)
    output_path = output_path or DEFAULT_OUTPUT_PATH
    manifest = generate_manifest(sdk_source_root)
    output_path.parent.mkdir(parents=True, exist_ok=True)
    output_path.write_text(json.dumps(manifest, indent=2, sort_keys=True) + "\n", encoding="utf-8")
    return manifest


def resolve_sdk_source_root(sdk_source_arg: str | None = None) -> Path:
    explicit_candidates = []
    if sdk_source_arg:
        explicit_candidates.append(Path(sdk_source_arg))
    env_value = os.getenv("AIDP_SDK_SOURCE_ROOT")
    if env_value:
        explicit_candidates.append(Path(env_value))

    for candidate in explicit_candidates:
        resolved = candidate.expanduser().resolve()
        if is_valid_sdk_source_root(resolved):
            return resolved
        raise FileNotFoundError(
            f"{resolved} is not a generated AIDP Python SDK source root. "
            "Expected generated client files under aidp_python_client/aidataplatform_dp."
        )

    for candidate in (DEFAULT_SDK_SOURCE_ROOT, DEFAULT_SDK_BUILD_ROOT):
        resolved = candidate.expanduser().resolve()
        if is_valid_sdk_source_root(resolved):
            return resolved

    raise FileNotFoundError(
        "Unable to find the generated AIDP Python SDK source. Set AIDP_SDK_SOURCE_ROOT or build the Python SDK first."
    )


def is_valid_sdk_source_root(sdk_source_root: Path) -> bool:
    package_dir = sdk_package_dir(sdk_source_root)
    return package_dir.exists() and bool(list(client_source_files(sdk_source_root)))


def sdk_package_dir(sdk_source_root: Path) -> Path:
    path = sdk_source_root
    for part in SDK_PACKAGE_PARTS:
        path /= part
    return path


def hash_sdk_sources(sdk_source_root: Path) -> str:
    root = sdk_package_dir(sdk_source_root)
    digest = hashlib.sha256()
    for source_file in sorted(root.rglob("*.py")):
        digest.update(str(source_file.relative_to(root)).encode("utf-8"))
        digest.update(b"\0")
        digest.update(source_file.read_bytes())
        digest.update(b"\0")
    return digest.hexdigest()


def build_command_groups(sdk_source_root: Path) -> list[dict[str, Any]]:
    groups = []
    for client_source in client_source_files(sdk_source_root):
        client_class_name = client_class_name_from_source(client_source)
        class_node = class_node_from_source(client_source, client_class_name)
        tag = client_class_name.removesuffix("Client")
        group_name = command_group_name(snake_to_cli_name(client_source.stem.removesuffix("_client")))
        commands = [
            build_command_from_method(sdk_source_root, method_node)
            for method_node in class_node.body
            if is_sdk_operation(method_node)
        ]
        commands = sorted(commands, key=lambda command: command["name"])
        description = command_group_description(tag, commands)
        apply_short_command_names(group_name, commands)
        commands = sorted(commands, key=lambda command: command["name"])
        ensure_unique_command_names(group_name, commands)
        group = {
            "name": group_name,
            "tag": tag,
            "clientClassName": client_class_name,
            "description": description,
            "commands": commands,
        }
        groups.append(group)
    return sorted(groups, key=lambda group: group["name"])


def command_group_name(default_name: str) -> str:
    for source_name, cli_name in COMMAND_GROUP_NAME_OVERRIDES:
        if source_name == default_name:
            return cli_name
    return default_name


def client_source_files(sdk_source_root: Path) -> list[Path]:
    package_dir = sdk_package_dir(sdk_source_root)
    if not package_dir.exists():
        return []
    return [
        source_file
        for source_file in sorted(package_dir.glob("*_client.py"))
        if not source_file.name.endswith("_client_composite_operations.py")
    ]


def client_class_name_from_source(source_file: Path) -> str:
    tree = ast.parse(source_file.read_text(encoding="utf-8"))
    for node in tree.body:
        if isinstance(node, ast.ClassDef) and node.name.endswith("Client"):
            return node.name
    raise RuntimeError(f"Unable to find generated client class in {source_file}")


def class_node_from_source(source_file: Path, class_name: str) -> ast.ClassDef:
    tree = ast.parse(source_file.read_text(encoding="utf-8"))
    for node in tree.body:
        if isinstance(node, ast.ClassDef) and node.name == class_name:
            return node
    raise RuntimeError(f"Unable to find {class_name} in {source_file}")


def is_sdk_operation(node: ast.AST) -> bool:
    return isinstance(node, ast.FunctionDef) and not node.name.startswith("_") and node.name != "__init__"


def build_command_from_method(sdk_source_root: Path, method_node: ast.FunctionDef) -> dict[str, Any]:
    doc = parse_method_doc(ast.get_docstring(method_node) or "")
    method_metadata = extract_method_metadata(method_node)
    if not method_metadata["resourcePath"] or not method_metadata["httpMethod"]:
        raise RuntimeError(f"Unable to extract request metadata for SDK method {method_node.name}")

    fields = command_fields_from_method(doc, method_metadata)
    body_field = next((field for field in fields if field["in"] == "body"), None)
    body_metadata = body_model_metadata(sdk_source_root, body_field.get("modelName", "") if body_field else "")
    command_name = command_name_from_sdk_method(method_node.name)
    description = doc["description"]
    command = {
        "name": command_name,
        "sdkMethodName": method_node.name,
        "operationId": snake_to_mixed(method_node.name),
        "httpMethod": method_metadata["httpMethod"],
        "path": method_metadata["resourcePath"],
        "section": command_section(command_name),
        "summary": first_sentence(description),
        "description": description,
        "deprecated": description.lower().startswith("deprecated"),
        "fields": fields,
        "bodyFields": body_metadata["fields"],
        "bodyRequiredFields": body_metadata["requiredFields"],
        "bodyEnumFields": body_metadata["enumFields"],
        "bodyModels": body_metadata["models"],
    }
    if body_field:
        command["bodyField"] = body_field["name"]
        command["bodyModel"] = body_field.get("modelName", "")
    return command


def parse_method_doc(docstring: str) -> dict[str, Any]:
    description = leading_description(docstring)
    params = {}
    for match in PARAM_BLOCK_PATTERN.finditer(docstring):
        type_text, name, raw_description = match.groups()
        params[name] = {
            "typeText": clean_text(type_text),
            "description": clean_param_description(raw_description),
            "required": "(required)" in raw_description.lower(),
        }
    return {"description": description, "params": params}


def leading_description(docstring: str) -> str:
    leading = re.split(r"^\s*:param\s+", docstring, maxsplit=1, flags=re.MULTILINE)[0]
    return clean_text(leading)


def clean_param_description(value: str) -> str:
    lines = [
        line.strip()
        for line in value.splitlines()
        if line.strip() and not line.strip().startswith("__ ")
    ]
    text = clean_text(" ".join(lines))
    text = re.sub(r"^\((?:required|optional)\)\s*", "", text, flags=re.IGNORECASE)
    return text


def extract_method_metadata(method_node: ast.FunctionDef) -> dict[str, Any]:
    metadata = {
        "resourcePath": "",
        "httpMethod": "",
        "pathParams": {},
        "queryParams": {},
        "headerParams": {},
        "bodyParam": "",
        "enumValues": {},
    }
    for node in ast.walk(method_node):
        if isinstance(node, ast.Assign):
            names = [target.id for target in node.targets if isinstance(target, ast.Name)]
            if "resource_path" in names and isinstance(node.value, ast.Constant):
                metadata["resourcePath"] = str(node.value.value)
            elif "method" in names and isinstance(node.value, ast.Constant):
                metadata["httpMethod"] = str(node.value.value).upper()
            elif "path_params" in names and isinstance(node.value, ast.Dict):
                metadata["pathParams"] = extract_param_map(node.value)
            elif "query_params" in names and isinstance(node.value, ast.Dict):
                metadata["queryParams"] = extract_param_map(node.value)
            elif "header_params" in names and isinstance(node.value, ast.Dict):
                metadata["headerParams"] = extract_param_map(node.value)
            else:
                for name in names:
                    if name.endswith("_allowed_values"):
                        metadata["enumValues"][name.removesuffix("_allowed_values")] = literal_list(node.value)
        elif isinstance(node, ast.Call) and is_call_api(node):
            for keyword in node.keywords:
                if keyword.arg == "body":
                    metadata["bodyParam"] = expression_name(keyword.value)
    return metadata


def is_call_api(node: ast.Call) -> bool:
    if isinstance(node.func, ast.Attribute) and node.func.attr == "call_api":
        return True
    if isinstance(node.func, ast.Attribute) and node.func.attr == "make_retrying_call":
        return True
    return False


def literal_list(node: ast.AST) -> list[Any]:
    try:
        value = ast.literal_eval(node)
    except (ValueError, SyntaxError):
        return []
    return list(value) if isinstance(value, (list, tuple)) else []


def extract_param_map(node: ast.Dict) -> dict[str, str]:
    params: dict[str, str] = {}
    for key_node, value_node in zip(node.keys, node.values):
        key = literal_string(key_node)
        value = param_value_name(value_node)
        if key and value:
            params[key] = value
    return params


def literal_string(node: ast.AST | None) -> str:
    if isinstance(node, ast.Constant) and isinstance(node.value, str):
        return node.value
    return ""


def param_value_name(node: ast.AST) -> str:
    if isinstance(node, ast.Name):
        return node.id
    if isinstance(node, ast.Call) and isinstance(node.func, ast.Attribute) and node.func.attr == "get":
        if node.args:
            return literal_string(node.args[0])
    return ""


def expression_name(node: ast.AST) -> str:
    return node.id if isinstance(node, ast.Name) else ""


def command_fields_from_method(doc: dict[str, Any], metadata: dict[str, Any]) -> list[dict[str, Any]]:
    fields = []
    params = doc["params"]
    enum_values = metadata["enumValues"]
    seen: set[str] = set()

    for original_name, parameter_name in metadata["pathParams"].items():
        fields.append(field_from_metadata(params, enum_values, parameter_name, original_name, "path", True))
        seen.add(parameter_name)

    body_param = metadata["bodyParam"]
    if body_param:
        param_doc = params.get(body_param, {})
        model_name = model_name_from_type(param_doc.get("typeText", ""))
        body_field = field_from_metadata(
            params,
            enum_values,
            body_param,
            model_name or body_param,
            "body",
            True,
        )
        if model_name:
            body_field["modelName"] = model_name
        body_field["type"] = "object"
        fields.append(body_field)
        seen.add(body_param)

    for original_name, parameter_name in metadata["queryParams"].items():
        if parameter_name in seen:
            continue
        fields.append(field_from_metadata(params, enum_values, parameter_name, original_name, "query", False))
        seen.add(parameter_name)

    for original_name, parameter_name in metadata["headerParams"].items():
        if parameter_name in seen or parameter_name in SKIPPED_KWARGS:
            continue
        fields.append(field_from_metadata(params, enum_values, parameter_name, original_name, "header", False))
        seen.add(parameter_name)

    return [remove_empty(field) for field in fields]


def field_from_metadata(
    params: dict[str, dict[str, Any]],
    enum_values: dict[str, list[Any]],
    parameter_name: str,
    original_name: str,
    location: str,
    required: bool,
) -> dict[str, Any]:
    param_doc = params.get(parameter_name, {})
    type_text = param_doc.get("typeText", "")
    model_name = model_name_from_type(type_text)
    field = {
        "name": parameter_name,
        "cliName": snake_to_cli_name(parameter_name),
        "originalName": original_name,
        "in": location,
        "required": bool(required or param_doc.get("required", False)),
        "description": param_doc.get("description", ""),
        "type": type_name_from_type(type_text),
        "modelName": model_name,
    }
    values = enum_values.get(parameter_name, [])
    if values:
        field["enumValues"] = values
    return field


def body_model_metadata(sdk_source_root: Path, model_name: str) -> dict[str, Any]:
    if not model_name:
        return {"fields": [], "requiredFields": [], "enumFields": {}, "models": {}}
    models = collect_body_models(sdk_source_root, model_name)
    root_model = models.get(model_name, {})
    return {
        "fields": root_model.get("fields", []),
        "requiredFields": root_model.get("requiredFields", []),
        "enumFields": root_model.get("enumFields", {}),
        "models": models,
    }


def collect_body_models(
    sdk_source_root: Path,
    model_name: str,
    models: dict[str, dict[str, Any]] | None = None,
) -> dict[str, dict[str, Any]]:
    models = models if models is not None else {}
    if not model_name or model_name in models:
        return models

    metadata = single_body_model_metadata(sdk_source_root, model_name)
    if not metadata:
        return models

    models[model_name] = metadata
    for field in metadata["fields"]:
        nested_model_name = field.get("modelName", "")
        if nested_model_name:
            collect_body_models(sdk_source_root, nested_model_name, models)
    for variant in metadata.get("variants", []):
        collect_body_models(sdk_source_root, variant.get("modelName", ""), models)
    return models


def single_body_model_metadata(sdk_source_root: Path, model_name: str) -> dict[str, Any]:
    model_source = model_source_file(sdk_source_root, model_name)
    if not model_source.exists():
        return {}

    class_node = class_node_from_source(model_source, model_name)
    swagger_types, attribute_map = model_field_maps(class_node)
    required_fields = required_model_fields(class_node, attribute_map)
    enum_fields = model_enum_fields(class_node, attribute_map)
    variants = model_variants(class_node)
    fields = []
    for python_name, type_text in sorted(swagger_types.items(), key=lambda item: attribute_map.get(item[0], item[0])):
        name = attribute_map.get(python_name, python_name)
        values = enum_fields.get(name, [])
        field = {
            "name": name,
            "required": name in required_fields,
            "type": type_name_from_type(type_text),
            "itemType": item_type_name_from_type(type_text),
            "modelName": model_name_from_type(type_text),
        }
        if values:
            field["enumValues"] = values
        fields.append(remove_empty(field))

    return {
        "fields": fields,
        "requiredFields": sorted(required_fields),
        "enumFields": enum_fields,
        "variants": variants,
    }


def model_source_file(sdk_source_root: Path, model_name: str) -> Path:
    return sdk_package_dir(sdk_source_root) / "models" / f"{camel_to_snake(model_name)}.py"


def model_field_maps(class_node: ast.ClassDef) -> tuple[dict[str, str], dict[str, str]]:
    swagger_types: dict[str, str] = {}
    attribute_map: dict[str, str] = {}
    for node in ast.walk(class_node):
        if not isinstance(node, ast.Assign):
            continue
        if any(is_self_attribute(target, "swagger_types") for target in node.targets):
            value = literal_dict(node.value)
            swagger_types = {str(key): str(item) for key, item in value.items()}
        elif any(is_self_attribute(target, "attribute_map") for target in node.targets):
            value = literal_dict(node.value)
            attribute_map = {str(key): str(item) for key, item in value.items()}
    return swagger_types, attribute_map


def literal_dict(node: ast.AST) -> dict[Any, Any]:
    try:
        value = ast.literal_eval(node)
    except (ValueError, SyntaxError):
        return {}
    return value if isinstance(value, dict) else {}


def is_self_attribute(node: ast.AST, name: str) -> bool:
    return (
        isinstance(node, ast.Attribute)
        and node.attr == name
        and isinstance(node.value, ast.Name)
        and node.value.id == "self"
    )


def required_model_fields(class_node: ast.ClassDef, attribute_map: dict[str, str]) -> set[str]:
    required = set()
    for node in class_node.body:
        if isinstance(node, ast.FunctionDef) and "**[Required]**" in (ast.get_docstring(node) or ""):
            required.add(attribute_map.get(node.name, node.name))
    return required


def model_enum_fields(class_node: ast.ClassDef, attribute_map: dict[str, str]) -> dict[str, list[Any]]:
    enum_fields = {}
    for node in class_node.body:
        if not isinstance(node, ast.FunctionDef):
            continue
        values = enum_values_from_function(node)
        if values:
            enum_fields[attribute_map.get(node.name, node.name)] = values
    return enum_fields


def enum_values_from_function(function_node: ast.FunctionDef) -> list[Any]:
    for node in ast.walk(function_node):
        if not isinstance(node, ast.Assign):
            continue
        if any(isinstance(target, ast.Name) and target.id == "allowed_values" for target in node.targets):
            return literal_list(node.value)
    return []


def model_variants(class_node: ast.ClassDef) -> list[dict[str, Any]]:
    get_subtype = next(
        (
            node
            for node in class_node.body
            if isinstance(node, ast.FunctionDef) and node.name == "get_subtype"
        ),
        None,
    )
    if get_subtype is None:
        return []

    discriminator_variable, discriminator_field = subtype_discriminator(get_subtype)
    if not discriminator_field:
        return []

    variants = []
    seen = set()
    for node in ast.walk(get_subtype):
        if not isinstance(node, ast.If):
            continue
        discriminator_value = subtype_discriminator_value(node.test, discriminator_variable)
        model_name = subtype_return_model_name(node)
        if not discriminator_value or not model_name or model_name == class_node.name:
            continue
        key = (discriminator_field, discriminator_value, model_name)
        if key in seen:
            continue
        seen.add(key)
        variants.append(
            {
                "discriminatorField": discriminator_field,
                "discriminatorValue": discriminator_value,
                "modelName": model_name,
            }
        )
    return variants


def subtype_discriminator(function_node: ast.FunctionDef) -> tuple[str, str]:
    for node in function_node.body:
        if not isinstance(node, ast.Assign):
            continue
        target = next((target for target in node.targets if isinstance(target, ast.Name)), None)
        if target is None or not isinstance(node.value, ast.Subscript):
            continue
        if not isinstance(node.value.value, ast.Name) or node.value.value.id != "object_dictionary":
            continue
        field = literal_string(node.value.slice)
        if field:
            return target.id, field
    return "", ""


def subtype_discriminator_value(test_node: ast.AST, discriminator_variable: str) -> str:
    if not isinstance(test_node, ast.Compare) or len(test_node.ops) != 1 or len(test_node.comparators) != 1:
        return ""
    if not isinstance(test_node.ops[0], ast.Eq):
        return ""
    left_matches = isinstance(test_node.left, ast.Name) and test_node.left.id == discriminator_variable
    right_matches = isinstance(test_node.comparators[0], ast.Name) and test_node.comparators[0].id == discriminator_variable
    if left_matches:
        return literal_string(test_node.comparators[0])
    if right_matches:
        return literal_string(test_node.left)
    return ""


def subtype_return_model_name(if_node: ast.If) -> str:
    for node in if_node.body:
        if isinstance(node, ast.Return):
            return literal_string(node.value)
    return ""


def type_name_from_type(type_text: str) -> str:
    normalized = type_text.strip()
    lowered = normalized.lower()
    if lowered in {"str", "string"}:
        return "string"
    if lowered in {"bool", "boolean"}:
        return "boolean"
    if lowered in {"int", "integer"}:
        return "integer"
    if lowered in {"float", "double", "number"}:
        return "number"
    if lowered.startswith("list[") or lowered.startswith("list("):
        return "array"
    if lowered.startswith("dict") or lowered in {"object", "object)"}:
        return "object"
    if lowered in {"datetime", "date"}:
        return "datetime"
    return "object" if model_name_from_type(normalized) else (normalized or "string")


def item_type_name_from_type(type_text: str) -> str:
    item_type_text = list_item_type_text(type_text)
    return type_name_from_type(item_type_text) if item_type_text else ""


def model_name_from_type(type_text: str) -> str:
    value = type_text.strip()
    model_match = re.search(r"(?:^|\.models\.)([A-Z][A-Za-z0-9]+)$", value)
    if model_match:
        return model_match.group(1)
    item_type_text = list_item_type_text(value)
    if item_type_text:
        return model_name_from_type(item_type_text)
    if re.match(r"^[A-Z][A-Za-z0-9]+$", value) and value not in {"String", "Object"}:
        return value
    return ""


def list_item_type_text(type_text: str) -> str:
    value = type_text.strip()
    for pattern in (r"list\[(.+)\]$", r"list\((.+)\)$"):
        match = re.match(pattern, value, flags=re.IGNORECASE)
        if match:
            return match.group(1).strip()
    return ""


def apply_short_command_names(group_name: str, commands: list[dict[str, Any]]) -> None:
    candidates = {command["sdkMethodName"]: short_command_name(group_name, command["name"]) for command in commands}
    candidate_counts: dict[str, int] = {}
    for candidate in candidates.values():
        candidate_counts[candidate] = candidate_counts.get(candidate, 0) + 1
    original_owners = {command["name"]: command["sdkMethodName"] for command in commands}

    used_names: set[str] = set()
    for command in commands:
        original = command["name"]
        candidate = candidates[command["sdkMethodName"]]
        candidate_is_other_original = (
            candidate in original_owners
            and original_owners[candidate] != command["sdkMethodName"]
        )
        if (
            candidate != original
            and candidate_counts[candidate] == 1
            and candidate not in used_names
            and not candidate_is_other_original
        ):
            command["name"] = candidate
        used_names.add(command["name"])


def short_command_name(group_name: str, command_name: str) -> str:
    group_tokens = group_name.split("-")
    command_tokens = command_name.split("-")
    if not command_tokens:
        return command_name

    candidate_tokens = drop_perform_wrapper(command_tokens)
    changed = candidate_tokens != command_tokens
    while True:
        next_tokens = short_command_tokens_once(group_tokens, candidate_tokens)
        if next_tokens is None:
            break
        candidate_tokens = next_tokens
        changed = True

    if not changed or not valid_short_command_tokens(candidate_tokens):
        return command_name
    return "-".join(candidate_tokens)


def drop_perform_wrapper(command_tokens: list[str]) -> list[str]:
    if (
        len(command_tokens) > 1
        and command_tokens[0] == "perform"
        and command_tokens[1] in ACTION_WORDS
    ):
        return command_tokens[1:]
    return command_tokens


def short_command_tokens_once(group_tokens: list[str], command_tokens: list[str]) -> list[str] | None:
    transforms = (
        strip_group_prefix_before_action,
        strip_group_after_action,
        strip_group_suffix,
        strip_group_tokens_after_action_sequence,
    )
    for transform in transforms:
        candidate = transform(group_tokens, command_tokens)
        if candidate is not None and candidate != command_tokens:
            return candidate
    return None


def strip_group_prefix_before_action(group_tokens: list[str], command_tokens: list[str]) -> list[str] | None:
    if len(command_tokens) <= len(group_tokens):
        return None
    if not equivalent_token_sequence(group_tokens, command_tokens[: len(group_tokens)]):
        return None
    candidate_tokens = command_tokens[len(group_tokens):]
    if not candidate_tokens or candidate_tokens[0] not in ACTION_WORDS:
        return None
    if not valid_short_command_tokens(candidate_tokens):
        return None
    return candidate_tokens


def strip_group_after_action(group_tokens: list[str], command_tokens: list[str]) -> list[str] | None:
    if command_tokens[0] not in ACTION_WORDS:
        return None
    group_start = 1
    group_end = group_start + len(group_tokens)
    if len(command_tokens) <= group_end:
        return None
    if not equivalent_token_sequence(group_tokens, command_tokens[group_start:group_end]):
        return None
    candidate_tokens = [command_tokens[0], *command_tokens[group_end:]]
    if not valid_short_command_tokens(candidate_tokens):
        return None
    return candidate_tokens


def strip_group_suffix(group_tokens: list[str], command_tokens: list[str]) -> list[str] | None:
    if command_tokens[0] not in SHORT_NAME_ACTIONS:
        return None
    if len(command_tokens) <= len(group_tokens):
        return None
    suffix = command_tokens[-len(group_tokens):]
    if not equivalent_token_sequence(group_tokens, suffix):
        return None

    candidate_tokens = command_tokens[: -len(group_tokens)]
    if candidate_tokens and candidate_tokens[-1] in DANGLING_CONNECTORS:
        candidate_tokens = candidate_tokens[:-1]
    if not valid_short_command_tokens(candidate_tokens):
        return None
    return candidate_tokens


def strip_group_tokens_after_action_sequence(group_tokens: list[str], command_tokens: list[str]) -> list[str] | None:
    for index, token in enumerate(command_tokens[1:], start=1):
        if not is_action_sequence(command_tokens[:index]):
            return None
        if not any(equivalent_token(group_token, token) for group_token in group_tokens):
            continue
        candidate_tokens = [*command_tokens[:index], *command_tokens[index + 1:]]
        if valid_short_command_tokens(candidate_tokens):
            return candidate_tokens
    return None


def is_action_sequence(tokens: list[str]) -> bool:
    return bool(tokens) and all(token in ACTION_WORDS for token in tokens)


def equivalent_token_sequence(left: list[str], right: list[str]) -> bool:
    return len(left) == len(right) and all(
        equivalent_token(left_token, right_token)
        for left_token, right_token in zip(left, right)
    )


def valid_short_command_tokens(tokens: list[str]) -> bool:
    return (
        bool(tokens)
        and tokens[0] not in DANGLING_CONNECTORS
        and tokens[-1] not in DANGLING_CONNECTORS
    )


def equivalent_token(left: str, right: str) -> bool:
    return left == right or singular_resource_word(left) == singular_resource_word(right)


def ensure_unique_command_names(group_name: str, commands: list[dict[str, Any]]) -> None:
    seen: dict[str, str] = {}
    duplicates = []
    for command in commands:
        previous = seen.setdefault(command["name"], command["sdkMethodName"])
        if previous != command["sdkMethodName"]:
            duplicates.append(command["name"])
    if duplicates:
        joined = ", ".join(sorted(set(duplicates)))
        raise RuntimeError(f"Duplicate command names in command group {group_name}: {joined}")


def command_name_from_sdk_method(method_name: str) -> str:
    stripped = PROVIDER_TOKEN_PATTERN.sub("_", method_name)
    stripped = re.sub(r"_+", "_", stripped).strip("_")
    return snake_to_cli_name(stripped)


def command_group_description(tag: str, commands: list[dict[str, Any]]) -> str:
    resources = command_group_resources(tag, commands)
    if resources:
        return sentence_from_phrase(format_phrase_list(resources))
    words = [word if word.isupper() else word.lower() for word in words_from_mixed(tag)]
    label = " ".join(words)
    if not label:
        return "API command group."
    return sentence_from_phrase(f"{label} resources")


def sentence_from_phrase(phrase: str) -> str:
    if not phrase:
        return ""
    sentence = phrase[:1].upper() + phrase[1:]
    return sentence if sentence.endswith(".") else f"{sentence}."


def command_group_resources(tag: str, commands: list[dict[str, Any]]) -> list[str]:
    resources: dict[str, dict[str, Any]] = {}
    for index, command in enumerate(commands):
        phrase = command_resource_phrase(command, tag)
        if not phrase:
            continue
        key = resource_key(phrase)
        if not key:
            continue
        resource = resources.setdefault(
            key,
            {"phrase": pluralize_resource_phrase(phrase), "count": 0, "firstIndex": index},
        )
        resource["count"] += 1

    merge_suffix_resources(resources)
    ranked = sorted(
        resources.values(),
        key=lambda resource: (-resource["count"], resource["firstIndex"], resource["phrase"]),
    )
    return [resource["phrase"] for resource in ranked[:4]]


def merge_suffix_resources(resources: dict[str, dict[str, Any]]) -> None:
    for key in list(resources):
        if key not in resources or len(key.split()) > 3:
            continue
        candidates = [
            other_key for other_key in resources
            if (
                other_key != key
                and other_key.endswith(f" {key}")
                and resources[other_key]["count"] >= resources[key]["count"]
            )
        ]
        if not candidates:
            continue
        target_key = sorted(
            candidates,
            key=lambda candidate: (
                -resources[candidate]["count"],
                resources[candidate]["firstIndex"],
                candidate,
            ),
        )[0]
        resources[target_key]["count"] += resources[key]["count"]
        resources[target_key]["firstIndex"] = min(
            resources[target_key]["firstIndex"],
            resources[key]["firstIndex"],
        )
        del resources[key]


def command_resource_phrase(command: dict[str, Any], tag: str) -> str:
    name_phrase = command_name_resource_phrase(command["name"], tag)
    if name_phrase and not is_generic_resource_phrase(name_phrase):
        return name_phrase
    summary_phrase = summary_resource_phrase(command.get("summary") or command.get("description") or "")
    return summary_phrase or name_phrase


def command_name_resource_phrase(command_name: str, tag: str) -> str:
    words = command_name.split("-")
    words = strip_action_words(words)
    words = strip_group_prefix(words, tag)
    words = strip_action_words(words)
    return normalize_resource_words(words)


def strip_action_words(words: list[str]) -> list[str]:
    while words and words[0] in ACTION_WORDS:
        words = words[1:]
    return words


def strip_group_prefix(words: list[str], tag: str) -> list[str]:
    tag_words = [word.lower() for word in words_from_mixed(tag)]
    if not tag_words or not words:
        return words
    if (
        len(tag_words) > 1
        and words[: len(tag_words)] == tag_words
        and len(words) - len(tag_words) >= 2
    ):
        return words[len(tag_words):]
    if (
        len(tag_words) == 1
        and words[0] == tag_words[0]
        and len(words) > 2
        and words[1] in ACTION_WORDS
    ):
        return words[1:]
    return words


def normalize_resource_words(words: list[str]) -> str:
    if "by" in words:
        words = words[: words.index("by")]
    if "with" in words and words[words.index("with"):] == ["with", "par"]:
        words = words[: words.index("with")]

    words = [
        RESOURCE_WORD_REPLACEMENTS.get(word, word)
        for word in words
        if word and word not in RESOURCE_NOISE_WORDS
    ]
    if not words:
        return ""

    words = strip_provider_resource_prefix(words)
    words = normalize_member_resource_words(words)
    words = normalize_permission_resource_words(words)
    words = normalize_status_resource_words(words)
    words = [word for word in words if word and word not in RESOURCE_NOISE_WORDS]
    return " ".join(words)


def strip_provider_resource_prefix(words: list[str]) -> list[str]:
    prefixes = (
        ["ai", "data", "platform", "workbench"],
        ["ai", "data", "platform"],
    )
    for prefix in prefixes:
        if words[: len(prefix)] == prefix:
            return words[len(prefix):]
    return words


def normalize_member_resource_words(words: list[str]) -> list[str]:
    if len(words) >= 3 and words[0] == "member" and words[1] in {"to", "from"}:
        return [*words[2:], "member"]
    return words


def normalize_permission_resource_words(words: list[str]) -> list[str]:
    permission_indexes = [
        index for index, word in enumerate(words)
        if word in {"permission", "permissions"}
    ]
    if not permission_indexes:
        return words

    before_permission = [
        word for word in words[: permission_indexes[-1]]
        if word not in ACTION_WORDS and word not in {"for", "on"}
    ]
    if before_permission:
        return [*before_permission, "permission"]
    return ["permission"]


def normalize_status_resource_words(words: list[str]) -> list[str]:
    if len(words) >= 4 and words[-3:] == ["async", "operation", "status"]:
        return [*words[:-3], "status"]
    return words


def summary_resource_phrase(summary: str) -> str:
    cleaned = clean_text(summary)
    if not cleaned:
        return ""
    cleaned = re.sub(r"^\([^)]*\)\s*", "", cleaned).lower()
    patterns = (
        r"^(?:gets?|returns?)\s+(?:a\s+)?list\s+of\s+(.+)$",
        r"^(?:gets?|returns?)\s+(?:detailed\s+)?(?:information|details)\s+(?:about|for|of)\s+(.+)$",
        r"^(?:creates?|updates?|deletes?|renames?|moves?|copies?|uploads?|downloads?|exports?|fetches?|repairs?|restores?)\s+(?:a|an|the|new)?\s*(.+)$",
        r"^(?:lists?)\s+(.+)$",
        r"^(?:searches?)\s+(.+)$",
    )
    for pattern in patterns:
        match = re.match(pattern, cleaned)
        if match:
            return normalize_summary_resource(match.group(1))
    return ""


def normalize_summary_resource(value: str) -> str:
    value = re.split(r"\s+(?:from|in|inside|on|to|with|using|by)\s+", value, maxsplit=1)[0]
    value = re.split(r"[.;:]", value, maxsplit=1)[0]
    return normalize_resource_words(value.replace("/", " ").replace("-", " ").split())


def is_generic_resource_phrase(phrase: str) -> bool:
    return phrase in UNCOUNTABLE_RESOURCE_WORDS and phrase not in {"content, contents", "content", "contents"}


def resource_key(phrase: str) -> str:
    words = phrase.split()
    if not words:
        return ""
    words[-1] = singular_resource_word(words[-1])
    return " ".join(words)


def pluralize_resource_phrase(phrase: str) -> str:
    words = phrase.split()
    if not words:
        return phrase
    if "or" in words:
        return pluralize_or_phrase(words)
    if words[-1] in UNCOUNTABLE_RESOURCE_WORDS:
        return phrase
    words[-1] = plural_resource_word(words[-1])
    return " ".join(words)


def pluralize_or_phrase(words: list[str]) -> str:
    index = words.index("or")
    if index == 0 or index == len(words) - 1:
        return " ".join(words)
    prefix = words[: index - 1]
    left = plural_resource_word(words[index - 1])
    right = plural_resource_word(words[index + 1])
    suffix = words[index + 2:]
    if suffix:
        return " ".join([*prefix, left, "or", right, *suffix])
    return " ".join([*prefix, left, "and", right])


def singular_resource_word(word: str) -> str:
    if word in UNCOUNTABLE_RESOURCE_WORDS:
        return word
    if word.endswith("ies") and len(word) > 3:
        return word[:-3] + "y"
    if word.endswith("ches") or word.endswith("shes"):
        return word[:-2]
    if word.endswith("xes"):
        return word[:-2]
    if word.endswith("sses"):
        return word[:-2]
    if word.endswith("s") and not word.endswith("ss"):
        return word[:-1]
    return word


def plural_resource_word(word: str) -> str:
    if word in UNCOUNTABLE_RESOURCE_WORDS or word.endswith("s"):
        return word
    if word.endswith("y") and len(word) > 1 and word[-2] not in "aeiou":
        return word[:-1] + "ies"
    if word.endswith(("ch", "sh", "x")):
        return word + "es"
    return word + "s"


def format_phrase_list(values: list[str]) -> str:
    if len(values) == 1:
        return values[0]
    if len(values) == 2:
        return f"{values[0]} and {values[1]}"
    return ", ".join(values[:-1]) + f", and {values[-1]}"


def command_section(command_name: str) -> str:
    return "Permission Commands" if "permission" in command_name.split("-") else "Available Commands"


def first_sentence(value: str) -> str:
    cleaned = clean_text(value)
    if not cleaned:
        return ""
    for delimiter in (". ", "! ", "? "):
        if delimiter in cleaned:
            return cleaned.split(delimiter, 1)[0].rstrip(".!?") + "."
    return cleaned if cleaned.endswith((".", "!", "?")) else f"{cleaned}."


def snake_to_mixed(value: str) -> str:
    return "".join(part.capitalize() for part in value.split("_") if part)


def snake_to_cli_name(value: str) -> str:
    return value.replace("_", "-")


def camel_to_snake(value: str) -> str:
    return "_".join(word.lower() for word in words_from_mixed(value))


def words_from_mixed(value: str) -> list[str]:
    normalized = re.sub(r"[^0-9A-Za-z]+", " ", str(value or ""))
    words: list[str] = []
    for token in normalized.split():
        words.extend(WORD_PATTERN.findall(token) or [token])
    return words


def clean_text(value: Any) -> str:
    text = re.sub(r"`([^`]+)`__", r"\1", str(value or ""))
    text = re.sub(r"`([^`]+)`", r"\1", text)
    text = re.sub(r"\[([^\]]+)\]\([^)]+\)", r"\1", text)
    return re.sub(r"\s+", " ", text).strip()


def remove_empty(value: dict[str, Any]) -> dict[str, Any]:
    return {key: item for key, item in value.items() if item not in ("", None, [], {})}


def count_commands(manifest: dict[str, Any]) -> int:
    return sum(len(group["commands"]) for group in manifest["commandGroups"])


if __name__ == "__main__":
    raise SystemExit(main())
