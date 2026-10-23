// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for replacing direct Ontology Manager permissions on a scope.
*/
export interface ManageOntologyManagerPermissionsDetails {
    'permissions': model.OntologyManagerPermissions;

}

export namespace ManageOntologyManagerPermissionsDetails {


    export function getJsonObj(obj: ManageOntologyManagerPermissionsDetails): object {
        const jsonObj = {...obj, ...{
            
                'permissions': obj.permissions ?
                
                
                model.OntologyManagerPermissions.getJsonObj(obj.permissions) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ManageOntologyManagerPermissionsDetails): object {
        const jsonObj = {...obj, ...{
            
                    'permissions': obj.permissions ?
                
                
                model.OntologyManagerPermissions.getDeserializedJsonObj(obj.permissions) : undefined,
         }};

        
        
        return jsonObj;
    }
}
