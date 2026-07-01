// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* AI compute cluster details for update.
*/
export interface UpdateAiComputeDetails extends model.UpdateClusterDetails {
    'replicaConfig'?: model.ReplicaConfig;

   "type": string;
}

export namespace UpdateAiComputeDetails {


    export function getJsonObj(obj: UpdateAiComputeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateClusterDetails.getJsonObj(obj) as UpdateAiComputeDetails, ...{
            
                'replicaConfig': obj.replicaConfig ?
                
                
                model.ReplicaConfig.getJsonObj(obj.replicaConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'AI_COMPUTE';
    export function getDeserializedJsonObj(obj: UpdateAiComputeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateClusterDetails.getDeserializedJsonObj(obj) as UpdateAiComputeDetails, ...{
            
                    'replicaConfig': obj.replicaConfig ?
                
                
                model.ReplicaConfig.getDeserializedJsonObj(obj.replicaConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
