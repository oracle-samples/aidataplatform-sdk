// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary information about an Oracle Analytics object.
*/
export interface OacObjectSummary {
    /**
    * The Oracle Analytics object identifier.
    */
    'id'?: string;
    /**
    * The parent folder identifier when available.
    */
    'parentId'?: string;
    /**
    * The Oracle Analytics object display name.
    */
    'name'?: string;
    /**
    * The Oracle Analytics object description.
    */
    'description'?: string;
    /**
    * The Oracle Analytics catalog path for the object when available.
    */
    'path'?: string;
    /**
    * The Oracle Analytics object owner when available.
    */
    'owner'?: string;
    /**
    * The Oracle Analytics object type.
    */
    'type'?: string;
    /**
    * The Oracle Analytics object identifier returned for dataset-backed items when available.
    */
    'objectId'?: string;
    /**
    * The last modified time reported by Oracle Analytics for the object.
    */
    'timeLastModified'?: Date;

}

export namespace OacObjectSummary {










    export function getJsonObj(obj: OacObjectSummary): object {
        const jsonObj = {...obj, ...{
            









        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectSummary): object {
        const jsonObj = {...obj, ...{
            









         }};

        
        
        return jsonObj;
    }
}
