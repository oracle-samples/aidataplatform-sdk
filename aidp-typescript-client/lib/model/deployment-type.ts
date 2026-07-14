// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Type of an Agent Deployment.
**/
export enum DeploymentType {
    Test = "TEST",
    Prod = "PROD",
    Code = "CODE",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace DeploymentType {
    export function getJsonObj(obj: DeploymentType): DeploymentType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: DeploymentType): DeploymentType {
        return obj;
    }
}

