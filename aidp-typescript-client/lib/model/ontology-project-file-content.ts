// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Text content for an ontology project source file.
*/
export interface OntologyProjectFileContent {
    'path': string;
    'content': string;
    'contentType'?: string;

}

export namespace OntologyProjectFileContent {




    export function getJsonObj(obj: OntologyProjectFileContent): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectFileContent): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
