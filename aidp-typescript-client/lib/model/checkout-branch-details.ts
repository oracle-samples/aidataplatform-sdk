// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Branch name and workspace Git folder path for a checkout request.
*/
export interface CheckoutBranchDetails {
    /**
    * Branch to check out. This selects the target branch rather than asserting the
* current branch.
* 
    */
    'branchName': string;
    /**
    * Workspace path of the Git folder associated with gitRepositoryKey.
* 
    */
    'gitFolderPath': string;

}

export namespace CheckoutBranchDetails {



    export function getJsonObj(obj: CheckoutBranchDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CheckoutBranchDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
