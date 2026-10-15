// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

export interface ExportModelDeploymentInferencesResponse {
    /**
     * The key of the asynchronous operations associated with an AI Data Platform instance.
* Use GetAsyncOperation with this key to track the status of the request.
* 
     */
    'aidpAsyncOperationKey': string;
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     */
    'opcRequestId': string;
    /**
     * The destination the export will be written to. When the requested file already
* exists and is_overwrite is false, a non-colliding name is chosen by appending
* _copy before the extension, so this can differ from the requested volume_location.
* 
     */
    'aidpExportDestination': string;


}
