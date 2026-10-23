// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details about a Git repository.
*/
export interface GitRepository {
    /**
    * Unique key associated with repository.
    */
    'key': string;
    /**
    * The workspaceKey associated with the Git repository.
    */
    'workspaceKey': string;
    /**
    * The name of the Git branch.
    */
    'branchName': string;
    /**
    * The Git repository url corresponding to the branch.
    */
    'gitUrl': string;
    /**
    * The path of the current Git folder which has to be created for the new branch.
    */
    'gitFolderPath': string;
    /**
    * Key of the current user's GIT_ACCOUNT user setting containing Git authentication
* credentials. Identified by settingType=GIT_ACCOUNT and displayName in user
* setting listings. Distinct from credentialStoreKey, which references a TLS
* CA certificate.
* 
    */
    'credentialKey'?: string;
    'sparseCheckout'?: model.SparseCheckoutDetails;
    /**
    * Whether this repository uses private network connectivity.
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
    * User-friendly name of the private Git connectivity profile.
    */
    'gitConnectivityProfileName'?: string;
    /**
    * Key of the credential-store entry containing the Git server's TLS CA
* certificate, identified by displayName in credential listings. Provides
* server certificate trust, separate from the Git authentication user setting
* referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.
* 
    */
    'credentialStoreKey'?: string;
    /**
    * User-friendly display name of the repository TLS CA certificate credential.
    */
    'credentialStoreName'?: string;

}

export namespace GitRepository {













    export function getJsonObj(obj: GitRepository): object {
        const jsonObj = {...obj, ...{
            






                'sparseCheckout': obj.sparseCheckout ?
                
                
                model.SparseCheckoutDetails.getJsonObj(obj.sparseCheckout) : undefined,





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: GitRepository): object {
        const jsonObj = {...obj, ...{
            






                    'sparseCheckout': obj.sparseCheckout ?
                
                
                model.SparseCheckoutDetails.getDeserializedJsonObj(obj.sparseCheckout) : undefined,





         }};

        
        
        return jsonObj;
    }
}
