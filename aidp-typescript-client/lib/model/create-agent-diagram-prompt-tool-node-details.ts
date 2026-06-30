// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to create a Prompt tool node in an agent.
*/
export interface CreateAgentDiagramPromptToolNodeDetails extends model.CreateAgentDiagramNodeDetails {
    /**
    * The unique identifier (key) of the saved AI tool.
    */
    'toolKey'?: string;
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };
    'toolConfig'?: model.PromptToolConfiguration;

   "type": string;
}

export namespace CreateAgentDiagramPromptToolNodeDetails {




    export function getJsonObj(obj: CreateAgentDiagramPromptToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getJsonObj(obj) as CreateAgentDiagramPromptToolNodeDetails, ...{
            


                'toolConfig': obj.toolConfig ?
                
                
                model.PromptToolConfiguration.getJsonObj(obj.toolConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'PROMPT_TOOL';
    export function getDeserializedJsonObj(obj: CreateAgentDiagramPromptToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as CreateAgentDiagramPromptToolNodeDetails, ...{
            


                    'toolConfig': obj.toolConfig ?
                
                
                model.PromptToolConfiguration.getDeserializedJsonObj(obj.toolConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
