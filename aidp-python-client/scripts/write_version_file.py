#!/usr/bin/env python3
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import os
import re
from typing import Optional


def append_build_number_for_branch_version(version: str, build_number: Optional[str]) -> str:
    if build_number and "-" in version and not version.endswith(f".{build_number}"):
        if version.endswith("-SNAPSHOT"):
            return f"{version[:-9]}.{build_number}-SNAPSHOT"
        return f"{version}.{build_number}"
    return version


def to_pep440(version: str) -> str:
    """
    Convert Build Service version to the minimal PEP 440-compliant form that preserves intent.
    Input examples from ocibuild:
      - 0.1.14
      - 0.1.14-PR-15989
      - 0.1.14-release-3.2.0.2605W4
      - 0.1.14-feature/my_change-SNAPSHOT

    Output (PEP 440):
      - 0.1.14
      - 0.1.14+PR.15989
      - 0.1.14+release.3.2.0.2605W4
      - 0.1.14.dev0+feature.my.change
    Rules:
      - base = numeric release prefix before any branch suffix
      - branch suffix is encoded as local version metadata, allowing only [A-Za-z0-9.] by replacing non-alnum with '.'
      - SNAPSHOT -> dev0 (pre-release), placed before +local per PEP 440 ordering
    """
    raw = version.strip().replace("/", "-")  # normalize slashes to dashes first
    is_snapshot = raw.endswith("-SNAPSHOT")
    if is_snapshot:
        raw = raw[:-9]

    if "-" in raw:
        base, branch_part = raw.split("-", 1)
        branch_tag = re.sub(r"[^0-9A-Za-z]+", ".", branch_part).strip(".") or None
    else:
        base = raw
        branch_tag = None

    pep = base if re.match(r"^\d+(?:\.\d+)*$", base) else "0.0.0"
    if is_snapshot:
        pep += ".dev0"
    if branch_tag:
        pep += f"+{branch_tag}"
    return pep


def main():
    raw = os.environ.get("PKG_VERSION") or os.environ.get("BLD_VERSION") or "0.0.0"
    raw = append_build_number_for_branch_version(raw, os.environ.get("BLD_NUMBER"))
    ver = to_pep440(raw)
    out_dir = os.path.dirname(os.path.abspath(__file__))
    project_root = os.path.abspath(os.path.join(out_dir, os.pardir, "src"))
    os.makedirs(project_root, exist_ok=True)
    with open(os.path.join(project_root, "VERSION"), "w", encoding="utf-8") as f:
        f.write(ver)
    print(f"Wrote VERSION='{ver}' to {project_root}/VERSION (from '{raw}')")


if __name__ == "__main__":
    main()
