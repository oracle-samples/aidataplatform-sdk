// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Processing state of a lineage import.
**/
export enum LineageImportLifecycleState {
    Accepted = "ACCEPTED",
    InProgress = "IN_PROGRESS",
    Succeeded = "SUCCEEDED",
    CompletedWithError = "COMPLETED_WITH_ERROR",
    Failed = "FAILED",
    Deleting = "DELETING"
    
}

export namespace LineageImportLifecycleState {
    export function getJsonObj(obj: LineageImportLifecycleState): LineageImportLifecycleState {
        return obj;
    }
    export function getDeserializedJsonObj(obj: LineageImportLifecycleState): LineageImportLifecycleState {
        return obj;
    }
}

