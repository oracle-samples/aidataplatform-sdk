// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for creating a folder under an ontology project root.
*/
export interface CreateOntologyFolderDetails {
    /**
    * Project-relative folder path.
    */
    'path': string;
    'description'?: string;

}

export namespace CreateOntologyFolderDetails {



    export function getJsonObj(obj: CreateOntologyFolderDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateOntologyFolderDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
