// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Remote branch and optional context for a Git merge request.
*/
export interface GitMergeDetails {
    /**
    * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
    */
    'gitFolderPath'?: string;
    /**
    * Requested destination branch name. The merge destination is the stored
* repository branch; the supplied value does not override it.
* 
    */
    'branchName'?: string;
    /**
    * Remote branch whose origin reference is merged into the stored repository
* branch.
* 
    */
    'remoteBranchName': string;
    /**
    * Requested source commit identifier. The merge source is
* origin/{remoteBranchName}; the supplied value does not override it.
* 
    */
    'commitId'?: string;

}

export namespace GitMergeDetails {





    export function getJsonObj(obj: GitMergeDetails): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitMergeDetails): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
