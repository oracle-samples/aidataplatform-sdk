// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Hierarchy expansion metadata for a graph node.
*/
export interface OntologyGraphPreviewNodeExpansion {
    /**
    * Total direct child relationship count for this node. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'childCount': number;
    /**
    * Whether this node has any direct child relationships.
    */
    'hasChildren': boolean;
    /**
    * Whether more direct child relationships can be loaded for this node in paged hierarchy mode.
    */
    'hasMoreChildren': boolean;
    /**
    * Number of direct child relationships represented in the returned graph. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'loadedChildCount': number;
    /**
    * Cursor for loading the next direct child page for this node.
    */
    'nextChildCursor'?: string;
    /**
    * Whether this node was returned as a root or parent page item.
    */
    'isRoot': boolean;

}

export namespace OntologyGraphPreviewNodeExpansion {







    export function getJsonObj(obj: OntologyGraphPreviewNodeExpansion): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreviewNodeExpansion): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
