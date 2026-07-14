// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to update a Custom tool node.
*/
export interface UpdateAgentDiagramCustomToolNodeDetails extends model.UpdateAgentDiagramNodeDetails {
    /**
    * The unique identifier (key) of the saved AI tool.
    */
    'toolKey'?: string;
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };
    'toolConfig'?: model.CustomToolConfiguration;

   "type": string;
}

export namespace UpdateAgentDiagramCustomToolNodeDetails {




    export function getJsonObj(obj: UpdateAgentDiagramCustomToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getJsonObj(obj) as UpdateAgentDiagramCustomToolNodeDetails, ...{
            


                'toolConfig': obj.toolConfig ?
                
                
                model.CustomToolConfiguration.getJsonObj(obj.toolConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'CUSTOM_TOOL';
    export function getDeserializedJsonObj(obj: UpdateAgentDiagramCustomToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as UpdateAgentDiagramCustomToolNodeDetails, ...{
            


                    'toolConfig': obj.toolConfig ?
                
                
                model.CustomToolConfiguration.getDeserializedJsonObj(obj.toolConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
