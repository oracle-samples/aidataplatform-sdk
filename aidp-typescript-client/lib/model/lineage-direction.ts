// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Indicates the direction for lineage fetch. It is one of upstream (or source objects), downstream (or target
* objects), both.
* Corresponding enums are:
* UPSTREAM   - Source objects.
* DOWNSTREAM - Target objects.
* BOTH       - Both source and target objects.
* 
**/
export enum LineageDirection {
    Upstream = "UPSTREAM",
    Both = "BOTH",
    Downstream = "DOWNSTREAM",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace LineageDirection {
    export function getJsonObj(obj: LineageDirection): LineageDirection {
        return obj;
    }
    export function getDeserializedJsonObj(obj: LineageDirection): LineageDirection {
        return obj;
    }
}

