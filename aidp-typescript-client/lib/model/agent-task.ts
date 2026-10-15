// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The information about an Agent task that invokes an active PROD Agent deployment from a workflow. Resolved parameters whose names start with {@code sessionvariables.} are forwarded unchanged as A2A message metadata; Credential Store keys remain opaque to Workflow.
*/
export interface AgentTask extends model.Task {
    /**
    * Unique key of the deployed Agent or Multi-Agent System. At execution time, DataHub resolves this key to one active PROD deployment, fetches its Agent Card through a workload-authenticated internal route, and invokes the validated internal JSON-RPC URL advertised by the Card. AgentTask supports A2A protocol 0.3.x.
    */
    'agentKey': string;
    /**
    * Required user input text sent as an A2A user message part.
    */
    'prompt': string;
    /**
    * An optional list of parameters.
    */
    'parameters'?: Array<model.Parameter>;

   "type": string;
}

export namespace AgentTask {




    export function getJsonObj(obj: AgentTask, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Task.getJsonObj(obj) as AgentTask, ...{
            


                'parameters': obj.parameters ?
                
                obj.parameters.map((item)=>{return model.Parameter.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'AGENT_TASK';
    export function getDeserializedJsonObj(obj: AgentTask, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Task.getDeserializedJsonObj(obj) as AgentTask, ...{
            


                    'parameters': obj.parameters ?
                
                obj.parameters.map((item)=>{return model.Parameter.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
