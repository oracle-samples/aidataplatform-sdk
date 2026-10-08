// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Supported third-party Large Language Model provider values for ThirdPartyLlmConfig.provider.
**/
export enum ThirdPartyLlmProvider {
    Openai = "openai",
    Anthropic = "anthropic",
    Gemini = "gemini",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace ThirdPartyLlmProvider {
    export function getJsonObj(obj: ThirdPartyLlmProvider): ThirdPartyLlmProvider {
        return obj;
    }
    export function getDeserializedJsonObj(obj: ThirdPartyLlmProvider): ThirdPartyLlmProvider {
        return obj;
    }
}

