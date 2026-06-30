const fs = require("fs");
const path = require("path");

const TYPESCRIPT_CLIENT_PACKAGE = "aidp-typescript-client";

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

const rawVersion = process.env.PKG_VERSION || process.env.BLD_VERSION;

if (!rawVersion) {
  console.error("PKG_VERSION or BLD_VERSION is required");
  process.exit(1);
}

const version = appendBuildNumberForBranchVersion(rawVersion);

for (const relativePath of ["package.json", "package-lock.json", "npm-shrinkwrap.json"]) {
  const filePath = path.join(__dirname, "..", relativePath);
  if (!fs.existsSync(filePath)) {
    continue;
  }

  const document = JSON.parse(fs.readFileSync(filePath, "utf8"));
  document.version = version;
  if (document.dependencies && document.dependencies[TYPESCRIPT_CLIENT_PACKAGE]) {
    document.dependencies[TYPESCRIPT_CLIENT_PACKAGE] = version;
  }

  if ((relativePath === "package-lock.json" || relativePath === "npm-shrinkwrap.json") && document.packages && document.packages[""]) {
    document.packages[""].version = version;
    if (document.packages[""].dependencies && document.packages[""].dependencies[TYPESCRIPT_CLIENT_PACKAGE]) {
      document.packages[""].dependencies[TYPESCRIPT_CLIENT_PACKAGE] = version;
    }
    if (document.packages["../../aidp-typescript-client"]) {
      document.packages["../../aidp-typescript-client"].version = version;
    }
  }

  fs.writeFileSync(filePath, `${JSON.stringify(document, null, 2)}\n`);
}
