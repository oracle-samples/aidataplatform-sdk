// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Folder or file under an ontology project root.
*/
export interface OntologyProjectObject {
    /**
    * Project-relative folder or file path.
    */
    'path': string;
    'name': string;
    /**
    * FOLDER or FILE.
    */
    'objectType': string;
    'contentType'?: string;
    'sizeInBytes'?: number;
    'timeUpdated'?: Date;

}

export namespace OntologyProjectObject {







    export function getJsonObj(obj: OntologyProjectObject): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectObject): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
