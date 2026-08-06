// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Collection of column links flowing through a process node.
*/
export interface ProcessNodeColumnLinksCollection {
    /**
    * List of process-node column links.
    */
    'items': Array<model.ProcessNodeColumnLink>;

}

export namespace ProcessNodeColumnLinksCollection {


    export function getJsonObj(obj: ProcessNodeColumnLinksCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.ProcessNodeColumnLink.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ProcessNodeColumnLinksCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.ProcessNodeColumnLink.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
