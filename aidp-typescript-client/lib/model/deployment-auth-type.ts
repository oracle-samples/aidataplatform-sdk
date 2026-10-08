// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Authentication mechanism selected for a model deployment's query endpoint.
**/
export enum DeploymentAuthType {
    Aidp = "AIDP",
    Oauth = "OAUTH",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace DeploymentAuthType {
    export function getJsonObj(obj: DeploymentAuthType): DeploymentAuthType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: DeploymentAuthType): DeploymentAuthType {
        return obj;
    }
}

