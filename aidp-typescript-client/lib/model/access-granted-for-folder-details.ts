// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Folder resource details.
*/
export interface AccessGrantedForFolderDetails {
    /**
    * Lakeproxy datalakeId.
    */
    'datalakeId': string;
    /**
    * Lakeproxy workspaceId.
    */
    'workspaceId': string;
    /**
    * Lakeproxy folderId.
    */
    'folderId': string;

}

export namespace AccessGrantedForFolderDetails {




    export function getJsonObj(obj: AccessGrantedForFolderDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForFolderDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
