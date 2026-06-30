// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Agent dependency items.
*/
export interface AgentDependencyItem {
    /**
    * AICompute or file.
    */
    'type'?: string;
    /**
    * AICompute key.
    */
    'key'?: string;
    /**
    * Location of file/folders.
    */
    'location'?: string;

}

export namespace AgentDependencyItem {




    export function getJsonObj(obj: AgentDependencyItem): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentDependencyItem): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
