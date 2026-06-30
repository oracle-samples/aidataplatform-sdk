// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Agent session.
*/
export interface AgentSession {
    /**
    * Display name.
    */
    'displayName': string;
    /**
    * Agent Session identifier.
    */
    'key': string;
    /**
    * The Agent key for which the session is started.
    */
    'agentKey': string;
    /**
    * The endpointUrl where the client should connect to communicate with the agent.
    */
    'endpointUrl': string;
    /**
    * LifecycleState of an Agent Session or Deployment.
    */
    'lifecycleState': model.DeploymentLifecycleState;
    /**
    * The Agent Compute Key where client can run or test the agent.
    */
    'agentComputeKey': string;
    /**
    * The date and time the Agent session was created.
    */
    'timeCreated'?: Date;
    /**
    * OCID of the user who updated this record
    */
    'updatedBy'?: string;
    /**
    * The OCID of the user/principal who created the agent session.
    */
    'createdBy'?: string;
    /**
    * The date and time the Agent session was updated.
    */
    'timeUpdated'?: Date;
    /**
    * The date and time the session was started.
    */
    'timeStarted'?: Date;
    /**
    * The date and time the session was ended.
    */
    'timeEnded'?: Date;
    'context'?: model.AgentSessionContext;

}

export namespace AgentSession {














    export function getJsonObj(obj: AgentSession): object {
        const jsonObj = {...obj, ...{
            












                'context': obj.context ?
                
                
                model.AgentSessionContext.getJsonObj(obj.context) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentSession): object {
        const jsonObj = {...obj, ...{
            












                    'context': obj.context ?
                
                
                model.AgentSessionContext.getDeserializedJsonObj(obj.context) : undefined,
         }};

        
        
        return jsonObj;
    }
}
