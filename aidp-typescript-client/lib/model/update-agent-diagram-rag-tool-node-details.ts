// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to update a RAG tool node.
*/
export interface UpdateAgentDiagramRagToolNodeDetails extends model.UpdateAgentDiagramNodeDetails {
    'inputSchema'?: model.RagToolInputSchema;

   "type": string;
}

export namespace UpdateAgentDiagramRagToolNodeDetails {


    export function getJsonObj(obj: UpdateAgentDiagramRagToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getJsonObj(obj) as UpdateAgentDiagramRagToolNodeDetails, ...{
            
                'inputSchema': obj.inputSchema ?
                
                
                model.RagToolInputSchema.getJsonObj(obj.inputSchema) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'RAG_TOOL';
    export function getDeserializedJsonObj(obj: UpdateAgentDiagramRagToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as UpdateAgentDiagramRagToolNodeDetails, ...{
            
                    'inputSchema': obj.inputSchema ?
                
                
                model.RagToolInputSchema.getDeserializedJsonObj(obj.inputSchema) : undefined,
         }};

        
        
        return jsonObj;
    }
}
