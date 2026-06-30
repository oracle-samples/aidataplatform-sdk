// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to create a MCP tool node in an agent.
*/
export interface CreateAgentDiagramMcpToolNodeDetails extends model.CreateAgentDiagramNodeDetails {
    /**
    * The unique identifier (key) of the saved AI tool
    */
    'toolKey'?: string;
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };
    'toolConfig'?: model.McpToolConfiguration;

   "type": string;
}

export namespace CreateAgentDiagramMcpToolNodeDetails {




    export function getJsonObj(obj: CreateAgentDiagramMcpToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getJsonObj(obj) as CreateAgentDiagramMcpToolNodeDetails, ...{
            


                'toolConfig': obj.toolConfig ?
                
                
                model.McpToolConfiguration.getJsonObj(obj.toolConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'MCP_TOOL';
    export function getDeserializedJsonObj(obj: CreateAgentDiagramMcpToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as CreateAgentDiagramMcpToolNodeDetails, ...{
            


                    'toolConfig': obj.toolConfig ?
                
                
                model.McpToolConfiguration.getDeserializedJsonObj(obj.toolConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
