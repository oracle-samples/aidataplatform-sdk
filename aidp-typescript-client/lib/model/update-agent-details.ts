// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to update a Agent.
*/
export interface UpdateAgentDetails {
    /**
    * Agent name.
    */
    'displayName'?: string;
    /**
    * Agent description.
    */
    'description'?: string;
    /**
    * The key of the agent compute associated with this agent.
    */
    'computeKey'?: string;
    'diagram'?: model.AgentDiagram;
    /**
    * The path to project entry file.
    */
    'entryFilePath'?: string;
    /**
    * The path to dependencies file.
    */
    'dependenciesFilePath'?: string;
    /**
    * List of node keys that were removed from the agent diagram.
    */
    'deletedNodes'?: Array<string>;
    /**
    * List of node keys that were updated in the agent diagram.
    */
    'updatedNodes'?: Array<string>;
    /**
    * List of node keys that were newly added to the agent diagram.
    */
    'addedNodes'?: Array<string>;
    'guardrails'?: model.GuardrailsConfiguration;
    'sessionConfig'?: model.SessionConfiguration;
    'agentCardConfig'?: model.AgentCardConfigDetail;

}

export namespace UpdateAgentDetails {













    export function getJsonObj(obj: UpdateAgentDetails): object {
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
    export function getDeserializedJsonObj(obj: UpdateAgentDetails): object {
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
