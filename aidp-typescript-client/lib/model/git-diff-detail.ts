// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Unified diff content and status information for a repository-relative file.
*/
export interface GitDiffDetail {
    /**
    * File path relative to repository root.
    */
    'gitFilePath': string;
    /**
    * Indicates whether the file is currently in a conflicted state.
    */
    'isConflict'?: boolean;
    /**
    * Indicates whether the file is binary.
    */
    'isBinary'?: boolean;
    /**
    * Local unified diff patch text. Binary files may have no textual patch.
* 
    */
    'patch'?: string;
    /**
    * Whether returned diff output is marked truncated; this does not guarantee
* enforcement of the requested maxPatchBytes.
* 
    */
    'isTruncated'?: boolean;
    /**
    * Indicates the reason for the truncated diff to be returned.
    */
    'truncatedReason'?: GitDiffDetail.TruncatedReason;

}

export namespace GitDiffDetail {






    export enum TruncatedReason {
    
    MaxPatchBytes = "MAX_PATCH_BYTES",
    Binary = "BINARY",
    TooLarge = "TOO_LARGE",
    Unknown = "UNKNOWN",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}


    export function getJsonObj(obj: GitDiffDetail): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitDiffDetail): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
