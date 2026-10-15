// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Credential resource details.
*/
export interface AccessGrantedForCredentialDetails {
    /**
    * Lakeproxy credentialOperationTarget.
    */
    'credentialOperationTarget': AccessGrantedForCredentialDetails.CredentialOperationTarget;
    /**
    * Lakeproxy credentialDetails.
    */
    'credentialDetails'?: string;

}

export namespace AccessGrantedForCredentialDetails {

    export enum CredentialOperationTarget {
    
    CentrifyCatalog = "CENTRIFY_CATALOG",
    Credential = "CREDENTIAL",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}



    export function getJsonObj(obj: AccessGrantedForCredentialDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForCredentialDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
