// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Deployment counts for a registered model. Returned by a registered-model search only when the search requests the deployment summary, and omitted when it cannot be resolved. Both counts are always present together, so a summary reporting 0 means the model genuinely has no deployments, while no summary at all means the counts were not requested or could not be resolved.
*/
export interface DeploymentSummary {
    /**
    * Number of model deployments for this registered model, in any status. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'totalDeployment': number;
    /**
    * Number of those deployments that are currently active. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'activeDeployment': number;

}

export namespace DeploymentSummary {



    export function getJsonObj(obj: DeploymentSummary): object {
        const jsonObj = {...obj, ...{
            
                'total_deployment': obj.totalDeployment,

                'active_deployment': obj.activeDeployment,

        }};

        delete (jsonObj as Partial<DeploymentSummary>).totalDeployment;delete (jsonObj as Partial<DeploymentSummary>).activeDeployment;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentSummary): object {
        const jsonObj = {...obj, ...{
            
                'totalDeployment': (obj as any)["total_deployment"],

                'activeDeployment': (obj as any)["active_deployment"],

         }};

        delete (jsonObj as any)["total_deployment"];delete (jsonObj as any)["active_deployment"];
        
        return jsonObj;
    }
}
