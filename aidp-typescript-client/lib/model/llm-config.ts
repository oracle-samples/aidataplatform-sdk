// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* OCI Generative AI Large Language Model configuration.
*/
export interface LlmConfig extends model.BaseLlmConfig {
    /**
    * The OCI Generative AI provider name.
    */
    'provider'?: string;
    /**
    * The OCI Generative AI region ID.
    */
    'regionId'?: string;

   "type": string;
}

export namespace LlmConfig {



    export function getJsonObj(obj: LlmConfig, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.BaseLlmConfig.getJsonObj(obj) as LlmConfig, ...{
            


        }};

        
        
        return jsonObj;
    }
    export const type = 'OCI_GEN_AI';
    export function getDeserializedJsonObj(obj: LlmConfig, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.BaseLlmConfig.getDeserializedJsonObj(obj) as LlmConfig, ...{
            


         }};

        
        
        return jsonObj;
    }
}
