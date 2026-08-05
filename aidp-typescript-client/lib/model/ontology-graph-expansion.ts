// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Nodes and edges returned by graph exploration.
*/
export interface OntologyGraphExpansion {
    'nodes': Array<model.OntologyGraphNode>;
    'edges': Array<model.OntologyGraphEdge>;
    'truncated'?: boolean;

}

export namespace OntologyGraphExpansion {




    export function getJsonObj(obj: OntologyGraphExpansion): object {
        const jsonObj = {...obj, ...{
            
                'nodes': obj.nodes ?
                
                obj.nodes.map((item)=>{return model.OntologyGraphNode.getJsonObj(item)})
                
                 : undefined,
                'edges': obj.edges ?
                
                obj.edges.map((item)=>{return model.OntologyGraphEdge.getJsonObj(item)})
                
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphExpansion): object {
        const jsonObj = {...obj, ...{
            
                    'nodes': obj.nodes ?
                
                obj.nodes.map((item)=>{return model.OntologyGraphNode.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'edges': obj.edges ?
                
                obj.edges.map((item)=>{return model.OntologyGraphEdge.getDeserializedJsonObj(item)})
                
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
