// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Named parameters and their values for the test action.
*/
export interface TestToolParamValues {
    /**
    * Map of parameter names to their string values.
    */
    'values'?: { [key: string]: string; };

}

export namespace TestToolParamValues {


    export function getJsonObj(obj: TestToolParamValues): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: TestToolParamValues): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
