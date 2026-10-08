// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* JSON Patch-style operation. Paths are scoped to flat entity property paths.
*/
export interface OntologyEntityPatchOperation {
    /**
    * Patch operation. Supported values are add, replace, and remove.
    */
    'op': string;
    /**
    * JSON pointer path such as /label, /comment, or /subClassOf/0.
    */
    'path': string;
    /**
    * Value used by add and replace operations.
    */
    'value'?: any;

}

export namespace OntologyEntityPatchOperation {




    export function getJsonObj(obj: OntologyEntityPatchOperation): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityPatchOperation): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
