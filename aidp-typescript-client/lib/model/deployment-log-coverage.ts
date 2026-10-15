// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* How completely the underlying log source can serve the requested window.
*/
export interface DeploymentLogCoverage {
    /**
    * COMPLETE_WITHIN_RETENTION only when the window lies inside verified retention and the scan was not truncated. PARTIAL only with an affirmatively known gap. Otherwise UNKNOWN.
    */
    'state': DeploymentLogCoverage.State;
    /**
    * Configured retention of the current log object, when readable. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'retentionDays'?: number;
    /**
    * Machine-readable reasons explaining why coverage is not complete, when applicable.
    */
    'reasons'?: Array<string>;

}

export namespace DeploymentLogCoverage {

    export enum State {
    
    Unknown = "UNKNOWN",
    Partial = "PARTIAL",
    CompleteWithinRetention = "COMPLETE_WITHIN_RETENTION",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}




    export function getJsonObj(obj: DeploymentLogCoverage): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentLogCoverage): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
