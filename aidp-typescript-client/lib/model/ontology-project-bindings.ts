// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A page of ontology-project mapping bindings used to derive data sources.
*/
export interface OntologyProjectBindings {
    /**
    * R2RML/RML bindings in the same shape returned by GetDataLakeOntologyEntity.
    */
    'binding': Array<any>;
    /**
    * Opaque offset token for the next page, omitted when this is the final page.
    */
    'nextPage'?: string;

}

export namespace OntologyProjectBindings {



    export function getJsonObj(obj: OntologyProjectBindings): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectBindings): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
