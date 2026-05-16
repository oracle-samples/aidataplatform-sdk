# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

from __future__ import annotations

import inspect
import re
from types import ModuleType


def discover_clients(sdk_module: ModuleType) -> dict[str, type]:
    clients: dict[str, type] = {}
    for class_name, client_cls in inspect.getmembers(sdk_module, inspect.isclass):
        if not is_generated_client(class_name, client_cls, sdk_module):
            continue
        clients[service_name_from_client_class(class_name)] = client_cls
    return dict(sorted(clients.items()))


def is_generated_client(class_name: str, client_cls: type, sdk_module: ModuleType) -> bool:
    if not class_name.endswith("Client"):
        return False
    if class_name.endswith("CompositeOperations"):
        return False
    return client_cls.__module__.startswith(sdk_module.__name__)


def service_name_from_client_class(class_name: str) -> str:
    stem = class_name.removesuffix("Client")
    words = re.findall(r"[A-Z]+(?=[A-Z][a-z]|\d|$)|[A-Z]?[a-z]+|\d+", stem)
    return "-".join(word.lower() for word in words)


def client_class_from_service_name(service_name: str) -> str:
    return "".join(part.capitalize() for part in service_name.split("-")) + "Client"
