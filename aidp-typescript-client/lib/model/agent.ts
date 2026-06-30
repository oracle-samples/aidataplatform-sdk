// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* An agent is a sequence of nodes and edges defining an end-to-end agentic application. | A diagram can be composed of multiple nodes, each node being a single agent or a multi-agent system, working independently | or collaboratively to accomplish an overall objective.
*/
export interface Agent {
    /**
    * The unique identifier (UUID) of the agent.
    */
    'key': string;
    /**
    * Agent name.
    */
    'displayName': string;
    /**
    * The key of the workspace to which this agent belongs.
    */
    'workspaceKey'?: string;
    /**
    * Agent description.
    */
    'description': string;
    /**
    * Path inside volume where the agent JSON is written.
    */
    'pathInfo': string;
    /**
    * The type of agent (Canvas or Code).
    */
    'type'?: Agent.Type;
    /**
    * The path to project entry file.
    */
    'entryFilePath'?: string;
    /**
    * The path to dependencies file.
    */
    'dependenciesFilePath'?: string;
    /**
    * The key of the compute where agent is deployed.
    */
    'deploymentComputeKey'?: string;
    /**
    * Agent deployment mode.
    */
    'deploymentMode'?: string;
    /**
    * Agent URI.
    */
    'uri'?: string;
    /**
    * Agent URI state.
    */
    'uriState'?: string;
    /**
    * The current state of the agent.
    */
    'lifecycleState': Agent.LifecycleState;
    /**
    * A message that describes the current state of the agent in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
    */
    'lifecycleDetails'?: string;
    /**
    * The date and time the agent was created.
    */
    'timeCreated'?: Date;
    /**
    * The date and time the agent was updated.
    */
    'timeUpdated'?: Date;
    /**
    * The OCID of the user/principal who created the agent.
    */
    'createdBy'?: string;
    /**
    * The ID of the user who last updated the schema.
    */
    'updatedBy'?: string;
    /**
    * The key of the agent compute associated with this agent.
    */
    'computeKey'?: string;
    'diagram'?: model.AgentDiagram;
    'guardrails'?: model.GuardrailsConfiguration;
    'sessionConfig'?: model.SessionConfiguration;
    'agentCardConfig'?: model.AgentCardConfigDetail;
    /**
    * A number indicating the version of the record. Each time the record is updated, this version will be incremented. This will be used for optimistic locking. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'version'?: number;

}

export namespace Agent {






    export enum Type {
    
    Canvas = "CANVAS",
    Code = "CODE",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}








    export enum LifecycleState {
    
    Draft = "DRAFT",
    Deployed = "DEPLOYED",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}













    export function getJsonObj(obj: Agent): object {
        const jsonObj = {...obj, ...{
            



















                'diagram': obj.diagram ?
                
                
                model.AgentDiagram.getJsonObj(obj.diagram) : undefined,
                'guardrails': obj.guardrails ?
                
                
                model.GuardrailsConfiguration.getJsonObj(obj.guardrails) : undefined,
                'sessionConfig': obj.sessionConfig ?
                
                
                model.SessionConfiguration.getJsonObj(obj.sessionConfig) : undefined,
                'agentCardConfig': obj.agentCardConfig ?
                
                
                model.AgentCardConfigDetail.getJsonObj(obj.agentCardConfig) : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: Agent): object {
        const jsonObj = {...obj, ...{
            



















                    'diagram': obj.diagram ?
                
                
                model.AgentDiagram.getDeserializedJsonObj(obj.diagram) : undefined,
                    'guardrails': obj.guardrails ?
                
                
                model.GuardrailsConfiguration.getDeserializedJsonObj(obj.guardrails) : undefined,
                    'sessionConfig': obj.sessionConfig ?
                
                
                model.SessionConfiguration.getDeserializedJsonObj(obj.sessionConfig) : undefined,
                    'agentCardConfig': obj.agentCardConfig ?
                
                
                model.AgentCardConfigDetail.getDeserializedJsonObj(obj.agentCardConfig) : undefined,

         }};

        
        
        return jsonObj;
    }
}
