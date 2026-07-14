// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to update a Prompt tool node.
*/
export interface UpdateAgentDiagramPromptToolNodeDetails extends model.UpdateAgentDiagramNodeDetails {
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };

   "type": string;
}

export namespace UpdateAgentDiagramPromptToolNodeDetails {


    export function getJsonObj(obj: UpdateAgentDiagramPromptToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getJsonObj(obj) as UpdateAgentDiagramPromptToolNodeDetails, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'PROMPT_TOOL';
    export function getDeserializedJsonObj(obj: UpdateAgentDiagramPromptToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as UpdateAgentDiagramPromptToolNodeDetails, ...{
            

         }};

        
        
        return jsonObj;
    }
}
