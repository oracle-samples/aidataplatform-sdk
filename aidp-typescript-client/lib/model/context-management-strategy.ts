// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Strategy used for context management.
**/
export enum ContextManagementStrategy {
    ClearToolUses = "CLEAR_TOOL_USES",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace ContextManagementStrategy {
    export function getJsonObj(obj: ContextManagementStrategy): ContextManagementStrategy {
        return obj;
    }
    export function getDeserializedJsonObj(obj: ContextManagementStrategy): ContextManagementStrategy {
        return obj;
    }
}

