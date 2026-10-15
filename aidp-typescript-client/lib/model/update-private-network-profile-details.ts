// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Fields for updating a reusable Git private network profile.
*/
export interface UpdatePrivateNetworkProfileDetails {
    /**
    * Updated display name of the Git connectivity profile.
    */
    'name'?: string;
    /**
    * Updated profile description. An empty value clears the description.
    */
    'description'?: string;
    /**
    * Updated customer compartment identifier containing the private network resources.
    */
    'customerCompartmentId'?: string;
    /**
    * Updated customer VCN identifier used for Git connectivity.
    */
    'customerVcnId'?: string;
    /**
    * Updated customer subnet identifier used for Git connectivity.
    */
    'customerSubnetId'?: string;

}

export namespace UpdatePrivateNetworkProfileDetails {






    export function getJsonObj(obj: UpdatePrivateNetworkProfileDetails): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdatePrivateNetworkProfileDetails): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
