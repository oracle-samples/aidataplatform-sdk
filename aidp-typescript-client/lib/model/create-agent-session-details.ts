// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details required to create a new session of an agent.
*/
export interface CreateAgentSessionDetails {
    /**
    * Display name.
    */
    'displayName'?: string;
    /**
    * The unique identifier (UUID) of the agent.
    */
    'agentKey': string;
    'context'?: model.AgentSessionContext;

}

export namespace CreateAgentSessionDetails {




    export function getJsonObj(obj: CreateAgentSessionDetails): object {
        const jsonObj = {...obj, ...{
            


                'context': obj.context ?
                
                
                model.AgentSessionContext.getJsonObj(obj.context) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateAgentSessionDetails): object {
        const jsonObj = {...obj, ...{
            


                    'context': obj.context ?
                
                
                model.AgentSessionContext.getDeserializedJsonObj(obj.context) : undefined,
         }};

        
        
        return jsonObj;
    }
}
