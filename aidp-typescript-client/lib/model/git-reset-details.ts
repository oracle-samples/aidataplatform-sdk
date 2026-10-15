// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request details for resetting a workspace Git repository.
*/
export interface GitResetDetails {
    /**
    * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
    */
    'gitFolderPath'?: string;
    /**
    * Remote branch whose origin reference is the reset target. Current execution
* requires a target branch; the stored repository branch is the branch being
* reset and force-pushed.
* 
    */
    'branchName'?: string;
    /**
    * Requested target commit identifier. The reset target is origin/{branchName};
* the supplied value does not override it.
* 
    */
    'commitId'?: string;
    /**
    * Requested reset mode. The effective mode is HARD regardless of the supplied
* value, including SOFT or MIXED.
* 
    */
    'resetMode'?: GitResetDetails.ResetMode;

}

export namespace GitResetDetails {




    export enum ResetMode {
    
    Soft = "SOFT",
    Mixed = "MIXED",
    Hard = "HARD"

}


    export function getJsonObj(obj: GitResetDetails): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitResetDetails): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
