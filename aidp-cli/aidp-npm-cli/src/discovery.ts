import {
  camelToSnake,
  normalizedLookupName,
  serviceNameFromClientClass
} from "./names";

export interface OperationDefinition {
  bodyEnumFields: Record<string, string[]>;
  bodyField?: string;
  bodyFields: OperationBodyField[];
  bodyModel?: string;
  bodyRequiredFields: string[];
  description: string;
  displayName: string;
  enumFields: Record<string, string[]>;
  fields: OperationField[];
  methodName: string;
  requestFields: string[];
  requiredFields: string[];
  summary: string;
}

export interface OperationBodyField {
  enumValues?: string[];
  modelName?: string;
  name: string;
  required: boolean;
  type?: string;
}

export interface OperationField {
  description?: string;
  enumValues?: string[];
  in: string;
  name: string;
  originalName: string;
  required: boolean;
  type?: string;
}

export interface ServiceDefinition {
  clientClass?: new (args: Record<string, unknown>) => Record<string, unknown>;
  clientClassName: string;
  description: string;
  name: string;
  operations: OperationDefinition[];
}

const SERVICE_DESCRIPTIONS: Record<string, string> = {
  audit: "Search and manage AIDP audit logs.",
  bundle: "Create, deploy, inspect deployment status, and purge AIDP bundles.",
  catalog: "Create, list, refresh, update, delete, test, and manage permissions for catalogs.",
  cluster: "Create, list, inspect, start, stop, restart, update, delete, and manage Spark clusters.",
  "credential-store": "Create, list, inspect, update, and delete data lake credentials.",
  "delta-share": "Manage delta sharing recipients, shares, permissions, recipients, and shared data assets.",
  "git-service": "Manage workspace Git repositories, branches, diffs, pull, merge, rebase, reset, and conflict resolution.",
  "ml-ops": "Manage experiments, experiment runs, registered models, model versions, metrics, parameters, tags, and artifacts.",
  notebook: "Manage notebook content and interactive sessions inside a workspace.",
  role: "Create, list, inspect, update, delete roles and manage role members and permissions.",
  schema: "Manage catalogs' schemas, tables, views, permissions, refresh, inference, and PAR access.",
  "user-setting": "Create, list, inspect, update, and delete user settings.",
  volume: "Manage volumes, directories, files, uploads, downloads, and volume permissions.",
  workflow: "Manage jobs, job runs, task runs, output export, repair, cancel, and job permissions.",
  workspace: "Create, list, inspect, update, delete workspaces and manage workspace permissions.",
  "workspace-object": "Manage workspace objects, object movement, upload/download PAR, listing, and permissions.",
  wrapper: "Search and download cluster logs and summarize cluster metrics."
};

export function serviceDescriptionFor(serviceName: string): string {
  return SERVICE_DESCRIPTIONS[serviceName] ?? "";
}

export function discoverServices(sdkModule: Record<string, unknown>): ServiceDefinition[] {
  const services = Object.entries(sdkModule)
    .filter(([exportName, exported]) => isGeneratedClientExport(exportName, exported))
    .map(([exportName, exported]) => {
      const name = serviceNameFromClientClass(exportName);
      const clientClass = exported as new (args: Record<string, unknown>) => Record<string, unknown>;
      return {
        clientClass,
        clientClassName: exportName,
        description: serviceDescriptionFor(name),
        name,
        operations: discoverOperations(clientClass)
      };
    })
    .sort((left, right) => left.name.localeCompare(right.name));

  return services;
}

export function findService(
  services: ServiceDefinition[],
  requestedName: string
): ServiceDefinition | undefined {
  const normalized = normalizedLookupName(requestedName);
  return services.find((service) => normalizedLookupName(service.name) === normalized);
}

export function findOperation(
  service: ServiceDefinition,
  requestedName: string
): OperationDefinition | undefined {
  const normalized = normalizedLookupName(requestedName);
  return service.operations.find((operation) => {
    return (
      normalizedLookupName(operation.methodName) === normalized ||
      normalizedLookupName(operation.displayName) === normalized
    );
  });
}

function isGeneratedClientExport(exportName: string, exported: unknown): boolean {
  return (
    typeof exported === "function" &&
    exportName.endsWith("Client") &&
    !exportName.endsWith("CompositeOperations")
  );
}

function discoverOperations(
  clientClass: new (args: Record<string, unknown>) => Record<string, unknown>
): OperationDefinition[] {
  return Object.getOwnPropertyNames(clientClass.prototype)
    .filter((name) => {
      if (name === "constructor" || name.startsWith("_")) {
        return false;
      }
      return typeof clientClass.prototype[name] === "function";
    })
    .map((methodName) => {
      const method = clientClass.prototype[methodName] as Function;
      return {
        bodyEnumFields: {},
        bodyFields: [],
        bodyRequiredFields: [],
        description: "",
        displayName: camelToSnake(methodName),
        enumFields: {},
        fields: inferRequestFields(method).map((field) => ({
          in: "unknown",
          name: field,
          originalName: field,
          required: false
        })),
        methodName,
        requestFields: inferRequestFields(method),
        requiredFields: [],
        summary: ""
      };
    })
    .sort((left, right) => left.displayName.localeCompare(right.displayName));
}

function inferRequestFields(method: Function): string[] {
  const source = Function.prototype.toString.call(method);
  const fields = new Set<string>();
  const pattern = /\brequest\??\.([A-Za-z_][A-Za-z0-9_]*)/g;
  let match: RegExpExecArray | null;

  while ((match = pattern.exec(source)) !== null) {
    fields.add(match[1]);
  }

  return Array.from(fields).sort();
}
