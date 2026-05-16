// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result from HTTP tool execution.
*/
export interface HttpResult {
    /**
    * HTTP response status code Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'statusCode'?: number;
    /**
    * Response headers
    */
    'headers'?: { [key: string]: string; };
    /**
    * Response body
    */
    'body'?: { [key: string]: any; };

}

export namespace HttpResult {




    export function getJsonObj(obj: HttpResult): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: HttpResult): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
