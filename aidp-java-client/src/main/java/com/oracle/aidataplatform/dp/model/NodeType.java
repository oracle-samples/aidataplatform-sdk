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
    NestedAgentFlow("NESTED_AGENT_FLOW"),
    ExternalAgent("EXTERNAL_AGENT"),
    HumanInTheLoop("HUMAN_IN_THE_LOOP"),
    SqlTool("SQL_TOOL"),
    PromptTool("PROMPT_TOOL"),
    RagTool("RAG_TOOL"),
    McpTool("MCP_TOOL"),
    HttpTool("HTTP_TOOL"),
    CustomTool("CUSTOM_TOOL"),
    ;

    

    private final String value;
    private static java.util.Map<String, NodeType> map;

    static {
        map = new java.util.HashMap<>();
        for (NodeType v : NodeType.values()) {
                map.put(v.getValue(), v);
            
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
        throw new IllegalArgumentException("Invalid NodeType: " + key);
    }
}
