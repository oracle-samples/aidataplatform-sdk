// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* AI compute cluster.
*/
export interface AiCompute extends model.Cluster {
    'replicaConfig'?: model.ReplicaConfig;

   "sourceApi": string;
}

export namespace AiCompute {


    export function getJsonObj(obj: AiCompute, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Cluster.getJsonObj(obj) as AiCompute, ...{
            
                'replicaConfig': obj.replicaConfig ?
                
                
                model.ReplicaConfig.getJsonObj(obj.replicaConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const sourceApi = 'AI_COMPUTE';
    export function getDeserializedJsonObj(obj: AiCompute, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Cluster.getDeserializedJsonObj(obj) as AiCompute, ...{
            
                    'replicaConfig': obj.replicaConfig ?
                
                
                model.ReplicaConfig.getDeserializedJsonObj(obj.replicaConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
