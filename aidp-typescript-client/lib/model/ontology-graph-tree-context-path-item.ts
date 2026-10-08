// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Compact ontology tree path item.
*/
export interface OntologyGraphTreeContextPathItem {
    /**
    * Stable unique identifier for the path item.
    */
    'uid': string;
    /**
    * Node type for the path item.
    */
    'type': string;
    'displayName': string;

}

export namespace OntologyGraphTreeContextPathItem {




    export function getJsonObj(obj: OntologyGraphTreeContextPathItem): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphTreeContextPathItem): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
