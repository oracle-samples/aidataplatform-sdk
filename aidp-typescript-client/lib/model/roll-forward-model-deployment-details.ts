// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to roll a model deployment forward to a higher model version of the same registered model. Exactly one deployment target may be provided; its model_version must be higher than the version currently configured on the deployment.
*/
export interface RollForwardModelDeploymentDetails {
    /**
    * ID of the deployment to roll forward.
    */
    'deploymentId': string;
    /**
    * Optional deployment roll-forward message. At most 2000 characters and 2000 UTF-8 bytes.
    */
    'message'?: string;
    /**
    * The single target model version to roll forward to (exactly one, at 100% traffic).
    */
    'deploymentTargets': Array<model.DeploymentTarget>;

}

export namespace RollForwardModelDeploymentDetails {




    export function getJsonObj(obj: RollForwardModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,


                'deployment_targets': obj.deploymentTargets ?
                
                obj.deploymentTargets.map((item)=>{return model.DeploymentTarget.getJsonObj(item)})
                
                 : undefined,
        }};

        delete (jsonObj as Partial<RollForwardModelDeploymentDetails>).deploymentId;delete (jsonObj as Partial<RollForwardModelDeploymentDetails>).deploymentTargets;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: RollForwardModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],


                    'deploymentTargets': (obj as any)["deployment_targets"] ?
                
                (obj as any)["deployment_targets"].map((item: any)=>{return model.DeploymentTarget.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        delete (jsonObj as any)["deployment_id"];delete (jsonObj as any)["deployment_targets"];
        
        return jsonObj;
    }
}
