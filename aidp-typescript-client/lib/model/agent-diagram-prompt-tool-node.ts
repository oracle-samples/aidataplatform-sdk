// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A Prompt tool node in an agent.
*/
export interface AgentDiagramPromptToolNode extends model.AgentDiagramNode {
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };

   "type": string;
}

export namespace AgentDiagramPromptToolNode {


    export function getJsonObj(obj: AgentDiagramPromptToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getJsonObj(obj) as AgentDiagramPromptToolNode, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'PROMPT_TOOL';
    export function getDeserializedJsonObj(obj: AgentDiagramPromptToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getDeserializedJsonObj(obj) as AgentDiagramPromptToolNode, ...{
            

         }};

        
        
        return jsonObj;
    }
}
