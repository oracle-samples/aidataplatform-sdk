// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to create a RAG tool node in an agent.
*/
export interface CreateAgentDiagramRagToolNodeDetails extends model.CreateAgentDiagramNodeDetails {
    /**
    * The unique identifier (key) of the saved AI tool.
    */
    'toolKey'?: string;
    'inputSchema'?: model.RagToolInputSchema;
    'toolConfig'?: model.RagToolConfiguration;

   "type": string;
}

export namespace CreateAgentDiagramRagToolNodeDetails {




    export function getJsonObj(obj: CreateAgentDiagramRagToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getJsonObj(obj) as CreateAgentDiagramRagToolNodeDetails, ...{
            

                'inputSchema': obj.inputSchema ?
                
                
                model.RagToolInputSchema.getJsonObj(obj.inputSchema) : undefined,
                'toolConfig': obj.toolConfig ?
                
                
                model.RagToolConfiguration.getJsonObj(obj.toolConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'RAG_TOOL';
    export function getDeserializedJsonObj(obj: CreateAgentDiagramRagToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as CreateAgentDiagramRagToolNodeDetails, ...{
            

                    'inputSchema': obj.inputSchema ?
                
                
                model.RagToolInputSchema.getDeserializedJsonObj(obj.inputSchema) : undefined,
                    'toolConfig': obj.toolConfig ?
                
                
                model.RagToolConfiguration.getDeserializedJsonObj(obj.toolConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
