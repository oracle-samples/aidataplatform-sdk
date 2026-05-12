import { dirname, join } from "path";

import { CliError } from "./errors";

export function loadSdkModule(): Record<string, unknown> {
  try {
    return require("aidp-typescript-client") as Record<string, unknown>;
  } catch (error) {
    const detail = error instanceof Error ? error.message : String(error);
    throw new CliError(
      `Unable to load aidp-typescript-client. Build or install the TypeScript SDK before running the CLI. ${detail}`
    );
  }
}

export function loadSdkClientClass(
  clientClassName: string
): new (args: Record<string, unknown>) => Record<string, unknown> {
  const rootExport = loadOptionalRootSdkModule();
  const rootClientClass = rootExport[clientClassName];
  if (typeof rootClientClass === "function") {
    return rootClientClass as new (args: Record<string, unknown>) => Record<string, unknown>;
  }

  const clientModule = loadGeneratedClientModule();
  const generatedClientClass = clientModule[clientClassName];
  if (typeof generatedClientClass === "function") {
    return generatedClientClass as new (args: Record<string, unknown>) => Record<string, unknown>;
  }

  throw new CliError(
    `Unable to load ${clientClassName} from aidp-typescript-client. ` +
      "Ensure the generated TypeScript SDK contains and exports this client."
  );
}

function loadOptionalRootSdkModule(): Record<string, unknown> {
  try {
    return require("aidp-typescript-client") as Record<string, unknown>;
  } catch {
    return {};
  }
}

function loadGeneratedClientModule(): Record<string, unknown> {
  try {
    const packageJsonPath = require.resolve("aidp-typescript-client/package.json");
    return require(join(dirname(packageJsonPath), "dist", "lib", "client.js")) as Record<
      string,
      unknown
    >;
  } catch (error) {
    const detail = error instanceof Error ? error.message : String(error);
    throw new CliError(
      `Unable to load generated clients from aidp-typescript-client. ` +
        `Build or install the TypeScript SDK before invoking APIs. ${detail}`
    );
  }
}
