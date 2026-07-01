// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Agent session context.
*/
export interface AgentSessionContext {
    'retentionConfig'?: model.SessionRetentionConfiguration;

}

export namespace AgentSessionContext {


    export function getJsonObj(obj: AgentSessionContext): object {
        const jsonObj = {...obj, ...{
            
                'retentionConfig': obj.retentionConfig ?
                
                
                model.SessionRetentionConfiguration.getJsonObj(obj.retentionConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentSessionContext): object {
        const jsonObj = {...obj, ...{
            
                    'retentionConfig': obj.retentionConfig ?
                
                
                model.SessionRetentionConfiguration.getDeserializedJsonObj(obj.retentionConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
