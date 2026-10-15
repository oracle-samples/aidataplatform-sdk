// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A normalized permission grantee. Exactly one of u, g, or r identifies the user, group, or role without the compact prefix; the other principal keys are omitted rather than returned with null values. d indexes the collection-level display-name map.
*/
export interface OntologyManagerPermissionGrant {
    /**
    * User OCID when this grant targets a user.
    */
    'u'?: string;
    /**
    * Group OCID when this grant targets a group.
    */
    'g'?: string;
    /**
    * Role identifier when this grant targets a role.
    */
    'r'?: string;
    /**
    * One-based index into the collection-level display-name map. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'd': number;

}

export namespace OntologyManagerPermissionGrant {





    export function getJsonObj(obj: OntologyManagerPermissionGrant): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyManagerPermissionGrant): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
