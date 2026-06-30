// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Context management configuration for controlling conversation history before model invocation, such as clearing older tool-use outputs to reduce context size. If present, context management is enabled; if omitted or null, disabled.
*/
export interface ContextManagementConfiguration {
    /**
    * Ordered context management rules. In v1, only CLEAR_TOOL_USES is supported.
    */
    'rules'?: Array<model.ContextManagementRule>;

}

export namespace ContextManagementConfiguration {


    export function getJsonObj(obj: ContextManagementConfiguration): object {
        const jsonObj = {...obj, ...{
            
                'rules': obj.rules ?
                
                obj.rules.map((item)=>{return model.ContextManagementRule.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ContextManagementConfiguration): object {
        const jsonObj = {...obj, ...{
            
                    'rules': obj.rules ?
                
                obj.rules.map((item)=>{return model.ContextManagementRule.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
