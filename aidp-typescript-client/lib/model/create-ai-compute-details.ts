// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* AI compute cluster details for creation.
*/
export interface CreateAiComputeDetails extends model.CreateClusterDetails {
    'replicaConfig'?: model.ReplicaConfig;

   "type": string;
}

export namespace CreateAiComputeDetails {


    export function getJsonObj(obj: CreateAiComputeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateClusterDetails.getJsonObj(obj) as CreateAiComputeDetails, ...{
            
                'replicaConfig': obj.replicaConfig ?
                
                
                model.ReplicaConfig.getJsonObj(obj.replicaConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'AI_COMPUTE';
    export function getDeserializedJsonObj(obj: CreateAiComputeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateClusterDetails.getDeserializedJsonObj(obj) as CreateAiComputeDetails, ...{
            
                    'replicaConfig': obj.replicaConfig ?
                
                
                model.ReplicaConfig.getDeserializedJsonObj(obj.replicaConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
