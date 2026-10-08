// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Response envelope for operations returning ontology project source file content.
*/
export interface OntologyProjectFileContentResponse {
    'data'?: model.OntologyProjectFileContent;
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

export namespace OntologyProjectFileContentResponse {






    export function getJsonObj(obj: OntologyProjectFileContentResponse): object {
        const jsonObj = {...obj, ...{
            
                'data': obj.data ?
                
                
                model.OntologyProjectFileContent.getJsonObj(obj.data) : undefined,




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectFileContentResponse): object {
        const jsonObj = {...obj, ...{
            
                    'data': obj.data ?
                
                
                model.OntologyProjectFileContent.getDeserializedJsonObj(obj.data) : undefined,




         }};

        
        
        return jsonObj;
    }
}
