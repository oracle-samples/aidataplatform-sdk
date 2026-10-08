// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Neighbor links and anchor-column associations for supplied columns.
*/
export interface AnchorAwareNeighborColumnLinks {
    /**
    * Nodes referenced by neighborLinks.
    */
    'nodes': Array<model.LineageObject>;
    /**
    * Immediate links adjacent to supplied columns, including proven toward-anchor links.
    */
    'neighborLinks': Array<model.LineageRelationship>;
    /**
    * Derived supplied-column to anchor-column associations.
    */
    'anchorColumnLinks': Array<model.AnchorColumnLink>;

}

export namespace AnchorAwareNeighborColumnLinks {




    export function getJsonObj(obj: AnchorAwareNeighborColumnLinks): object {
        const jsonObj = {...obj, ...{
            
                'nodes': obj.nodes ?
                
                obj.nodes.map((item)=>{return model.LineageObject.getJsonObj(item)})
                
                 : undefined,
                'neighborLinks': obj.neighborLinks ?
                
                obj.neighborLinks.map((item)=>{return model.LineageRelationship.getJsonObj(item)})
                
                 : undefined,
                'anchorColumnLinks': obj.anchorColumnLinks ?
                
                obj.anchorColumnLinks.map((item)=>{return model.AnchorColumnLink.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AnchorAwareNeighborColumnLinks): object {
        const jsonObj = {...obj, ...{
            
                    'nodes': obj.nodes ?
                
                obj.nodes.map((item)=>{return model.LineageObject.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'neighborLinks': obj.neighborLinks ?
                
                obj.neighborLinks.map((item)=>{return model.LineageRelationship.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'anchorColumnLinks': obj.anchorColumnLinks ?
                
                obj.anchorColumnLinks.map((item)=>{return model.AnchorColumnLink.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
