// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Commit message and optional file selection for a Git commit and push request.
*/
export interface CommitPushDetails {
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
    * Repository-relative paths staged for a normal commit. When omitted, all local
* changes are staged with git add -A. Not applied when continuing a resolved
* rebase. Selected paths must be included by sparse checkout, if enabled.
* 
    */
    'files'?: Array<string>;
    /**
    * Commit message.
    */
    'commitMessage': string;
    /**
    * Commit description.
    */
    'commitDescription'?: string;

}

export namespace CommitPushDetails {






    export function getJsonObj(obj: CommitPushDetails): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CommitPushDetails): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
