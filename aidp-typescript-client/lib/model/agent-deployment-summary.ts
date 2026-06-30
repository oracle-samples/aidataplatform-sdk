// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Agent deployment summary.
*/
export interface AgentDeploymentSummary {
    /**
    * Display name.
    */
    'displayName': string;
    /**
    * deployment description.
    */
    'description'?: string;
    /**
    * Identifier, generally UUID.
    */
    'key': string;
    /**
    * LifecycleState of an Agent Session or Deployment.
    */
    'lifecycleState': model.DeploymentLifecycleState;
    /**
    * Type of an agent deployment.
    */
    'deploymentType': model.DeploymentType;
    /**
    * The key of the agent compute associated with this agent.
    */
    'agentComputeKey'?: string;
    /**
    * The unique identifier (UUID) of the agent.
    */
    'agentKey'?: string;
    /**
    * The endpointUrl where the client should connect to communicate with the agent.
    */
    'endpointUrl'?: string;
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
    * AgentCard base URL.
    */
    'agentCardUrl'?: string;

}

export namespace AgentDeploymentSummary {













    export function getJsonObj(obj: AgentDeploymentSummary): object {
        const jsonObj = {...obj, ...{
            












        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentDeploymentSummary): object {
        const jsonObj = {...obj, ...{
            












         }};

        
        
        return jsonObj;
    }
}
