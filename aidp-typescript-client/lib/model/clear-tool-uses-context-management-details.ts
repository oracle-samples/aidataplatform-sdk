// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Configuration details for CLEAR_TOOL_USES context management.
*/
export interface ClearToolUsesContextManagementDetails {
    /**
    * Number of most-recent tool messages to keep unchanged. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'keepToolMessages'?: number;

}

export namespace ClearToolUsesContextManagementDetails {


    export function getJsonObj(obj: ClearToolUsesContextManagementDetails): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ClearToolUsesContextManagementDetails): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
