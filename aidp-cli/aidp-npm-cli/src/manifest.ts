import { existsSync, readFileSync } from "fs";
import { join } from "path";

import { ServiceDefinition, serviceDescriptionFor } from "./discovery";

interface ManifestField {
  description?: string;
  enumValues?: string[];
  in: string;
  name: string;
  originalName: string;
  required: boolean;
  type?: string;
}

interface ManifestBodyField {
  enumValues?: string[];
  modelName?: string;
  name: string;
  required: boolean;
  type?: string;
}

interface ManifestOperation {
  bodyEnumFields?: Record<string, string[]>;
  bodyField?: string;
  bodyFields?: ManifestBodyField[];
  bodyModel?: string;
  bodyRequiredFields?: string[];
  description?: string;
  displayName: string;
  enumFields?: Record<string, string[]>;
  fields?: ManifestField[];
  method: string;
  methodName: string;
  operationId: string;
  path: string;
  requestFields: string[];
  requiredFields?: string[];
  summary?: string;
}

interface ManifestService {
  clientClassName: string;
  description?: string;
  name: string;
  operations: ManifestOperation[];
  tag: string;
}

interface OperationManifest {
  services: ManifestService[];
  sourceSpec: string;
  version: number;
}

export function loadManifestServices(): ServiceDefinition[] | undefined {
  const manifestPath = join(__dirname, "operation_manifest.json");
  if (!existsSync(manifestPath)) {
    return undefined;
  }

  const manifest = JSON.parse(readFileSync(manifestPath, "utf8")) as OperationManifest;
  return manifest.services.map((service) => ({
    clientClassName: service.clientClassName,
    description: service.description || serviceDescriptionFor(service.name),
    name: service.name,
    operations: service.operations.map((operation) => ({
      bodyEnumFields: operation.bodyEnumFields ?? {},
      bodyField: operation.bodyField,
      bodyFields: operation.bodyFields ?? [],
      bodyModel: operation.bodyModel,
      bodyRequiredFields: operation.bodyRequiredFields ?? [],
      description: operation.description ?? "",
      displayName: operation.displayName,
      enumFields: operation.enumFields ?? {},
      fields: operation.fields ?? [],
      methodName: operation.methodName,
      requestFields: operation.requestFields,
      requiredFields: operation.requiredFields ?? [],
      summary: operation.summary ?? ""
    }))
  }));
}
