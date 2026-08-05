// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Published ontology graph node.
*/
export interface OntologyGraphNode {
    'id': string;
    /**
    * CLASS, PROPERTY, SHAPE, CONSTRAINT, or RELATIONSHIP.
    */
    'type': string;
    'name'?: string;
    'label'?: string;
    'description'?: string;

}

export namespace OntologyGraphNode {






    export function getJsonObj(obj: OntologyGraphNode): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphNode): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
