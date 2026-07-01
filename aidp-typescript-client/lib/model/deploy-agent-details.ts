// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Agent details to deploy an agent.
*/
export interface DeployAgentDetails {
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
    'sessionRetentionConfig'?: model.SessionRetentionConfiguration;
    'oAuthConfig'?: model.OAuthConfiguration;

}

export namespace DeployAgentDetails {







    export function getJsonObj(obj: DeployAgentDetails): object {
        const jsonObj = {...obj, ...{
            




                'sessionRetentionConfig': obj.sessionRetentionConfig ?
                
                
                model.SessionRetentionConfiguration.getJsonObj(obj.sessionRetentionConfig) : undefined,
                'oAuthConfig': obj.oAuthConfig ?
                
                
                model.OAuthConfiguration.getJsonObj(obj.oAuthConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeployAgentDetails): object {
        const jsonObj = {...obj, ...{
            




                    'sessionRetentionConfig': obj.sessionRetentionConfig ?
                
                
                model.SessionRetentionConfiguration.getDeserializedJsonObj(obj.sessionRetentionConfig) : undefined,
                    'oAuthConfig': obj.oAuthConfig ?
                
                
                model.OAuthConfiguration.getDeserializedJsonObj(obj.oAuthConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
