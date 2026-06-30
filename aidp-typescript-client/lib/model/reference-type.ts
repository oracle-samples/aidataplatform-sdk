// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * referenceType of the node
**/
export enum ReferenceType {
    Child = "CHILD",
    Parent = "PARENT"
    
}

export namespace ReferenceType {
    export function getJsonObj(obj: ReferenceType): ReferenceType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: ReferenceType): ReferenceType {
        return obj;
    }
}

