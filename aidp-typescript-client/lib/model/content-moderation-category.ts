// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Content moderation categories.
**/
export enum ContentModerationCategory {
    HateSpeech = "HATE_SPEECH",
    Harassment = "HARASSMENT",
    Violence = "VIOLENCE",
    Sexual = "SEXUAL",
    Derogatory = "DEROGATORY",
    Toxic = "TOXIC",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace ContentModerationCategory {
    export function getJsonObj(obj: ContentModerationCategory): ContentModerationCategory {
        return obj;
    }
    export function getDeserializedJsonObj(obj: ContentModerationCategory): ContentModerationCategory {
        return obj;
    }
}

