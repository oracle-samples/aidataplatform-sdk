// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* File read/upload settings collected by the UI and persisted as Agent Flow
* session configuration. DataHub stores and forwards these settings;
* runtime and gateway components enforce file policy during execution.
* 
*/
export interface FileReadConfiguration {
    /**
    * Whether file read/upload configuration is enabled.
    */
    'isEnabled'?: boolean;
    /**
    * File type enum values accepted by the UI/runtime contract.
    */
    'allowedFileTypes'?: Array<FileReadConfiguration.AllowedFileTypes>;
    /**
    * Maximum uploaded file size in megabytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxFileSizeMb'?: number;
    /**
    * Maximum number of files allowed in a request/session. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxFileCount'?: number;
    /**
    * Strict relative workspace folder or volumeRef/workspaceFolder path where uploaded/readable files are stored or located for later runtime access. Path segments must not be empty, absolute, traversal segments, backslash-separated, contain control characters, or contain malformed dot-separated volume refs.
    */
    'targetPath'?: string;
    /**
    * Whether uploaded files should be retained beyond the current request/session intent.
    */
    'isPersistenceEnabled'?: boolean;
    /**
    * Retention period in days for persisted files. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'retentionDays'?: number;

}

export namespace FileReadConfiguration {


    export enum AllowedFileTypes {
    
    Pdf = "pdf",
    Txt = "txt",
    Csv = "csv",
    Json = "json",
    Ndjson = "ndjson",
    Png = "png",
    Jpg = "jpg",
    Jpeg = "jpeg",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}







    export function getJsonObj(obj: FileReadConfiguration): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: FileReadConfiguration): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
