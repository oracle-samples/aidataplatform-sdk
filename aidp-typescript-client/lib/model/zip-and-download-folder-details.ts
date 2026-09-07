// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to zip a workspace folder for download.
*/
export interface ZipAndDownloadFolderDetails {
    /**
    * Workspace folder path to zip for download.
    */
    'sourceFolderPath': string;

}

export namespace ZipAndDownloadFolderDetails {


    export function getJsonObj(obj: ZipAndDownloadFolderDetails): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ZipAndDownloadFolderDetails): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
