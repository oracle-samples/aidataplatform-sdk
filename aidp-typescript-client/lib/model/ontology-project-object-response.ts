// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Response envelope for operations returning a single ontology project folder/file object.
*/
export interface OntologyProjectObjectResponse {
    'data'?: model.OntologyProjectObject;
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

export namespace OntologyProjectObjectResponse {






    export function getJsonObj(obj: OntologyProjectObjectResponse): object {
        const jsonObj = {...obj, ...{
            
                'data': obj.data ?
                
                
                model.OntologyProjectObject.getJsonObj(obj.data) : undefined,




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectObjectResponse): object {
        const jsonObj = {...obj, ...{
            
                    'data': obj.data ?
                
                
                model.OntologyProjectObject.getDeserializedJsonObj(obj.data) : undefined,




         }};

        
        
        return jsonObj;
    }
}
