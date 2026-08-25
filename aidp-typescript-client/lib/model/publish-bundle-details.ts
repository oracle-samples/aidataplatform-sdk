// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request payload for bundle publish.
*/
export interface PublishBundleDetails {
    /**
    * Target folder for the new bundle.
    */
    'path': string;

}

export namespace PublishBundleDetails {


    export function getJsonObj(obj: PublishBundleDetails): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PublishBundleDetails): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
