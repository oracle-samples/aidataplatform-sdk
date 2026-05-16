// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Update a git repository with the provided details
*/
export interface UpdateGitRepositoryDetails {
    /**
    * The path of the current git folder which has to be created for the new branch
    */
    'gitFolderPath'?: string;
    /**
    * The git repository url corresponding to the branch
    */
    'gitUrl'?: string;
    /**
    * updated PAT credential key
    */
    'credentialKey'?: string;

}

export namespace UpdateGitRepositoryDetails {




    export function getJsonObj(obj: UpdateGitRepositoryDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateGitRepositoryDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
