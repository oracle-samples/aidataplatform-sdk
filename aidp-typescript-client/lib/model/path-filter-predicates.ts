// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* List of conditions
*/
export interface PathFilterPredicates {
    'passThroughNode'?: model.PassThroughNodeFilterPredicate;
    /**
    * Includes only lineage paths where the anchor node's column is one of the specified values, and column-level traversal starts only from these anchor columns.
    */
    'anchorNodeColumnsIn'?: Array<string>;
    /**
    * Includes only those lineage paths in which each node's parent ID is present in the specified list.
    */
    'parentIdIn'?: Array<string>;

}

export namespace PathFilterPredicates {




    export function getJsonObj(obj: PathFilterPredicates): object {
        const jsonObj = {...obj, ...{
            
                'passThroughNode': obj.passThroughNode ?
                
                
                model.PassThroughNodeFilterPredicate.getJsonObj(obj.passThroughNode) : undefined,


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PathFilterPredicates): object {
        const jsonObj = {...obj, ...{
            
                    'passThroughNode': obj.passThroughNode ?
                
                
                model.PassThroughNodeFilterPredicate.getDeserializedJsonObj(obj.passThroughNode) : undefined,


         }};

        
        
        return jsonObj;
    }
}
