// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for a single correlated inference request and response record.
*/
export interface InferenceInvocationDetails {
    /**
    * Timestamp recorded for the inference request event.
    */
    'requestTimestamp': Date;
    /**
    * Response latency in milliseconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'latencyMs'?: number;
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
    * Request ID of the inference invocation, used to correlate the request and response events.
    */
    'requestId': string;
    /**
    * Request payload captured in the inference request event.
    */
    'requestPayload'?: any;
    /**
    * Response payload captured in the inference response event.
    */
    'responsePayload'?: any;
    'metadata': model.InferenceInvocationMetadata;

}

export namespace InferenceInvocationDetails {










    export function getJsonObj(obj: InferenceInvocationDetails): object {
        const jsonObj = {...obj, ...{
            








                'metadata': obj.metadata ?
                
                
                model.InferenceInvocationMetadata.getJsonObj(obj.metadata) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: InferenceInvocationDetails): object {
        const jsonObj = {...obj, ...{
            








                    'metadata': obj.metadata ?
                
                
                model.InferenceInvocationMetadata.getDeserializedJsonObj(obj.metadata) : undefined,
         }};

        
        
        return jsonObj;
    }
}
