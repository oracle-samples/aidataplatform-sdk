// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Configuration for Oracle Agent Memory long-term memory. When enabled, llmConfig selects the OCI Generative AI model used for memory extraction and summarization.
*/
export interface LongTermMemoryConfiguration {
    /**
    * UI-only authoring state for long-term memory. It is not sent to the deployed runtime.
    */
    'isEnabled'?: boolean;
    /**
    * Whether long-term-memory retrieval can use memories saved in other chat threads for the same user and Agent Flow.
    */
    'shareBetweenChatThreads'?: boolean;
    'llmConfig'?: model.LlmConfig;

}

export namespace LongTermMemoryConfiguration {




    export function getJsonObj(obj: LongTermMemoryConfiguration): object {
        const jsonObj = {...obj, ...{
            


                'llmConfig': obj.llmConfig ?
                
                
                model.LlmConfig.getJsonObj(obj.llmConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LongTermMemoryConfiguration): object {
        const jsonObj = {...obj, ...{
            


                    'llmConfig': obj.llmConfig ?
                
                
                model.LlmConfig.getDeserializedJsonObj(obj.llmConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
