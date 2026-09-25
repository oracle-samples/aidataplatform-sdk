// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Third-party/BYO Large Language Model configuration.
*/
export interface ThirdPartyLlmConfig extends model.BaseLlmConfig {
    /**
    * The third-party provider wire value; currently openai, anthropic, or gemini.
    */
    'provider': model.ThirdPartyLlmProvider;
    'apiKeyCredstoreRef': model.CredentialV2NameAndSecretKey;
    'llmConnectionSettings'?: model.LlmConnectionSettings;

   "type": string;
}

export namespace ThirdPartyLlmConfig {




    export function getJsonObj(obj: ThirdPartyLlmConfig, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.BaseLlmConfig.getJsonObj(obj) as ThirdPartyLlmConfig, ...{
            

                'apiKeyCredstoreRef': obj.apiKeyCredstoreRef ?
                
                
                model.CredentialV2NameAndSecretKey.getJsonObj(obj.apiKeyCredstoreRef) : undefined,
                'llmConnectionSettings': obj.llmConnectionSettings ?
                
                
                model.LlmConnectionSettings.getJsonObj(obj.llmConnectionSettings) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'THIRD_PARTY';
    export function getDeserializedJsonObj(obj: ThirdPartyLlmConfig, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.BaseLlmConfig.getDeserializedJsonObj(obj) as ThirdPartyLlmConfig, ...{
            

                    'apiKeyCredstoreRef': obj.apiKeyCredstoreRef ?
                
                
                model.CredentialV2NameAndSecretKey.getDeserializedJsonObj(obj.apiKeyCredstoreRef) : undefined,
                    'llmConnectionSettings': obj.llmConnectionSettings ?
                
                
                model.LlmConnectionSettings.getDeserializedJsonObj(obj.llmConnectionSettings) : undefined,
         }};

        
        
        return jsonObj;
    }
}
