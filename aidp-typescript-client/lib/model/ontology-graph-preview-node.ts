// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Graph node in a design-time ontology preview.
*/
export interface OntologyGraphPreviewNode {
    'id': string;
    /**
    * Full IRI for ontology entity nodes. Present only when the node represents an ontology entity.
    */
    'iri'?: string;
    /**
    * Compact QName identifier for ontology entity nodes, such as ex:Customer. Present only when the node represents an ontology entity.
    */
    'compactIri'?: string;
    'label': string;
    'properties': Array<model.OntologyGraphPreviewProperty>;
    'kind'?: string;
    'expansion'?: model.OntologyGraphPreviewNodeExpansion;

}

export namespace OntologyGraphPreviewNode {








    export function getJsonObj(obj: OntologyGraphPreviewNode): object {
        const jsonObj = {...obj, ...{
            




                'properties': obj.properties ?
                
                obj.properties.map((item)=>{return model.OntologyGraphPreviewProperty.getJsonObj(item)})
                
                 : undefined,

                'expansion': obj.expansion ?
                
                
                model.OntologyGraphPreviewNodeExpansion.getJsonObj(obj.expansion) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreviewNode): object {
        const jsonObj = {...obj, ...{
            




                    'properties': obj.properties ?
                
                obj.properties.map((item)=>{return model.OntologyGraphPreviewProperty.getDeserializedJsonObj(item)})
                
                 : undefined,

                    'expansion': obj.expansion ?
                
                
                model.OntologyGraphPreviewNodeExpansion.getDeserializedJsonObj(obj.expansion) : undefined,
         }};

        
        
        return jsonObj;
    }
}
