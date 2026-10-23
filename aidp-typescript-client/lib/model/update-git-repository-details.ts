// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Repository URL, authentication, connectivity, and sparse checkout settings to update.
*/
export interface UpdateGitRepositoryDetails {
    /**
    * Workspace Git folder path. The stored repository path is retained; the supplied
* value does not rename or relocate the folder.
* 
    */
    'gitFolderPath'?: string;
    /**
    * The Git repository URL corresponding to the branch.
    */
    'gitUrl'?: string;
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
    * Key of the credential-store entry containing the Git server's TLS CA
* certificate, identified by displayName in credential listings. Provides
* server certificate trust, separate from the Git authentication user setting
* referenced by credentialKey. Required when isPrivateConnectivityEnabled is true.
* 
    */
    'credentialStoreKey'?: string;

}

export namespace UpdateGitRepositoryDetails {








    export function getJsonObj(obj: UpdateGitRepositoryDetails): object {
        const jsonObj = {...obj, ...{
            



                'sparseCheckout': obj.sparseCheckout ?
                
                
                model.SparseCheckoutDetails.getJsonObj(obj.sparseCheckout) : undefined,



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateGitRepositoryDetails): object {
        const jsonObj = {...obj, ...{
            



                    'sparseCheckout': obj.sparseCheckout ?
                
                
                model.SparseCheckoutDetails.getDeserializedJsonObj(obj.sparseCheckout) : undefined,



         }};

        
        
        return jsonObj;
    }
}
