// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to repair a job run.
*/
export interface RepairJobRunDetails {
    /**
    * Deprecated. Use repairTasks to select tasks to be repaired.
    */
    'taskKeys'?: Array<string>;
    /**
    * repairMode is no longer supported. Select tasks explicitly, or use the default nested task selection. For a failed nested JobRun, the default selects only unsuccessful tasks. For a successful nested JobRun, the default selects all tasks.
    */
    'repairMode'?: RepairJobRunDetails.RepairMode;
    /**
    * The collection of selected task details to be repaired.
    */
    'repairTasks'?: Array<model.RepairTaskDetails>;
    /**
    * An optional list of parameters.
    */
    'parameters'?: Array<model.Parameter>;

}

export namespace RepairJobRunDetails {


    export enum RepairMode {
    
    Resume = "RESUME",
    Rerun = "RERUN"

}




    export function getJsonObj(obj: RepairJobRunDetails): object {
        const jsonObj = {...obj, ...{
            


                'repairTasks': obj.repairTasks ?
                
                obj.repairTasks.map((item)=>{return model.RepairTaskDetails.getJsonObj(item)})
                
                 : undefined,
                'parameters': obj.parameters ?
                
                obj.parameters.map((item)=>{return model.Parameter.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: RepairJobRunDetails): object {
        const jsonObj = {...obj, ...{
            


                    'repairTasks': obj.repairTasks ?
                
                obj.repairTasks.map((item)=>{return model.RepairTaskDetails.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'parameters': obj.parameters ?
                
                obj.parameters.map((item)=>{return model.Parameter.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
