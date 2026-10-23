// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The log event's message, subject to redaction and size limits.
*/
export interface DeploymentLogMessage {
    /**
    * Whether the message text is available. Text is only present for AVAILABLE.
    */
    'state': DeploymentLogMessage.State;
    /**
    * Display text of the log event. Treat as untrusted display data. Null when the state denies or lacks content.
    */
    'text'?: string;
    /**
    * Whether the text was truncated to the size limit.
    */
    'isTruncated': boolean;

}

export namespace DeploymentLogMessage {

    export enum State {
    
    Available = "AVAILABLE",
    Redacted = "REDACTED",
    NotAuthorized = "NOT_AUTHORIZED",
    Unknown = "UNKNOWN",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}




    export function getJsonObj(obj: DeploymentLogMessage): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentLogMessage): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
