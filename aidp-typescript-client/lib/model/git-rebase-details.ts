// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Remote branch and optional context for a Git rebase request.
*/
export interface GitRebaseDetails {
    /**
    * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
    */
    'gitFolderPath'?: string;
    /**
    * Requested branch name. The branch being rebased is the stored repository
* branch; the supplied value does not override it.
* 
    */
    'branchName'?: string;
    /**
    * Required remote branch whose origin reference is the rebase target.
* 
    */
    'remoteBranchName': string;
    /**
    * Requested target commit identifier. The rebase target is
* origin/{remoteBranchName}; the supplied value does not override it.
* 
    */
    'commitId'?: string;

}

export namespace GitRebaseDetails {





    export function getJsonObj(obj: GitRebaseDetails): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitRebaseDetails): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
