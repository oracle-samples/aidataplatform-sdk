// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request for refactoring a design-time ontology entity IRI across project Turtle files.
*/
export interface OntologyEntityRefactorDetails {
    /**
    * Entity type to refactor. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap. Uppercase aliases ONTOLOGY, CLASS, PROPERTY, and RELATIONSHIP are also accepted.
    */
    'entityType': string;
    /**
    * Current ontology entity IRI.
    */
    'iri': string;
    /**
    * Replacement ontology entity IRI.
    */
    'newIri': string;
    /**
    * Optional current ontology namespace prefix to replace. Not required for class refactors.
    */
    'prefix'?: string;
    /**
    * Optional replacement ontology namespace prefix. Not required for class refactors.
    */
    'newPrefix'?: string;

}

export namespace OntologyEntityRefactorDetails {






    export function getJsonObj(obj: OntologyEntityRefactorDetails): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityRefactorDetails): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
