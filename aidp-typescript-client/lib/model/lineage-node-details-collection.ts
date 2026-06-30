// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* child/parent node results of a lineage node.
*/
export interface LineageNodeDetailsCollection {
    /**
    * List of LineageNodeDetails.
    */
    'items': Array<model.LineageNodeDetails>;

}

export namespace LineageNodeDetailsCollection {


    export function getJsonObj(obj: LineageNodeDetailsCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.LineageNodeDetails.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageNodeDetailsCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.LineageNodeDetails.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
