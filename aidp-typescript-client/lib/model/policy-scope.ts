// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Scope of policy application.
**/
export enum PolicyScope {
    UserRequest = "USER_REQUEST",
    AgentResponse = "AGENT_RESPONSE",
    Both = "BOTH",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace PolicyScope {
    export function getJsonObj(obj: PolicyScope): PolicyScope {
        return obj;
    }
    export function getDeserializedJsonObj(obj: PolicyScope): PolicyScope {
        return obj;
    }
}

