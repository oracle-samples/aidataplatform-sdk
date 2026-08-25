// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result of starting workspace folder zip creation for download.
*/
export interface ZipAndDownloadFolderResult {
    /**
    * Async operation key for zip creation.
    */
    'operationKey': string;
    /**
    * PAR URL for downloading the generated archive after async operation success.
    */
    'downloadUrl': string;
    /**
    * Generated archive basename, including its .zip or .aidp extension.
    */
    'archiveName': string;

}

export namespace ZipAndDownloadFolderResult {




    export function getJsonObj(obj: ZipAndDownloadFolderResult): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ZipAndDownloadFolderResult): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
