// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The permissions revoked from assignees for a registered model.
*/
export interface RevokeRegisteredModelPermissionDetails {
    'assignees': model.PermissionAssignees;
    /**
    * The permissions revoked from the assignees.
    */
    'permissions': Array<RevokeRegisteredModelPermissionDetails.Permissions>;

}

export namespace RevokeRegisteredModelPermissionDetails {


    export enum Permissions {
    
    Read = "READ",
    Manage = "MANAGE",
    Admin = "ADMIN"

}


    export function getJsonObj(obj: RevokeRegisteredModelPermissionDetails): object {
        const jsonObj = {...obj, ...{
            
                'assignees': obj.assignees ?
                
                
                model.PermissionAssignees.getJsonObj(obj.assignees) : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: RevokeRegisteredModelPermissionDetails): object {
        const jsonObj = {...obj, ...{
            
                    'assignees': obj.assignees ?
                
                
                model.PermissionAssignees.getDeserializedJsonObj(obj.assignees) : undefined,

         }};

        
        
        return jsonObj;
    }
}
