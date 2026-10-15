// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* One page of deployment log events.
*/
export interface DeploymentLogPage {
    /**
    * Log events for this page, newest first. May be empty while nextPageToken is set.
    */
    'items': Array<model.DeploymentLogSummary>;
    /**
    * Continuation token. Absent when the traversal is complete. An empty page with a token means the scan quota ended before matches were found; continue.
    */
    'nextPageToken'?: string;

}

export namespace DeploymentLogPage {



    export function getJsonObj(obj: DeploymentLogPage): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.DeploymentLogSummary.getJsonObj(item)})
                
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentLogPage): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.DeploymentLogSummary.getDeserializedJsonObj(item)})
                
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
