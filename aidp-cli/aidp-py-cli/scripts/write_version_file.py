#!/usr/bin/env python3
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import os
import re


def to_pep440(version: str) -> str:
    """
    Convert Build Service version to the minimal PEP 440-compliant form that preserves intent.
    Input examples from ocibuild:
      - 0.1.3095
      - 0.1-PR-11334.21924
      - 0.1-feature/my_change.1234-SNAPSHOT

    Output (PEP 440):
      - 0.1.3095
      - 0.1.21924+PR.11334
      - 0.1.1234.dev0+feature.my_change
    Rules:
      - base = numeric prefix before branch/build (e.g., 0.1)
      - build = last dot-separated token (digits), appended as the final release segment
      - branch suffix (between base and build) encoded as local version (+tag), allowing only [A-Za-z0-9.] by replacing non-alnum with '.'
      - SNAPSHOT -> dev0 (pre-release), placed before +local per PEP 440 ordering
    """
    raw = version.strip().replace("/", "-")
    is_snapshot = raw.endswith("-SNAPSHOT")
    if is_snapshot:
        raw = raw[:-9]

    if "." not in raw:
        base = "0.0"
        build = "0"
        branch_tag = None
    else:
        prefix, build = raw.rsplit(".", 1)
        build = re.sub(r"\D", "", build) or "0"

        if "-" in prefix:
            base_part, branch_part = prefix.split("-", 1)
            base = base_part
            branch_tag = re.sub(r"[^0-9A-Za-z]+", ".", branch_part).strip(".") or None
        else:
            base = prefix
            branch_tag = None

    pep = f"{base}.{build}"
    if is_snapshot:
        pep += ".dev0"
    if branch_tag:
        pep += f"+{branch_tag}"
    return pep


def main():
    raw = os.environ.get("PKG_VERSION") or os.environ.get("BLD_VERSION") or "0.0.0"
    ver = to_pep440(raw)
    project_root = os.path.abspath(os.path.join(os.path.dirname(__file__), os.pardir))
    with open(os.path.join(project_root, "VERSION"), "w", encoding="utf-8") as f:
        f.write(ver)
    print(f"Wrote VERSION='{ver}' to {project_root}/VERSION (from '{raw}')")


if __name__ == "__main__":
    main()
