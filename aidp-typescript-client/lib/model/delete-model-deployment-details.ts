// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to delete a model deployment.
*/
export interface DeleteModelDeploymentDetails {
    /**
    * ID of the deployment to delete.
    */
    'deploymentId': string;

}

export namespace DeleteModelDeploymentDetails {


    export function getJsonObj(obj: DeleteModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,

        }};

        delete (jsonObj as Partial<DeleteModelDeploymentDetails>).deploymentId;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeleteModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],

         }};

        delete (jsonObj as any)["deployment_id"];
        
        return jsonObj;
    }
}
