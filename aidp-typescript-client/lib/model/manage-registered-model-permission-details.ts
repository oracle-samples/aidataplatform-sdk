// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Information to grant or revoke permissions on a registered model's dedicated volume.
*/
export interface ManageRegisteredModelPermissionDetails {
    'assignRegisteredModelPermissionDetails'?: model.AssignRegisteredModelPermissionDetails;
    'revokeRegisteredModelPermissionDetails'?: model.RevokeRegisteredModelPermissionDetails;

}

export namespace ManageRegisteredModelPermissionDetails {



    export function getJsonObj(obj: ManageRegisteredModelPermissionDetails): object {
        const jsonObj = {...obj, ...{
            
                'assignRegisteredModelPermissionDetails': obj.assignRegisteredModelPermissionDetails ?
                
                
                model.AssignRegisteredModelPermissionDetails.getJsonObj(obj.assignRegisteredModelPermissionDetails) : undefined,
                'revokeRegisteredModelPermissionDetails': obj.revokeRegisteredModelPermissionDetails ?
                
                
                model.RevokeRegisteredModelPermissionDetails.getJsonObj(obj.revokeRegisteredModelPermissionDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ManageRegisteredModelPermissionDetails): object {
        const jsonObj = {...obj, ...{
            
                    'assignRegisteredModelPermissionDetails': obj.assignRegisteredModelPermissionDetails ?
                
                
                model.AssignRegisteredModelPermissionDetails.getDeserializedJsonObj(obj.assignRegisteredModelPermissionDetails) : undefined,
                    'revokeRegisteredModelPermissionDetails': obj.revokeRegisteredModelPermissionDetails ?
                
                
                model.RevokeRegisteredModelPermissionDetails.getDeserializedJsonObj(obj.revokeRegisteredModelPermissionDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
