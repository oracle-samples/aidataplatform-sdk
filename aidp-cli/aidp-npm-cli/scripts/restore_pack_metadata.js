const fs = require("fs");
const path = require("path");

const PACKAGE_ROOT = path.resolve(__dirname, "..");
const PACKAGE_JSON = path.join(PACKAGE_ROOT, "package.json");
const PACKAGE_BACKUP = path.join(PACKAGE_ROOT, ".package.json.prepack-backup");
const SHRINKWRAP = path.join(PACKAGE_ROOT, "npm-shrinkwrap.json");
const SHRINKWRAP_BACKUP = path.join(PACKAGE_ROOT, ".npm-shrinkwrap.json.prepack-backup");

function main() {
  restoreFile(PACKAGE_BACKUP, PACKAGE_JSON);
  restoreFile(SHRINKWRAP_BACKUP, SHRINKWRAP);
}

function restoreFile(backupPath, targetPath) {
  if (!fs.existsSync(backupPath)) {
    return;
  }
  fs.renameSync(backupPath, targetPath);
  console.log(`Restored ${path.relative(PACKAGE_ROOT, targetPath)}`);
}

main();
