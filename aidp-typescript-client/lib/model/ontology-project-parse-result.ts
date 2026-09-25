// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result of parsing every Turtle source file in an ontology project through Apache Jena.
*/
export interface OntologyProjectParseResult {
    /**
    * Whether all project Turtle files parsed without Jena errors.
    */
    'isSuccessful': boolean;
    /**
    * Parse status.
    */
    'status': string;
    /**
    * Project content revision hash used for the parsed dataset.
    */
    'revision'?: string;
    /**
    * Aggregate size of parsed Turtle content in bytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'sizeBytes'?: number;
    /**
    * Number of Turtle files parsed. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'parsedFileCount': number;
    /**
    * Project-relative Turtle source paths parsed into named graphs.
    */
    'sourcePaths': Array<string>;
    /**
    * Parser diagnostics returned by Apache Jena.
    */
    'diagnostics'?: Array<model.OntologyGraphPreviewDiagnostic>;

}

export namespace OntologyProjectParseResult {








    export function getJsonObj(obj: OntologyProjectParseResult): object {
        const jsonObj = {...obj, ...{
            






                'diagnostics': obj.diagnostics ?
                
                obj.diagnostics.map((item)=>{return model.OntologyGraphPreviewDiagnostic.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectParseResult): object {
        const jsonObj = {...obj, ...{
            






                    'diagnostics': obj.diagnostics ?
                
                obj.diagnostics.map((item)=>{return model.OntologyGraphPreviewDiagnostic.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
