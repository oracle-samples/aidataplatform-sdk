// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details of the experiment run to delete.
*/
export interface DeleteExperimentRunDetails {
    /**
    * Unique identifier for the run.
    */
    'runId': string;
    /**
    * If true, the run is permanently deleted from the database instead of being soft deleted. Defaults to false.
    */
    'isPermanent'?: boolean;

}

export namespace DeleteExperimentRunDetails {



    export function getJsonObj(obj: DeleteExperimentRunDetails): object {
        const jsonObj = {...obj, ...{
            
                'run_id': obj.runId,

                'is_permanent': obj.isPermanent,

        }};

        delete (jsonObj as Partial<DeleteExperimentRunDetails>).runId;delete (jsonObj as Partial<DeleteExperimentRunDetails>).isPermanent;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeleteExperimentRunDetails): object {
        const jsonObj = {...obj, ...{
            
                'runId': (obj as any)["run_id"],

                'isPermanent': (obj as any)["is_permanent"],

         }};

        delete (jsonObj as any)["run_id"];delete (jsonObj as any)["is_permanent"];
        
        return jsonObj;
    }
}
