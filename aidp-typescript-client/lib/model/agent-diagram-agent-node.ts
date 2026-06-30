// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* An Agent Node in an Agent
*/
export interface AgentDiagramAgentNode extends model.AgentDiagramNode {
    /**
    * System prompt written by the Agent developer defining the agent goals and what tools the agent has access to.
    */
    'instructions'?: string;
    'llm'?: model.LlmConfig;
    /**
    * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
    */
    'modelSettings'?: { [key: string]: any; };
    'memory'?: model.MemoryConfiguration;
    /**
    * List of tools that are accessible to the agent. Provide the unique tool key.
    */
    'tools'?: Array<model.Tool>;
    /**
    * A list of tool reference keys, the full tool definition can be found in the toolsMap.
    */
    'toolReferences'?: Array<string>;

   "type": string;
}

export namespace AgentDiagramAgentNode {







    export function getJsonObj(obj: AgentDiagramAgentNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getJsonObj(obj) as AgentDiagramAgentNode, ...{
            

                'llm': obj.llm ?
                
                
                model.LlmConfig.getJsonObj(obj.llm) : undefined,

                'memory': obj.memory ?
                
                
                model.MemoryConfiguration.getJsonObj(obj.memory) : undefined,
                'tools': obj.tools ?
                
                obj.tools.map((item)=>{return model.Tool.getJsonObj(item)})
                
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    export const type = 'AGENT';
    export function getDeserializedJsonObj(obj: AgentDiagramAgentNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getDeserializedJsonObj(obj) as AgentDiagramAgentNode, ...{
            

                    'llm': obj.llm ?
                
                
                model.LlmConfig.getDeserializedJsonObj(obj.llm) : undefined,

                    'memory': obj.memory ?
                
                
                model.MemoryConfiguration.getDeserializedJsonObj(obj.memory) : undefined,
                    'tools': obj.tools ?
                
                obj.tools.map((item)=>{return model.Tool.getDeserializedJsonObj(item)})
                
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
