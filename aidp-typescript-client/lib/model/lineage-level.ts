// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Indicates the level for lineage fetch. It is one of ENTITY/COLUMN
* Corresponding enums are:
* Entity   - Entity objects.
* Column - Column objects.
* 
**/
export enum LineageLevel {
    Entity = "ENTITY",
    Column = "COLUMN"
    
}

export namespace LineageLevel {
    export function getJsonObj(obj: LineageLevel): LineageLevel {
        return obj;
    }
    export function getDeserializedJsonObj(obj: LineageLevel): LineageLevel {
        return obj;
    }
}

