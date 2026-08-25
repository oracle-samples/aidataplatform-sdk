// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The user metadata for a given id.
*/
export interface IdentityUserMetadatum {
    /**
    * The ID of the user.
    */
    'userId': string;
    /**
    * The unique id used during login as name.
    */
    'userName': string;
    /**
    * The display name used by the user
    */
    'userDisplayName'?: string;
    /**
    * The email of the user.
    */
    'userEmail'?: string;

}

export namespace IdentityUserMetadatum {





    export function getJsonObj(obj: IdentityUserMetadatum): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: IdentityUserMetadatum): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
