// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details needed by a lineage fetch request.
*/
export interface ObjectLineageRequestDetails {
    /**
    * Root entity node from with the lineage is to be fetched.
* 
    */
    'anchorNode': string;
    /**
    * Maximum depth to traverse in lineage graph. Depth is measured as number of links from anchor node to matching nodes.
*  Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxDepth': number;
    /**
    * Indicates the level for lineage fetch. It is one of ENTITY/COLUMN
* 
    */
    'level': model.LineageLevel;
    /**
    * Direction of the lineage returned.
    */
    'direction': model.LineageDirection;
    'nodeFilters'?: model.NodeFilterObject;
    'pathFilters'?: model.PathFilterObject;
    /**
    * Controls if the edges will be returned with vertices.
    */
    'shouldIncludeEdges'?: boolean;

}

export namespace ObjectLineageRequestDetails {








    export function getJsonObj(obj: ObjectLineageRequestDetails): object {
        const jsonObj = {...obj, ...{
            




                'nodeFilters': obj.nodeFilters ?
                
                
                model.NodeFilterObject.getJsonObj(obj.nodeFilters) : undefined,
                'pathFilters': obj.pathFilters ?
                
                
                model.PathFilterObject.getJsonObj(obj.pathFilters) : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ObjectLineageRequestDetails): object {
        const jsonObj = {...obj, ...{
            




                    'nodeFilters': obj.nodeFilters ?
                
                
                model.NodeFilterObject.getDeserializedJsonObj(obj.nodeFilters) : undefined,
                    'pathFilters': obj.pathFilters ?
                
                
                model.PathFilterObject.getDeserializedJsonObj(obj.pathFilters) : undefined,

         }};

        
        
        return jsonObj;
    }
}
