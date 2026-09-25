// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for anchor-aware neighbor column links.
*/
export interface FetchAnchorAwareNeighborColumnLinksDetails {
    /**
    * ID of the active anchor entity.
    */
    'anchorNodeId': string;
    /**
    * ID of the expanded non-anchor entity.
    */
    'nodeId': string;
    /**
    * Lineage depth of the node from the anchor, used to bound traversal. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'nodeDepth': number;
    /**
    * Direction of the non-anchor entity relative to the anchor.
    */
    'direction': model.ScopedLineageDirection;
    /**
    * Column IDs to include in both response link collections.
    */
    'nodeColumns': Array<string>;
    /**
    * Entity IDs constraining the route; must include nodeId and anchorNodeId.
    */
    'entityPathNodeIds': Array<string>;

}

export namespace FetchAnchorAwareNeighborColumnLinksDetails {







    export function getJsonObj(obj: FetchAnchorAwareNeighborColumnLinksDetails): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: FetchAnchorAwareNeighborColumnLinksDetails): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
