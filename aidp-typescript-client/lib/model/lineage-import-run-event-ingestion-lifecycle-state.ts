// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Graph-ingestion state for an imported lineage run event.
**/
export enum LineageImportRunEventIngestionLifecycleState {
    Pending = "PENDING",
    Succeeded = "SUCCEEDED",
    Failed = "FAILED"
    
}

export namespace LineageImportRunEventIngestionLifecycleState {
    export function getJsonObj(obj: LineageImportRunEventIngestionLifecycleState): LineageImportRunEventIngestionLifecycleState {
        return obj;
    }
    export function getDeserializedJsonObj(obj: LineageImportRunEventIngestionLifecycleState): LineageImportRunEventIngestionLifecycleState {
        return obj;
    }
}

