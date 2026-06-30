// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * LifecycleState of an Agent Session or Deployment.
**/
export enum DeploymentLifecycleState {
    Creating = "CREATING",
    Active = "ACTIVE",
    Inactive = "INACTIVE",
    Failed = "FAILED",
    Deleted = "DELETED",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace DeploymentLifecycleState {
    export function getJsonObj(obj: DeploymentLifecycleState): DeploymentLifecycleState {
        return obj;
    }
    export function getDeserializedJsonObj(obj: DeploymentLifecycleState): DeploymentLifecycleState {
        return obj;
    }
}

