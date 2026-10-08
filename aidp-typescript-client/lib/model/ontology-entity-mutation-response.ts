// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Response envelope for design-time ontology entity mutation results.
*/
export interface OntologyEntityMutationResponse {
    'data'?: model.OntologyEntityMutationResult;
    /**
    * HTTP-equivalent status code reported by the Ontology Manager backend. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'status'?: number;
    /**
    * Backend request identifier for tracing.
    */
    'opcRequestId'?: string;
    /**
    * Time the response was produced.
    */
    'timestamp'?: Date;
    /**
    * Optional human-readable message describing the response.
    */
    'message'?: string;

}

export namespace OntologyEntityMutationResponse {






    export function getJsonObj(obj: OntologyEntityMutationResponse): object {
        const jsonObj = {...obj, ...{
            
                'data': obj.data ?
                
                
                model.OntologyEntityMutationResult.getJsonObj(obj.data) : undefined,




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityMutationResponse): object {
        const jsonObj = {...obj, ...{
            
                    'data': obj.data ?
                
                
                model.OntologyEntityMutationResult.getDeserializedJsonObj(obj.data) : undefined,




         }};

        
        
        return jsonObj;
    }
}
