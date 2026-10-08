// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Autoscaling configuration for AI Compute. When the minimum and maximum replica counts differ, at least one metric is required; omitted metric targets are defaulted before the request is sent to Data Flow. The default targets are 10 requests per second for API_REQUESTS_PER_SECOND, 75 percent for CPU_UTILIZATION, and 75 percent for MEMORY_UTILIZATION. An empty object represents fixed compute when the replica counts match.
*/
export interface AutoScaleConfiguration {
    /**
    * Autoscaling metric targets. At least one request-rate, CPU, or memory metric is required when autoscaling is enabled. API_REQUESTS_PER_SECOND accepts 1-15 requests per second per runtime pod. CPU_UTILIZATION accepts 0-100 percent mean CPU utilization across the replica set. Missing metrics use the defaults documented on AutoScaleConfiguration.
    */
    'metrics'?: Array<model.AutoScaleMetricConfiguration>;
    /**
    * Minimum time in minutes between autoscaling actions. API-handler applies this value to both Data Flow stabilization windows. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'cooldownPeriodInMinutes'?: number;

}

export namespace AutoScaleConfiguration {



    export function getJsonObj(obj: AutoScaleConfiguration): object {
        const jsonObj = {...obj, ...{
            
                'metrics': obj.metrics ?
                
                obj.metrics.map((item)=>{return model.AutoScaleMetricConfiguration.getJsonObj(item)})
                
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AutoScaleConfiguration): object {
        const jsonObj = {...obj, ...{
            
                    'metrics': obj.metrics ?
                
                obj.metrics.map((item)=>{return model.AutoScaleMetricConfiguration.getDeserializedJsonObj(item)})
                
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
