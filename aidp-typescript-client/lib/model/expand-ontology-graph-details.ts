// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface ExpandOntologyGraphDetails {
    'projectId': string;
    'startNodeId': string;
    /**
    * OUT, IN, or BOTH.
    */
    'direction'?: string;
    'depth'?: number;
    'relationshipTypes'?: Array<string>;
    'limit'?: number;

}

export namespace ExpandOntologyGraphDetails {







    export function getJsonObj(obj: ExpandOntologyGraphDetails): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ExpandOntologyGraphDetails): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
