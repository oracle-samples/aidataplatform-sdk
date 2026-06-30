// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Node type.
**/
export enum NodeType {
    StartNode = "START_NODE",
    Guardrails = "GUARDRAILS",
    Agent = "AGENT",
    SupervisorAgent = "SUPERVISOR_AGENT",
    SqlTool = "SQL_TOOL",
    PromptTool = "PROMPT_TOOL",
    RagTool = "RAG_TOOL",
    McpTool = "MCP_TOOL",
    HttpTool = "HTTP_TOOL",
    CustomTool = "CUSTOM_TOOL",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace NodeType {
    export function getJsonObj(obj: NodeType): NodeType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: NodeType): NodeType {
        return obj;
    }
}

