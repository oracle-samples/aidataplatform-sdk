// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface CreateOntologyProjectDetails {
    'workspaceId': string;
    'key': string;
    'displayName': string;
    'description'?: string;
    'namespace'?: string;
    'workspaceBasePath'?: string;

}

export namespace CreateOntologyProjectDetails {







    export function getJsonObj(obj: CreateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
