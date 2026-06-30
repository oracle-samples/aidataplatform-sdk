// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* List of conditions
*/
export interface NodeFilterPredicates {
    /**
    * Filters nodes whose display name contains the specified value.
    */
    'displayNameContains'?: string;
    /**
    * Filters nodes whose type exactly matches the specified value.
    */
    'typeEquals'?: string;

}

export namespace NodeFilterPredicates {



    export function getJsonObj(obj: NodeFilterPredicates): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: NodeFilterPredicates): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
