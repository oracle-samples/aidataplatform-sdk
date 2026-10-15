// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Direct permission grants on an Ontology Manager scope.
*/
export interface OntologyManagerPermissionCollection {
    'permissions': model.OntologyManagerReadPermissions;
    /**
    * One-based display-name map referenced by each grant's d field. Indices are deterministic only within this response.
    */
    'd': { [key: string]: string; };

}

export namespace OntologyManagerPermissionCollection {



    export function getJsonObj(obj: OntologyManagerPermissionCollection): object {
        const jsonObj = {...obj, ...{
            
                'permissions': obj.permissions ?
                
                
                model.OntologyManagerReadPermissions.getJsonObj(obj.permissions) : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyManagerPermissionCollection): object {
        const jsonObj = {...obj, ...{
            
                    'permissions': obj.permissions ?
                
                
                model.OntologyManagerReadPermissions.getDeserializedJsonObj(obj.permissions) : undefined,

         }};

        
        
        return jsonObj;
    }
}
