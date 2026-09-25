// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Lifecycle status of a model deployment.
**/
export enum DeploymentStatus {
    Inactive = "INACTIVE",
    Activating = "ACTIVATING",
    Active = "ACTIVE",
    Deactivating = "DEACTIVATING",
    Updating = "UPDATING",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace DeploymentStatus {
    export function getJsonObj(obj: DeploymentStatus): DeploymentStatus {
        return obj;
    }
    export function getDeserializedJsonObj(obj: DeploymentStatus): DeploymentStatus {
        return obj;
    }
}

