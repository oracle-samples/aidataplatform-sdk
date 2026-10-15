// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Access checks for one subject.
*/
export interface PrincipalAccessGrantedDetails {
    /**
    * Base64-encoded serialized OCI principal for an explicit subject. If omitted, use the resolved request
* identity. With principalType SIGNED, any supplied principal must match that identity.
* Base64 is a transport encoding, not proof of caller authorization.
* 
    */
    'principal'?: string;
    /**
    * SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity.
    */
    'principalType'?: PrincipalAccessGrantedDetails.PrincipalType;
    /**
    * Optional IAM access check passed unchanged to Lakeproxy.
    */
    'iamCheckAccessType'?: string;
    'authCheckRequestCollection': model.AccessGrantedForRequestCollection;

}

export namespace PrincipalAccessGrantedDetails {


    export enum PrincipalType {
    
    Signed = "SIGNED",
    Unsigned = "UNSIGNED"

}




    export function getJsonObj(obj: PrincipalAccessGrantedDetails): object {
        const jsonObj = {...obj, ...{
            



                'authCheckRequestCollection': obj.authCheckRequestCollection ?
                
                
                model.AccessGrantedForRequestCollection.getJsonObj(obj.authCheckRequestCollection) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PrincipalAccessGrantedDetails): object {
        const jsonObj = {...obj, ...{
            



                    'authCheckRequestCollection': obj.authCheckRequestCollection ?
                
                
                model.AccessGrantedForRequestCollection.getDeserializedJsonObj(obj.authCheckRequestCollection) : undefined,
         }};

        
        
        return jsonObj;
    }
}
