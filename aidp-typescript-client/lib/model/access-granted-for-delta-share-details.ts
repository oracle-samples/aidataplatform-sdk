// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy DeltaShare resource details.
*/
export interface AccessGrantedForDeltaShareDetails {
    /**
    * Lakeproxy deltaShareOperationTarget.
    */
    'deltaShareOperationTarget': AccessGrantedForDeltaShareDetails.DeltaShareOperationTarget;
    /**
    * Lakeproxy shareName.
    */
    'shareName'?: string;
    /**
    * Lakeproxy recipientName.
    */
    'recipientName'?: string;

}

export namespace AccessGrantedForDeltaShareDetails {

    export enum DeltaShareOperationTarget {
    
    CentrifyCatalog = "CENTRIFY_CATALOG",
    Share = "SHARE",
    Recipient = "RECIPIENT",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}




    export function getJsonObj(obj: AccessGrantedForDeltaShareDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForDeltaShareDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
