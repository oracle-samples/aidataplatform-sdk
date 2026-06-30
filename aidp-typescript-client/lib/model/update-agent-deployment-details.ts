// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details required to update the deployment of an agent.
*/
export interface UpdateAgentDeploymentDetails {
    /**
    * Display name.
    */
    'displayName'?: string;
    /**
    * deployment description.
    */
    'description'?: string;
    /**
    * The key of the agent compute associated with this agent.
    */
    'agentComputeKey'?: string;
    /**
    * The unique identifier (UUID) of the agent.
    */
    'agentKey': string;
    'oAuthConfig'?: model.OAuthConfiguration;

}

export namespace UpdateAgentDeploymentDetails {






    export function getJsonObj(obj: UpdateAgentDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            




                'oAuthConfig': obj.oAuthConfig ?
                
                
                model.OAuthConfiguration.getJsonObj(obj.oAuthConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateAgentDeploymentDetails): object {
        const jsonObj = {...obj, ...{
            




                    'oAuthConfig': obj.oAuthConfig ?
                
                
                model.OAuthConfiguration.getDeserializedJsonObj(obj.oAuthConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
