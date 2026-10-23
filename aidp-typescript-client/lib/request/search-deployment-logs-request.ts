// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * @example Click {@link https://docs.oracle.com/en-us/iaas/tools/typescript-sdk-examples/latest/aidp/SearchDeploymentLogs.ts.html |here} to see how to use SearchDeploymentLogsRequest.
 */
export interface SearchDeploymentLogsRequest extends common.BaseRequest {
/**
 * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
 */
 'aiDataPlatformId': string;
/**
 * The unique 32-character hexadecimal ID of the model deployment.
 */
 'deploymentId': string;
/**
 * Window, filters, and pagination for the log search.
 */
 'searchDeploymentLogsDetails':  model.SearchDeploymentLogsDetails;
/**
 * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
 */
 'opcRequestId'?: string;
}

