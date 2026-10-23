// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * @example Click {@link https://docs.oracle.com/en-us/iaas/tools/typescript-sdk-examples/latest/aidp/GetGitDiffDetail.ts.html |here} to see how to use GetGitDiffDetailRequest.
 */
export interface GetGitDiffDetailRequest extends common.BaseRequest {
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
 * Workspace path of the Git folder, distinct from repository-relative file paths.
 */
 'gitFolderPath': string;
/**
 * Expected branch name for the folder context.
 */
 'branchName': string;
/**
 * File path relative to repository root.
 */
 'gitFilePath': string;
/**
 * Requested diff context lines. Current execution does not apply this value.
* 
 */
 'contextLines'?: number;
/**
 * Requested maximum patch bytes. Current execution does not enforce this
* value.
* 
 */
 'maxPatchBytes'?: number;
/**
 * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
 */
 'opcRequestId'?: string;
}

