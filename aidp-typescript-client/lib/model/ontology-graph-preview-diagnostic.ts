// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Parser or preview diagnostic.
*/
export interface OntologyGraphPreviewDiagnostic {
    'severity': string;
    'message': string;
    'line'?: number;
    'column'?: number;

}

export namespace OntologyGraphPreviewDiagnostic {





    export function getJsonObj(obj: OntologyGraphPreviewDiagnostic): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreviewDiagnostic): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
