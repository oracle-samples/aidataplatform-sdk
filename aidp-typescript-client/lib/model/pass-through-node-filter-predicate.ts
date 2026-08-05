// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Includes only lineage paths that pass through the specified intermediate node.
*/
export interface PassThroughNodeFilterPredicate {
    /**
    * ID of the pass through node.
    */
    'id'?: string;
    /**
    * Depth of the pass through node from anchor node. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'depth'?: number;

}

export namespace PassThroughNodeFilterPredicate {



    export function getJsonObj(obj: PassThroughNodeFilterPredicate): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PassThroughNodeFilterPredicate): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
