// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Hierarchy level metadata for an Oracle Analytics hierarchical column.
*/
export interface OacObjectHierarchyLevel {
    /**
    * The Oracle Analytics hierarchy level identifier.
    */
    'levelID'?: string;
    /**
    * The Oracle Analytics hierarchy level display name.
    */
    'displayName'?: string;
    /**
    * The Oracle Analytics hierarchy level description.
    */
    'desc'?: string;

}

export namespace OacObjectHierarchyLevel {




    export function getJsonObj(obj: OacObjectHierarchyLevel): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectHierarchyLevel): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
