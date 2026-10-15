// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface DiscoverySelection {
    'include'?: Array<string>;
    'exclude'?: Array<string>;
    'limit'?: number;

}

export namespace DiscoverySelection {




    export function getJsonObj(obj: DiscoverySelection): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DiscoverySelection): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
