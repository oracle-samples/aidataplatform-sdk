// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface FindOntologyGraphPathsDetails {
    'projectId': string;
    'sourceNodeId': string;
    'targetNodeId': string;
    'maxDepth'?: number;
    'relationshipTypes'?: Array<string>;
    'limit'?: number;

}

export namespace FindOntologyGraphPathsDetails {







    export function getJsonObj(obj: FindOntologyGraphPathsDetails): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: FindOntologyGraphPathsDetails): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
