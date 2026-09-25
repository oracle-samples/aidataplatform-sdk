// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Operation recorded in a deployment activity history entry.
**/
export enum DeploymentOperationType {
    Create = "CREATE",
    Edit = "EDIT",
    Activate = "ACTIVATE",
    Deactivate = "DEACTIVATE",
    RollForward = "ROLL_FORWARD",
    RollBack = "ROLL_BACK",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace DeploymentOperationType {
    export function getJsonObj(obj: DeploymentOperationType): DeploymentOperationType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: DeploymentOperationType): DeploymentOperationType {
        return obj;
    }
}

