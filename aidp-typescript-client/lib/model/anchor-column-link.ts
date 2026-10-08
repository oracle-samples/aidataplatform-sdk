// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived association between a supplied non-anchor column and an anchor column.
*/
export interface AnchorColumnLink {
    /**
    * ID of a non-anchor column supplied in nodeColumns.
    */
    'scopedColumnId': string;
    /**
    * ID of an anchor column connected to the scoped column.
    */
    'anchorColumnId': string;

}

export namespace AnchorColumnLink {



    export function getJsonObj(obj: AnchorColumnLink): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AnchorColumnLink): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
