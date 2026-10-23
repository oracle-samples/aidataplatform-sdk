// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * The privilege granted on a registered model.
**/
export enum RegisteredModelPrivilege {
    Read = "READ",
    Manage = "MANAGE",
    Admin = "ADMIN",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace RegisteredModelPrivilege {
    export function getJsonObj(obj: RegisteredModelPrivilege): RegisteredModelPrivilege {
        return obj;
    }
    export function getDeserializedJsonObj(obj: RegisteredModelPrivilege): RegisteredModelPrivilege {
        return obj;
    }
}

