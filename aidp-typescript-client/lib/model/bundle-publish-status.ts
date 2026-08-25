// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Bundle publish status.
* 
*/
export interface BundlePublishStatus {
    /**
    * Publish status.
    */
    'status': BundlePublishStatus.Status;
    /**
    * Publish start time.
    */
    'timeStarted': Date;
    /**
    * Publish end time.
    */
    'timeCompleted': Date;
    /**
    * Publish summary.
    */
    'message'?: string;
    'publish'?: model.BundlePublishLocation;
    /**
    * Published resources.
    */
    'resources'?: Array<model.BundlePublishedResource>;

}

export namespace BundlePublishStatus {

    export enum Status {
    
    Succeeded = "SUCCEEDED",
    Failed = "FAILED",
    InProgress = "IN_PROGRESS",
    NotPublished = "NOT_PUBLISHED",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}







    export function getJsonObj(obj: BundlePublishStatus): object {
        const jsonObj = {...obj, ...{
            




                'publish': obj.publish ?
                
                
                model.BundlePublishLocation.getJsonObj(obj.publish) : undefined,
                'resources': obj.resources ?
                
                obj.resources.map((item)=>{return model.BundlePublishedResource.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: BundlePublishStatus): object {
        const jsonObj = {...obj, ...{
            




                    'publish': obj.publish ?
                
                
                model.BundlePublishLocation.getDeserializedJsonObj(obj.publish) : undefined,
                    'resources': obj.resources ?
                
                obj.resources.map((item)=>{return model.BundlePublishedResource.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
