# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

from __future__ import annotations

import json
from dataclasses import dataclass
from importlib import resources
from typing import Any


MANIFEST_FILENAME = "operation_manifest.json"


@dataclass(frozen=True)
class CommandField:
    name: str
    cli_name: str
    original_name: str
    location: str
    required: bool
    description: str = ""
    type_name: str = ""
    model_name: str = ""
    enum_values: tuple[Any, ...] = ()


@dataclass(frozen=True)
class BodyField:
    name: str
    required: bool
    type_name: str = ""
    item_type: str = ""
    model_name: str = ""
    enum_values: tuple[Any, ...] = ()


@dataclass(frozen=True)
class BodyVariant:
    discriminator_field: str
    discriminator_value: Any
    model_name: str


@dataclass(frozen=True)
class BodyModel:
    name: str
    fields: tuple[BodyField, ...]
    required_fields: tuple[str, ...]
    enum_fields: dict[str, tuple[Any, ...]]
    variants: tuple[BodyVariant, ...] = ()


@dataclass(frozen=True)
class CommandDefinition:
    name: str
    sdk_method_name: str
    operation_id: str
    http_method: str
    path: str
    section: str
    summary: str
    description: str
    deprecated: bool
    fields: tuple[CommandField, ...]
    body_field: CommandField | None
    body_model: str
    body_fields: tuple[BodyField, ...]
    body_required_fields: tuple[str, ...]
    body_enum_fields: dict[str, tuple[Any, ...]]
    body_models: dict[str, BodyModel]


@dataclass(frozen=True)
class CommandGroup:
    name: str
    tag: str
    client_class_name: str
    description: str
    commands: tuple[CommandDefinition, ...]


@dataclass(frozen=True)
class CommandManifest:
    version: int
    source_spec: str
    source_spec_sha256: str
    command_groups: tuple[CommandGroup, ...]


def load_command_manifest() -> CommandManifest:
    try:
        content = resources.files(__package__).joinpath(MANIFEST_FILENAME).read_text(encoding="utf-8")
    except FileNotFoundError as exc:
        raise RuntimeError(
            "AIDP command manifest is missing. Regenerate the CLI package before running aidp."
        ) from exc
    try:
        raw = json.loads(content)
        if not isinstance(raw, dict):
            raise TypeError("manifest root must be a JSON object")
        if not isinstance(raw.get("commandGroups"), list):
            raise TypeError("manifest commandGroups must be a list")
        return manifest_from_dict(raw)
    except (json.JSONDecodeError, KeyError, TypeError, ValueError) as exc:
        raise RuntimeError(
            "AIDP command manifest is invalid. Regenerate the CLI package before running aidp."
        ) from exc


def manifest_from_dict(raw: dict[str, Any]) -> CommandManifest:
    return CommandManifest(
        version=int(raw.get("version", 0)),
        source_spec=str(raw.get("sourceSpec", "")),
        source_spec_sha256=str(raw.get("sourceSpecSha256", "")),
        command_groups=tuple(group_from_dict(group) for group in raw.get("commandGroups", [])),
    )


def group_from_dict(raw: dict[str, Any]) -> CommandGroup:
    return CommandGroup(
        name=str(raw["name"]),
        tag=str(raw.get("tag", "")),
        client_class_name=str(raw["clientClassName"]),
        description=str(raw.get("description", "")),
        commands=tuple(command_from_dict(command) for command in raw.get("commands", [])),
    )


def command_from_dict(raw: dict[str, Any]) -> CommandDefinition:
    fields = tuple(field_from_dict(field) for field in raw.get("fields", []))
    body_field_name = raw.get("bodyField")
    return CommandDefinition(
        name=str(raw["name"]),
        sdk_method_name=str(raw["sdkMethodName"]),
        operation_id=str(raw.get("operationId", "")),
        http_method=str(raw.get("httpMethod", "")),
        path=str(raw.get("path", "")),
        section=str(raw.get("section", "Available Commands")),
        summary=str(raw.get("summary", "")),
        description=str(raw.get("description", "")),
        deprecated=bool(raw.get("deprecated", False)),
        fields=fields,
        body_field=next((field for field in fields if field.name == body_field_name), None),
        body_model=str(raw.get("bodyModel", "")),
        body_fields=tuple(body_field_from_dict(field) for field in raw.get("bodyFields", [])),
        body_required_fields=tuple(str(field) for field in raw.get("bodyRequiredFields", [])),
        body_enum_fields={
            str(name): tuple(values)
            for name, values in raw.get("bodyEnumFields", {}).items()
        },
        body_models={
            str(name): body_model_from_dict(str(name), model)
            for name, model in raw.get("bodyModels", {}).items()
        },
    )


def field_from_dict(raw: dict[str, Any]) -> CommandField:
    return CommandField(
        name=str(raw["name"]),
        cli_name=str(raw["cliName"]),
        original_name=str(raw.get("originalName", raw["name"])),
        location=str(raw.get("in", "")),
        required=bool(raw.get("required", False)),
        description=str(raw.get("description", "")),
        type_name=str(raw.get("type", "")),
        model_name=str(raw.get("modelName", "")),
        enum_values=tuple(raw.get("enumValues", [])),
    )


def body_field_from_dict(raw: dict[str, Any]) -> BodyField:
    return BodyField(
        name=str(raw["name"]),
        required=bool(raw.get("required", False)),
        type_name=str(raw.get("type", "")),
        item_type=str(raw.get("itemType", "")),
        model_name=str(raw.get("modelName", "")),
        enum_values=tuple(raw.get("enumValues", [])),
    )


def body_model_from_dict(name: str, raw: dict[str, Any]) -> BodyModel:
    return BodyModel(
        name=name,
        fields=tuple(body_field_from_dict(field) for field in raw.get("fields", [])),
        required_fields=tuple(str(field) for field in raw.get("requiredFields", [])),
        enum_fields={
            str(field_name): tuple(values)
            for field_name, values in raw.get("enumFields", {}).items()
        },
        variants=tuple(body_variant_from_dict(variant) for variant in raw.get("variants", [])),
    )


def body_variant_from_dict(raw: dict[str, Any]) -> BodyVariant:
    return BodyVariant(
        discriminator_field=str(raw["discriminatorField"]),
        discriminator_value=raw.get("discriminatorValue"),
        model_name=str(raw["modelName"]),
    )


def find_command_group(manifest: CommandManifest, name: str) -> CommandGroup | None:
    normalized = normalize_lookup_name(name)
    return next(
        (
            group
            for group in manifest.command_groups
            if normalize_lookup_name(group.name) == normalized
        ),
        None,
    )


def find_command(group: CommandGroup, name: str) -> CommandDefinition | None:
    normalized = normalize_lookup_name(name)
    return next(
        (
            command
            for command in group.commands
            if normalize_lookup_name(command.name) == normalized
        ),
        None,
    )


def normalize_lookup_name(value: str) -> str:
    return value.replace("-", "").replace("_", "").lower()
