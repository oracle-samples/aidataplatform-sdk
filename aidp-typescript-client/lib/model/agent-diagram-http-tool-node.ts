// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A HTTP tool node in an agent.
*/
export interface AgentDiagramHttpToolNode extends model.AgentDiagramNode {
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };

   "type": string;
}

export namespace AgentDiagramHttpToolNode {


    export function getJsonObj(obj: AgentDiagramHttpToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getJsonObj(obj) as AgentDiagramHttpToolNode, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'HTTP_TOOL';
    export function getDeserializedJsonObj(obj: AgentDiagramHttpToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getDeserializedJsonObj(obj) as AgentDiagramHttpToolNode, ...{
            

         }};

        
        
        return jsonObj;
    }
}
