// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to create a Custom tool node in an agent.
*/
export interface CreateAgentDiagramCustomToolNodeDetails extends model.CreateAgentDiagramNodeDetails {
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

export namespace CreateAgentDiagramCustomToolNodeDetails {




    export function getJsonObj(obj: CreateAgentDiagramCustomToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getJsonObj(obj) as CreateAgentDiagramCustomToolNodeDetails, ...{
            


                'toolConfig': obj.toolConfig ?
                
                
                model.CustomToolConfiguration.getJsonObj(obj.toolConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'CUSTOM_TOOL';
    export function getDeserializedJsonObj(obj: CreateAgentDiagramCustomToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as CreateAgentDiagramCustomToolNodeDetails, ...{
            


                    'toolConfig': obj.toolConfig ?
                
                
                model.CustomToolConfiguration.getDeserializedJsonObj(obj.toolConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
