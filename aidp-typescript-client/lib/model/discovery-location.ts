// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Volume location for DOCUMENTS or TTL sources.
*/
export interface DiscoveryLocation {
    /**
    * Key of the workspace volume containing the source files.
    */
    'volumeKey'?: string;
    /**
    * Volume-relative paths of the source files or folders.
    */
    'paths'?: Array<string>;

}

export namespace DiscoveryLocation {



    export function getJsonObj(obj: DiscoveryLocation): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DiscoveryLocation): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
