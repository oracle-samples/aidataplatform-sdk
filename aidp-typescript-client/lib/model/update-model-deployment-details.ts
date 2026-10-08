// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to update a model deployment. The registered model and model version cannot be changed here; use the roll-forward and roll-back actions instead.
*/
export interface UpdateModelDeploymentDetails {
    /**
    * ID of the deployment.
    */
    'deploymentId': string;
    /**
    * Name of the deployment. At most 255 characters and 255 UTF-8 bytes.
    */
    'name': string;
    /**
    * Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.
    */
    'description'?: string;
    /**
    * Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.
    */
    'workspaceKey': string;
    /**
    * Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.
    */
    'computeKey': string;
    /**
    * Model versions served by the deployment. Immutable through update (use roll-forward/roll-back); accepted here only when unchanged.
    */
    'deploymentTargets'?: Array<model.DeploymentTarget>;
    /**
    * Authentication mechanism for the deployment's query endpoint. Required when authDetails is provided. Cannot be changed while the deployment is ACTIVE.
    */
    'authType'?: model.DeploymentAuthType;
    'authDetails'?: model.DeploymentOAuthDetails;

}

export namespace UpdateModelDeploymentDetails {









    export function getJsonObj(obj: UpdateModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,





                'deployment_targets': obj.deploymentTargets ?
                
                obj.deploymentTargets.map((item)=>{return model.DeploymentTarget.getJsonObj(item)})
                
                 : undefined,

                'authDetails': obj.authDetails ?
                
                
                model.DeploymentOAuthDetails.getJsonObj(obj.authDetails) : undefined,
        }};

        delete (jsonObj as Partial<UpdateModelDeploymentDetails>).deploymentId;delete (jsonObj as Partial<UpdateModelDeploymentDetails>).deploymentTargets;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],





                    'deploymentTargets': (obj as any)["deployment_targets"] ?
                
                (obj as any)["deployment_targets"].map((item: any)=>{return model.DeploymentTarget.getDeserializedJsonObj(item)})
                
                 : undefined,

                    'authDetails': obj.authDetails ?
                
                
                model.DeploymentOAuthDetails.getDeserializedJsonObj(obj.authDetails) : undefined,
         }};

        delete (jsonObj as any)["deployment_id"];delete (jsonObj as any)["deployment_targets"];
        
        return jsonObj;
    }
}
