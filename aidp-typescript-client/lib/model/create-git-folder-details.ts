// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to create a Git folder in a workspace.
*/
export interface CreateGitFolderDetails {
    /**
    * Workspace-relative path of the Git folder, without a leading slash (for example, {@code sample-repo}). The folder is located at {@code /Workspace/<folderPath>}.
    */
    'folderPath': string;
    /**
    * key corresponding to Git service provider in git provider table.
    */
    'gitProviderKey'?: string;
    /**
    * Git repository url used to clone.
    */
    'gitRepositoryUrl': string;
    /**
    * Git branch name that is cloned.
    */
    'branchName': string;
    /**
    * Key of the current user's GIT_ACCOUNT user setting for repository authentication.
* User setting listings identify it by settingType=GIT_ACCOUNT and displayName;
* the matching entry's key is the credentialKey.
* 
    */
    'credentialKey': string;
    /**
    * Whether this Git folder uses private network connectivity.
    */
    'isPrivateConnectivityEnabled'?: boolean;
    /**
    * Key of the private network profile used for Git connectivity, returned by
* private network profile listings filtered by name. Required when
* isPrivateConnectivityEnabled is true.
* 
    */
    'gitConnectivityProfileKey'?: string;
    /**
    * Key of the credential containing the Git server's TLS CA certificate,
* returned by credential listings filtered by displayName. Required when
* isPrivateConnectivityEnabled is true.
* 
    */
    'credentialStoreKey'?: string;
    /**
    * Short description about the git repository.
    */
    'description'?: string;
    'sparseCheckout'?: model.SparseCheckoutDetails;

}

export namespace CreateGitFolderDetails {











    export function getJsonObj(obj: CreateGitFolderDetails): object {
        const jsonObj = {...obj, ...{
            









                'sparseCheckout': obj.sparseCheckout ?
                
                
                model.SparseCheckoutDetails.getJsonObj(obj.sparseCheckout) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateGitFolderDetails): object {
        const jsonObj = {...obj, ...{
            









                    'sparseCheckout': obj.sparseCheckout ?
                
                
                model.SparseCheckoutDetails.getDeserializedJsonObj(obj.sparseCheckout) : undefined,
         }};

        
        
        return jsonObj;
    }
}
