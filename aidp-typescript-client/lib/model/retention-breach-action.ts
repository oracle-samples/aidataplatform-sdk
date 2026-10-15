// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Action taken when a session-message retention condition is breached.
**/
export enum RetentionBreachAction {
    DeleteFifo = "DELETE_FIFO",
    
    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownValue = "UNKNOWN_VALUE"
}

export namespace RetentionBreachAction {
    export function getJsonObj(obj: RetentionBreachAction): RetentionBreachAction {
        return obj;
    }
    export function getDeserializedJsonObj(obj: RetentionBreachAction): RetentionBreachAction {
        return obj;
    }
}

