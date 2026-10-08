// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A model version targeted by a deployment and its traffic share.
*/
export interface DeploymentTarget {
    /**
    * Version number of the model version.
    */
    'modelVersion': string;
    /**
    * Percentage of deployment traffic routed to this model version. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'trafficPercentage': number;

}

export namespace DeploymentTarget {



    export function getJsonObj(obj: DeploymentTarget): object {
        const jsonObj = {...obj, ...{
            
                'model_version': obj.modelVersion,

                'traffic_percentage': obj.trafficPercentage,

        }};

        delete (jsonObj as Partial<DeploymentTarget>).modelVersion;delete (jsonObj as Partial<DeploymentTarget>).trafficPercentage;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentTarget): object {
        const jsonObj = {...obj, ...{
            
                'modelVersion': (obj as any)["model_version"],

                'trafficPercentage': (obj as any)["traffic_percentage"],

         }};

        delete (jsonObj as any)["model_version"];delete (jsonObj as any)["traffic_percentage"];
        
        return jsonObj;
    }
}
