// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Filtering parameter that lets users define which entities are included in the results, while still traversing the full lineage.
*/
export interface NodeFilterObject {
    'predicates': model.NodeFilterPredicates;

}

export namespace NodeFilterObject {


    export function getJsonObj(obj: NodeFilterObject): object {
        const jsonObj = {...obj, ...{
            
                'predicates': obj.predicates ?
                
                
                model.NodeFilterPredicates.getJsonObj(obj.predicates) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: NodeFilterObject): object {
        const jsonObj = {...obj, ...{
            
                    'predicates': obj.predicates ?
                
                
                model.NodeFilterPredicates.getDeserializedJsonObj(obj.predicates) : undefined,
         }};

        
        
        return jsonObj;
    }
}
