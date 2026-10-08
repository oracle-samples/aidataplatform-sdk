// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Direction of a non-anchor node relative to the active lineage anchor.
* BOTH is intentionally unsupported because a rendered non-anchor node belongs to one side
* of the anchor.
* 
**/
export enum ScopedLineageDirection {
    Upstream = "UPSTREAM",
    Downstream = "DOWNSTREAM"
    
}

export namespace ScopedLineageDirection {
    export function getJsonObj(obj: ScopedLineageDirection): ScopedLineageDirection {
        return obj;
    }
    export function getDeserializedJsonObj(obj: ScopedLineageDirection): ScopedLineageDirection {
        return obj;
    }
}

