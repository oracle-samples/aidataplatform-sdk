// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Type used for applying memory limits.
**/
export enum MemoryLimitStrategy {
    Truncation = "TRUNCATION",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace MemoryLimitStrategy {
    export function getJsonObj(obj: MemoryLimitStrategy): MemoryLimitStrategy {
        return obj;
    }
    export function getDeserializedJsonObj(obj: MemoryLimitStrategy): MemoryLimitStrategy {
        return obj;
    }
}

