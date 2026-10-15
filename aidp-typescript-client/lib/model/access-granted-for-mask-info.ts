// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Mask expressions returned by Lakeproxy, preserved verbatim.
*/
export interface AccessGrantedForMaskInfo {
    /**
    * Ranger mask type.
    */
    'maskType'?: string;
    /**
    * Mask condition, including an empty string or null.
    */
    'maskCondition'?: string;
    /**
    * Mask value or SQL expression, including an empty string or null.
    */
    'maskedValue'?: string;

}

export namespace AccessGrantedForMaskInfo {




    export function getJsonObj(obj: AccessGrantedForMaskInfo): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForMaskInfo): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
