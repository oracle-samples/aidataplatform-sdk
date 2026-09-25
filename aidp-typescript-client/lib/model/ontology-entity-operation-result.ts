// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result for one applied entity operation.
*/
export interface OntologyEntityOperationResult {
    'opId'?: string;
    'entityType'?: string;
    'compactIri'?: string;
    'iri'?: string;
    'status'?: string;

}

export namespace OntologyEntityOperationResult {






    export function getJsonObj(obj: OntologyEntityOperationResult): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityOperationResult): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
