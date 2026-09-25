// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Graph model rendered by the Ontology Manager UI.
*/
export interface OntologyGraphPreviewModel {
    'nodes': Array<model.OntologyGraphPreviewNode>;
    'edges': Array<model.OntologyGraphPreviewEdge>;

}

export namespace OntologyGraphPreviewModel {



    export function getJsonObj(obj: OntologyGraphPreviewModel): object {
        const jsonObj = {...obj, ...{
            
                'nodes': obj.nodes ?
                
                obj.nodes.map((item)=>{return model.OntologyGraphPreviewNode.getJsonObj(item)})
                
                 : undefined,
                'edges': obj.edges ?
                
                obj.edges.map((item)=>{return model.OntologyGraphPreviewEdge.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreviewModel): object {
        const jsonObj = {...obj, ...{
            
                    'nodes': obj.nodes ?
                
                obj.nodes.map((item)=>{return model.OntologyGraphPreviewNode.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'edges': obj.edges ?
                
                obj.edges.map((item)=>{return model.OntologyGraphPreviewEdge.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
