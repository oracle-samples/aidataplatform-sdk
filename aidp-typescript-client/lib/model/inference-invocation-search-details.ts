// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Filters and OCI-backed pagination for correlated inference invocation rows. Each response contains at most 20 rows; only the first 10,000 matching rows are available.
*/
export interface InferenceInvocationSearchDetails {
    /**
    * Inclusive request timestamp start. Defaults to current time minus 24 hours when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
    */
    'timeStart'?: Date;
    /**
    * Inclusive request timestamp end. Defaults to current time when omitted. The range must be within the most recent 14 days. Body timestamps require millisecond precision. Example: 2026-09-15T00:00:00.000Z.
    */
    'timeEnd'?: Date;
    /**
    * Restricts results to correlated invocations with this status.
    */
    'status'?: model.InferenceInvocationStatus;
    /**
    * Restricts results to invocations served by this model version.
    */
    'modelVersion'?: string;
    /**
    * Restricts results to invocations against this inference endpoint URI.
    */
    'requestUri'?: string;
    /**
    * Opaque token from a previous response. It continues pagination of the filtered, correlated invocation rows.
    */
    'pageToken'?: string;

}

export namespace InferenceInvocationSearchDetails {







    export function getJsonObj(obj: InferenceInvocationSearchDetails): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: InferenceInvocationSearchDetails): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
