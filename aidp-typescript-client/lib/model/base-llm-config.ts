// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Base Large Language Model configuration.
*/
export interface BaseLlmConfig {
    /**
    * The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool.
    */
    'modelId'?: string;
    /**
    * The compartment id of the Large Language Model (LLM) to use in the Agent or Tool
    */
    'compartmentId'?: string;
    /**
    * The endpoint URL of the Large Language Model (LLM) to use in the Agent or Tool
    */
    'endpointUrl'?: string;

   "type": string;
}

export namespace BaseLlmConfig {




    export function getJsonObj(obj: BaseLlmConfig): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "OCI_GEN_AI":
                    return model.LlmConfig.getJsonObj(<model.LlmConfig>(<object>jsonObj), true);
                case "THIRD_PARTY":
                    return model.ThirdPartyLlmConfig.getJsonObj(<model.ThirdPartyLlmConfig>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)

        }
        }
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: BaseLlmConfig): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "OCI_GEN_AI":
                    return model.LlmConfig.getDeserializedJsonObj(<model.LlmConfig>(<object>jsonObj), true);
                case "THIRD_PARTY":
                    return model.ThirdPartyLlmConfig.getDeserializedJsonObj(<model.ThirdPartyLlmConfig>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)
        }
        }
        return jsonObj;
    }
}
