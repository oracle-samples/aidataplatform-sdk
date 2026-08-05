// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lineage for a data entity.
*/
export interface LineageNodeDetails {
    /**
    * Unique identifier (GUID) of the node.
    */
    'id': string;
    /**
    * Fully\u2011qualified name ({@code namespace:name}) of the node.
    */
    'qualifiedName': string;
    /**
    * referenceType of the node
    */
    'referenceType': model.ReferenceType;
    /**
    * Human\u2011readable name of the node.
    */
    'name': string;
    /**
    * High\u2011level categorisation (e.g., WorkspaceObject, Dataset, etc.).
    */
    'type': string;
    /**
    * Parent of the node
    */
    'parentId': string;
    /**
    * A generic property bag associated with the Node
    */
    'properties': { [key: string]: any; };

}

export namespace LineageNodeDetails {








    export function getJsonObj(obj: LineageNodeDetails): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageNodeDetails): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
