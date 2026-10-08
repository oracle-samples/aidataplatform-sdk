// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Source file metadata for a design-time ontology graph preview.
*/
export interface OntologyGraphPreviewFile {
    /**
    * Project-relative file path.
    */
    'path': string;
    /**
    * File size in bytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'sizeBytes'?: number;
    /**
    * File etag used for cache invalidation.
    */
    'etag'?: string;
    /**
    * File revision used for cache invalidation.
    */
    'revision'?: string;

}

export namespace OntologyGraphPreviewFile {





    export function getJsonObj(obj: OntologyGraphPreviewFile): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphPreviewFile): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
