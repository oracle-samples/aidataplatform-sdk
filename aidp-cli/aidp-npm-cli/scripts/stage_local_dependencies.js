const fs = require("fs");
const path = require("path");

const PACKAGE_ROOT = path.resolve(__dirname, "..");
const SDK_ROOT = path.resolve(PACKAGE_ROOT, "..", "..", "aidp-typescript-client");
const STAGED_SDK_DIR = path.join(PACKAGE_ROOT, "node_modules", "aidp-typescript-client");
const SDK_PACKAGE_FILES = [
  "package.json",
  "npm-shrinkwrap.json",
  "index.ts",
  "lib",
  "dist"
];
const OPTIONAL_SDK_PACKAGE_FILES = [
  "LICENSE",
  "LICENSE.txt",
  "NOTICE",
  "NOTICE.txt",
  "THIRD_PARTY_LICENSES",
  "THIRD_PARTY_LICENSES.txt"
];

function main() {
  assertDirectory(SDK_ROOT, "AIDP TypeScript client root");
  assertDirectory(path.join(SDK_ROOT, "dist"), "AIDP TypeScript client dist");
  stagePackageDirectory(SDK_ROOT, STAGED_SDK_DIR);
  console.log(`Staged aidp-typescript-client at ${path.relative(PACKAGE_ROOT, STAGED_SDK_DIR)}`);
}

function stagePackageDirectory(sourceDir, targetDir) {
  fs.rmSync(targetDir, { force: true, recursive: true });
  fs.mkdirSync(targetDir, { recursive: true });

  for (const relativePath of SDK_PACKAGE_FILES) {
    copyRequiredPath(sourceDir, targetDir, relativePath);
  }

  for (const relativePath of OPTIONAL_SDK_PACKAGE_FILES) {
    copyOptionalPath(sourceDir, targetDir, relativePath);
  }
}

function copyRequiredPath(sourceDir, targetDir, relativePath) {
  const sourcePath = path.join(sourceDir, relativePath);
  if (!fs.existsSync(sourcePath)) {
    throw new Error(`Required SDK package path is missing: ${sourcePath}`);
  }
  copyPath(sourcePath, path.join(targetDir, relativePath));
}

function copyOptionalPath(sourceDir, targetDir, relativePath) {
  const sourcePath = path.join(sourceDir, relativePath);
  if (fs.existsSync(sourcePath)) {
    copyPath(sourcePath, path.join(targetDir, relativePath));
  }
}

function copyPath(sourcePath, targetPath) {
  fs.cpSync(sourcePath, targetPath, {
    dereference: true,
    errorOnExist: false,
    force: true,
    recursive: true
  });
}

function assertDirectory(directoryPath, description) {
  if (!fs.existsSync(directoryPath) || !fs.statSync(directoryPath).isDirectory()) {
    throw new Error(
      `${description} is missing at ${directoryPath}. ` +
        "Run the TypeScript client build before packing the npm CLI."
    );
  }
}

main();
