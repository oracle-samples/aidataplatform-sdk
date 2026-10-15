// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Where a DFL connection's coordinates and credentials come from.
**/
export enum OntologyDflConnectionSourceType {
    CatalogConnection = "CATALOG_CONNECTION",
    CredStore = "CRED_STORE",
    Inline = "INLINE"
    
}

export namespace OntologyDflConnectionSourceType {
    export function getJsonObj(obj: OntologyDflConnectionSourceType): OntologyDflConnectionSourceType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: OntologyDflConnectionSourceType): OntologyDflConnectionSourceType {
        return obj;
    }
}

