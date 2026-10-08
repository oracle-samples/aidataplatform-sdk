// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The information about a Spark driver failure and subsequent recovery event.
*/
export interface DriverFailedAndRecoveredEvent extends model.ClusterEvent {
    /**
    * The date and time when the replacement Spark driver became ready, in RFC 3339 format.
    */
    'timeDriverRecovered': Date;
    /**
    * The reason why the previous Spark driver failed.
    */
    'failureReason': string;

   "type": string;
}

export namespace DriverFailedAndRecoveredEvent {



    export function getJsonObj(obj: DriverFailedAndRecoveredEvent, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterEvent.getJsonObj(obj) as DriverFailedAndRecoveredEvent, ...{
            


        }};

        
        
        return jsonObj;
    }
    export const type = 'DRIVER_FAILED_AND_RECOVERED_EVENT';
    export function getDeserializedJsonObj(obj: DriverFailedAndRecoveredEvent, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterEvent.getDeserializedJsonObj(obj) as DriverFailedAndRecoveredEvent, ...{
            


         }};

        
        
        return jsonObj;
    }
}
