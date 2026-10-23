// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for adding direct Ontology Manager project permissions.
*/
export interface PatchOntologyProjectPermissionsDetails {
    'permissions': model.OntologyManagerPermissions;

}

export namespace PatchOntologyProjectPermissionsDetails {


    export function getJsonObj(obj: PatchOntologyProjectPermissionsDetails): object {
        const jsonObj = {...obj, ...{
            
                'permissions': obj.permissions ?
                
                
                model.OntologyManagerPermissions.getJsonObj(obj.permissions) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PatchOntologyProjectPermissionsDetails): object {
        const jsonObj = {...obj, ...{
            
                    'permissions': obj.permissions ?
                
                
                model.OntologyManagerPermissions.getDeserializedJsonObj(obj.permissions) : undefined,
         }};

        
        
        return jsonObj;
    }
}
