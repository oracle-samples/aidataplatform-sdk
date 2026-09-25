// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Flat ontology entity JSON for design-time ontology editing.
*/
export interface OntologyEntity {
    /**
    * Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.
    */
    'entityType': string;
    /**
    * Compact IRI for the entity, such as ex:Product.
    */
    'compactIri'?: string;
    /**
    * Full IRI for the entity, such as https://example.com/ontology/Product.
    */
    'iri'?: string;
    /**
    * Project-relative Turtle file path used when creating a new OwlOntology. If omitted, the service creates concepts/{safeOntologyName}.ttl.
    */
    'path'?: string;
    /**
    * Human-readable entity label.
    */
    'label'?: string;
    /**
    * Human-readable entity comment.
    */
    'comment'?: string;
    /**
    * Human-readable entity description.
    */
    'description'?: string;
    /**
    * Preferred SKOS label for the entity.
    */
    'prefLabel'?: string;
    /**
    * SKOS definition text for the entity.
    */
    'definition'?: string;
    /**
    * SKOS scope note text for the entity.
    */
    'scopeNotes'?: string;
    /**
    * Alternative SKOS labels for the entity.
    */
    'altLabels'?: Array<string>;
    /**
    * Synonym labels for the entity.
    */
    'synonyms'?: Array<string>;
    /**
    * OWL version information for ontology entities.
    */
    'versionInfo'?: string;
    /**
    * Default prefix used to identify entities that belong to this ontology.
    */
    'defaultPrefix'?: string;
    /**
    * Namespace prefix mappings defined by the ontology file, including the default prefix mapping when present.
    */
    'prefix'?: { [key: string]: string; };
    /**
    * OWL ontology import IRIs.
    */
    'imports'?: Array<string>;
    /**
    * Parent class IRIs or prefixed names for class entities.
    */
    'subClassOf'?: Array<string>;
    /**
    * Equivalent class IRIs or prefixed names for class entities.
    */
    'equivalentClasses'?: Array<string>;
    /**
    * Disjoint class IRIs or prefixed names for class entities.
    */
    'disjointWith'?: Array<string>;
    /**
    * Related class IRIs or prefixed names for class entities.
    */
    'relatedClasses'?: Array<string>;
    /**
    * Role of the class in the business or BI model.
    */
    'entityRole'?: string;
    /**
    * Property names or IRIs defining analytical grain.
    */
    'grainKey'?: Array<string>;
    /**
    * BI measure group association.
    */
    'measureGroup'?: string;
    /**
    * Source BI subject area.
    */
    'biSubjectArea'?: string;
    /**
    * Source BI subject area table mapping.
    */
    'biSubjectAreaTable'?: string;
    /**
    * Property kind for OwlProperty, such as datatype or object.
    */
    'propertyType'?: string;
    /**
    * Expected datatype for an OwlProperty or class property object.
    */
    'dataType'?: string;
    /**
    * Physical source column mapped to the property.
    */
    'mappedColumn'?: string;
    /**
    * Domain class IRIs or prefixed names for relationship entities.
    */
    'domain'?: string;
    /**
    * Range class IRIs or prefixed names for relationship entities.
    */
    'range'?: string;
    'cardinality'?: model.OntologyEntityCardinality;
    /**
    * Parent property IRIs or prefixed names for relationship entities.
    */
    'subPropertyOf'?: Array<string>;
    /**
    * Inverse property IRIs or prefixed names for relationship entities.
    */
    'inverseOf'?: string;
    /**
    * OWL property characteristics such as FunctionalProperty, TransitiveProperty, or IrreflexiveProperty.
    */
    'owlCharacteristics'?: Array<string>;
    /**
    * Property definitions associated with the class.
    */
    'properties'?: Array<any>;
    /**
    * Validation or governance constraints for the class.
    */
    'constraints'?: Array<any>;
    /**
    * R2RML or RML bindings for the class.
    */
    'binding'?: Array<any>;
    /**
    * Relationship definitions associated with the class.
    */
    'relationships'?: Array<any>;
    /**
    * Join-backed mapping entries for a relationship.
    */
    'joinBackedMapping'?: Array<any>;

}

export namespace OntologyEntity {








































    export function getJsonObj(obj: OntologyEntity): object {
        const jsonObj = {...obj, ...{
            






























                'cardinality': obj.cardinality ?
                
                
                model.OntologyEntityCardinality.getJsonObj(obj.cardinality) : undefined,








        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntity): object {
        const jsonObj = {...obj, ...{
            






























                    'cardinality': obj.cardinality ?
                
                
                model.OntologyEntityCardinality.getDeserializedJsonObj(obj.cardinality) : undefined,








         }};

        
        
        return jsonObj;
    }
}
