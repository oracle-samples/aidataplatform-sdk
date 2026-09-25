// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to create a model deployment.
*/
export interface CreateModelDeploymentDetails {
    /**
    * Name of the deployment. At most 255 characters and 255 UTF-8 bytes.
    */
    'name': string;
    /**
    * Description of the deployment. At most 2000 characters and 2000 UTF-8 bytes.
    */
    'description'?: string;
    /**
    * Name of the registered model. At most 256 characters and 256 UTF-8 bytes.
    */
    'modelName': string;
    /**
    * Deployment targets of the deployment.
    */
    'deploymentTargets': Array<model.DeploymentTarget>;
    /**
    * Workspace key of the deployment. At most 255 characters and 255 UTF-8 bytes.
    */
    'workspaceKey': string;
    /**
    * Compute key of the deployment. At most 255 characters and 255 UTF-8 bytes.
    */
    'computeKey': string;
    /**
    * List of tags set on the model deployment.
    */
    'tags'?: Array<model.ModelDeploymentTag>;
    /**
    * Authentication mechanism for the deployment's query endpoint. Required.
    */
    'authType': model.DeploymentAuthType;
    'authDetails'?: model.DeploymentOAuthDetails;

}

export namespace CreateModelDeploymentDetails {










    export function getJsonObj(obj: CreateModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            


                'model_name': obj.modelName,

                'deployment_targets': obj.deploymentTargets ?
                
                obj.deploymentTargets.map((item)=>{return model.DeploymentTarget.getJsonObj(item)})
                
                 : undefined,


                'tags': obj.tags ?
                
                obj.tags.map((item)=>{return model.ModelDeploymentTag.getJsonObj(item)})
                
                 : undefined,

                'authDetails': obj.authDetails ?
                
                
                model.DeploymentOAuthDetails.getJsonObj(obj.authDetails) : undefined,
        }};

        delete (jsonObj as Partial<CreateModelDeploymentDetails>).modelName;delete (jsonObj as Partial<CreateModelDeploymentDetails>).deploymentTargets;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateModelDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            


                'modelName': (obj as any)["model_name"],

                    'deploymentTargets': (obj as any)["deployment_targets"] ?
                
                (obj as any)["deployment_targets"].map((item: any)=>{return model.DeploymentTarget.getDeserializedJsonObj(item)})
                
                 : undefined,


                    'tags': obj.tags ?
                
                obj.tags.map((item)=>{return model.ModelDeploymentTag.getDeserializedJsonObj(item)})
                
                 : undefined,

                    'authDetails': obj.authDetails ?
                
                
                model.DeploymentOAuthDetails.getDeserializedJsonObj(obj.authDetails) : undefined,
         }};

        delete (jsonObj as any)["model_name"];delete (jsonObj as any)["deployment_targets"];
        
        return jsonObj;
    }
}
