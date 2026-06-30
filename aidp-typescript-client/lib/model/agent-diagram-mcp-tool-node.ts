// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A MCP tool node in an agent.
*/
export interface AgentDiagramMcpToolNode extends model.AgentDiagramNode {
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };

   "type": string;
}

export namespace AgentDiagramMcpToolNode {


    export function getJsonObj(obj: AgentDiagramMcpToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getJsonObj(obj) as AgentDiagramMcpToolNode, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'MCP_TOOL';
    export function getDeserializedJsonObj(obj: AgentDiagramMcpToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getDeserializedJsonObj(obj) as AgentDiagramMcpToolNode, ...{
            

         }};

        
        
        return jsonObj;
    }
}
