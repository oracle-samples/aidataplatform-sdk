// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result of creating or updating a workspace zip upload and extraction operation.
*/
export interface UploadAndExtractZipResult {
    /**
    * Async operation key for upload and extraction.
    */
    'operationKey': string;
    /**
    * PAR URL where the caller uploads the zip bytes. Returned for CREATE.
    */
    'uploadUrl'?: string;
    /**
    * Final workspace folder path where the zip will be extracted. Returned for CREATE.
    */
    'destinationFolderPath'?: string;

}

export namespace UploadAndExtractZipResult {




    export function getJsonObj(obj: UploadAndExtractZipResult): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UploadAndExtractZipResult): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
