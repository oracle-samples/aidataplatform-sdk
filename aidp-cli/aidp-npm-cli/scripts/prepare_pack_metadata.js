const fs = require("fs");
const path = require("path");

const PACKAGE_ROOT = path.resolve(__dirname, "..");
const SDK_PACKAGE_JSON = path.resolve(PACKAGE_ROOT, "..", "..", "aidp-typescript-client", "package.json");
const PACKAGE_JSON = path.join(PACKAGE_ROOT, "package.json");
const PACKAGE_BACKUP = path.join(PACKAGE_ROOT, ".package.json.prepack-backup");
const SHRINKWRAP = path.join(PACKAGE_ROOT, "npm-shrinkwrap.json");
const SHRINKWRAP_BACKUP = path.join(PACKAGE_ROOT, ".npm-shrinkwrap.json.prepack-backup");

function main() {
  if (fs.existsSync(PACKAGE_BACKUP) || fs.existsSync(SHRINKWRAP_BACKUP)) {
    throw new Error("Refusing to prepare package metadata because a prepack backup already exists.");
  }

  const packageJson = readJson(PACKAGE_JSON);
  const sdkPackageJson = readJson(SDK_PACKAGE_JSON);
  const sdkVersion = sdkPackageJson.version;
  if (!sdkVersion) {
    throw new Error(`Unable to determine aidp-typescript-client version from ${SDK_PACKAGE_JSON}`);
  }

  fs.copyFileSync(PACKAGE_JSON, PACKAGE_BACKUP);
  if (fs.existsSync(SHRINKWRAP)) {
    fs.renameSync(SHRINKWRAP, SHRINKWRAP_BACKUP);
  }

  packageJson.dependencies = {
    ...packageJson.dependencies,
    "aidp-typescript-client": sdkVersion
  };
  delete packageJson.bundledDependencies;
  delete packageJson.bundleDependencies;

  fs.writeFileSync(PACKAGE_JSON, `${JSON.stringify(packageJson, null, 2)}\n`, "utf8");
  console.log(`Prepared aidp-cli package metadata with aidp-typescript-client@${sdkVersion}`);
}

function readJson(filePath) {
  return JSON.parse(fs.readFileSync(filePath, "utf8"));
}

main();
