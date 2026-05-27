# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

from __future__ import annotations

import re
from typing import Any

from aidp_cli.manifest import BodyField, CommandDefinition


MAX_BODY_SCAN_DEPTH = 20


def _normalized_identifier(value: str) -> str:
    return re.sub(r"[^A-Za-z0-9]", "", value).lower()


SENSITIVE_BODY_FIELD_NAMES = {
    _normalized_identifier(name)
    for name in (
        "apiKey",
        "accessToken",
        "clientSecret",
        "credentialDetails",
        "passphrase",
        "password",
        "personalAccessToken",
        "privateApiKey",
        "privateKey",
        "refreshToken",
        "secret",
        "secretContentBase64",
        "secretId",
        "secretKey",
        "secretTokenPair",
        "secretValue",
        "token",
    )
}


def json_body_argument_source(value: str) -> str:
    if value == "-":
        return "stdin"
    if value.startswith("@") or value.startswith("file://"):
        return "file"
    return "inline"


def command_has_sensitive_body_fields(command: CommandDefinition) -> bool:
    return _fields_contain_sensitive_body_field(
        command,
        _root_body_fields(command),
        "",
        (),
        set(),
        0,
    )


def body_contains_sensitive_field(command: CommandDefinition, body: Any) -> bool:
    return _value_contains_sensitive_field(command, body, _root_body_model_name(command), (), 0)


def _fields_contain_sensitive_body_field(
    command: CommandDefinition,
    fields: tuple[BodyField, ...],
    model_name: str,
    parent_path: tuple[str, ...],
    seen_models: set[str],
    depth: int,
) -> bool:
    if depth >= MAX_BODY_SCAN_DEPTH:
        return False

    for field in fields:
        path = (*parent_path, field.name)
        if _is_sensitive_field(field.name, model_name, path):
            return True
        if not field.model_name or field.model_name in seen_models:
            continue
        model = command.body_models.get(field.model_name)
        if model is None:
            continue
        next_seen = set(seen_models)
        next_seen.add(field.model_name)
        if _fields_contain_sensitive_body_field(
            command,
            model.fields,
            field.model_name,
            path,
            next_seen,
            depth + 1,
        ):
            return True
    return False


def _value_contains_sensitive_field(
    command: CommandDefinition,
    value: Any,
    model_name: str,
    parent_path: tuple[str, ...],
    depth: int,
) -> bool:
    if depth >= MAX_BODY_SCAN_DEPTH:
        return False
    if isinstance(value, list):
        return any(
            _value_contains_sensitive_field(command, item, model_name, parent_path, depth + 1)
            for item in value
        )
    if not isinstance(value, dict):
        return False

    for key, nested_value in value.items():
        path = (*parent_path, str(key))
        if _is_sensitive_field(str(key), model_name, path):
            return True
        field = _body_field_for_key(command, model_name, str(key))
        next_model_name = field.model_name if field is not None else ""
        if _value_contains_sensitive_field(command, nested_value, next_model_name, path, depth + 1):
            return True
    return False


def _is_sensitive_field(field_name: str, model_name: str, path: tuple[str, ...]) -> bool:
    normalized_name = _normalized_identifier(field_name)
    if normalized_name in SENSITIVE_BODY_FIELD_NAMES:
        return True
    if normalized_name == "credential":
        return _normalized_identifier(model_name) == "gitconfig" or _parent_path_name(path) == "gitconfig"
    return False


def _body_field_for_key(command: CommandDefinition, model_name: str, key: str) -> BodyField | None:
    normalized_key = _normalized_identifier(key)
    return next(
        (
            field
            for field in _fields_for_model(command, model_name)
            if _normalized_identifier(field.name) == normalized_key
        ),
        None,
    )


def _fields_for_model(command: CommandDefinition, model_name: str) -> tuple[BodyField, ...]:
    if model_name and model_name in command.body_models:
        return command.body_models[model_name].fields
    return _root_body_fields(command)


def _root_body_fields(command: CommandDefinition) -> tuple[BodyField, ...]:
    model_name = _root_body_model_name(command)
    if model_name and model_name in command.body_models:
        return command.body_models[model_name].fields
    return command.body_fields


def _root_body_model_name(command: CommandDefinition) -> str:
    return command.body_model if command.body_model and command.body_model in command.body_models else ""


def _parent_path_name(path: tuple[str, ...]) -> str:
    return _normalized_identifier(path[-2]) if len(path) >= 2 else ""
