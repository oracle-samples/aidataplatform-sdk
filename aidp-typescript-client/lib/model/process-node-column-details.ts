// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Structured details for a column participating in a process-node column link.
*/
export interface ProcessNodeColumnDetails {
    /**
    * Display name of the column.
* 
    */
    'displayName': string;
    /**
    * Unique identifier of the column.
* 
    */
    'id': string;
    /**
    * Qualified name of the column.
* 
    */
    'qualifiedName': string;
    /**
    * Type of the column node.
* 
    */
    'type': string;
    /**
    * Display name of the parent artifact containing the column.
* 
    */
    'parentDisplayName': string;
    /**
    * Unique identifier of the parent artifact containing the column.
* 
    */
    'parentId': string;
    /**
    * Qualified name of the parent artifact containing the column.
* 
    */
    'parentQualifiedName': string;
    /**
    * Type of the parent artifact containing the column.
* 
    */
    'parentType': string;

}

export namespace ProcessNodeColumnDetails {









    export function getJsonObj(obj: ProcessNodeColumnDetails): object {
        const jsonObj = {...obj, ...{
            








        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ProcessNodeColumnDetails): object {
        const jsonObj = {...obj, ...{
            








         }};

        
        
        return jsonObj;
    }
}
