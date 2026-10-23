// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request details for pulling changes into a workspace Git repository.
*/
export interface GitPullDetails {
    /**
    * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
    */
    'gitFolderPath'?: string;
    /**
    * Repository branch name. The effective branch is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
    */
    'branchName'?: string;
    /**
    * Requested remote branch name. The pull source is origin for the stored
* repository branch; the supplied value does not override it.
* 
    */
    'remoteBranchName'?: string;
    /**
    * Requested pull action. The effective action is PULL regardless of the supplied
* value; MERGE_CONTINUE and MERGE_ABORT do not select separate actions.
* 
    */
    'pullAction'?: GitPullDetails.PullAction;
    /**
    * Requested merge-continuation commit message. The supplied value has no effect,
* including when pullAction is MERGE_CONTINUE.
* 
    */
    'commitMessage'?: string;

}

export namespace GitPullDetails {




    export enum PullAction {
    
    Pull = "PULL",
    MergeContinue = "MERGE_CONTINUE",
    MergeAbort = "MERGE_ABORT"

}



    export function getJsonObj(obj: GitPullDetails): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitPullDetails): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
