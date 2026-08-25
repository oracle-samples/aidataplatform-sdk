// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* File write/download settings collected by the UI and persisted as Agent Flow
* session configuration. DataHub stores and forwards these settings;
* runtime and gateway components enforce file policy during execution.
* 
*/
export interface FileWriteConfiguration {
    /**
    * Whether file write/download configuration is enabled.
    */
    'isEnabled'?: boolean;
    /**
    * Whether generated/downloadable files should be written to AIDP Catalog or a configured volume.
    */
    'isDownloadToCatalogEnabled'?: boolean;
    /**
    * File type enum values allowed for generated/downloadable files.
    */
    'allowedFileTypes'?: Array<FileWriteConfiguration.AllowedFileTypes>;
    /**
    * Maximum generated/downloadable file size in megabytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxFileSizeMb'?: number;
    /**
    * Canonical /Volumes/catalog/schema/volume path, optionally followed by safe folder segments, or a legacy relative volumeRef/workspaceFolder path where generated/downloadable files should be stored for retention or delivery.
    */
    'targetPath'?: string;
    /**
    * Whether generated/downloadable files should be retained beyond the current request/session intent.
    */
    'isPersistenceEnabled'?: boolean;
    /**
    * Retention period in days for generated/downloadable files. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'retentionDays'?: number;
    /**
    * Intended file visibility for generated/downloadable files.
    */
    'visibility'?: FileWriteConfiguration.Visibility;
    /**
    * Intended download link expiry behavior, for example session duration.
    */
    'downloadLinkExpiry'?: FileWriteConfiguration.DownloadLinkExpiry;

}

export namespace FileWriteConfiguration {



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






    export enum Visibility {
    
    EndUserOnly = "END_USER_ONLY",
    DeveloperOnly = "DEVELOPER_ONLY",
    EndUserAndDeveloper = "END_USER_AND_DEVELOPER",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}


    export enum DownloadLinkExpiry {
    
    SessionDuration = "SESSION_DURATION",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}


    export function getJsonObj(obj: FileWriteConfiguration): object {
        const jsonObj = {...obj, ...{
            









        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: FileWriteConfiguration): object {
        const jsonObj = {...obj, ...{
            









         }};

        
        
        return jsonObj;
    }
}
