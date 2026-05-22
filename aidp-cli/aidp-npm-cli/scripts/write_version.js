const fs = require("fs");
const path = require("path");

const version = process.env.PKG_VERSION || process.env.BLD_VERSION;

if (!version) {
  console.error("PKG_VERSION or BLD_VERSION is required");
  process.exit(1);
}

for (const relativePath of ["package.json", "package-lock.json", "npm-shrinkwrap.json"]) {
  const filePath = path.join(__dirname, "..", relativePath);
  if (!fs.existsSync(filePath)) {
    continue;
  }

  const document = JSON.parse(fs.readFileSync(filePath, "utf8"));
  document.version = version;

  if ((relativePath === "package-lock.json" || relativePath === "npm-shrinkwrap.json") && document.packages && document.packages[""]) {
    document.packages[""].version = version;
    if (document.packages["../../aidp-typescript-client"]) {
      document.packages["../../aidp-typescript-client"].version = version;
    }
  }

  fs.writeFileSync(filePath, `${JSON.stringify(document, null, 2)}\n`);
}
