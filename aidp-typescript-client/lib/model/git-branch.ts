// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Git Branch details
*/
export interface GitBranch {
    /**
    * The name of the git branch
    */
    'branchName': string;
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

}

export namespace GitBranch {







    export function getJsonObj(obj: GitBranch): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitBranch): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
