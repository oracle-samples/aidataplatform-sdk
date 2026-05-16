// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details about a git repository
*/
export interface GitRepository {
    /**
    * Unique key associated with repository
    */
    'key': string;
    /**
    * The workspaceKey associated with the git repository
    */
    'workspaceKey': string;
    /**
    * The name of the git branch
    */
    'branchName': string;
    /**
    * The git repository url corresponding to the branch
    */
    'gitUrl': string;
    /**
    * The path of the current git folder which has to be created for the new branch
    */
    'gitFolderPath': string;
    /**
    * The credential setting key
    */
    'credentialKey'?: string;

}

export namespace GitRepository {







    export function getJsonObj(obj: GitRepository): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitRepository): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
