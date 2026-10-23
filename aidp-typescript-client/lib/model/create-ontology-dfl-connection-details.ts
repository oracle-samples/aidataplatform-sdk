// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request to register (upsert) a DFL connection. {@code sourceType} selects how Ontology Manager
* obtains the connection's coordinates and credentials. For the resolved source types it reads
* them under the caller's identity and this body carries no secrets.
* 
*/
export interface CreateOntologyDflConnectionDetails {
    /**
    * CATALOG_CONNECTION resolves an AIDP external ADW catalog by {@code key}; CRED_STORE resolves a
* Credential Store entry by {@code key}; INLINE registers the {@code uri}, {@code kind} and {@code properties} in
* this request.
* 
    */
    'sourceType': model.OntologyDflConnectionSourceType;
    /**
    * Catalog key or Credential Store key. Required unless {@code sourceType} is INLINE.
    */
    'key'?: string;
    /**
    * Credential Store namespace. CRED_STORE only; defaults to {@code default}.
    */
    'namespace'?: string;
    /**
    * DFL connection URI to register, for example {@code duckdb://analytics}. Required for INLINE;
* for the resolved source types it defaults to {@code oracle://<key>}, and supplying it registers
* the resolved connection under a second URI.
* 
    */
    'uri'?: string;
    /**
    * DFL connection kind ({@code duckdb}, {@code jdbc}, ...). INLINE only; resolved source types are always {@code jdbc}.
    */
    'kind'?: string;
    /**
    * DFL per-kind connection properties. INLINE only; the {@code type} property DFL requires is
* derived from {@code kind} when absent. May carry secrets; excluded from audit events.
* 
    */
    'properties'?: { [key: string]: string; };
    /**
    * Merged last over the resolved properties, for what the source does not carry such as a
* {@code wallet_path}. Not valid for INLINE. May carry secrets; excluded from audit events.
* 
    */
    'propertyOverrides'?: { [key: string]: string; };

}

export namespace CreateOntologyDflConnectionDetails {








    export function getJsonObj(obj: CreateOntologyDflConnectionDetails): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateOntologyDflConnectionDetails): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
