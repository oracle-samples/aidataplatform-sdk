const crypto = require("crypto");
const fs = require("fs");
const path = require("path");
const ts = require("typescript");

const PACKAGE_ROOT = path.resolve(__dirname, "..");
const OUTPUT_PATH = path.join(PACKAGE_ROOT, "dist", "operation_manifest.json");
const DEFAULT_SDK_ROOT = path.resolve(PACKAGE_ROOT, "..", "..", "aidp-typescript-client");
const COMMAND_GROUP_NAME_OVERRIDES = new Map([
  ["ml-ops", "mlops"]
]);
const PROVIDER_WORDS = ["ai", "data", "platform"];
const ACTION_WORDS = new Set([
  "add",
  "cancel",
  "checkout",
  "commit",
  "copy",
  "create",
  "delete",
  "deploy",
  "download",
  "export",
  "fetch",
  "generate",
  "get",
  "head",
  "infer",
  "list",
  "log",
  "make",
  "manage",
  "merge",
  "modify",
  "move",
  "patch",
  "perform",
  "pull",
  "push",
  "purge",
  "rebase",
  "refresh",
  "remove",
  "rename",
  "repair",
  "reset",
  "resolve",
  "restart",
  "restore",
  "retrieve",
  "search",
  "set",
  "start",
  "stop",
  "summarize",
  "test",
  "transition",
  "update",
  "upload"
]);
const SHORT_NAME_ACTIONS = new Set([
  "add",
  "copy",
  "create",
  "delete",
  "deploy",
  "get",
  "head",
  "infer",
  "list",
  "move",
  "purge",
  "refresh",
  "remove",
  "rename",
  "restart",
  "start",
  "stop",
  "update"
]);
const DANGLING_CONNECTORS = new Set(["by", "for", "from", "in", "of", "on", "to", "with"]);
const RESOURCE_WORD_REPLACEMENTS = new Map([
  ["dir", "directory"],
  ["dirs", "directory"]
]);
const RESOURCE_NOISE_WORDS = new Set([
  "a",
  "all",
  "an",
  "available",
  "by",
  "details",
  "detail",
  "new",
  "specified",
  "the"
]);
const UNCOUNTABLE_RESOURCE_WORDS = new Set(["access", "content", "data", "metadata", "output", "status", "state"]);

function main() {
  const sdkRoot = resolveSdkRoot();
  const manifest = generateManifest(sdkRoot);
  fs.mkdirSync(path.dirname(OUTPUT_PATH), { recursive: true });
  fs.writeFileSync(OUTPUT_PATH, `${JSON.stringify(manifest, null, 2)}\n`, "utf8");
  console.log(
    `Generated ${OUTPUT_PATH} from ${sdkRoot} ` +
      `(${manifest.commandGroups.length} command groups, ${countCommands(manifest)} commands)`
  );
}

function resolveSdkRoot() {
  const candidates = process.env.AIDP_TYPESCRIPT_SDK_ROOT
    ? [process.env.AIDP_TYPESCRIPT_SDK_ROOT]
    : [DEFAULT_SDK_ROOT];
  for (const candidate of candidates) {
    const resolved = path.resolve(candidate);
    if (fs.existsSync(path.join(resolved, "lib", "client.ts"))) {
      return resolved;
    }
  }
  throw new Error("Unable to find the generated AIDP TypeScript SDK. Set AIDP_TYPESCRIPT_SDK_ROOT or build the TypeScript SDK first.");
}

function generateManifest(sdkRoot) {
  const clientSource = readSourceFile(path.join(sdkRoot, "lib", "client.ts"));
  const groups = [];
  for (const node of clientSource.statements) {
    if (!ts.isClassDeclaration(node) || !node.name || !node.name.text.endsWith("Client")) {
      continue;
    }
    const clientClassName = node.name.text;
    const tag = clientClassName.replace(/Client$/, "");
    const groupName = serviceNameFromClientClass(clientClassName);
    const commands = node.members
      .filter((member) => ts.isMethodDeclaration(member) && isSdkOperation(member))
      .map((member) => buildCommand(sdkRoot, clientSource, member))
      .sort((left, right) => left.name.localeCompare(right.name));
    const description = commandGroupDescription(tag, commands);
    applyShortCommandNames(groupName, commands);
    commands.sort((left, right) => left.name.localeCompare(right.name));
    ensureUniqueCommandNames(groupName, commands);
    groups.push({
      name: groupName,
      tag,
      clientClassName,
      description,
      commands
    });
  }
  groups.sort((left, right) => left.name.localeCompare(right.name));
  return {
    version: 4,
    sourceSpec: path.relative(PACKAGE_ROOT, sdkRoot),
    sourceSpecSha256: hashSdkSources(sdkRoot),
    commandGroups: groups
  };
}

function isSdkOperation(member) {
  if (!member.name || !ts.isIdentifier(member.name)) {
    return false;
  }
  if (!member.body || member.parameters.length !== 1) {
    return false;
  }
  return Boolean(findComposeRequestObject(member));
}

function buildCommand(sdkRoot, clientSource, methodNode) {
  const sdkMethodName = methodNode.name.text;
  const requestParamName = methodNode.parameters[0].name.getText(clientSource);
  const requestType = requestTypeName(methodNode.parameters[0], clientSource);
  const responseType = responseTypeName(methodNode, clientSource);
  const requestMetadata = parseRequest(sdkRoot, requestType);
  const methodMetadata = extractMethodMetadata(methodNode, clientSource, requestParamName);
  const responseMetadata = responseType ? parseResponse(sdkRoot, responseType) : { bodyKey: "", headers: [] };
  const bodyFieldSource = methodMetadata.bodyField
    ? requestMetadata.fieldsByName.get(methodMetadata.bodyField)
    : undefined;
  const bodyField = bodyFieldSource
    ? { ...bodyFieldSource, modelName: methodMetadata.bodyModel || bodyFieldSource.modelName }
    : undefined;
  const bodyMetadata = bodyField?.modelName
    ? bodyModelMetadata(sdkRoot, bodyField.modelName)
    : { fields: [], requiredFields: [], enumFields: {}, models: {} };
  const baseName = commandNameFromSdkMethod(sdkMethodName);
  const description = methodDescription(clientSource, methodNode);
  const fields = commandFields(requestMetadata, methodMetadata);
  return removeUndefined({
    name: baseName,
    aliases: [baseName],
    sdkMethodName,
    operationId: upperFirst(sdkMethodName),
    httpMethod: methodMetadata.httpMethod,
    path: methodMetadata.path,
    section: commandSection(baseName),
    summary: firstSentence(description),
    description,
    deprecated: description.toLowerCase().startsWith("deprecated"),
    fields,
    bodyField: bodyField?.name,
    bodyModel: bodyField?.modelName || "",
    bodyFields: bodyMetadata.fields,
    bodyRequiredFields: bodyMetadata.requiredFields,
    bodyEnumFields: bodyMetadata.enumFields,
    bodyModels: bodyMetadata.models,
    responseBodyKey: responseMetadata.bodyKey,
    responseHeaderFields: responseMetadata.headers
  });
}

function requestTypeName(parameter, sourceFile) {
  if (!parameter.type) {
    throw new Error(`Unable to determine request type for ${parameter.getText(sourceFile)}`);
  }
  const text = parameter.type.getText(sourceFile);
  return text.split(".").pop();
}

function responseTypeName(methodNode, sourceFile) {
  if (!methodNode.type) {
    return "";
  }
  const text = methodNode.type.getText(sourceFile);
  const match = text.match(/responses\.([A-Za-z0-9_]+Response)/);
  return match ? match[1] : "";
}

function extractMethodMetadata(methodNode, sourceFile, requestParamName) {
  const composeRequestObject = findComposeRequestObject(methodNode);
  if (!composeRequestObject) {
    throw new Error(`Unable to find composeRequest call for ${methodNode.name.getText(sourceFile)}`);
  }
  const objectMaps = extractObjectMaps(methodNode, sourceFile, requestParamName);
  const bodyContent = propertyValue(composeRequestObject, "bodyContent");
  return {
    path: stringProperty(composeRequestObject, "path"),
    httpMethod: stringProperty(composeRequestObject, "method"),
    pathParams: objectMaps.pathParams ?? [],
    queryParams: objectMaps.queryParams ?? [],
    headerParams: objectMaps.headerParams ?? [],
    bodyField: bodyContent ? requestFieldFromExpression(bodyContent, requestParamName) : "",
    bodyModel: bodyContent ? bodyModelFromExpression(bodyContent, sourceFile) : ""
  };
}

function findComposeRequestObject(node) {
  let found;
  visit(node);
  return found;

  function visit(current) {
    if (found) {
      return;
    }
    if (
      ts.isCallExpression(current) &&
      current.expression.getText().endsWith("composeRequest") &&
      current.arguments[0] &&
      ts.isObjectLiteralExpression(current.arguments[0])
    ) {
      found = current.arguments[0];
      return;
    }
    ts.forEachChild(current, visit);
  }
}

function extractObjectMaps(methodNode, sourceFile, requestParamName) {
  const maps = {};
  for (const statement of methodNode.body.statements) {
    if (!ts.isVariableStatement(statement)) {
      continue;
    }
    for (const declaration of statement.declarationList.declarations) {
      if (!ts.isIdentifier(declaration.name) || !declaration.initializer || !ts.isObjectLiteralExpression(declaration.initializer)) {
        continue;
      }
      if (!["pathParams", "queryParams", "headerParams"].includes(declaration.name.text)) {
        continue;
      }
      maps[declaration.name.text] = objectMapEntries(declaration.initializer, sourceFile, requestParamName);
    }
  }
  return maps;
}

function objectMapEntries(objectLiteral, sourceFile, requestParamName) {
  const entries = [];
  for (const property of objectLiteral.properties) {
    if (!ts.isPropertyAssignment(property)) {
      continue;
    }
    const requestField = requestFieldFromExpression(property.initializer, requestParamName);
    if (!requestField) {
      continue;
    }
    entries.push({
      originalName: propertyNameText(property.name, sourceFile).replace(/^\{|\}$/g, ""),
      requestField
    });
  }
  return entries;
}

function requestFieldFromExpression(expression, requestParamName) {
  if (ts.isPropertyAccessExpression(expression) && expression.expression.getText() === requestParamName) {
    return expression.name.text;
  }
  if (ts.isElementAccessExpression(expression) && expression.expression.getText() === requestParamName) {
    const arg = expression.argumentExpression;
    return ts.isStringLiteral(arg) ? arg.text : "";
  }
  if (ts.isCallExpression(expression)) {
    for (const arg of expression.arguments) {
      const field = requestFieldFromExpression(arg, requestParamName);
      if (field) {
        return field;
      }
    }
  }
  if (ts.isParenthesizedExpression(expression)) {
    return requestFieldFromExpression(expression.expression, requestParamName);
  }
  return "";
}

function bodyModelFromExpression(expression, sourceFile) {
  if (ts.isCallExpression(expression) && expression.arguments.length >= 2) {
    const modelArg = expression.arguments[1];
    if (ts.isStringLiteral(modelArg)) {
      return modelArg.text;
    }
  }
  return "";
}

function propertyValue(objectLiteral, propertyName) {
  for (const property of objectLiteral.properties) {
    if (ts.isPropertyAssignment(property) && propertyNameText(property.name, objectLiteral.getSourceFile()) === propertyName) {
      return property.initializer;
    }
  }
  return undefined;
}

function stringProperty(objectLiteral, propertyName) {
  const value = propertyValue(objectLiteral, propertyName);
  return value && ts.isStringLiteral(value) ? value.text : "";
}

function commandFields(requestMetadata, methodMetadata) {
  const fields = [];
  const seen = new Set();
  for (const item of methodMetadata.pathParams) {
    pushField(fields, seen, requestMetadata, item.requestField, item.originalName, "path", true);
  }
  if (methodMetadata.bodyField) {
    pushField(fields, seen, requestMetadata, methodMetadata.bodyField, methodMetadata.bodyModel || methodMetadata.bodyField, "body", true);
  }
  for (const item of methodMetadata.queryParams) {
    pushField(fields, seen, requestMetadata, item.requestField, item.originalName, "query", undefined);
  }
  for (const item of methodMetadata.headerParams) {
    if (item.requestField === "retryConfiguration") {
      continue;
    }
    pushField(fields, seen, requestMetadata, item.requestField, item.originalName, "header", undefined);
  }
  return fields;
}

function pushField(fields, seen, requestMetadata, name, originalName, location, requiredOverride) {
  if (!name || seen.has(name)) {
    return;
  }
  const source = requestMetadata.fieldsByName.get(name);
  if (!source) {
    return;
  }
  seen.add(name);
  fields.push(removeUndefined({
    name,
    cliName: camelToKebab(name),
    originalName,
    in: location,
    required: requiredOverride === undefined ? source.required : requiredOverride,
    description: source.description,
    type: source.type,
    modelName: source.modelName,
    enumValues: source.enumValues.length > 0 ? source.enumValues : undefined
  }));
}

function parseRequest(sdkRoot, requestType) {
  const source = readSourceFile(path.join(sdkRoot, "lib", "request", `${pascalToKebab(requestType)}.ts`));
  const fields = [];
  const fieldsByName = new Map();
  const namespaceEnums = parseNamespaceEnums(source, requestType);
  const interfaceNode = source.statements.find((node) => ts.isInterfaceDeclaration(node) && node.name.text === requestType);
  if (!interfaceNode) {
    throw new Error(`Unable to find request interface ${requestType}`);
  }
  for (const member of interfaceNode.members) {
    if (!ts.isPropertySignature(member) || !member.type) {
      continue;
    }
    const name = propertyNameText(member.name, source);
    const typeInfo = typeInfoFromNode(member.type, source, namespaceEnums, sdkRoot);
    const field = {
      name,
      required: !member.questionToken,
      description: cleanText(jsDocText(source, member)),
      type: typeInfo.type,
      itemType: typeInfo.itemType,
      modelName: typeInfo.modelName,
      enumValues: typeInfo.enumValues
    };
    fields.push(field);
    fieldsByName.set(name, field);
  }
  return { fields, fieldsByName };
}

function parseResponse(sdkRoot, responseType) {
  const responsePath = path.join(sdkRoot, "lib", "response", `${pascalToKebab(responseType)}.ts`);
  if (!fs.existsSync(responsePath)) {
    return { bodyKey: "", headers: [] };
  }
  const source = readSourceFile(responsePath);
  const interfaceNode = source.statements.find((node) => ts.isInterfaceDeclaration(node) && node.name.text === responseType);
  if (!interfaceNode) {
    return { bodyKey: "", headers: [] };
  }
  const headers = [];
  let bodyKey = "";
  for (const member of interfaceNode.members) {
    if (!ts.isPropertySignature(member) || !member.type) {
      continue;
    }
    const name = propertyNameText(member.name, source);
    const typeText = member.type.getText(source);
    if (typeText.includes("model.")) {
      bodyKey = name;
    } else {
      headers.push(name);
    }
  }
  return { bodyKey, headers };
}

function bodyModelMetadata(sdkRoot, modelName) {
  const models = collectBodyModels(sdkRoot, modelName, new Map());
  const rootModel = models.get(modelName) ?? { fields: [], requiredFields: [], enumFields: {}, variants: [] };
  return {
    fields: rootModel.fields,
    requiredFields: rootModel.requiredFields,
    enumFields: rootModel.enumFields,
    models: Object.fromEntries(models)
  };
}

function collectBodyModels(sdkRoot, modelName, models) {
  if (!modelName || models.has(modelName)) {
    return models;
  }
  const model = parseModel(sdkRoot, modelName);
  if (!model) {
    return models;
  }
  models.set(modelName, model);
  for (const field of model.fields) {
    if (field.modelName) {
      collectBodyModels(sdkRoot, field.modelName, models);
    }
  }
  for (const variant of model.variants) {
    collectBodyModels(sdkRoot, variant.modelName, models);
  }
  return models;
}

function parseModel(sdkRoot, modelName) {
  const modelPath = path.join(sdkRoot, "lib", "model", `${pascalToKebab(modelName)}.ts`);
  if (!fs.existsSync(modelPath)) {
    return undefined;
  }
  const source = readSourceFile(modelPath);
  const namespaceEnums = parseNamespaceEnums(source, modelName);
  const variants = parseDiscriminatorVariants(source);
  const discriminatorEnums = discriminatorEnumMap(variants);
  const interfaceNode = source.statements.find((node) => ts.isInterfaceDeclaration(node) && node.name.text === modelName);
  if (!interfaceNode) {
    return undefined;
  }
  const fields = [];
  const requiredFields = [];
  const enumFields = {};
  for (const member of interfaceNode.members) {
    if (!ts.isPropertySignature(member) || !member.type) {
      continue;
    }
    const name = propertyNameText(member.name, source);
    const typeInfo = typeInfoFromNode(member.type, source, namespaceEnums, sdkRoot);
    const enumValues = typeInfo.enumValues.length > 0
      ? typeInfo.enumValues
      : discriminatorEnums.get(name) || [];
    const field = removeUndefined({
      name,
      required: !member.questionToken,
      type: typeInfo.type,
      itemType: typeInfo.itemType,
      modelName: typeInfo.modelName,
      enumValues: enumValues.length > 0 ? enumValues : undefined
    });
    fields.push(field);
    if (!member.questionToken) {
      requiredFields.push(name);
    }
    if (enumValues.length > 0) {
      enumFields[name] = enumValues;
    }
  }
  fields.sort((left, right) => left.name.localeCompare(right.name));
  requiredFields.sort();
  return { fields, requiredFields, enumFields, variants };
}

function typeInfoFromNode(typeNode, source, namespaceEnums, sdkRoot) {
  const text = typeNode.getText(source);
  if (ts.isArrayTypeNode(typeNode)) {
    const item = typeInfoFromNode(typeNode.elementType, source, namespaceEnums, sdkRoot);
    return { type: "array", itemType: item.type, modelName: item.modelName, enumValues: item.enumValues };
  }
  if (ts.isTypeReferenceNode(typeNode) && typeNode.typeName.getText(source) === "Array" && typeNode.typeArguments?.[0]) {
    const item = typeInfoFromNode(typeNode.typeArguments[0], source, namespaceEnums, sdkRoot);
    return { type: "array", itemType: item.type, modelName: item.modelName, enumValues: item.enumValues };
  }
  const namespaceEnum = namespaceEnums.get(text.replace(/\s+/g, ""));
  if (namespaceEnum) {
    return { type: "string", itemType: "", modelName: "", enumValues: namespaceEnum };
  }
  const modelEnum = modelEnumValues(text, sdkRoot);
  if (modelEnum.length > 0) {
    return { type: "string", itemType: "", modelName: "", enumValues: modelEnum };
  }
  const modelMatch = text.match(/(?:model\.)?([A-Z][A-Za-z0-9]+)$/);
  if (modelMatch && !["String", "Object", "Date"].includes(modelMatch[1])) {
    return { type: "object", itemType: "", modelName: modelMatch[1], enumValues: [] };
  }
  const lower = text.toLowerCase();
  if (lower === "string") {
    return { type: "string", itemType: "", modelName: "", enumValues: [] };
  }
  if (lower === "boolean") {
    return { type: "boolean", itemType: "", modelName: "", enumValues: [] };
  }
  if (lower === "number") {
    return { type: "number", itemType: "", modelName: "", enumValues: [] };
  }
  return { type: "object", itemType: "", modelName: "", enumValues: [] };
}

function parseNamespaceEnums(source, namespaceName) {
  const enums = new Map();
  const namespaceNode = source.statements.find(
    (node) => ts.isModuleDeclaration(node) && node.name.getText(source) === namespaceName
  );
  if (!namespaceNode || !namespaceNode.body || !ts.isModuleBlock(namespaceNode.body)) {
    return enums;
  }
  for (const statement of namespaceNode.body.statements) {
    if (!ts.isEnumDeclaration(statement)) {
      continue;
    }
    const values = statement.members.map((member) => enumMemberValue(member, source)).filter((value) => value !== undefined);
    enums.set(`${namespaceName}.${statement.name.text}`, values);
  }
  return enums;
}

function discriminatorEnumMap(variants) {
  const enums = new Map();
  for (const variant of variants) {
    const values = enums.get(variant.discriminatorField) || [];
    if (!values.includes(variant.discriminatorValue)) {
      values.push(variant.discriminatorValue);
    }
    enums.set(variant.discriminatorField, values);
  }
  return enums;
}

function parseDiscriminatorVariants(source) {
  const variants = [];
  const seen = new Set();
  visit(source);
  return variants;

  function visit(node) {
    if (ts.isSwitchStatement(node)) {
      const fieldName = switchedObjectFieldName(node.expression);
      if (fieldName) {
        for (const clause of node.caseBlock.clauses) {
          if (!ts.isCaseClause(clause) || !ts.isStringLiteral(clause.expression)) {
            continue;
          }
          const modelName = discriminatorVariantModelName(clause, source);
          if (!modelName) {
            continue;
          }
          const key = `${fieldName}\0${clause.expression.text}\0${modelName}`;
          if (!seen.has(key)) {
            seen.add(key);
            variants.push({
              discriminatorField: fieldName,
              discriminatorValue: clause.expression.text,
              modelName
            });
          }
        }
      }
    }
    ts.forEachChild(node, visit);
  }
}

function discriminatorVariantModelName(clause, source) {
  let modelName = "";
  for (const statement of clause.statements) {
    visit(statement);
    if (modelName) {
      break;
    }
  }
  return modelName;

  function visit(node) {
    if (modelName) {
      return;
    }
    if (
      ts.isCallExpression(node) &&
      ts.isPropertyAccessExpression(node.expression) &&
      ["getJsonObj", "getDeserializedJsonObj"].includes(node.expression.name.text) &&
      ts.isPropertyAccessExpression(node.expression.expression) &&
      node.expression.expression.expression.getText(source) === "model"
    ) {
      modelName = node.expression.expression.name.text;
      return;
    }
    ts.forEachChild(node, visit);
  }
}

function switchedObjectFieldName(expression) {
  if (ts.isPropertyAccessExpression(expression) && expression.expression.getText() === "obj") {
    return expression.name.text;
  }
  if (ts.isElementAccessExpression(expression) && expression.expression.getText() === "obj") {
    const argument = expression.argumentExpression;
    return ts.isStringLiteral(argument) ? argument.text : "";
  }
  return "";
}

function modelEnumValues(typeText, sdkRoot) {
  const match = typeText.match(/^model\.([A-Z][A-Za-z0-9]+)$/);
  if (!match) {
    return [];
  }
  const enumName = match[1];
  const modelPath = path.join(sdkRoot, "lib", "model", `${pascalToKebab(enumName)}.ts`);
  if (!fs.existsSync(modelPath)) {
    return [];
  }
  const source = readSourceFile(modelPath);
  const enumNode = source.statements.find((node) => ts.isEnumDeclaration(node) && node.name.text === enumName);
  if (!enumNode) {
    return [];
  }
  return enumNode.members.map((member) => enumMemberValue(member, source)).filter((value) => value !== undefined);
}

function enumMemberValue(member, source) {
  if (!member.initializer) {
    return member.name.getText(source);
  }
  if (ts.isStringLiteral(member.initializer)) {
    return member.initializer.text;
  }
  if (ts.isParenthesizedExpression(member.initializer) && ts.isStringLiteral(member.initializer.expression)) {
    return member.initializer.expression.text;
  }
  return undefined;
}

function methodDescription(source, node) {
  const raw = jsDocText(source, node);
  const withoutTags = raw
    .split(/\n/)
    .map((line) => line.trim())
    .filter((line) => line && !line.startsWith("@"))
    .join(" ");
  const cleaned = cleanText(withoutTags);
  return cleaned
    .replace(/\s*This operation uses .*?default if no retry configuration is defined by the user\.?/i, "")
    .trim();
}

function jsDocText(source, node) {
  const ranges = ts.getLeadingCommentRanges(source.getFullText(), node.pos) || [];
  const comments = ranges
    .map((range) => source.getFullText().slice(range.pos, range.end))
    .filter((comment) => comment.startsWith("/**"));
  if (comments.length === 0) {
    return "";
  }
  return comments[comments.length - 1]
    .replace(/^\/\*\*/, "")
    .replace(/\*\/$/, "")
    .split(/\r?\n/)
    .map((line) => line.replace(/^\s*\*\s?/, ""))
    .join("\n");
}

function cleanText(value) {
  return String(value || "")
    .replace(/\{@code\s+([^}]+)\}/g, "$1")
    .replace(/\{@link\s+[^|}]+\|([^}]+)\}/g, "$1")
    .replace(/\{@link\s+([^}]+)\}/g, "$1")
    .replace(/\[([^\]]+)\]\([^)]+\)/g, "$1")
    .replace(/\{\{DOC_SERVER_URL\}\}/g, "")
    .replace(/\\+"/g, '"')
    .replace(/\s+/g, " ")
    .trim();
}

function commandNameFromSdkMethod(methodName) {
  const words = wordsFromMixed(methodName).map((word) => word.toLowerCase());
  const stripped = [];
  for (let index = 0; index < words.length; index += 1) {
    if (words.slice(index, index + PROVIDER_WORDS.length).join("-") === PROVIDER_WORDS.join("-")) {
      index += PROVIDER_WORDS.length - 1;
      continue;
    }
    stripped.push(words[index]);
  }
  return stripped.join("-");
}

function applyShortCommandNames(groupName, commands) {
  const candidates = new Map();
  const candidateCounts = new Map();
  const originalOwners = new Map();
  for (const command of commands) {
    const candidate = shortCommandName(groupName, command.name);
    candidates.set(command.sdkMethodName, candidate);
    candidateCounts.set(candidate, (candidateCounts.get(candidate) || 0) + 1);
    originalOwners.set(command.name, command.sdkMethodName);
  }
  const used = new Set();
  for (const command of commands) {
    const original = command.name;
    const candidate = candidates.get(command.sdkMethodName);
    const candidateIsOtherOriginal = originalOwners.has(candidate) && originalOwners.get(candidate) !== command.sdkMethodName;
    if (
      candidate !== original &&
      candidateCounts.get(candidate) === 1 &&
      !used.has(candidate) &&
      !candidateIsOtherOriginal
    ) {
      command.aliases = Array.from(new Set([...(command.aliases || []), original]));
      command.name = candidate;
    }
    used.add(command.name);
  }
}

function shortCommandName(groupName, commandName) {
  const groupTokens = groupName.split("-");
  let commandTokens = dropPerformWrapper(commandName.split("-"));
  let changed = commandTokens.join("-") !== commandName;
  while (true) {
    const next = shortCommandTokensOnce(groupTokens, commandTokens);
    if (!next) {
      break;
    }
    commandTokens = next;
    changed = true;
  }
  if (!changed || !validShortCommandTokens(commandTokens)) {
    return commandName;
  }
  return commandTokens.join("-");
}

function dropPerformWrapper(tokens) {
  if (tokens.length > 1 && tokens[0] === "perform" && ACTION_WORDS.has(tokens[1])) {
    return tokens.slice(1);
  }
  return tokens;
}

function shortCommandTokensOnce(groupTokens, commandTokens) {
  const transforms = [
    stripGroupPrefixBeforeAction,
    stripGroupAfterAction,
    stripGroupSuffix,
    stripGroupTokensAfterActionSequence
  ];
  for (const transform of transforms) {
    const candidate = transform(groupTokens, commandTokens);
    if (candidate && candidate.join("-") !== commandTokens.join("-")) {
      return candidate;
    }
  }
  return undefined;
}

function stripGroupPrefixBeforeAction(groupTokens, commandTokens) {
  if (commandTokens.length <= groupTokens.length || !equivalentTokenSequence(groupTokens, commandTokens.slice(0, groupTokens.length))) {
    return undefined;
  }
  const candidate = commandTokens.slice(groupTokens.length);
  return candidate.length && ACTION_WORDS.has(candidate[0]) && validShortCommandTokens(candidate) ? candidate : undefined;
}

function stripGroupAfterAction(groupTokens, commandTokens) {
  if (!ACTION_WORDS.has(commandTokens[0])) {
    return undefined;
  }
  const groupStart = 1;
  const groupEnd = groupStart + groupTokens.length;
  if (commandTokens.length <= groupEnd || !equivalentTokenSequence(groupTokens, commandTokens.slice(groupStart, groupEnd))) {
    return undefined;
  }
  const candidate = [commandTokens[0], ...commandTokens.slice(groupEnd)];
  return validShortCommandTokens(candidate) ? candidate : undefined;
}

function stripGroupSuffix(groupTokens, commandTokens) {
  if (!SHORT_NAME_ACTIONS.has(commandTokens[0]) || commandTokens.length <= groupTokens.length) {
    return undefined;
  }
  if (!equivalentTokenSequence(groupTokens, commandTokens.slice(-groupTokens.length))) {
    return undefined;
  }
  let candidate = commandTokens.slice(0, -groupTokens.length);
  if (candidate.length && DANGLING_CONNECTORS.has(candidate[candidate.length - 1])) {
    candidate = candidate.slice(0, -1);
  }
  return validShortCommandTokens(candidate) ? candidate : undefined;
}

function stripGroupTokensAfterActionSequence(groupTokens, commandTokens) {
  for (let index = 1; index < commandTokens.length; index += 1) {
    if (!commandTokens.slice(0, index).every((token) => ACTION_WORDS.has(token))) {
      return undefined;
    }
    if (!groupTokens.some((groupToken) => equivalentToken(groupToken, commandTokens[index]))) {
      continue;
    }
    const candidate = [...commandTokens.slice(0, index), ...commandTokens.slice(index + 1)];
    if (validShortCommandTokens(candidate)) {
      return candidate;
    }
  }
  return undefined;
}

function validShortCommandTokens(tokens) {
  return Boolean(tokens.length) && !DANGLING_CONNECTORS.has(tokens[0]) && !DANGLING_CONNECTORS.has(tokens[tokens.length - 1]);
}

function equivalentTokenSequence(left, right) {
  return left.length === right.length && left.every((token, index) => equivalentToken(token, right[index]));
}

function equivalentToken(left, right) {
  return left === right || singularResourceWord(left) === singularResourceWord(right);
}

function ensureUniqueCommandNames(groupName, commands) {
  const seen = new Map();
  const duplicates = [];
  for (const command of commands) {
    const previous = seen.get(command.name);
    if (previous && previous !== command.sdkMethodName) {
      duplicates.push(command.name);
    }
    seen.set(command.name, command.sdkMethodName);
  }
  if (duplicates.length > 0) {
    throw new Error(`Duplicate command names in command group ${groupName}: ${Array.from(new Set(duplicates)).sort().join(", ")}`);
  }
}

function commandGroupDescription(tag, commands) {
  const resources = commandGroupResources(tag, commands);
  if (resources.length > 0) {
    return sentenceFromPhrase(formatPhraseList(resources));
  }
  const label = wordsFromMixed(tag)
    .map((word) => (word.toUpperCase() === word ? word : word.toLowerCase()))
    .join(" ");
  return sentenceFromPhrase(label ? `${label} resources` : "API command group");
}

function commandGroupResources(tag, commands) {
  const resources = new Map();
  commands.forEach((command, index) => {
    const phrase = commandResourcePhrase(command, tag);
    const key = resourceKey(phrase);
    if (!key) {
      return;
    }
    if (!resources.has(key)) {
      resources.set(key, { phrase: pluralizeResourcePhrase(phrase), count: 0, firstIndex: index });
    }
    resources.get(key).count += 1;
  });
  mergeSuffixResources(resources);
  return Array.from(resources.values())
    .sort((left, right) => right.count - left.count || left.firstIndex - right.firstIndex || left.phrase.localeCompare(right.phrase))
    .slice(0, 4)
    .map((resource) => resource.phrase);
}

function commandResourcePhrase(command, tag) {
  const namePhrase = commandNameResourcePhrase(command.name, tag);
  if (namePhrase && !isGenericResourcePhrase(namePhrase)) {
    return namePhrase;
  }
  return summaryResourcePhrase(command.summary || command.description || "") || namePhrase;
}

function commandNameResourcePhrase(commandName, tag) {
  let words = commandName.split("-");
  words = stripActionWords(words);
  words = stripGroupPrefix(words, tag);
  words = stripActionWords(words);
  return normalizeResourceWords(words);
}

function stripActionWords(words) {
  while (words.length && ACTION_WORDS.has(words[0])) {
    words = words.slice(1);
  }
  return words;
}

function stripGroupPrefix(words, tag) {
  const tagWords = wordsFromMixed(tag).map((word) => word.toLowerCase());
  if (!tagWords.length || !words.length) {
    return words;
  }
  if (tagWords.length > 1 && tagWords.join("\0") === words.slice(0, tagWords.length).join("\0") && words.length - tagWords.length >= 2) {
    return words.slice(tagWords.length);
  }
  if (tagWords.length === 1 && words[0] === tagWords[0] && words.length > 2 && ACTION_WORDS.has(words[1])) {
    return words.slice(1);
  }
  return words;
}

function normalizeResourceWords(words) {
  if (words.includes("by")) {
    words = words.slice(0, words.indexOf("by"));
  }
  if (words.includes("with") && words.slice(words.indexOf("with")).join(" ") === "with par") {
    words = words.slice(0, words.indexOf("with"));
  }
  words = words
    .map((word) => RESOURCE_WORD_REPLACEMENTS.get(word) || word)
    .filter((word) => word && !RESOURCE_NOISE_WORDS.has(word));
  words = stripProviderResourcePrefix(words);
  words = normalizeMemberResourceWords(words);
  words = normalizePermissionResourceWords(words);
  words = normalizeStatusResourceWords(words);
  words = words.filter((word) => word && !RESOURCE_NOISE_WORDS.has(word));
  return words.join(" ");
}

function stripProviderResourcePrefix(words) {
  const prefixes = [
    ["ai", "data", "platform", "workbench"],
    ["ai", "data", "platform"]
  ];
  for (const prefix of prefixes) {
    if (words.slice(0, prefix.length).join(" ") === prefix.join(" ")) {
      return words.slice(prefix.length);
    }
  }
  return words;
}

function normalizeMemberResourceWords(words) {
  if (words.length >= 3 && words[0] === "member" && ["to", "from"].includes(words[1])) {
    return [...words.slice(2), "member"];
  }
  return words;
}

function normalizePermissionResourceWords(words) {
  const indexes = words.map((word, index) => ["permission", "permissions"].includes(word) ? index : -1).filter((index) => index >= 0);
  if (!indexes.length) {
    return words;
  }
  const before = words.slice(0, indexes[indexes.length - 1]).filter((word) => !ACTION_WORDS.has(word) && !["for", "on"].includes(word));
  return before.length ? [...before, "permission"] : ["permission"];
}

function normalizeStatusResourceWords(words) {
  if (words.length >= 4 && words.slice(-3).join(" ") === "async operation status") {
    return [...words.slice(0, -3), "status"];
  }
  return words;
}

function summaryResourcePhrase(summary) {
  const cleaned = cleanText(summary).replace(/^\([^)]*\)\s*/, "").toLowerCase();
  if (!cleaned) {
    return "";
  }
  const patterns = [
    /^(?:gets?|returns?)\s+(?:a\s+)?list\s+of\s+(.+)$/,
    /^(?:gets?|returns?)\s+(?:detailed\s+)?(?:information|details)\s+(?:about|for|of)\s+(.+)$/,
    /^(?:creates?|updates?|deletes?|renames?|moves?|copies?|uploads?|downloads?|exports?|fetches?|repairs?|restores?)\s+(?:(?:an|a|the|new)\s+)?(.+)$/,
    /^(?:lists?)\s+(.+)$/,
    /^(?:searches?)\s+(.+)$/
  ];
  for (const pattern of patterns) {
    const match = cleaned.match(pattern);
    if (match) {
      return normalizeSummaryResource(match[1]);
    }
  }
  return "";
}

function normalizeSummaryResource(value) {
  value = value.split(/\s+(?:from|in|inside|on|to|with|using|by)\s+/, 1)[0];
  value = value.split(/[.;:]/, 1)[0];
  return normalizeResourceWords(value.replace(/[/-]/g, " ").split(/\s+/));
}

function isGenericResourcePhrase(phrase) {
  return UNCOUNTABLE_RESOURCE_WORDS.has(phrase) && !["content, contents", "content", "contents"].includes(phrase);
}

function resourceKey(phrase) {
  const words = phrase.split(/\s+/).filter(Boolean);
  if (!words.length) {
    return "";
  }
  words[words.length - 1] = singularResourceWord(words[words.length - 1]);
  return words.join(" ");
}

function pluralizeResourcePhrase(phrase) {
  const words = phrase.split(/\s+/).filter(Boolean);
  if (!words.length) {
    return phrase;
  }
  if (words.includes("or")) {
    return pluralizeOrPhrase(words);
  }
  if (UNCOUNTABLE_RESOURCE_WORDS.has(words[words.length - 1])) {
    return phrase;
  }
  words[words.length - 1] = pluralResourceWord(words[words.length - 1]);
  return words.join(" ");
}

function pluralizeOrPhrase(words) {
  const index = words.indexOf("or");
  if (index === 0 || index === words.length - 1) {
    return words.join(" ");
  }
  const prefix = words.slice(0, index - 1);
  const left = pluralResourceWord(words[index - 1]);
  const right = pluralResourceWord(words[index + 1]);
  const suffix = words.slice(index + 2);
  if (suffix.length > 0) {
    return [...prefix, left, "or", right, ...suffix].join(" ");
  }
  return [...prefix, left, "and", right].join(" ");
}

function singularResourceWord(word) {
  if (UNCOUNTABLE_RESOURCE_WORDS.has(word)) {
    return word;
  }
  if (word.endsWith("ies") && word.length > 3) {
    return `${word.slice(0, -3)}y`;
  }
  if (word.endsWith("ches") || word.endsWith("shes") || word.endsWith("xes") || word.endsWith("sses")) {
    return word.slice(0, -2);
  }
  if (word.endsWith("s") && !word.endsWith("ss")) {
    return word.slice(0, -1);
  }
  return word;
}

function pluralResourceWord(word) {
  if (UNCOUNTABLE_RESOURCE_WORDS.has(word) || word.endsWith("s")) {
    return word;
  }
  if (word.endsWith("y") && word.length > 1 && !"aeiou".includes(word[word.length - 2])) {
    return `${word.slice(0, -1)}ies`;
  }
  if (word.endsWith("ch") || word.endsWith("sh") || word.endsWith("x")) {
    return `${word}es`;
  }
  return `${word}s`;
}

function mergeSuffixResources(resources) {
  for (const key of Array.from(resources.keys())) {
    if (!resources.has(key) || key.split(" ").length > 3) {
      continue;
    }
    const candidates = Array.from(resources.keys()).filter((otherKey) => otherKey !== key && otherKey.endsWith(` ${key}`) && resources.get(otherKey).count >= resources.get(key).count);
    if (!candidates.length) {
      continue;
    }
    candidates.sort((left, right) => resources.get(right).count - resources.get(left).count || resources.get(left).firstIndex - resources.get(right).firstIndex || left.localeCompare(right));
    const target = candidates[0];
    resources.get(target).count += resources.get(key).count;
    resources.get(target).firstIndex = Math.min(resources.get(target).firstIndex, resources.get(key).firstIndex);
    resources.delete(key);
  }
}

function formatPhraseList(values) {
  if (values.length === 1) {
    return values[0];
  }
  if (values.length === 2) {
    return `${values[0]} and ${values[1]}`;
  }
  return `${values.slice(0, -1).join(", ")}, and ${values[values.length - 1]}`;
}

function sentenceFromPhrase(phrase) {
  const sentence = `${phrase.slice(0, 1).toUpperCase()}${phrase.slice(1)}`;
  return sentence.endsWith(".") ? sentence : `${sentence}.`;
}

function commandSection(commandName) {
  return commandName.split("-").includes("permission") ? "Permission Commands" : "Available Commands";
}

function firstSentence(value) {
  const cleaned = cleanText(value);
  if (!cleaned) {
    return "";
  }
  for (const delimiter of [". ", "! ", "? "]) {
    if (cleaned.includes(delimiter)) {
      return `${cleaned.split(delimiter, 1)[0].replace(/[.!?]+$/, "")}.`;
    }
  }
  return /[.!?]$/.test(cleaned) ? cleaned : `${cleaned}.`;
}

function readSourceFile(filePath) {
  const content = fs.readFileSync(filePath, "utf8");
  return ts.createSourceFile(filePath, content, ts.ScriptTarget.Latest, true);
}

function propertyNameText(name, source) {
  if (ts.isIdentifier(name) || ts.isStringLiteral(name) || ts.isNumericLiteral(name)) {
    return name.text;
  }
  return name.getText(source);
}

function serviceNameFromClientClass(className) {
  const defaultName = wordsFromMixed(className.replace(/Client$/, "")).map((word) => word.toLowerCase()).join("-");
  return COMMAND_GROUP_NAME_OVERRIDES.get(defaultName) || defaultName;
}

function camelToKebab(value) {
  return wordsFromMixed(value).map((word) => word.toLowerCase()).join("-");
}

function camelToSnake(value) {
  return wordsFromMixed(value).map((word) => word.toLowerCase()).join("_");
}

function pascalToKebab(value) {
  return camelToKebab(value);
}

function wordsFromMixed(value) {
  const normalized = String(value || "").replace(/[^0-9A-Za-z]+/g, " ");
  const words = [];
  for (const token of normalized.split(/\s+/).filter(Boolean)) {
    words.push(...(token.match(/[A-Z]+(?=[A-Z][a-z]|\d|$)|[A-Z]?[a-z]+|\d+/g) || [token]));
  }
  return words;
}

function upperFirst(value) {
  return `${value.charAt(0).toUpperCase()}${value.slice(1)}`;
}

function removeUndefined(value) {
  return Object.fromEntries(Object.entries(value).filter((entry) => entry[1] !== undefined));
}

function hashSdkSources(sdkRoot) {
  const digest = crypto.createHash("sha256");
  for (const filePath of sdkSourceFiles(sdkRoot)) {
    digest.update(path.relative(sdkRoot, filePath));
    digest.update("\0");
    digest.update(fs.readFileSync(filePath));
    digest.update("\0");
  }
  return digest.digest("hex");
}

function sdkSourceFiles(sdkRoot) {
  const roots = [path.join(sdkRoot, "lib", "client.ts"), path.join(sdkRoot, "lib", "request"), path.join(sdkRoot, "lib", "model"), path.join(sdkRoot, "lib", "response")];
  const files = [];
  for (const root of roots) {
    if (!fs.existsSync(root)) {
      continue;
    }
    const stat = fs.statSync(root);
    if (stat.isFile()) {
      files.push(root);
    } else {
      for (const name of fs.readdirSync(root).sort()) {
        if (name.endsWith(".ts")) {
          files.push(path.join(root, name));
        }
      }
    }
  }
  return files.sort();
}

function countCommands(manifest) {
  return manifest.commandGroups.reduce((total, group) => total + group.commands.length, 0);
}

main();
