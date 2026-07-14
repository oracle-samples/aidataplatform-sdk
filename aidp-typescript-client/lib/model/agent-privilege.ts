// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * The privilege for a agent. Can be inherited privilege coming from object higher up in hierarchy.
**/
export enum AgentPrivilege {
    Read = "READ",
    Manage = "MANAGE",
    Admin = "ADMIN",
    Use = "USE",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace AgentPrivilege {
    export function getJsonObj(obj: AgentPrivilege): AgentPrivilege {
        return obj;
    }
    export function getDeserializedJsonObj(obj: AgentPrivilege): AgentPrivilege {
        return obj;
    }
}

