// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to create or update a workspace zip upload and extraction operation.
*/
export interface UploadAndExtractZipDetails {
    /**
    * Action to perform for the upload and extract operation. CREATE starts the async operation and returns an upload PAR URL. UPDATE records final uploaded object metadata for an existing operation.
    */
    'action': UploadAndExtractZipDetails.Action;
    /**
    * Async operation key returned by the CREATE action. Required for UPDATE.
    */
    'operationKey'?: string;
    /**
    * Name of the zip file that will be uploaded through the returned PAR URL. Required for CREATE.
    */
    'zipFileName'?: string;
    /**
    * Workspace folder where the zip root folder will be extracted. Required for CREATE.
    */
    'destinationFolderPath'?: string;
    /**
    * Flag to overwrite existing files during extraction. If false, existing files are skipped.
    */
    'isOverwrite'?: boolean;
    /**
    * Final Object Storage ETag for the uploaded zip object. If multipart upload is used, the caller commits the multipart upload directly with Object Storage before calling UPDATE.
    */
    'eTag'?: string;
    /**
    * Final uploaded zip object size in bytes. Required for UPDATE. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'sizeInBytes'?: number;

}

export namespace UploadAndExtractZipDetails {

    export enum Action {
    
    Create = "CREATE",
    Update = "UPDATE"

}








    export function getJsonObj(obj: UploadAndExtractZipDetails): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UploadAndExtractZipDetails): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
