// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Information to update permissions on a agent.
*/
export interface ManageAgentPermissionDetails {
    'assignAgentPermissionDetails'?: model.AssignAgentPermissionDetails;
    'revokeAgentPermissionDetails'?: model.RevokeAgentPermissionDetails;

}

export namespace ManageAgentPermissionDetails {



    export function getJsonObj(obj: ManageAgentPermissionDetails): object {
        const jsonObj = {...obj, ...{
            
                'assignAgentPermissionDetails': obj.assignAgentPermissionDetails ?
                
                
                model.AssignAgentPermissionDetails.getJsonObj(obj.assignAgentPermissionDetails) : undefined,
                'revokeAgentPermissionDetails': obj.revokeAgentPermissionDetails ?
                
                
                model.RevokeAgentPermissionDetails.getJsonObj(obj.revokeAgentPermissionDetails) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ManageAgentPermissionDetails): object {
        const jsonObj = {...obj, ...{
            
                    'assignAgentPermissionDetails': obj.assignAgentPermissionDetails ?
                
                
                model.AssignAgentPermissionDetails.getDeserializedJsonObj(obj.assignAgentPermissionDetails) : undefined,
                    'revokeAgentPermissionDetails': obj.revokeAgentPermissionDetails ?
                
                
                model.RevokeAgentPermissionDetails.getDeserializedJsonObj(obj.revokeAgentPermissionDetails) : undefined,
         }};

        
        
        return jsonObj;
    }
}
