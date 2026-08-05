// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details needed by a fetchLineageGraphNodeNeighbors request.
*/
export interface ObjectNeighborsFetchRequestDetails {
    /**
    * ID of the node to fetch the details
* 
    */
    'nodeId': string;
    /**
    * Direction of the lineage returned.
    */
    'direction': model.LineageDirection;
    /**
    * The flag to indicate whether columns also to be included while fetching neighbors. Default is false.
* 
    */
    'isWithColumns'?: boolean;
    /**
    * List of scoped column names for fetching the Graph Node Neighbors. Applicable only when isWithColumns is true.
* 
    */
    'scopedColumns'?: Array<string>;
    'filter'?: model.LineageGraphNodeNeighborsFilter;

}

export namespace ObjectNeighborsFetchRequestDetails {






    export function getJsonObj(obj: ObjectNeighborsFetchRequestDetails): object {
        const jsonObj = {...obj, ...{
            




                'filter': obj.filter ?
                
                
                model.LineageGraphNodeNeighborsFilter.getJsonObj(obj.filter) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ObjectNeighborsFetchRequestDetails): object {
        const jsonObj = {...obj, ...{
            




                    'filter': obj.filter ?
                
                
                model.LineageGraphNodeNeighborsFilter.getDeserializedJsonObj(obj.filter) : undefined,
         }};

        
        
        return jsonObj;
    }
}
