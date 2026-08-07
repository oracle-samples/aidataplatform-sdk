// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Search hit from a published ontology graph metadata object.
*/
export interface OntologyGraphSearchResult {
    /**
    * Stable ontology object identifier, usually an IRI or generated relationship id.
    */
    'id': string;
    /**
    * Result type. One of CLASS, PROPERTY, SHAPE, or RELATIONSHIP.
    */
    'type': string;
    /**
    * Local name or generated graph object name.
    */
    'name'?: string;
    /**
    * Human-readable label when available.
    */
    'label'?: string;
    'description'?: string;
    /**
    * Source class or object identifier for relationship-like results.
    */
    'sourceId'?: string;
    /**
    * Target class or object identifier for relationship-like results.
    */
    'targetId'?: string;
    /**
    * Relationship or property kind when available.
    */
    'relationshipLabel'?: string;

}

export namespace OntologyGraphSearchResult {









    export function getJsonObj(obj: OntologyGraphSearchResult): object {
        const jsonObj = {...obj, ...{
            








        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphSearchResult): object {
        const jsonObj = {...obj, ...{
            








         }};

        
        
        return jsonObj;
    }
}
