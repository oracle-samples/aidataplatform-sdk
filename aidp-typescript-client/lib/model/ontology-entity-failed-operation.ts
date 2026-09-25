// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Failed operation details for an unsuccessful save bundle.
*/
export interface OntologyEntityFailedOperation {
    'opId'?: string;
    'op'?: string;
    'entityType'?: string;
    'compactIri'?: string;
    'iri'?: string;
    'code'?: string;
    'message'?: string;

}

export namespace OntologyEntityFailedOperation {








    export function getJsonObj(obj: OntologyEntityFailedOperation): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityFailedOperation): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
