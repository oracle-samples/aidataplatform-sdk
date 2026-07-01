// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The response object for getting the agent dependencies.
*/
export interface AgentDependency {
    /**
    * Agent key.
    */
    'agentKey': string;
    /**
    * Agent.
    */
    'type'?: string;
    /**
    * List of agent dependencies.
    */
    'dependencies'?: Array<model.AgentDependencyItem>;

}

export namespace AgentDependency {




    export function getJsonObj(obj: AgentDependency): object {
        const jsonObj = {...obj, ...{
            


                'dependencies': obj.dependencies ?
                
                obj.dependencies.map((item)=>{return model.AgentDependencyItem.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentDependency): object {
        const jsonObj = {...obj, ...{
            


                    'dependencies': obj.dependencies ?
                
                obj.dependencies.map((item)=>{return model.AgentDependencyItem.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
