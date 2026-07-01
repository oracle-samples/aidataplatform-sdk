// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Optional filter criteria for fetching lineage graph node neighbors.
*/
export interface LineageGraphNodeNeighborsFilter {
    /**
    * Filters only the neighbors for a particular stage in a multi-stage process.
* 
    */
    'processRunStageId'?: string;

}

export namespace LineageGraphNodeNeighborsFilter {


    export function getJsonObj(obj: LineageGraphNodeNeighborsFilter): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageGraphNodeNeighborsFilter): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
