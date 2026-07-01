// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lineage for a data entity.
*/
export interface EntityLineage {
    /**
    * Set of links that are involved in the lineage.
    */
    'nodes': Array<model.LineageObject>;
    /**
    * Set of links between the objects in the 'objects' set.
    */
    'links': Array<model.LineageRelationship>;

}

export namespace EntityLineage {



    export function getJsonObj(obj: EntityLineage): object {
        const jsonObj = {...obj, ...{
            
                'nodes': obj.nodes ?
                
                obj.nodes.map((item)=>{return model.LineageObject.getJsonObj(item)})
                
                 : undefined,
                'links': obj.links ?
                
                obj.links.map((item)=>{return model.LineageRelationship.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: EntityLineage): object {
        const jsonObj = {...obj, ...{
            
                    'nodes': obj.nodes ?
                
                obj.nodes.map((item)=>{return model.LineageObject.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'links': obj.links ?
                
                obj.links.map((item)=>{return model.LineageRelationship.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
