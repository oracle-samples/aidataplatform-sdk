// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for updating agent deployment metadata.
*/
export interface UpdateAgentDeploymentMetadataDetails {
    /**
    * Deployment Id on Agent Service
    */
    'deploymentKey'?: string;
    'agentCardConfigDetail'?: model.AgentCardConfigDetail;

}

export namespace UpdateAgentDeploymentMetadataDetails {



    export function getJsonObj(obj: UpdateAgentDeploymentMetadataDetails): object {
        const jsonObj = {...obj, ...{
            

                'agentCardConfigDetail': obj.agentCardConfigDetail ?
                
                
                model.AgentCardConfigDetail.getJsonObj(obj.agentCardConfigDetail) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateAgentDeploymentMetadataDetails): object {
        const jsonObj = {...obj, ...{
            

                    'agentCardConfigDetail': obj.agentCardConfigDetail ?
                
                
                model.AgentCardConfigDetail.getDeserializedJsonObj(obj.agentCardConfigDetail) : undefined,
         }};

        
        
        return jsonObj;
    }
}
