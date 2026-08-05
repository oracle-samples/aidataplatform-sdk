// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lineage for an object.
*/
export interface ObjectLineage {
    /**
    * Set of links that are involved in the lineage.
    */
    'nodes': Array<model.LineageObject>;
    /**
    * Set of links between the objects in the 'objects' set.
    */
    'links': Array<model.LineageRelationship>;

}

export namespace ObjectLineage {



    export function getJsonObj(obj: ObjectLineage): object {
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
    export function getDeserializedJsonObj(obj: ObjectLineage): object {
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
