// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Tool type.
**/
export enum ToolType {
    Rag = "RAG",
    Sql = "SQL",
    Prompt = "PROMPT",
    Nl2Sql = "NL2SQL",
    Mcp = "MCP",
    Custom = "CUSTOM",
    Http = "HTTP",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace ToolType {
    export function getJsonObj(obj: ToolType): ToolType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: ToolType): ToolType {
        return obj;
    }
}

