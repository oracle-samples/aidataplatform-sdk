// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* AI Compute replica configuration.
*/
export interface ReplicaConfig {
    /**
    * Minimum number of AI Compute replicas. If replica configuration is not specified, AI Compute uses one replica by default. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'minReplica'?: number;
    /**
    * Maximum number of AI Compute replicas. The default service soft limit is 10; AI Compute uses a fixed replica count when minReplica and maxReplica match. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxReplica'?: number;

}

export namespace ReplicaConfig {



    export function getJsonObj(obj: ReplicaConfig): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ReplicaConfig): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
