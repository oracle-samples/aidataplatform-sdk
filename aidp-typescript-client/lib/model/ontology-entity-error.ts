// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Entity mutation error details.
*/
export interface OntologyEntityError {
    /**
    * Machine-readable error code.
    */
    'code'?: string;
    /**
    * Human-readable error message.
    */
    'errorMessage'?: string;

}

export namespace OntologyEntityError {



    export function getJsonObj(obj: OntologyEntityError): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityError): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
