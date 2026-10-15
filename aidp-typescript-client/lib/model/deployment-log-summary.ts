// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* One deployment lifecycle log event.
*/
export interface DeploymentLogSummary {
    /**
    * Stable identity of the ingested log record.
    */
    'recordId': string;
    /**
    * Opaque, expiring locator usable with the log detail operation.
    */
    'logId': string;
    /**
    * Displayed event time (RFC 3339 UTC). Producer event time when available; otherwise the publish time, per timestampSource.
    */
    'timestamp': Date;
    /**
    * EVENT_TIME when the producer timestamp was valid; PUBLISH_TIME when the displayed value fell back to the provider publish time.
    */
    'timestampSource': DeploymentLogSummary.TimestampSource;
    /**
    * Normalized severity. Unrecognized producer values are returned as UNKNOWN.
    */
    'level': DeploymentLogSummary.Level;
    /**
    * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
    */
    'opcRequestId'?: string;
    /**
    * Latency in milliseconds, when the event carries one. Zero is a real value, distinct from absent. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'latencyMs'?: number;
    /**
    * Emitting replica or source scope, when the event carries one.
    */
    'replicaId'?: string;
    /**
    * Whether the log detail operation can resolve this record.
    */
    'isDetailAvailable': boolean;

}

export namespace DeploymentLogSummary {




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






    export function getJsonObj(obj: DeploymentLogSummary): object {
        const jsonObj = {...obj, ...{
            









        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentLogSummary): object {
        const jsonObj = {...obj, ...{
            









         }};

        
        
        return jsonObj;
    }
}
