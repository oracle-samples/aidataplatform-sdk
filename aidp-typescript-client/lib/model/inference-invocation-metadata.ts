// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Metadata recorded with the inference request and response events.
*/
export interface InferenceInvocationMetadata {
    /**
    * OCI region that served the inference invocation.
    */
    'region'?: string;
    /**
    * Identifier of the model deployment replica that served the invocation.
    */
    'replicaId'?: string;
    /**
    * Caller recorded on the inference request event.
    */
    'caller'?: string;

}

export namespace InferenceInvocationMetadata {




    export function getJsonObj(obj: InferenceInvocationMetadata): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: InferenceInvocationMetadata): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
