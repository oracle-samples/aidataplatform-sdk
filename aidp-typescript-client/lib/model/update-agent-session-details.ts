// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details required to update a new session of an agent.
*/
export interface UpdateAgentSessionDetails {
    /**
    * Display name.
    */
    'displayName'?: string;
    /**
    * The date and time the session was started.
    */
    'timeStarted'?: Date;
    /**
    * The date and time the session was ended.
    */
    'timeEnded'?: Date;
    'context'?: model.AgentSessionContext;

}

export namespace UpdateAgentSessionDetails {





    export function getJsonObj(obj: UpdateAgentSessionDetails): object {
        const jsonObj = {...obj, ...{
            



                'context': obj.context ?
                
                
                model.AgentSessionContext.getJsonObj(obj.context) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateAgentSessionDetails): object {
        const jsonObj = {...obj, ...{
            



                    'context': obj.context ?
                
                
                model.AgentSessionContext.getDeserializedJsonObj(obj.context) : undefined,
         }};

        
        
        return jsonObj;
    }
}
