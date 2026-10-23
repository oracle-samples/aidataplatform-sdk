// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for revoking direct Ontology Manager project permissions.
*/
export interface RevokeOntologyProjectPermissionsDetails {
    'permissions': model.OntologyManagerPermissions;

}

export namespace RevokeOntologyProjectPermissionsDetails {


    export function getJsonObj(obj: RevokeOntologyProjectPermissionsDetails): object {
        const jsonObj = {...obj, ...{
            
                'permissions': obj.permissions ?
                
                
                model.OntologyManagerPermissions.getJsonObj(obj.permissions) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: RevokeOntologyProjectPermissionsDetails): object {
        const jsonObj = {...obj, ...{
            
                    'permissions': obj.permissions ?
                
                
                model.OntologyManagerPermissions.getDeserializedJsonObj(obj.permissions) : undefined,
         }};

        
        
        return jsonObj;
    }
}
