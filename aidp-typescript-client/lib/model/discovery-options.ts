// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface DiscoveryOptions {
    'emitOwl'?: boolean;
    'emitRml'?: boolean;

}

export namespace DiscoveryOptions {



    export function getJsonObj(obj: DiscoveryOptions): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DiscoveryOptions): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
