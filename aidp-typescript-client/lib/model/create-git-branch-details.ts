// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request details for creating a Git branch in a workspace.
*/
export interface CreateGitBranchDetails {
    /**
    * Name of the new branch. The branch must not already exist locally or on
* origin.
* 
    */
    'gitBranchName': string;
    /**
    * Workspace Git folder path. The effective path is taken from the repository
* identified by gitRepositoryKey; the supplied value does not override it.
* 
    */
    'gitFolderPath'?: string;

}

export namespace CreateGitBranchDetails {



    export function getJsonObj(obj: CreateGitBranchDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateGitBranchDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
