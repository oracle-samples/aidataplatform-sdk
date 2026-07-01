// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface UpdateOntologyProjectDetails {
    'key'?: string;
    'displayName'?: string;
    'description'?: string;
    'namespace'?: string;
    'workspaceBasePath'?: string;
    'lifecycleState'?: string;

}

export namespace UpdateOntologyProjectDetails {







    export function getJsonObj(obj: UpdateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
