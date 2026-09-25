// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* JSON Patch-style request for modifying flat ontology entity properties.
*/
export interface OntologyEntityPatchDetails {
    /**
    * Ontology entity type. Supported values include OwlOntology, OwlClass, OwlProperty, OwlRelationship, and TriplesMap.
    */
    'entityType': string;
    /**
    * JSON Patch-style operations scoped to flat entity property paths such as /label or /synonyms/0.
    */
    'payload': Array<model.OntologyEntityPatchOperation>;

}

export namespace OntologyEntityPatchDetails {



    export function getJsonObj(obj: OntologyEntityPatchDetails): object {
        const jsonObj = {...obj, ...{
            

                'payload': obj.payload ?
                
                obj.payload.map((item)=>{return model.OntologyEntityPatchOperation.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityPatchDetails): object {
        const jsonObj = {...obj, ...{
            

                    'payload': obj.payload ?
                
                obj.payload.map((item)=>{return model.OntologyEntityPatchOperation.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
