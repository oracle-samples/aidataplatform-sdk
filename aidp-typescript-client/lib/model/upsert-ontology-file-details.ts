// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for creating or replacing an ontology source file.
*/
export interface UpsertOntologyFileDetails {
    /**
    * Project-relative file path. Allowed source files use .ttl or .swrl; root project metadata must be project.yaml.
    */
    'path': string;
    /**
    * Text content for the ontology source file.
    */
    'content': string;
    /**
    * Optional content type. OMS infers one from the file extension when omitted.
    */
    'contentType'?: string;

}

export namespace UpsertOntologyFileDetails {




    export function getJsonObj(obj: UpsertOntologyFileDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpsertOntologyFileDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
