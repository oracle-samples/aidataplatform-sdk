package com.oracle.aidp.cli.invocation.assertions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.aidp.cli.invocation.runner.CliCommandResult;
import java.util.ArrayList;
import java.util.List;

public final class CliAssertions {
  private static final ObjectMapper MAPPER = new ObjectMapper();

  private CliAssertions() {}

  public static JsonNode assertSuccess(CliCommandResult result) {
    assertEquals(
        result.exitCode(),
        0,
        "CLI command failed.\nSTDOUT:\n" + result.stdout() + "\nSTDERR:\n" + result.stderr());
    return responseJson(result);
  }

  public static void assertStatus(JsonNode response, int expectedStatus) {
    JsonNode statusNode = response.path("status");
    assertTrue(statusNode.isNumber(), "CLI response did not contain numeric status: " + response);
    assertEquals(statusNode.asInt(), expectedStatus, "Unexpected CLI response status.");
  }

  public static void assertStatusIn(JsonNode response, int... expectedStatuses) {
    JsonNode statusNode = response.path("status");
    assertTrue(statusNode.isNumber(), "CLI response did not contain numeric status: " + response);
    int actual = statusNode.asInt();
    for (int expected : expectedStatuses) {
      if (actual == expected) {
        return;
      }
    }
    throw new AssertionError("Unexpected CLI response status " + actual + " in " + response);
  }

  public static JsonNode responseJson(CliCommandResult result) {
    String text = result.stdout().contains("Response:") ? result.stdout() : result.stderr();
    int markerIndex = text.indexOf("Response:");
    assertTrue(markerIndex >= 0, "CLI output did not contain a Response block: " + result.combinedOutput());
    String rawJson = text.substring(markerIndex + "Response:".length()).trim();
    try {
      return MAPPER.readTree(rawJson);
    } catch (Exception e) {
      throw new AssertionError("Failed to parse CLI response JSON from: " + rawJson, e);
    }
  }

  public static String requiredText(JsonNode node, String... fieldNames) {
    String value = optionalText(node, fieldNames);
    assertTrue(value != null && !value.isBlank(), "Missing required field " + List.of(fieldNames) + " in " + node);
    return value;
  }

  public static String optionalText(JsonNode node, String... fieldNames) {
    for (String fieldName : fieldNames) {
      JsonNode value = node.path(fieldName);
      if (!value.isMissingNode() && !value.isNull()) {
        return value.asText();
      }
    }
    return null;
  }

  public static JsonNode data(JsonNode response) {
    return response.path("data");
  }

  public static List<JsonNode> items(JsonNode response) {
    JsonNode data = data(response);
    JsonNode items = firstExisting(data, "items");
    if (items.isMissingNode()) {
      items = firstExisting(data, "workspaceCollection", "workspace_collection").path("items");
    }
    if (items.isMissingNode()) {
      items = firstExisting(data, "workspacePermissionCollection", "workspace_permission_collection").path("items");
    }
    if (items.isMissingNode()) {
      items = firstExisting(data, "asyncOperationCollection", "async_operation_collection").path("items");
    }
    List<JsonNode> values = new ArrayList<>();
    if (items.isArray()) {
      items.forEach(values::add);
    }
    return values;
  }

  public static JsonNode firstExisting(JsonNode node, String... fieldNames) {
    for (String fieldName : fieldNames) {
      JsonNode value = node.path(fieldName);
      if (!value.isMissingNode()) {
        return value;
      }
    }
    return MAPPER.missingNode();
  }
}
