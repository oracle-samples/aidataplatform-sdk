// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details to copy the agent to target workspace.
*/
export interface CopyAgentDetails {
    /**
    * Agent name.
    */
    'targetDisplayName'?: string;
    /**
    * Agent description.
    */
    'targetDescription'?: string;
    /**
    * Path inside volume where the agent JSON is written.
    */
    'targetPathInfo': string;
    /**
    * Key of the target workspace where the agent is copied.
    */
    'targetWorkspaceKey': string;

}

export namespace CopyAgentDetails {





    export function getJsonObj(obj: CopyAgentDetails): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CopyAgentDetails): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
