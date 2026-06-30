// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Direct child items returned for an Oracle Analytics catalog folder.
*/
export interface OacChildItemCollection {
    /**
    * The direct child items under the requested folder.
    */
    'items': Array<model.OacChildItemSummary>;

}

export namespace OacChildItemCollection {


    export function getJsonObj(obj: OacChildItemCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.OacChildItemSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacChildItemCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.OacChildItemSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
