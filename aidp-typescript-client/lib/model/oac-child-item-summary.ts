// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary information about a direct child item returned from an Oracle Analytics catalog browse request.
*/
export interface OacChildItemSummary {
    /**
    * The item identifier.
    */
    'id'?: string;
    /**
    * The parent folder identifier.
    */
    'parentId'?: string;
    /**
    * The item display name.
    */
    'name'?: string;
    /**
    * The Oracle Analytics catalog path for the item.
    */
    'path'?: string;
    /**
    * The item owner.
    */
    'owner'?: string;
    /**
    * The Oracle Analytics object type returned by the connector.
    */
    'type'?: string;
    /**
    * The last modified time reported by Oracle Analytics for the item.
    */
    'timeLastModified'?: Date;

}

export namespace OacChildItemSummary {








    export function getJsonObj(obj: OacChildItemSummary): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacChildItemSummary): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
