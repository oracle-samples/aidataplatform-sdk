// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* List of TaskRun retries.
*/
export interface TaskRunRetryCollection {
    /**
    * List of TaskRun retries.
    */
    'items': Array<model.TaskRunRetrySummary>;

}

export namespace TaskRunRetryCollection {


    export function getJsonObj(obj: TaskRunRetryCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.TaskRunRetrySummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: TaskRunRetryCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.TaskRunRetrySummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
