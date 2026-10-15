// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Aggregate metrics for a model deployment's inference invocations.
*/
export interface InferenceInvocationSummaryResponse {
    /**
    * Inclusive start time resolved for this summary query.
    */
    'timeStart': Date;
    /**
    * Inclusive end time resolved for this summary query.
    */
    'timeEnd': Date;
    'summary': model.InferenceInvocationSummaryMetrics;

}

export namespace InferenceInvocationSummaryResponse {




    export function getJsonObj(obj: InferenceInvocationSummaryResponse): object {
        const jsonObj = {...obj, ...{
            


                'summary': obj.summary ?
                
                
                model.InferenceInvocationSummaryMetrics.getJsonObj(obj.summary) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: InferenceInvocationSummaryResponse): object {
        const jsonObj = {...obj, ...{
            


                    'summary': obj.summary ?
                
                
                model.InferenceInvocationSummaryMetrics.getDeserializedJsonObj(obj.summary) : undefined,
         }};

        
        
        return jsonObj;
    }
}
