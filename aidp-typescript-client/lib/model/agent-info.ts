// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary information of agent in the schema.
*/
export interface AgentInfo {
    /**
    * The unique identifier (UUID) of the agent.
    */
    'key': string;
    /**
    * Agent name.
    */
    'displayName': string;
    /**
    * Agent description.
    */
    'description'?: string;
    /**
    * The key of the workspace to which this agent belongs.
    */
    'workspaceKey'?: string;
    /**
    * Path inside volume where the agent JSON is written.
    */
    'pathInfo'?: string;
    /**
    * The type of agent (Canvas or Code).
    */
    'type'?: AgentInfo.Type;
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
    * The path to project entry file.
    */
    'entryFilePath'?: string;
    /**
    * The path to dependencies file.
    */
    'dependenciesFilePath'?: string;
    /**
    * The current state of the agent.
    */
    'lifecycleState'?: string;
    /**
    * A message that describes the current state of the agent in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
    */
    'lifecycleDetails'?: string;
    /**
    * The key of the agent compute associated with this agent.
    */
    'computeKey'?: string;
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

}

export namespace AgentInfo {






    export enum Type {
    
    Canvas = "CANVAS",
    Code = "CODE",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}















    export function getJsonObj(obj: AgentInfo): object {
        const jsonObj = {...obj, ...{
            



















        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentInfo): object {
        const jsonObj = {...obj, ...{
            



















         }};

        
        
        return jsonObj;
    }
}
