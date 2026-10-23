// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* One deployment log event with its full message and metadata.
*/
export interface DeploymentLogDetail {
    /**
    * The model deployment the log event belongs to.
    */
    'deploymentId': string;
    /**
    * Stable identity of the ingested log record.
    */
    'recordId': string;
    /**
    * The opaque, expiring locator this event was resolved from.
    */
    'logId': string;
    /**
    * Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.
    */
    'timestamp': Date;
    /**
    * EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.
    */
    'timestampSource': DeploymentLogDetail.TimestampSource;
    /**
    * Normalized severity. Unrecognized producer values are returned as UNKNOWN.
    */
    'level': DeploymentLogDetail.Level;
    'message': model.DeploymentLogMessage;
    'metadata': model.DeploymentLogMetadata;

}

export namespace DeploymentLogDetail {





    export enum TimestampSource {
    
    EventTime = "EVENT_TIME",
    PublishTime = "PUBLISH_TIME",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}


    export enum Level {
    
    Debug = "DEBUG",
    Info = "INFO",
    Warning = "WARNING",
    Error = "ERROR",
    Critical = "CRITICAL",
    Unknown = "UNKNOWN",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}




    export function getJsonObj(obj: DeploymentLogDetail): object {
        const jsonObj = {...obj, ...{
            






                'message': obj.message ?
                
                
                model.DeploymentLogMessage.getJsonObj(obj.message) : undefined,
                'metadata': obj.metadata ?
                
                
                model.DeploymentLogMetadata.getJsonObj(obj.metadata) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentLogDetail): object {
        const jsonObj = {...obj, ...{
            






                    'message': obj.message ?
                
                
                model.DeploymentLogMessage.getDeserializedJsonObj(obj.message) : undefined,
                    'metadata': obj.metadata ?
                
                
                model.DeploymentLogMetadata.getDeserializedJsonObj(obj.metadata) : undefined,
         }};

        
        
        return jsonObj;
    }
}
