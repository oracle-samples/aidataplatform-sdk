// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Agent deployment details.
*/
export interface AgentDeployment {
    /**
    * Identifier, generally UUID.
    */
    'key': string;
    /**
    * Display name.
    */
    'displayName': string;
    /**
    * The unique identifier (UUID) of the agent.
    */
    'agentKey': string;
    /**
    * The key of the agent compute associated with this agent.
    */
    'agentComputeKey'?: string;
    /**
    * The endpointUrl where the client should connect to communicate with the agent.
    */
    'endpointUrl': string;
    /**
    * deployment description.
    */
    'description'?: string;
    /**
    * Type of an agent deployment.
    */
    'deploymentType': model.DeploymentType;
    /**
    * LifecycleState of an Agent Session or Deployment.
    */
    'lifecycleState': model.DeploymentLifecycleState;
    /**
    * Version of agent deployed on compute.
    */
    'deploymentVersion': string;
    /**
    * The date and time the Agent session was created.
    */
    'timeCreated': Date;
    /**
    * The OCID of the user/principal who created the agent session.
    */
    'createdBy': string;
    /**
    * The date and time the agent deployment was updated.
    */
    'timeUpdated'?: Date;
    /**
    * The OCID of the user/principal who re-deployed the existing agent deployment.
    */
    'updatedBy'?: string;
    'sessionRetentionConfig'?: model.SessionRetentionConfiguration;
    'oAuthConfig'?: model.OAuthConfiguration;
    /**
    * AgentCard base URL.
    */
    'agentCardUrl'?: string;

}

export namespace AgentDeployment {

















    export function getJsonObj(obj: AgentDeployment): object {
        const jsonObj = {...obj, ...{
            













                'sessionRetentionConfig': obj.sessionRetentionConfig ?
                
                
                model.SessionRetentionConfiguration.getJsonObj(obj.sessionRetentionConfig) : undefined,
                'oAuthConfig': obj.oAuthConfig ?
                
                
                model.OAuthConfiguration.getJsonObj(obj.oAuthConfig) : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentDeployment): object {
        const jsonObj = {...obj, ...{
            













                    'sessionRetentionConfig': obj.sessionRetentionConfig ?
                
                
                model.SessionRetentionConfiguration.getDeserializedJsonObj(obj.sessionRetentionConfig) : undefined,
                    'oAuthConfig': obj.oAuthConfig ?
                
                
                model.OAuthConfiguration.getDeserializedJsonObj(obj.oAuthConfig) : undefined,

         }};

        
        
        return jsonObj;
    }
}
