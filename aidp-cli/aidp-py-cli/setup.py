# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

from __future__ import annotations

import importlib.util
import json
import shutil
from pathlib import Path

from setuptools import setup
from setuptools.command.build_py import build_py as setuptools_build_py
from setuptools.command.sdist import sdist as setuptools_sdist


PACKAGE_ROOT = Path(__file__).resolve().parent


def write_generated_manifest(manifest_path: Path, allow_existing: bool) -> None:
    script_path = PACKAGE_ROOT / "scripts" / "generate_manifest.py"
    if not script_path.exists():
        if allow_existing and manifest_path.exists():
            return
        raise RuntimeError(f"Unable to find manifest generator at {script_path}")

    spec = importlib.util.spec_from_file_location("aidp_cli_generate_manifest", script_path)
    if spec is None or spec.loader is None:
        raise RuntimeError(f"Unable to load manifest generator from {script_path}")
    module = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(module)
    try:
        manifest = module.generate_manifest()
    except FileNotFoundError:
        if allow_existing and manifest_path.exists():
            return
        raise
    manifest_path.parent.mkdir(parents=True, exist_ok=True)
    manifest_path.write_text(json.dumps(manifest, indent=2, sort_keys=True) + "\n", encoding="utf-8")


class build_py(setuptools_build_py):
    def run(self) -> None:
        self.force = True
        build_package_dir = Path(self.build_lib) / "aidp_cli"
        if build_package_dir.exists():
            shutil.rmtree(build_package_dir)
        super().run()
        manifest_path = build_package_dir / "operation_manifest.json"
        write_generated_manifest(manifest_path, allow_existing=True)


class sdist(setuptools_sdist):
    def run(self) -> None:
        manifest_path = PACKAGE_ROOT / "src" / "aidp_cli" / "operation_manifest.json"
        write_generated_manifest(manifest_path, allow_existing=True)
        super().run()


setup(cmdclass={"build_py": build_py, "sdist": sdist})
