// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result produced by a single rule during ontology validation.
*/
export interface OntologyValidationFinding {
    /**
    * Stable identifier of the validation rule that produced this finding.
    */
    'ruleId'?: string;
    /**
    * Outcome reported by the validation rule.
    */
    'status'?: string;
    /**
    * Importance level assigned to the validation finding.
    */
    'severity'?: string;
    /**
    * Human-readable explanation of the validation finding.
    */
    'message'?: string;

}

export namespace OntologyValidationFinding {





    export function getJsonObj(obj: OntologyValidationFinding): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyValidationFinding): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
