// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Minimal deployment configuration for a deployment-activity list row: the registered model and the served model versions. The full configuration snapshot is available from the single-activity read.
*/
export interface DeploymentDetailsSummary {
    /**
    * Name of the registered model.
    */
    'modelName'?: string;
    /**
    * Model versions served by the deployment and their traffic share.
    */
    'deploymentTargets'?: Array<model.DeploymentTarget>;

}

export namespace DeploymentDetailsSummary {



    export function getJsonObj(obj: DeploymentDetailsSummary): object {
        const jsonObj = {...obj, ...{
            
                'model_name': obj.modelName,

                'deployment_targets': obj.deploymentTargets ?
                
                obj.deploymentTargets.map((item)=>{return model.DeploymentTarget.getJsonObj(item)})
                
                 : undefined,
        }};

        delete (jsonObj as Partial<DeploymentDetailsSummary>).modelName;delete (jsonObj as Partial<DeploymentDetailsSummary>).deploymentTargets;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentDetailsSummary): object {
        const jsonObj = {...obj, ...{
            
                'modelName': (obj as any)["model_name"],

                    'deploymentTargets': (obj as any)["deployment_targets"] ?
                
                (obj as any)["deployment_targets"].map((item: any)=>{return model.DeploymentTarget.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        delete (jsonObj as any)["model_name"];delete (jsonObj as any)["deployment_targets"];
        
        return jsonObj;
    }
}
