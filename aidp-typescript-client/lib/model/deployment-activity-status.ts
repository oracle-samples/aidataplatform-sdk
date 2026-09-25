// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Outcome recorded for a deployment activity.
**/
export enum DeploymentActivityStatus {
    Success = "SUCCESS",
    Failure = "FAILURE",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace DeploymentActivityStatus {
    export function getJsonObj(obj: DeploymentActivityStatus): DeploymentActivityStatus {
        return obj;
    }
    export function getDeserializedJsonObj(obj: DeploymentActivityStatus): DeploymentActivityStatus {
        return obj;
    }
}

