// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Response payload containing compute replica identifiers that emitted matching metric data.
*/
export interface QueryReplicaIdsResult {
    /**
    * Distinct compute replica identifiers derived from the Monitoring {@code agentNode} dimension.
    */
    'replicaIds': Array<string>;

}

export namespace QueryReplicaIdsResult {


    export function getJsonObj(obj: QueryReplicaIdsResult): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: QueryReplicaIdsResult): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
