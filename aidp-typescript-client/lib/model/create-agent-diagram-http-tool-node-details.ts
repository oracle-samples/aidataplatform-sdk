// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to create a HTTP tool node in an agent.
*/
export interface CreateAgentDiagramHttpToolNodeDetails extends model.CreateAgentDiagramNodeDetails {
    /**
    * The unique identifier (key) of the saved AI tool
    */
    'toolKey'?: string;
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };
    'toolConfig'?: model.HttpToolConfiguration;

   "type": string;
}

export namespace CreateAgentDiagramHttpToolNodeDetails {




    export function getJsonObj(obj: CreateAgentDiagramHttpToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getJsonObj(obj) as CreateAgentDiagramHttpToolNodeDetails, ...{
            


                'toolConfig': obj.toolConfig ?
                
                
                model.HttpToolConfiguration.getJsonObj(obj.toolConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'HTTP_TOOL';
    export function getDeserializedJsonObj(obj: CreateAgentDiagramHttpToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as CreateAgentDiagramHttpToolNodeDetails, ...{
            


                    'toolConfig': obj.toolConfig ?
                
                
                model.HttpToolConfiguration.getDeserializedJsonObj(obj.toolConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
