// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary information for a Git connectivity profile.
*/
export interface PrivateNetworkProfileSummary {
    /**
    * Unique key for the Git connectivity profile.
    */
    'key': string;
    /**
    * Display name of the Git connectivity profile.
    */
    'name': string;
    /**
    * Optional description of the Git connectivity profile.
    */
    'description'?: string;
    /**
    * Current lifecycle state of the profile.
    */
    'lifecycleState': string;
    /**
    * Latest validation state of the profile.
    */
    'validationState': PrivateNetworkProfileSummary.ValidationState;
    /**
    * Time at which the profile was last validated.
    */
    'timeLastValidated'?: Date;
    /**
    * Non-sensitive code for the latest validation failure.
    */
    'lastValidationErrorCode'?: string;
    /**
    * Non-sensitive message for the latest validation failure.
    */
    'lastValidationErrorMessage'?: string;
    /**
    * Time at which the profile was created.
    */
    'timeCreated': Date;
    /**
    * Time at which the profile was last updated.
    */
    'timeUpdated': Date;
    /**
    * Identifier of the user who created the profile.
    */
    'createdBy'?: string;
    /**
    * Display name of the user who created the profile.
    */
    'createdByName'?: string;

}

export namespace PrivateNetworkProfileSummary {





    export enum ValidationState {
    
    Unknown = "UNKNOWN",
    Valid = "VALID",
    Invalid = "INVALID",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}









    export function getJsonObj(obj: PrivateNetworkProfileSummary): object {
        const jsonObj = {...obj, ...{
            












        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PrivateNetworkProfileSummary): object {
        const jsonObj = {...obj, ...{
            












         }};

        
        
        return jsonObj;
    }
}
