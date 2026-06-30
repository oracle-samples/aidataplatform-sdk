// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Node type.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public enum NodeType implements com.oracle.bmc.http.internal.BmcEnum {
    StartNode("START_NODE"),
    Guardrails("GUARDRAILS"),
    Agent("AGENT"),
    SupervisorAgent("SUPERVISOR_AGENT"),
    SqlTool("SQL_TOOL"),
    PromptTool("PROMPT_TOOL"),
    RagTool("RAG_TOOL"),
    McpTool("MCP_TOOL"),
    HttpTool("HTTP_TOOL"),
    CustomTool("CUSTOM_TOOL"),
    

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(NodeType.class);

    private final String value;
    private static java.util.Map<String, NodeType> map;

    static {
        map = new java.util.HashMap<>();
        for (NodeType v : NodeType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    NodeType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static NodeType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn("Received unknown value '{}' for enum 'NodeType', returning UnknownEnumValue", key);
        return UnknownEnumValue;
    }
}
