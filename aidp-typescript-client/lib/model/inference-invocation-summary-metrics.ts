// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Aggregate metrics for the correlated invocation rows matching the request filters.
*/
export interface InferenceInvocationSummaryMetrics {
    /**
    * Total number of correlated inference invocations in the resolved time range. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'totalRequests': number;
    /**
    * Number of correlated invocations whose inference response status is 2xx. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'successfulRequests': number;
    /**
    * Number of correlated invocations whose inference response status is 5xx. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'failedRequests': number;
    /**
    * Percentage of correlated invocations that succeeded, between 0 and 100. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'successRatePercent': number;
    /**
    * Number of correlated requests whose inference response status is 4xx. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'malformedRequests': number;
    /**
    * Mean response latency in milliseconds across the correlated invocations. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'averageResponseTimeMs': number;

}

export namespace InferenceInvocationSummaryMetrics {







    export function getJsonObj(obj: InferenceInvocationSummaryMetrics): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: InferenceInvocationSummaryMetrics): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
