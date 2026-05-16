// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Git Branch details
*/
export interface CreateGitBranch {
    /**
    * Git branch name that is cloned.
    */
    'gitBranchName': string;
    /**
    * The git repository url corresponding to the branch
    */
    'gitUrl': string;
    /**
    * Git Error Message
    */
    'errorMessage'?: string;
    /**
    * Git STDOUT Message
    */
    'stdOut'?: string;
    /**
    * Git STDERR Message
    */
    'stdErr'?: string;
    /**
    * Git exit status Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'gitExitCode'?: number;
    /**
    * The path of the current git folder which has to be created for the new branch
    */
    'gitFolderPath'?: string;

}

export namespace CreateGitBranch {








    export function getJsonObj(obj: CreateGitBranch): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateGitBranch): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
