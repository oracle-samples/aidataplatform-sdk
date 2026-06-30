// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A SQL tool node in an agent.
*/
export interface AgentDiagramSqlToolNode extends model.AgentDiagramNode {
    /**
    * The list of properties in the inputSchema, along with the default value and description of each property.
    */
    'inputSchema'?: { [key: string]: any; };

   "type": string;
}

export namespace AgentDiagramSqlToolNode {


    export function getJsonObj(obj: AgentDiagramSqlToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getJsonObj(obj) as AgentDiagramSqlToolNode, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'SQL_TOOL';
    export function getDeserializedJsonObj(obj: AgentDiagramSqlToolNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getDeserializedJsonObj(obj) as AgentDiagramSqlToolNode, ...{
            

         }};

        
        
        return jsonObj;
    }
}
