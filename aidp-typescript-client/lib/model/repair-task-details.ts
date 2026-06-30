// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Repair task details for a specific task selection.
*/
export interface RepairTaskDetails {
    /**
    * The display name of the task. User can specify a value for this.
    */
    'taskKey': string;
    /**
    * Include transitive downstream tasks for this task selection.
    */
    'shouldIncludeDownstream'?: boolean;
    /**
    * Include transitive upstream tasks for this task selection.
    */
    'shouldIncludeUpstream'?: boolean;

}

export namespace RepairTaskDetails {




    export function getJsonObj(obj: RepairTaskDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: RepairTaskDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
