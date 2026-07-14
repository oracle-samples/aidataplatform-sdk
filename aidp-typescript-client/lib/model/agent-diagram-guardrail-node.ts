// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A node used to run guardrails on input in the agent.
*/
export interface AgentDiagramGuardrailNode extends model.AgentDiagramNode {
    /**
    * A reference by key value to a guardrails configuration stored in the guardrails map in the agent diagram.
    */
    'guardrailsConfigKey'?: string;
    /**
    * Extra configuration for the guardrails node.
    */
    'extraGuardrailsConfig'?: { [key: string]: string; };

   "type": string;
}

export namespace AgentDiagramGuardrailNode {



    export function getJsonObj(obj: AgentDiagramGuardrailNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getJsonObj(obj) as AgentDiagramGuardrailNode, ...{
            


        }};

        
        
        return jsonObj;
    }
    export const type = 'GUARDRAILS';
    export function getDeserializedJsonObj(obj: AgentDiagramGuardrailNode, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.AgentDiagramNode.getDeserializedJsonObj(obj) as AgentDiagramGuardrailNode, ...{
            


         }};

        
        
        return jsonObj;
    }
}
