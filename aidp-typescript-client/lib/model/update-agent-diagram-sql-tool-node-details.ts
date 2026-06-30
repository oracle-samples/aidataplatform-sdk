// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to update a SQL tool node.
*/
export interface UpdateAgentDiagramSqlToolNodeDetails extends model.UpdateAgentDiagramNodeDetails {
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };

   "type": string;
}

export namespace UpdateAgentDiagramSqlToolNodeDetails {


    export function getJsonObj(obj: UpdateAgentDiagramSqlToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getJsonObj(obj) as UpdateAgentDiagramSqlToolNodeDetails, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'SQL_TOOL';
    export function getDeserializedJsonObj(obj: UpdateAgentDiagramSqlToolNodeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.UpdateAgentDiagramNodeDetails.getDeserializedJsonObj(obj) as UpdateAgentDiagramSqlToolNodeDetails, ...{
            

         }};

        
        
        return jsonObj;
    }
}
