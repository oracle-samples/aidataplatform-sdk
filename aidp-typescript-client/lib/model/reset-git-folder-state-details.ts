// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Abort or discard action and optional file selection for resetting Git folder state.
*/
export interface ResetGitFolderStateDetails {
    /**
    * ABORT_MERGE, ABORT_REBASE, and ABORT_PULL abort the respective in-progress
* operation. DISCARD restores selected tracked paths and removes selected new
* files.
* 
    */
    'action': ResetGitFolderStateDetails.Action;
    /**
    * Repository-relative paths whose local changes are to be discarded. Required
* and nonempty when action is DISCARD.
* 
    */
    'discardPaths'?: Array<string>;
    /**
    * Requested inclusion of ignored files in a DISCARD request. The supplied value
* does not enable ignored-file removal.
* 
    */
    'canIncludeIgnored'?: boolean;

}

export namespace ResetGitFolderStateDetails {

    export enum Action {
    
    AbortMerge = "ABORT_MERGE",
    AbortRebase = "ABORT_REBASE",
    AbortPull = "ABORT_PULL",
    Discard = "DISCARD"

}




    export function getJsonObj(obj: ResetGitFolderStateDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ResetGitFolderStateDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
