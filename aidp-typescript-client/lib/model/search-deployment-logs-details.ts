// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Filters and pagination for searching deployment lifecycle logs.
*/
export interface SearchDeploymentLogsDetails {
    /**
    * Start of the requested publish-time window (RFC 3339, inclusive).
    */
    'timeStart': Date;
    /**
    * End of the requested publish-time window (RFC 3339, exclusive). Must not be in the future.
    */
    'timeEnd': Date;
    /**
    * Optional severity filter. Allowed values: DEBUG, INFO, WARNING, ERROR, CRITICAL, UNKNOWN; any other value is rejected with 400. An empty or absent array means all levels.
    */
    'levels'?: Array<string>;
    /**
    * Optional exact match on the original request identifier of a log event. Only events that carry a request identifier can match. Model deployment lifecycle events are not emitted per request and carry none, so this filter excludes them.
    */
    'opcRequestId'?: string;
    /**
    * Optional exact match on the emitting replica or source scope.
    */
    'replicaId'?: string;
    /**
    * Sort column. Only TIMESTAMP is supported.
    */
    'sortBy'?: SearchDeploymentLogsDetails.SortBy;
    /**
    * Sort order. Only DESC is supported.
    */
    'sortOrder'?: SearchDeploymentLogsDetails.SortOrder;
    /**
    * Maximum rows per page. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'limit'?: number;
    /**
    * Opaque continuation token from a previous page. Bound to the platform, deployment, and query; expires.
    */
    'pageToken'?: string;

}

export namespace SearchDeploymentLogsDetails {






    export enum SortBy {
    
    Timestamp = "TIMESTAMP"

}


    export enum SortOrder {
    
    Desc = "DESC"

}




    export function getJsonObj(obj: SearchDeploymentLogsDetails): object {
        const jsonObj = {...obj, ...{
            









        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: SearchDeploymentLogsDetails): object {
        const jsonObj = {...obj, ...{
            









         }};

        
        
        return jsonObj;
    }
}
