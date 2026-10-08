// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary of a model deployment returned by a search.
*/
export interface ModelDeploymentSummary {
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
    * Status of the deployment.
    */
    'status': model.DeploymentStatus;
    /**
    * User that created the model deployment.
    */
    'createdBy': string;
    /**
    * Unix timestamp in milliseconds of when the deployment was created.
    */
    'createdTime': string;
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
    * Unix timestamp in milliseconds of when the deployment was updated.
    */
    'updatedTime': string;
    /**
    * User that last updated the model deployment.
    */
    'updatedBy': string;

}

export namespace ModelDeploymentSummary {













    export function getJsonObj(obj: ModelDeploymentSummary): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,



                'model_name': obj.modelName,


                'created_by': obj.createdBy,

                'created_time': obj.createdTime,

                'activated_time': obj.activatedTime,

                'activated_by': obj.activatedBy,

                'serving_uri': obj.servingUri,

                'updated_time': obj.updatedTime,

                'updated_by': obj.updatedBy,

        }};

        delete (jsonObj as Partial<ModelDeploymentSummary>).deploymentId;delete (jsonObj as Partial<ModelDeploymentSummary>).modelName;delete (jsonObj as Partial<ModelDeploymentSummary>).createdBy;delete (jsonObj as Partial<ModelDeploymentSummary>).createdTime;delete (jsonObj as Partial<ModelDeploymentSummary>).activatedTime;delete (jsonObj as Partial<ModelDeploymentSummary>).activatedBy;delete (jsonObj as Partial<ModelDeploymentSummary>).servingUri;delete (jsonObj as Partial<ModelDeploymentSummary>).updatedTime;delete (jsonObj as Partial<ModelDeploymentSummary>).updatedBy;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ModelDeploymentSummary): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],



                'modelName': (obj as any)["model_name"],


                'createdBy': (obj as any)["created_by"],

                'createdTime': (obj as any)["created_time"],

                'activatedTime': (obj as any)["activated_time"],

                'activatedBy': (obj as any)["activated_by"],

                'servingUri': (obj as any)["serving_uri"],

                'updatedTime': (obj as any)["updated_time"],

                'updatedBy': (obj as any)["updated_by"],

         }};

        delete (jsonObj as any)["deployment_id"];delete (jsonObj as any)["model_name"];delete (jsonObj as any)["created_by"];delete (jsonObj as any)["created_time"];delete (jsonObj as any)["activated_time"];delete (jsonObj as any)["activated_by"];delete (jsonObj as any)["serving_uri"];delete (jsonObj as any)["updated_time"];delete (jsonObj as any)["updated_by"];
        
        return jsonObj;
    }
}
