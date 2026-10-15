// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Echo of the executed query and its consistency.
*/
export interface DeploymentLogQueryEcho {
    /**
    * Start of the publish-time window the query was evaluated against (RFC 3339, inclusive).
    */
    'timeStart': Date;
    /**
    * End of the publish-time window the query was evaluated against (RFC 3339, exclusive).
    */
    'timeEnd': Date;
    /**
    * Sort column applied to the results. Only TIMESTAMP is supported.
    */
    'sortBy'?: string;
    /**
    * Sort order applied to the results. Only DESC is supported.
    */
    'sortOrder'?: string;
    /**
    * Retrieval time. Not a claim that ingestion is complete through this instant.
    */
    'timeEvaluated': Date;
    /**
    * Consistency of the returned page. Always BEST_EFFORT for a live read of the log source.
    */
    'consistency': DeploymentLogQueryEcho.Consistency;

}

export namespace DeploymentLogQueryEcho {






    export enum Consistency {
    
    BestEffort = "BEST_EFFORT",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}


    export function getJsonObj(obj: DeploymentLogQueryEcho): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentLogQueryEcho): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
