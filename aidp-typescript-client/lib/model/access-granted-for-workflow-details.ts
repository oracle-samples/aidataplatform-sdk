// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy Workflow resource details.
*/
export interface AccessGrantedForWorkflowDetails {
    /**
    * Lakeproxy datalakeId.
    */
    'datalakeId': string;
    /**
    * Lakeproxy workspaceId.
    */
    'workspaceId': string;
    /**
    * Lakeproxy workflowId.
    */
    'workflowId': string;

}

export namespace AccessGrantedForWorkflowDetails {




    export function getJsonObj(obj: AccessGrantedForWorkflowDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForWorkflowDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
