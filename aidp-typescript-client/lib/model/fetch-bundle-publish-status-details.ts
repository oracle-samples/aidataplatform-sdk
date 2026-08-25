// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Bundle publish status request.
*/
export interface FetchBundlePublishStatusDetails {
    /**
    * Target folder for the new bundle.
    */
    'path': string;

}

export namespace FetchBundlePublishStatusDetails {


    export function getJsonObj(obj: FetchBundlePublishStatusDetails): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: FetchBundlePublishStatusDetails): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
