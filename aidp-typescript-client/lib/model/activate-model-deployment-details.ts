// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to activate a model deployment.
*/
export interface ActivateModelDeploymentDetails {
    /**
    * ID of the deployment to activate.
    */
    'deploymentId': string;
    /**
    * Optional deployment activation message. At most 2000 characters and 2000 UTF-8 bytes.
    */
    'message'?: string;

}

export namespace ActivateModelDeploymentDetails {



    export function getJsonObj(obj: ActivateModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,


        }};

        delete (jsonObj as Partial<ActivateModelDeploymentDetails>).deploymentId;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ActivateModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],


         }};

        delete (jsonObj as any)["deployment_id"];
        
        return jsonObj;
    }
}
