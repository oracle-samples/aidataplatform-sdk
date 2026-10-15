// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Project-wide semantic counts, independent of the bounded graph slice.
*/
export interface OntologyGraphSummary {
    'classCount': number;
    'propertyCount': number;
    'relationshipCount': number;

}

export namespace OntologyGraphSummary {




    export function getJsonObj(obj: OntologyGraphSummary): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphSummary): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
