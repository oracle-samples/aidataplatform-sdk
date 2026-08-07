// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details of the experiment to delete.
*/
export interface DeleteExperimentDetails {
    /**
    * Unique identifier for the experiment.
    */
    'experimentId': string;
    /**
    * If true, the experiment is permanently deleted from the database instead of being soft deleted. Permanent deletion is rejected if the experiment has any associated run. Defaults to false.
    */
    'isPermanent'?: boolean;

}

export namespace DeleteExperimentDetails {



    export function getJsonObj(obj: DeleteExperimentDetails): object {
        const jsonObj = {...obj, ...{
            
                'experiment_id': obj.experimentId,

                'is_permanent': obj.isPermanent,

        }};

        delete (jsonObj as Partial<DeleteExperimentDetails>).experimentId;delete (jsonObj as Partial<DeleteExperimentDetails>).isPermanent;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeleteExperimentDetails): object {
        const jsonObj = {...obj, ...{
            
                'experimentId': (obj as any)["experiment_id"],

                'isPermanent': (obj as any)["is_permanent"],

         }};

        delete (jsonObj as any)["experiment_id"];delete (jsonObj as any)["is_permanent"];
        
        return jsonObj;
    }
}
