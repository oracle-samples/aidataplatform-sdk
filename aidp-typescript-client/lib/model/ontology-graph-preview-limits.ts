// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Graph preview limits and whether they were reached.
*/
export interface OntologyGraphPreviewLimits {
    'maxNodes': number;
    'maxEdges': number;
    'reachedNodeLimit': boolean;
    'reachedEdgeLimit': boolean;

}

export namespace OntologyGraphPreviewLimits {





    export function getJsonObj(obj: OntologyGraphPreviewLimits): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreviewLimits): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
