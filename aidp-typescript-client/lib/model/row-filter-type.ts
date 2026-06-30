// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Type of row filter expression.
**/
export enum RowFilterType {
    Sql = "SQL",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace RowFilterType {
    export function getJsonObj(obj: RowFilterType): RowFilterType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: RowFilterType): RowFilterType {
        return obj;
    }
}

