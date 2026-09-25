// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Cardinality resolved from a relationship domain class restriction.
*/
export interface OntologyEntityCardinality {
    'minCardinality': number;
    'maxCardinality'?: number;

}

export namespace OntologyEntityCardinality {



    export function getJsonObj(obj: OntologyEntityCardinality): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityCardinality): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
