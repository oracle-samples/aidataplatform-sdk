// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result returned by OT SDK project.validate for an ontology project.
*/
export interface OntologyProjectValidationResult {
    /**
    * Ontology Manager project identifier that was validated.
    */
    'projectId': string;
    /**
    * Whether OT SDK validation accepted the project.
    */
    'valid': boolean;
    /**
    * OT SDK operation name.
    */
    'operation'?: string;
    /**
    * JSON validation result or error details returned by OT SDK.
    */
    'validationReport'?: string;
    /**
    * OT SDK validation error code when validation fails.
    */
    'errorCode'?: string;
    /**
    * OT SDK validation error message when validation fails.
    */
    'errorMessage'?: string;

}

export namespace OntologyProjectValidationResult {







    export function getJsonObj(obj: OntologyProjectValidationResult): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectValidationResult): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
