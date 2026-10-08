// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Graph edge in a design-time ontology preview.
*/
export interface OntologyGraphPreviewEdge {
    'id': string;
    'label': string;
    'sourceId': string;
    'targetId': string;

}

export namespace OntologyGraphPreviewEdge {





    export function getJsonObj(obj: OntologyGraphPreviewEdge): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreviewEdge): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
