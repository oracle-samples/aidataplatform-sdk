// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Progress reported by an ontology discovery job.
*/
export interface OntologyDiscoveryProgress {
    /**
    * Completed work item count. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'completed'?: number;
    /**
    * Total work item count. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'total'?: number;
    /**
    * Current discovery stage.
    */
    'currentStage'?: string;

}

export namespace OntologyDiscoveryProgress {




    export function getJsonObj(obj: OntologyDiscoveryProgress): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyDiscoveryProgress): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
