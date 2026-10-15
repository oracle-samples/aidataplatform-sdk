// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Compact Ontology Manager permission buckets. Principal identifiers are prefixed u: for a user, g: for a group and r: for a role.
*/
export interface OntologyManagerPermissions {
    /**
    * Principals with read access.
    */
    'r'?: Array<string>;
    /**
    * Principals with use or execute access.
    */
    'u'?: Array<string>;
    /**
    * Principals with manage access.
    */
    'm'?: Array<string>;
    /**
    * Principals with admin access, including permission management.
    */
    'a'?: Array<string>;

}

export namespace OntologyManagerPermissions {





    export function getJsonObj(obj: OntologyManagerPermissions): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyManagerPermissions): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
