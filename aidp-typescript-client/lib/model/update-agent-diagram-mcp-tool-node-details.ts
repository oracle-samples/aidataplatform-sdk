// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to update a MCP tool node.
*/
export interface UpdateAgentDiagramMcpToolNodeDetails extends model.UpdateAgentDiagramNodeDetails {
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };

   "type": string;
}

export namespace UpdateAgentDiagramMcpToolNodeDetails {


    export function getJsonObj(obj: UpdateAgentDiagramMcpToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getJsonObj(obj) as UpdateAgentDiagramMcpToolNodeDetails, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'MCP_TOOL';
    export function getDeserializedJsonObj(obj: UpdateAgentDiagramMcpToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as UpdateAgentDiagramMcpToolNodeDetails, ...{
            

         }};

        
        
        return jsonObj;
    }
}
