// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * HTTP method for the request
**/
export enum HttpMethod {
    Get = "GET",
    Post = "POST",
    Put = "PUT",
    Delete = "DELETE",
    Patch = "PATCH",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace HttpMethod {
    export function getJsonObj(obj: HttpMethod): HttpMethod {
        return obj;
    }
    export function getDeserializedJsonObj(obj: HttpMethod): HttpMethod {
        return obj;
    }
}

