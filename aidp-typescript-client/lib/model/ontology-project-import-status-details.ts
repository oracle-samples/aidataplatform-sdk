// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Import-specific progress details for an ontology project import status.
*/
export interface OntologyProjectImportStatusDetails {
    /**
    * Total number of expanded Turtle files accepted for this import. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'totalFileCount'?: number;
    /**
    * Number of expanded Turtle files that have completed RDF parse processing. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'parsedFileCount'?: number;
    /**
    * Number of parsed Turtle files that have completed storage persistence. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'processedFileCount'?: number;
    /**
    * Import failure message when the status is IMPORT_FAILED.
    */
    'errorMessage'?: string;

}

export namespace OntologyProjectImportStatusDetails {





    export function getJsonObj(obj: OntologyProjectImportStatusDetails): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectImportStatusDetails): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
