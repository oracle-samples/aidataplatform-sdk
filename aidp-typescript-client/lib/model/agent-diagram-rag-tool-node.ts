// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A RAG tool node in an agent.
*/
export interface AgentDiagramRagToolNode extends model.AgentDiagramNode {
    'inputSchema'?: model.RagToolInputSchema;

   "type": string;
}

export namespace AgentDiagramRagToolNode {


    export function getJsonObj(obj: AgentDiagramRagToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getJsonObj(obj) as AgentDiagramRagToolNode, ...{
            
                'inputSchema': obj.inputSchema ?
                
                
                model.RagToolInputSchema.getJsonObj(obj.inputSchema) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'RAG_TOOL';
    export function getDeserializedJsonObj(obj: AgentDiagramRagToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getDeserializedJsonObj(obj) as AgentDiagramRagToolNode, ...{
            
                    'inputSchema': obj.inputSchema ?
                
                
                model.RagToolInputSchema.getDeserializedJsonObj(obj.inputSchema) : undefined,
         }};

        
        
        return jsonObj;
    }
}
