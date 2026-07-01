// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Filtering parameter that lets the user control how far the lineage is traversed.
*/
export interface PathFilterObject {
    'predicates': model.PathFilterPredicates;

}

export namespace PathFilterObject {


    export function getJsonObj(obj: PathFilterObject): object {
        const jsonObj = {...obj, ...{
            
                'predicates': obj.predicates ?
                
                
                model.PathFilterPredicates.getJsonObj(obj.predicates) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PathFilterObject): object {
        const jsonObj = {...obj, ...{
            
                    'predicates': obj.predicates ?
                
                
                model.PathFilterPredicates.getDeserializedJsonObj(obj.predicates) : undefined,
         }};

        
        
        return jsonObj;
    }
}
