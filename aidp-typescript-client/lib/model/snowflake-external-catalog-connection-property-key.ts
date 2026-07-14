// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Snowflake external catalog connection property keys.
**/
export enum SnowflakeExternalCatalogConnectionPropertyKey {
    SnowflakeHost = "SNOWFLAKE_HOST",
    SnowflakePort = "SNOWFLAKE_PORT",
    SnowflakeUsername = "SNOWFLAKE_USERNAME",
    SnowflakePassword = "SNOWFLAKE_PASSWORD",
    SnowflakeDatabaseName = "SNOWFLAKE_DATABASE_NAME",
    SnowflakeWarehouse = "SNOWFLAKE_WAREHOUSE",
    SnowflakeRole = "SNOWFLAKE_ROLE",
    SnowflakeAuthenticationMethod = "SNOWFLAKE_AUTHENTICATION_METHOD",
    SnowflakePrivateKeyFile = "SNOWFLAKE_PRIVATE_KEY_FILE",
    SnowflakePrivateKeyContent = "SNOWFLAKE_PRIVATE_KEY_CONTENT",
    SnowflakePrivateKeyPassphrase = "SNOWFLAKE_PRIVATE_KEY_PASSPHRASE"
    
}

export namespace SnowflakeExternalCatalogConnectionPropertyKey {
    export function getJsonObj(obj: SnowflakeExternalCatalogConnectionPropertyKey): SnowflakeExternalCatalogConnectionPropertyKey {
        return obj;
    }
    export function getDeserializedJsonObj(obj: SnowflakeExternalCatalogConnectionPropertyKey): SnowflakeExternalCatalogConnectionPropertyKey {
        return obj;
    }
}

