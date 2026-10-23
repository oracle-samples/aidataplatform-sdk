// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* One correlated inference request and response record.
*/
export interface InferenceInvocationSummary {
    /**
    * Timestamp recorded for the inference request event.
    */
    'requestTimestamp': Date;
    /**
    * Inference endpoint URI.
    */
    'requestUri': string;
    /**
    * Model version associated with the invocation.
    */
    'modelVersion'?: string;
    /**
    * Status derived from the correlated inference response event.
    */
    'status': model.InferenceInvocationStatus;
    /**
    * Response latency in milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'latencyMs'?: number;
    /**
    * Request ID of the inference invocation, used to correlate the request and response events. Pass this value to the get inference details operation.
    */
    'requestId': string;

}

export namespace InferenceInvocationSummary {







    export function getJsonObj(obj: InferenceInvocationSummary): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: InferenceInvocationSummary): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
