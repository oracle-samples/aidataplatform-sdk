// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * @example Click {@link https://docs.oracle.com/en-us/iaas/tools/typescript-sdk-examples/latest/aidp/GetGitOperationState.ts.html |here} to see how to use GetGitOperationStateRequest.
 */
export interface GetGitOperationStateRequest extends common.BaseRequest {
/**
 * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
 */
 'aiDataPlatformId': string;
/**
 * The key of the Workspace
 */
 'workspaceKey': string;
/**
 * The opaque repository key, available as GitRepository.key or system:repoKey
* in the folder's JSON file-metadata HEAD response header when
* shouldIncludeMetadata=true. Distinct from the async operation resourceName.
* 
 */
 'gitRepositoryKey': string;
/**
 * Operation intent, such as PULL, PUSH, or DIFF_LIST, used to compute
* isAllowed. Does not execute the operation.
* 
 */
 'operationName'?: string;
/**
 * Expected branch name for the folder context.
 */
 'branchName'?: string;
/**
 * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
 */
 'opcRequestId'?: string;
}

