// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to update a HTTP tool node.
*/
export interface UpdateAgentDiagramHttpToolNodeDetails extends model.UpdateAgentDiagramNodeDetails {
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };

   "type": string;
}

export namespace UpdateAgentDiagramHttpToolNodeDetails {


    export function getJsonObj(obj: UpdateAgentDiagramHttpToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getJsonObj(obj) as UpdateAgentDiagramHttpToolNodeDetails, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'HTTP_TOOL';
    export function getDeserializedJsonObj(obj: UpdateAgentDiagramHttpToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as UpdateAgentDiagramHttpToolNodeDetails, ...{
            

         }};

        
        
        return jsonObj;
    }
}
