// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Published resource.
*/
export interface BundlePublishedResource {
    /**
    * Type of resource
    */
    'type': BundlePublishedResource.Type;
    /**
    * Resource key.
    */
    'key'?: string;
    /**
    * Resource name
    */
    'name': string;

}

export namespace BundlePublishedResource {

    export enum Type {
    
    Job = "JOB",
    Agentflow = "AGENTFLOW",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}




    export function getJsonObj(obj: BundlePublishedResource): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: BundlePublishedResource): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
