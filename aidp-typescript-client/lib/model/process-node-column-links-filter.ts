// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Optional filter criteria for process node column links.
*/
export interface ProcessNodeColumnLinksFilter {
    /**
    * Filters only the links for a particular stage in a multi-stage process.
* 
    */
    'processRunStageId'?: string;
    /**
    * Limits the returned column links to those whose transformation exactly matches the
* supplied value.
* 
    */
    'transformation'?: string;
    /**
    * Limits the returned column links to those where either the source or target column
* display name contains the supplied value, or where the parent artifact segment in the
* source or target column path contains the supplied value.
* 
    */
    'displayNameContains'?: string;

}

export namespace ProcessNodeColumnLinksFilter {




    export function getJsonObj(obj: ProcessNodeColumnLinksFilter): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ProcessNodeColumnLinksFilter): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
