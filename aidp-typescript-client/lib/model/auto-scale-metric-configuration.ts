// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Autoscaling metric target for AI Compute.
*/
export interface AutoScaleMetricConfiguration {
    /**
    * Metric used to determine whether AI Compute should scale. API_REQUESTS_PER_SECOND measures average request traffic per runtime pod; CPU_UTILIZATION measures mean CPU utilization across the replica set; MEMORY_UTILIZATION measures mean memory utilization across the replica set.
    */
    'name': AutoScaleMetricConfiguration.Name;
    /**
    * Target average value for the selected metric. Use requests per second for API_REQUESTS_PER_SECOND (supported range 1-15; default 10 when omitted), and percent for CPU_UTILIZATION and MEMORY_UTILIZATION (supported range 0-100; default 75 when omitted).
* 
    */
    'targetAverageValue': string;

}

export namespace AutoScaleMetricConfiguration {

    export enum Name {
    
    ApiRequestsPerSecond = "API_REQUESTS_PER_SECOND",
    CpuUtilization = "CPU_UTILIZATION",
    MemoryUtilization = "MEMORY_UTILIZATION",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}



    export function getJsonObj(obj: AutoScaleMetricConfiguration): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AutoScaleMetricConfiguration): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
