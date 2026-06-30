// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Agent session summary.
*/
export interface AgentSessionSummary {
    /**
    * Display name.
    */
    'displayName': string;
    /**
    * Agent Session identifier.
    */
    'key': string;
    /**
    * The unique identifier (UUID) of the agent.
    */
    'agentKey': string;
    /**
    * LifecycleState of an Agent Session or Deployment.
    */
    'lifecycleState'?: model.DeploymentLifecycleState;
    /**
    * The key of the agent compute associated with this agent.
    */
    'agentComputeKey'?: string;
    /**
    * The endpointUrl where the client should connect to communicate with the agent.
    */
    'endpointUrl'?: string;
    /**
    * The date and time the Agent session was created.
    */
    'timeCreated': Date;
    /**
    * The OCID of the user/principal who created the agent session.
    */
    'createdBy': string;
    /**
    * The date and time the session was started.
    */
    'timeStarted'?: Date;
    /**
    * The date and time the session was ended.
    */
    'timeEnded'?: Date;
    /**
    * Agent session duration Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'duration'?: number;
    /**
    * Agent session token usage Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'tokens'?: number;

}

export namespace AgentSessionSummary {













    export function getJsonObj(obj: AgentSessionSummary): object {
        const jsonObj = {...obj, ...{
            












        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentSessionSummary): object {
        const jsonObj = {...obj, ...{
            












         }};

        
        
        return jsonObj;
    }
}
