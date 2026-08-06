// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request payload for querying compute replica identifiers from metric data.
*/
export interface QueryReplicaIdsDetails {
    /**
    * The metric to use when discovering replica identifiers for the selected compute cluster.
* Allowed values are CpuUtilization, MemoryUtilization, NetworkReceiveBytes, and NetworkTransmitBytes.
* 
    */
    'metricName': string;
    /**
    * The beginning of the time range to use when searching for replica metric data points. Format is RFC 3339.
    */
    'timeBegin': Date;
    /**
    * The end of the time range to use when searching for replica metric data points. Format is RFC 3339.
    */
    'timeEnd': Date;

}

export namespace QueryReplicaIdsDetails {




    export function getJsonObj(obj: QueryReplicaIdsDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: QueryReplicaIdsDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
