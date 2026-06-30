// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * The target query engine type for SQL tool execution.
**/
export enum SqlToolQueryType {
    Oracle = "ORACLE",
    Spark = "SPARK",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace SqlToolQueryType {
    export function getJsonObj(obj: SqlToolQueryType): SqlToolQueryType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: SqlToolQueryType): SqlToolQueryType {
        return obj;
    }
}

