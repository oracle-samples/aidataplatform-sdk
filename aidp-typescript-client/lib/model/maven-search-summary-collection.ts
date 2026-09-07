// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* List of Maven package search results.
*/
export interface MavenSearchSummaryCollection {
    /**
    * Maven package search results.
    */
    'items': Array<model.MavenSearchSummary>;

}

export namespace MavenSearchSummaryCollection {


    export function getJsonObj(obj: MavenSearchSummaryCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.MavenSearchSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: MavenSearchSummaryCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.MavenSearchSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
