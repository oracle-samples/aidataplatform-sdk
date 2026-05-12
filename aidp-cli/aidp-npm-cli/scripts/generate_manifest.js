const fs = require("fs");
const path = require("path");
const YAML = require("yaml");

const HTTP_METHODS = new Set([
  "delete",
  "get",
  "head",
  "options",
  "patch",
  "post",
  "put"
]);

const PACKAGE_ROOT = path.resolve(__dirname, "..");
const OUTPUT_PATH = path.join(PACKAGE_ROOT, "dist", "operation_manifest.json");
const DEFAULT_SPEC_CANDIDATES = [
  path.join(PACKAGE_ROOT, "..", "..", "aidp-typescript-client", "spec", "api.public.normalized.yaml"),
  path.join(PACKAGE_ROOT, "..", "..", "aidp-typescript-client", "target", "specs", "splat-publish", "api.public.yaml"),
  path.join(PACKAGE_ROOT, "..", "..", "aidp-python-client", "target", "specs", "splat-publish", "api.public.yaml")
];

function main() {
  const specPath = resolveSpecPath();
  const spec = YAML.parse(normalizeDuplicateAnchors(fs.readFileSync(specPath, "utf8")), {
    maxAliasCount: -1
  });
  const manifest = buildManifest(spec, specPath);

  fs.mkdirSync(path.dirname(OUTPUT_PATH), { recursive: true });
  fs.writeFileSync(OUTPUT_PATH, `${JSON.stringify(manifest, null, 2)}\n`);
  console.log(
    `Generated ${OUTPUT_PATH} from ${specPath} ` +
      `(${manifest.services.length} services, ${countOperations(manifest)} operations)`
  );
}

function resolveSpecPath() {
  const candidates = process.env.AIDP_OPENAPI_SPEC
    ? [process.env.AIDP_OPENAPI_SPEC]
    : DEFAULT_SPEC_CANDIDATES;

  for (const candidate of candidates) {
    const resolved = path.resolve(candidate);
    if (fs.existsSync(resolved)) {
      return resolved;
    }
  }

  throw new Error(
    "Unable to find AIDP OpenAPI spec. Set AIDP_OPENAPI_SPEC or run the TypeScript SDK Maven generation first."
  );
}

function buildManifest(spec, specPath) {
  const servicesByName = new Map();

  for (const [resourcePath, pathItem] of Object.entries(spec.paths || {})) {
    for (const [rawMethod, operation] of Object.entries(pathItem || {})) {
      const method = rawMethod.toLowerCase();
      if (!HTTP_METHODS.has(method) || !operation || !operation.operationId) {
        continue;
      }

      const tag = ((operation.tags || [])[0] || "default").trim();
      const serviceName = serviceNameFromTag(tag);
      const service = getOrCreateService(servicesByName, serviceName, tag);
      service.operations.push(buildOperation(spec, operation, method, resourcePath));
    }
  }

  const services = Array.from(servicesByName.values())
    .map((service) => ({
      ...service,
      operations: service.operations.sort((left, right) =>
        left.displayName.localeCompare(right.displayName)
      )
    }))
    .sort((left, right) => left.name.localeCompare(right.name));

  return {
    version: 1,
    sourceSpec: path.relative(PACKAGE_ROOT, specPath),
    services
  };
}

function getOrCreateService(servicesByName, serviceName, tag) {
  let service = servicesByName.get(serviceName);
  if (service) {
    return service;
  }

  service = {
    name: serviceName,
    tag,
    clientClassName: `${wordsFromMixed(tag)
      .map(capitalize)
      .join("")}Client`,
    operations: []
  };
  servicesByName.set(serviceName, service);
  return service;
}

function buildOperation(spec, operation, method, resourcePath) {
  const operationId = operation.operationId;
  const methodName = lowerFirst(operationId);
  const fields = (operation.parameters || []).map((parameter) =>
    parameterToField(spec, resolveRef(spec, parameter))
  );
  const bodyField = fields.find((field) => field.in === "body");
  const enumFields = {};

  for (const field of fields) {
    if (field.enumValues && field.enumValues.length > 0) {
      enumFields[field.name] = field.enumValues;
    }
  }

  const bodyMetadata = bodyField
    ? bodyModelMetadata(spec, bodyField.modelName)
    : { fields: [], requiredFields: [], enumFields: {} };

  return {
    displayName: camelToSnake(methodName),
    method,
    methodName,
    operationId,
    path: resourcePath,
    summary: cleanText(operation.summary),
    description: cleanText(operation.description),
    requestFields: fields.map((field) => field.name),
    requiredFields: fields.filter((field) => field.required).map((field) => field.name),
    fields,
    bodyField: bodyField ? bodyField.name : undefined,
    bodyModel: bodyField ? bodyField.modelName : undefined,
    bodyFields: bodyMetadata.fields,
    bodyRequiredFields: bodyMetadata.requiredFields,
    bodyEnumFields: bodyMetadata.enumFields,
    enumFields
  };
}

function parameterToField(spec, parameter) {
  const schema = parameter.schema || {};
  const modelName = modelNameFromSchema(schema);
  const enumValues = enumValuesForParameter(spec, parameter);
  const field = {
    name: toLowerCamel(parameter.name),
    originalName: parameter.name,
    in: parameter.in || "unknown",
    required: Boolean(parameter.required || parameter.in === "path"),
    type: parameter.type || schema.type || (modelName ? "object" : undefined),
    description: cleanText(parameter.description),
    modelName
  };

  if (enumValues.length > 0) {
    field.enumValues = enumValues;
  }

  return removeUndefined(field);
}

function bodyModelMetadata(spec, modelName) {
  if (!modelName) {
    return { fields: [], requiredFields: [], enumFields: {} };
  }

  const definition = spec.definitions && spec.definitions[modelName];
  if (!definition) {
    return { fields: [], requiredFields: [], enumFields: {} };
  }

  const requiredFields = Array.isArray(definition.required) ? definition.required : [];
  const fields = [];
  const enumFields = {};
  for (const [propertyName, property] of Object.entries(definition.properties || {})) {
    const resolvedProperty = resolveSchemaRef(spec, property);
    const nestedModelName = modelNameFromSchema(property);
    const enumValues = enumValuesForSchema(spec, resolvedProperty);
    fields.push(removeUndefined({
      name: propertyName,
      required: requiredFields.includes(propertyName),
      type: resolvedProperty.type || (nestedModelName ? "object" : undefined),
      modelName: nestedModelName,
      enumValues: enumValues.length > 0 ? enumValues : undefined
    }));
    if (enumValues.length > 0) {
      enumFields[propertyName] = enumValues;
    }
  }

  return {
    fields,
    requiredFields,
    enumFields
  };
}

function enumValuesForParameter(spec, parameter) {
  if (Array.isArray(parameter.enum)) {
    return parameter.enum;
  }

  if (parameter.schema && Array.isArray(parameter.schema.enum)) {
    return parameter.schema.enum;
  }

  return enumValuesFromEnumRef(spec, parameter["x-obmcs-enumref"]);
}

function enumValuesForSchema(spec, schema) {
  if (Array.isArray(schema.enum)) {
    return schema.enum;
  }

  return enumValuesFromEnumRef(spec, schema["x-obmcs-enumref"]);
}

function resolveSchemaRef(spec, schema) {
  if (!schema || !schema.$ref) {
    return schema || {};
  }

  const prefix = "#/definitions/";
  if (!schema.$ref.startsWith(prefix)) {
    return schema;
  }

  const definitionName = schema.$ref.slice(prefix.length);
  return (spec.definitions && spec.definitions[definitionName]) || schema;
}

function enumValuesFromEnumRef(spec, enumRef) {
  if (!enumRef || !enumRef.startsWith("#/definitions/")) {
    return [];
  }

  const parts = enumRef.replace(/^#\/definitions\//, "").split("/");
  const definitionName = parts[0];
  const propertyName = parts[1];
  const definition = spec.definitions && spec.definitions[definitionName];
  if (!definition) {
    return [];
  }

  if (!propertyName && Array.isArray(definition.enum)) {
    return definition.enum;
  }

  const property = definition.properties && definition.properties[propertyName];
  return property && Array.isArray(property.enum) ? property.enum : [];
}

function modelNameFromSchema(schema) {
  if (!schema || !schema.$ref) {
    return undefined;
  }
  const prefix = "#/definitions/";
  return schema.$ref.startsWith(prefix) ? schema.$ref.slice(prefix.length) : undefined;
}

function resolveRef(spec, value) {
  if (!value || !value.$ref) {
    return value;
  }

  const prefix = "#/parameters/";
  if (!value.$ref.startsWith(prefix)) {
    return value;
  }

  const name = value.$ref.slice(prefix.length);
  const resolved = spec.parameters && spec.parameters[name];
  if (!resolved) {
    throw new Error(`Unresolved parameter reference: ${value.$ref}`);
  }
  return resolved;
}

function normalizeDuplicateAnchors(content) {
  const counts = new Map();
  return content.replace(/&([A-Za-z0-9._-]+)/g, (match, name) => {
    const count = (counts.get(name) || 0) + 1;
    counts.set(name, count);
    return count === 1 ? match : `&${name}__dup${count}`;
  });
}

function serviceNameFromTag(tag) {
  return wordsFromMixed(tag)
    .map((word) => word.toLowerCase())
    .join("-");
}

function toLowerCamel(value) {
  const words = wordsFromMixed(value);
  if (words.length <= 1 && /^[a-z][A-Za-z0-9]*$/.test(value)) {
    return value;
  }

  return words
    .map((word, index) => {
      const lower = word.toLowerCase();
      return index === 0 ? lower : capitalize(lower);
    })
    .join("");
}

function camelToSnake(value) {
  return wordsFromMixed(value)
    .map((word) => word.toLowerCase())
    .join("_");
}

function wordsFromMixed(value) {
  const normalized = String(value || "").replace(/[^0-9A-Za-z]+/g, " ");
  const words = [];
  for (const token of normalized.split(/\s+/).filter(Boolean)) {
    words.push(
      ...(token.match(/[A-Z]+(?=[A-Z][a-z]|\d|$)|[A-Z]?[a-z]+|\d+/g) || [token])
    );
  }
  return words;
}

function lowerFirst(value) {
  return value.charAt(0).toLowerCase() + value.slice(1);
}

function capitalize(value) {
  return value.charAt(0).toUpperCase() + value.slice(1);
}

function cleanText(value) {
  return typeof value === "string" ? value.trim().replace(/\s+/g, " ") : undefined;
}

function removeUndefined(value) {
  return Object.fromEntries(Object.entries(value).filter((entry) => entry[1] !== undefined));
}

function countOperations(manifest) {
  return manifest.services.reduce((total, service) => total + service.operations.length, 0);
}

main();
