// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Information about a registered model permission grant.
*/
export interface RegisteredModelPermissionSummary {
    /**
    * The OCID of user/group and name in case of role.
    */
    'grantee': string;
    /**
    * The simplified name of the grantee.
    */
    'granteeName'?: string;
    /**
    * The type of grantee.
    */
    'granteeType': model.GranteeType;
    /**
    * The permission tiers granted on the registered model.
    */
    'granteePermissions': Array<RegisteredModelPermissionSummary.GranteePermissions>;
    /**
    * Whether the permission is inherited from an object higher in the hierarchy (e.g. a catalog/schema/platform admin) rather than granted directly on the model.
    */
    'isInherited'?: boolean;
    /**
    * The model this permission applies to (<catalog>.<schema>.<model>) for a direct grant, or the ancestor object's name if the grant is inherited.
    */
    'resourceName'?: string;

}

export namespace RegisteredModelPermissionSummary {




    export enum GranteePermissions {
    
    Read = "READ",
    Manage = "MANAGE",
    Admin = "ADMIN",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}




    export function getJsonObj(obj: RegisteredModelPermissionSummary): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: RegisteredModelPermissionSummary): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
