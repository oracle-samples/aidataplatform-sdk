// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to deactivate a model deployment.
*/
export interface DeactivateModelDeploymentDetails {
    /**
    * ID of the deployment to deactivate.
    */
    'deploymentId': string;
    /**
    * Optional deployment deactivation message. At most 2000 characters and 2000 UTF-8 bytes.
    */
    'message'?: string;

}

export namespace DeactivateModelDeploymentDetails {



    export function getJsonObj(obj: DeactivateModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,


        }};

        delete (jsonObj as Partial<DeactivateModelDeploymentDetails>).deploymentId;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeactivateModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],


         }};

        delete (jsonObj as any)["deployment_id"];
        
        return jsonObj;
    }
}
