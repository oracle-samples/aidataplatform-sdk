// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result of listing Guardrails available for configuration.
*/
export interface AgentGuardrailsCollection {
    /**
    * List of safety policies available to configure in this guardrails.
    */
    'items': Array<model.AgentGuardrailsSummary>;

}

export namespace AgentGuardrailsCollection {


    export function getJsonObj(obj: AgentGuardrailsCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.AgentGuardrailsSummary.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentGuardrailsCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.AgentGuardrailsSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
