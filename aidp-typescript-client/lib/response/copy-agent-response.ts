// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

export interface CopyAgentResponse {
    /**
     * URL for the created agent. The agent key is generated after this request is sent.
     */
    'location': string;
    /**
     * Same as location.
     */
    'contentLocation': string;
    /**
     * For optimistic concurrency control. See {@code if-match}.
* 
     */
    'etag': string;
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     */
    'opcRequestId': string;
    /**
     * The returned model.Agent instance.
     */
    'agent': model.Agent;

}
