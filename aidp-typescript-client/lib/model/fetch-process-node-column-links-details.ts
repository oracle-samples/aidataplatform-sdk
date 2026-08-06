// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The information needed to obtain column transformations done by a process.
*/
export interface FetchProcessNodeColumnLinksDetails {
    /**
    * ID of the lineage anchor node from which the traversal context is derived.
* 
    */
    'anchorNodeId': string;
    /**
    * ID of process node for which column transformation links are requested.
* 
    */
    'processNodeId': string;
    /**
    * Depth of the process node relative to the anchor node within the lineage traversal.
*  Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'processDepth': number;
    /**
    * Direction of the process node with respect to Anchor node.
    */
    'direction': model.LineageDirection;
    'filter'?: model.ProcessNodeColumnLinksFilter;

}

export namespace FetchProcessNodeColumnLinksDetails {






    export function getJsonObj(obj: FetchProcessNodeColumnLinksDetails): object {
        const jsonObj = {...obj, ...{
            




                'filter': obj.filter ?
                
                
                model.ProcessNodeColumnLinksFilter.getJsonObj(obj.filter) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: FetchProcessNodeColumnLinksDetails): object {
        const jsonObj = {...obj, ...{
            




                    'filter': obj.filter ?
                
                
                model.ProcessNodeColumnLinksFilter.getDeserializedJsonObj(obj.filter) : undefined,
         }};

        
        
        return jsonObj;
    }
}
