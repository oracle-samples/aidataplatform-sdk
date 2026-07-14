// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to create a agent.
*/
export interface CreateAgentDetails {
    /**
    * Agent name.
    */
    'displayName': string;
    /**
    * Agent description.
    */
    'description'?: string;
    /**
    * Path inside volume where the agent JSON is written.
    */
    'pathInfo': string;
    /**
    * The type of agent (Canvas or Code).
    */
    'type'?: CreateAgentDetails.Type;
    /**
    * The path to project entry file.
    */
    'entryFilePath'?: string;
    /**
    * The path to dependencies file.
    */
    'dependenciesFilePath'?: string;
    /**
    * The key of the agent compute associated with this agent.
    */
    'computeKey'?: string;
    'guardrails'?: model.GuardrailsConfiguration;
    'sessionConfig'?: model.SessionConfiguration;
    'agentCardConfig'?: model.AgentCardConfigDetail;
    'diagram'?: model.AgentDiagram;

}

export namespace CreateAgentDetails {




    export enum Type {
    
    Canvas = "CANVAS",
    Code = "CODE"

}









    export function getJsonObj(obj: CreateAgentDetails): object {
        const jsonObj = {...obj, ...{
            







                'guardrails': obj.guardrails ?
                
                
                model.GuardrailsConfiguration.getJsonObj(obj.guardrails) : undefined,
                'sessionConfig': obj.sessionConfig ?
                
                
                model.SessionConfiguration.getJsonObj(obj.sessionConfig) : undefined,
                'agentCardConfig': obj.agentCardConfig ?
                
                
                model.AgentCardConfigDetail.getJsonObj(obj.agentCardConfig) : undefined,
                'diagram': obj.diagram ?
                
                
                model.AgentDiagram.getJsonObj(obj.diagram) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateAgentDetails): object {
        const jsonObj = {...obj, ...{
            







                    'guardrails': obj.guardrails ?
                
                
                model.GuardrailsConfiguration.getDeserializedJsonObj(obj.guardrails) : undefined,
                    'sessionConfig': obj.sessionConfig ?
                
                
                model.SessionConfiguration.getDeserializedJsonObj(obj.sessionConfig) : undefined,
                    'agentCardConfig': obj.agentCardConfig ?
                
                
                model.AgentCardConfigDetail.getDeserializedJsonObj(obj.agentCardConfig) : undefined,
                    'diagram': obj.diagram ?
                
                
                model.AgentDiagram.getDeserializedJsonObj(obj.diagram) : undefined,
         }};

        
        
        return jsonObj;
    }
}
