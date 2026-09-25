// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Save-level error details.
*/
export interface OntologyEntitySaveError {
    'code'?: string;
    'message'?: string;

}

export namespace OntologyEntitySaveError {



    export function getJsonObj(obj: OntologyEntitySaveError): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntitySaveError): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
