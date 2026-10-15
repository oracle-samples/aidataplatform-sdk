// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Snapshot of a Git worktree's operational state and readiness for an operation.
*/
export interface GitOperationState {
    /**
    * Folder path used to locate the Git worktree.
    */
    'gitFolderPath': string;
    /**
    * Detected operational state. CLEAN means no in-progress merge, rebase, or
* detached HEAD was detected. Conflicts are reported separately by haveConflicts;
* CLEAN does not imply an unchanged worktree or index.
* 
    */
    'state': GitOperationState.State;
    /**
    * Whether the detected state blocks typical write operations.
    */
    'isBlocking': boolean;
    /**
    * Whether the supplied operationName is allowed by the detected state and
* expected branch. With no operationName, indicates general operational
* readiness. This is a state check, not an authorization decision or execution
* guarantee.
* 
    */
    'isAllowed': boolean;
    /**
    * Human-readable hint for UI display.
    */
    'message'?: string;
    /**
    * Current branch name. Empty if detached HEAD.
    */
    'currentBranch'?: string;
    /**
    * Full commit ID of HEAD.
    */
    'headCommitId'?: string;
    /**
    * Whether HEAD is detached.
    */
    'isDetached'?: boolean;
    /**
    * Indicates if unmerged/conflicted files exist. This does not include file names.
    */
    'haveConflicts'?: boolean;
    /**
    * Time when the state was computed.
    */
    'timeChecked'?: Date;

}

export namespace GitOperationState {


    export enum State {
    
    Clean = "CLEAN",
    MergeInProgress = "MERGE_IN_PROGRESS",
    RebaseInProgress = "REBASE_IN_PROGRESS",
    PullInProgress = "PULL_IN_PROGRESS",
    DetachedHead = "DETACHED_HEAD",
    Unknown = "UNKNOWN",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}










    export function getJsonObj(obj: GitOperationState): object {
        const jsonObj = {...obj, ...{
            










        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitOperationState): object {
        const jsonObj = {...obj, ...{
            










         }};

        
        
        return jsonObj;
    }
}
