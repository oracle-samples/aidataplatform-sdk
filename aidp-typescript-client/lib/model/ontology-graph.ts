// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary of a published ontology graph.
*/
export interface OntologyGraph {
    'projectId': string;
    'graphName'?: string;
    'namespace'?: string;
    'classCount'?: number;
    'propertyCount'?: number;
    'shapeCount'?: number;
    'relationshipCount'?: number;

}

export namespace OntologyGraph {








    export function getJsonObj(obj: OntologyGraph): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraph): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
