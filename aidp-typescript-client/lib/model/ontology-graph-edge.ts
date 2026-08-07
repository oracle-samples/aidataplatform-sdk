// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Published ontology graph edge.
*/
export interface OntologyGraphEdge {
    'id': string;
    'type': string;
    'label'?: string;
    'sourceId': string;
    'targetId': string;

}

export namespace OntologyGraphEdge {






    export function getJsonObj(obj: OntologyGraphEdge): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphEdge): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
