// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A model deployment.
*/
export interface ModelDeployment {
    /**
    * ID of the deployment.
    */
    'deploymentId': string;
    /**
    * Name of the deployment.
    */
    'name': string;
    /**
    * Description of the deployment.
    */
    'description'?: string;
    /**
    * Name of the registered model.
    */
    'modelName': string;
    /**
    * Deployment targets of the deployment.
    */
    'deploymentTargets': Array<model.DeploymentTarget>;
    /**
    * Workspace key of the deployment.
    */
    'workspaceKey': string;
    /**
    * Compute key of the deployment.
    */
    'computeKey': string;
    /**
    * Status of the deployment.
    */
    'status': model.DeploymentStatus;
    /**
    * Unix timestamp in milliseconds of when the deployment was activated. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'activatedTime'?: number;
    /**
    * User that activated the model deployment.
    */
    'activatedBy'?: string;
    /**
    * Serving URI of the deployment.
    */
    'servingUri'?: string;
    /**
    * Unix timestamp in milliseconds of when the deployment was created.
    */
    'createdTime': string;
    /**
    * Unix timestamp in milliseconds of when the deployment was updated.
    */
    'updatedTime': string;
    /**
    * User that created the model deployment.
    */
    'createdBy': string;
    /**
    * User that last updated the model deployment.
    */
    'updatedBy': string;
    /**
    * List of tags set on the model deployment.
    */
    'tags'?: Array<model.ModelDeploymentTag>;
    /**
    * Authentication mechanism selected for the deployment's query endpoint.
    */
    'authType'?: model.DeploymentAuthType;
    'authDetails'?: model.DeploymentOAuthDetails;

}

export namespace ModelDeployment {



















    export function getJsonObj(obj: ModelDeployment): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,



                'model_name': obj.modelName,

                'deployment_targets': obj.deploymentTargets ?
                
                obj.deploymentTargets.map((item)=>{return model.DeploymentTarget.getJsonObj(item)})
                
                 : undefined,



                'activated_time': obj.activatedTime,

                'activated_by': obj.activatedBy,

                'serving_uri': obj.servingUri,

                'created_time': obj.createdTime,

                'updated_time': obj.updatedTime,

                'created_by': obj.createdBy,

                'updated_by': obj.updatedBy,

                'tags': obj.tags ?
                
                obj.tags.map((item)=>{return model.ModelDeploymentTag.getJsonObj(item)})
                
                 : undefined,

                'authDetails': obj.authDetails ?
                
                
                model.DeploymentOAuthDetails.getJsonObj(obj.authDetails) : undefined,
        }};

        delete (jsonObj as Partial<ModelDeployment>).deploymentId;delete (jsonObj as Partial<ModelDeployment>).modelName;delete (jsonObj as Partial<ModelDeployment>).deploymentTargets;delete (jsonObj as Partial<ModelDeployment>).activatedTime;delete (jsonObj as Partial<ModelDeployment>).activatedBy;delete (jsonObj as Partial<ModelDeployment>).servingUri;delete (jsonObj as Partial<ModelDeployment>).createdTime;delete (jsonObj as Partial<ModelDeployment>).updatedTime;delete (jsonObj as Partial<ModelDeployment>).createdBy;delete (jsonObj as Partial<ModelDeployment>).updatedBy;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ModelDeployment): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],



                'modelName': (obj as any)["model_name"],

                    'deploymentTargets': (obj as any)["deployment_targets"] ?
                
                (obj as any)["deployment_targets"].map((item: any)=>{return model.DeploymentTarget.getDeserializedJsonObj(item)})
                
                 : undefined,



                'activatedTime': (obj as any)["activated_time"],

                'activatedBy': (obj as any)["activated_by"],

                'servingUri': (obj as any)["serving_uri"],

                'createdTime': (obj as any)["created_time"],

                'updatedTime': (obj as any)["updated_time"],

                'createdBy': (obj as any)["created_by"],

                'updatedBy': (obj as any)["updated_by"],

                    'tags': obj.tags ?
                
                obj.tags.map((item)=>{return model.ModelDeploymentTag.getDeserializedJsonObj(item)})
                
                 : undefined,

                    'authDetails': obj.authDetails ?
                
                
                model.DeploymentOAuthDetails.getDeserializedJsonObj(obj.authDetails) : undefined,
         }};

        delete (jsonObj as any)["deployment_id"];delete (jsonObj as any)["model_name"];delete (jsonObj as any)["deployment_targets"];delete (jsonObj as any)["activated_time"];delete (jsonObj as any)["activated_by"];delete (jsonObj as any)["serving_uri"];delete (jsonObj as any)["created_time"];delete (jsonObj as any)["updated_time"];delete (jsonObj as any)["created_by"];delete (jsonObj as any)["updated_by"];
        
        return jsonObj;
    }
}
