// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Credential Store reference for the ATP connection used by ontology publish.
*/
export interface OntologyPublishTargetConnectionReference {
    /**
    * Credential Store key containing the target ATP connection secret pairs.
    */
    'credentialKey': string;
    /**
    * Credential Store namespace. Defaults to {@code default} when omitted.
    */
    'namespace'?: string;
    /**
    * Target ATP schema for generated ontology objects. Overrides the credential schema secret when supplied.
    */
    'schema'?: string;

}

export namespace OntologyPublishTargetConnectionReference {




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
