// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Status of DI Agent enablement and managed compute lifecycle for an AI Data Platform instance.
*/
export interface DflComputeStatusResult {
    /**
    * Whether DI Agent enablement is enabled for the AI Data Platform instance.
    */
    'isEnabled': boolean;
    /**
    * The current DI Agent managed compute lifecycle state when compute exists.
    */
    'lifecycleState'?: string;
    /**
    * Durable DI Agent enablement state, such as InProgress, Succeeded, or Failed.
    */
    'enablementStatus'?: string;
    /**
    * Additional sanitized details for the durable enablement state, populated when available.
    */
    'statusDetails'?: string;

}

export namespace DflComputeStatusResult {





    export function getJsonObj(obj: DflComputeStatusResult): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DflComputeStatusResult): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
