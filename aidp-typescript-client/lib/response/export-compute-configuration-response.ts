// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");
import stream = require("stream");

export interface ExportComputeConfigurationResponse {
    /**
     * URL for the created workspace object.
     */
    'location': string;
    /**
     * Same as location.
     */
    'contentLocation': string;
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
* Oracle about a particular request, please provide the request ID.
* 
     */
    'opcRequestId': string;
    /**
     * Full path of the YAML workspace object.
     */
    'path': string;
    /**
     * Workspace object type.
     */
    'type': string;
    /**
     * Date and time when the YAML workspace object was created.
     */
    'timeUpdated': Date;
    /**
     * The returned stream.Readable | ReadableStream instance.
     */
    'value': stream.Readable | ReadableStream;

}
