const fs = require("fs");
const path = require("path");

function appendBuildNumberForBranchVersion(version) {
  const buildNumber = process.env.BLD_NUMBER;
  if (buildNumber && version.includes("-") && !version.endsWith(`.${buildNumber}`)) {
    if (version.endsWith("-SNAPSHOT")) {
      return `${version.slice(0, -9)}.${buildNumber}-SNAPSHOT`;
    }
    return `${version}.${buildNumber}`;
  }
  return version;
}

function readJson(filePath) {
  return JSON.parse(fs.readFileSync(filePath, "utf8"));
}

function writeJson(filePath, document) {
  fs.writeFileSync(filePath, `${JSON.stringify(document, null, 2)}\n`);
}

const packageRoot = path.join(__dirname, "..");
const packageJsonPath = path.join(packageRoot, "package.json");
const packageJson = readJson(packageJsonPath);
const rawVersion = process.env.PKG_VERSION || process.env.BLD_VERSION || packageJson.version;

if (!rawVersion) {
  console.error("PKG_VERSION, BLD_VERSION, or package.json version is required");
  process.exit(1);
}

const version = appendBuildNumberForBranchVersion(rawVersion);

packageJson.version = version;
packageJson.dependencies = packageJson.dependencies || {};
packageJson.dependencies["aidp-typescript-client"] = version;
delete packageJson.bundledDependencies;
delete packageJson.bundleDependencies;

packageJson.scripts = packageJson.scripts || {};
delete packageJson.scripts.prepack;
delete packageJson.scripts.postpack;

packageJson.files = packageJson.files || [];
for (const requiredFile of ["README.md", "LICENSE.txt", "NOTICE.txt"]) {
  if (!packageJson.files.includes(requiredFile)) {
    packageJson.files.push(requiredFile);
  }
}

writeJson(packageJsonPath, packageJson);

for (const relativePath of ["package-lock.json", "npm-shrinkwrap.json"]) {
  const lockPath = path.join(packageRoot, relativePath);
  if (fs.existsSync(lockPath)) {
    fs.unlinkSync(lockPath);
  }
}
