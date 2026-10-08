// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * @example Click {@link https://docs.oracle.com/en-us/iaas/tools/typescript-sdk-examples/latest/aidp/ListRegisteredModels.ts.html |here} to see how to use ListRegisteredModelsRequest.
 */
export interface ListRegisteredModelsRequest extends common.BaseRequest {
/**
 * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
 */
 'aiDataPlatformId': string;
/**
 * String filter condition, like \"name LIKE 'my-model-name'\". Interpreted in the backend 
* automatically as \"name LIKE '%my-model-name%'\". Single boolean condition, with string 
* values wrapped in single quotes.
* 
 */
 'filter'?: string;
/**
 * Maximum number of models desired. Default is 100. Max threshold is 1000.
 */
 'maxResults'?: number;
/**
 * Pagination token to go to the next page based on a previous search query.
 */
 'pageToken'?: string;
/**
 * List of columns for ordering search results, which can include model name and last updated 
* timestamp with an optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default. 
* Tiebreaks are done by model name ASC.
* 
 */
 'orderBy'?: string;
/**
 * Whether to include the per-model deployment_summary (total_deployment and active_deployment)
* in each returned registered model. The summary is omitted from a model when it cannot be
* resolved, so an absent summary means \"not requested or unavailable\" rather than zero.
* 
 */
 'isDeploymentSummaryEnabled'?: boolean;
/**
 * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
 */
 'opcRequestId'?: string;
}

