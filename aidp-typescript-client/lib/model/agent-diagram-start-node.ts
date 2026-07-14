// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A starting point in an agent.
*/
export interface AgentDiagramStartNode extends model.AgentDiagramNode {
    /**
    * Extra configuration for the start node.
    */
    'startNodeConfig'?: { [key: string]: string; };

   "type": string;
}

export namespace AgentDiagramStartNode {


    export function getJsonObj(obj: AgentDiagramStartNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getJsonObj(obj) as AgentDiagramStartNode, ...{
            

        }};

        
        
        return jsonObj;
    }
    export const type = 'START_NODE';
    export function getDeserializedJsonObj(obj: AgentDiagramStartNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getDeserializedJsonObj(obj) as AgentDiagramStartNode, ...{
            

         }};

        
        
        return jsonObj;
    }
}
