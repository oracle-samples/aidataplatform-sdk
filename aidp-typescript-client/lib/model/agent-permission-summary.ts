// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Information about a agent permission.
*/
export interface AgentPermissionSummary {
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
    * The selected permissions for a agent.
    */
    'granteePermissions': Array<AgentPermissionSummary.GranteePermissions>;
    /**
    * The list of the columns included for permission assignment.
    */
    'columns'?: Array<string>;
    /**
    * The list of the columns excluded from permission assignment.
    */
    'excludeColumns'?: Array<string>;
    /**
    * If the permission listed is inherited or not from object higher up in hierarchy.
    */
    'isInherited'?: boolean;
    /**
    * Name of the object to which this permission belong to. Name of agent if permission is not inherited or name of object higher up in hierarchy if permission is inherited.
    */
    'resourceName'?: string;

}

export namespace AgentPermissionSummary {




    export enum GranteePermissions {
    
    Read = "READ",
    Manage = "MANAGE",
    Admin = "ADMIN",
    Use = "USE",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}






    export function getJsonObj(obj: AgentPermissionSummary): object {
        const jsonObj = {...obj, ...{
            








        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AgentPermissionSummary): object {
        const jsonObj = {...obj, ...{
            








         }};

        
        
        return jsonObj;
    }
}
