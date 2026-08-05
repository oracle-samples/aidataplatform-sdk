// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Google BigQuery external catalog connection property keys.
**/
export enum GoogleBigqueryExternalCatalogConnectionPropertyKey {
    GoogleBigqueryHost = "GOOGLE_BIGQUERY_HOST",
    GoogleBigqueryPort = "GOOGLE_BIGQUERY_PORT",
    GoogleBigqueryProjectId = "GOOGLE_BIGQUERY_PROJECT_ID",
    GoogleBigqueryOauthType = "GOOGLE_BIGQUERY_OAUTH_TYPE",
    GoogleBigqueryOauthServiceAcctEmail = "GOOGLE_BIGQUERY_OAUTH_SERVICE_ACCT_EMAIL",
    GoogleBigqueryOauthPvtKey = "GOOGLE_BIGQUERY_OAUTH_PVT_KEY"
    
}

export namespace GoogleBigqueryExternalCatalogConnectionPropertyKey {
    export function getJsonObj(obj: GoogleBigqueryExternalCatalogConnectionPropertyKey): GoogleBigqueryExternalCatalogConnectionPropertyKey {
        return obj;
    }
    export function getDeserializedJsonObj(obj: GoogleBigqueryExternalCatalogConnectionPropertyKey): GoogleBigqueryExternalCatalogConnectionPropertyKey {
        return obj;
    }
}

