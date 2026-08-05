// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * File type values accepted by the session file read/write configuration.
**/
export enum FileAllowedFileType {
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

export namespace FileAllowedFileType {
    export function getJsonObj(obj: FileAllowedFileType): FileAllowedFileType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: FileAllowedFileType): FileAllowedFileType {
        return obj;
    }
}

