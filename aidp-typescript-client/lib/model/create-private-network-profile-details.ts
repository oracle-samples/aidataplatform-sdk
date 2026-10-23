// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for creating a reusable Git private network profile.
*/
export interface CreatePrivateNetworkProfileDetails {
    /**
    * Display name of the Git connectivity profile.
    */
    'name': string;
    /**
    * Optional description of the Git connectivity profile.
    */
    'description'?: string;
    /**
    * Customer compartment identifier containing the private network resources.
    */
    'customerCompartmentId': string;
    /**
    * Customer VCN identifier used for Git connectivity.
    */
    'customerVcnId': string;
    /**
    * Customer subnet identifier used for Git connectivity.
    */
    'customerSubnetId': string;

}

export namespace CreatePrivateNetworkProfileDetails {






    export function getJsonObj(obj: CreatePrivateNetworkProfileDetails): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreatePrivateNetworkProfileDetails): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
