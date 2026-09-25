// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Credential Store or external catalog reference for the ATP/ADW connection used by ontology publish.
* Provide {@code type} and {@code key}. Legacy {@code credentialKey} and {@code catalogKey} payloads are also accepted.
* {@code namespace} is valid only with Credential Store targets.
* 
*/
export interface OntologyPublishTargetConnectionReference {
    /**
    * Target connection reference type. Required when {@code key} is supplied.
    */
    'type'?: OntologyPublishTargetConnectionReference.Type;
    /**
    * Credential Store key or ADW external catalog key. Required when {@code type} is supplied.
    */
    'key'?: string;
    /**
    * Deprecated. Credential Store key containing the target ATP/ADW connection secret pairs.
    */
    'credentialKey'?: string;
    /**
    * Deprecated. ADW external catalog key whose decrypted connection properties should be used as the ontology publish target.
    */
    'catalogKey'?: string;
    /**
    * Credential Store namespace. Defaults to {@code default} when omitted for Credential Store targets; not used with external catalog targets.
    */
    'namespace'?: string;
    /**
    * Target ATP schema for generated ontology objects. Overrides the credential schema secret when supplied.
    */
    'schema'?: string;

}

export namespace OntologyPublishTargetConnectionReference {

    export enum Type {
    
    CredentialStore = "CREDENTIAL_STORE",
    ExternalCatalog = "EXTERNAL_CATALOG"

}







    export function getJsonObj(obj: OntologyPublishTargetConnectionReference): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyPublishTargetConnectionReference): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
