// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * @example Click {@link https://docs.oracle.com/en-us/iaas/tools/typescript-sdk-examples/latest/aidp/AccessGrantedFor.ts.html |here} to see how to use AccessGrantedForRequest.
 */
export interface AccessGrantedForRequest extends common.BaseRequest {
/**
 * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the AI Data Platform (Data Lake) instance.
 */
 'aiDataPlatformId': string;
/**
 * Ordered subject and resource checks.
 */
 'multiplePrincipalAccessGrantedDetails':  model.MultiplePrincipalAccessGrantedDetails;
/**
 * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* The only valid characters for request IDs are letters, numbers,
* underscore, and dash.
* 
 */
 'opcRequestId'?: string;
/**
 * Optional Base64-encoded serialized evaluation principal; not caller authentication.
 */
 'dhUserPrincipal'?: string;
}

