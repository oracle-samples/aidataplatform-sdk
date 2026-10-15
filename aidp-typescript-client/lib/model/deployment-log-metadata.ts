// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Selected metadata of a log event. Every field may be null when the event does not carry it.
*/
export interface DeploymentLogMetadata {
    /**
    * Emitting replica or source scope, when the event carries one.
    */
    'replicaId'?: string;
    /**
    * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
    */
    'opcRequestId'?: string;
    /**
    * Logical producer of the event within the deployment runtime.
    */
    'source'?: string;
    /**
    * Region the event was emitted from, when the event carries one.
    */
    'region'?: string;
    /**
    * Producer error code, when the event carries one.
    */
    'errorCode'?: string;

}

export namespace DeploymentLogMetadata {






    export function getJsonObj(obj: DeploymentLogMetadata): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentLogMetadata): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
