// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Status derived from the correlated inference response event. UNKNOWN is reported when the response event carries no status code, which some model runtime versions omit; the invocation is still returned rather than discarded.
**/
export enum InferenceInvocationStatus {
    Success = "SUCCESS",
    Malformed = "MALFORMED",
    Failed = "FAILED",
    Unknown = "UNKNOWN",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace InferenceInvocationStatus {
    export function getJsonObj(obj: InferenceInvocationStatus): InferenceInvocationStatus {
        return obj;
    }
    export function getDeserializedJsonObj(obj: InferenceInvocationStatus): InferenceInvocationStatus {
        return obj;
    }
}

