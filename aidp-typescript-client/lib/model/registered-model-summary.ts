// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Aggregate counts of the registered-model footprint within a catalog and schema.
*/
export interface RegisteredModelSummary {
    /**
    * Number of registered models in the catalog and schema. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'registeredModelsCount': number;
    /**
    * Number of model versions across those registered models. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'modelVersionsCount': number;
    /**
    * Number of model deployments across those registered models. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'modelDeploymentsCount': number;
    /**
    * Number of model deployments that are currently active. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'activeDeploymentCount': number;

}

export namespace RegisteredModelSummary {





    export function getJsonObj(obj: RegisteredModelSummary): object {
        const jsonObj = {...obj, ...{
            
                'registered_models_count': obj.registeredModelsCount,

                'model_versions_count': obj.modelVersionsCount,

                'model_deployments_count': obj.modelDeploymentsCount,

                'active_deployment_count': obj.activeDeploymentCount,

        }};

        delete (jsonObj as Partial<RegisteredModelSummary>).registeredModelsCount;delete (jsonObj as Partial<RegisteredModelSummary>).modelVersionsCount;delete (jsonObj as Partial<RegisteredModelSummary>).modelDeploymentsCount;delete (jsonObj as Partial<RegisteredModelSummary>).activeDeploymentCount;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: RegisteredModelSummary): object {
        const jsonObj = {...obj, ...{
            
                'registeredModelsCount': (obj as any)["registered_models_count"],

                'modelVersionsCount': (obj as any)["model_versions_count"],

                'modelDeploymentsCount': (obj as any)["model_deployments_count"],

                'activeDeploymentCount': (obj as any)["active_deployment_count"],

         }};

        delete (jsonObj as any)["registered_models_count"];delete (jsonObj as any)["model_versions_count"];delete (jsonObj as any)["model_deployments_count"];delete (jsonObj as any)["active_deployment_count"];
        
        return jsonObj;
    }
}
