// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Serializable provider connection settings.
*/
export interface LlmConnectionSettings {
    /**
    * Optional provider organization identifier.
    */
    'organization'?: string;
    /**
    * Optional provider project identifier.
    */
    'project'?: string;
    /**
    * Optional provider request timeout in seconds. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'timeout'?: number;
    /**
    * Optional maximum number of provider request retries. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxRetries'?: number;
    /**
    * Optional provider query parameters to send by default.
    */
    'defaultQuery'?: { [key: string]: string; };

}

export namespace LlmConnectionSettings {






    export function getJsonObj(obj: LlmConnectionSettings): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LlmConnectionSettings): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
