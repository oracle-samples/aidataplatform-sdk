// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Resolved bundle publish location for the last publish operation.
*/
export interface BundlePublishLocation {
    /**
    * Resolved publish root used by the bundle publish operation.
    */
    'path': string;
    /**
    * Whether the publish operation was allowed to overwrite artifacts not owned by this bundle.
    */
    'overwrite'?: boolean;

}

export namespace BundlePublishLocation {



    export function getJsonObj(obj: BundlePublishLocation): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: BundlePublishLocation): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
