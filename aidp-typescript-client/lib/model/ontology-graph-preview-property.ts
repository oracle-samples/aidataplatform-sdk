// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Literal property attached to a graph node.
*/
export interface OntologyGraphPreviewProperty {
    'name': string;
    'value': string;

}

export namespace OntologyGraphPreviewProperty {



    export function getJsonObj(obj: OntologyGraphPreviewProperty): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreviewProperty): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
