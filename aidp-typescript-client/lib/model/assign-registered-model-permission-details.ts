// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The permissions assigned on the registered model to assignees.
*/
export interface AssignRegisteredModelPermissionDetails {
    'assignees': model.PermissionAssignees;
    /**
    * The permissions assigned to the assignees.
    */
    'permissions': Array<AssignRegisteredModelPermissionDetails.Permissions>;

}

export namespace AssignRegisteredModelPermissionDetails {


    export enum Permissions {
    
    Read = "READ",
    Manage = "MANAGE",
    Admin = "ADMIN"

}


    export function getJsonObj(obj: AssignRegisteredModelPermissionDetails): object {
        const jsonObj = {...obj, ...{
            
                'assignees': obj.assignees ?
                
                
                model.PermissionAssignees.getJsonObj(obj.assignees) : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AssignRegisteredModelPermissionDetails): object {
        const jsonObj = {...obj, ...{
            
                    'assignees': obj.assignees ?
                
                
                model.PermissionAssignees.getDeserializedJsonObj(obj.assignees) : undefined,

         }};

        
        
        return jsonObj;
    }
}
