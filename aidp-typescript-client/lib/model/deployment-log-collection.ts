// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result of searching deployment lifecycle logs.
*/
export interface DeploymentLogCollection {
    /**
    * The model deployment the logs belong to.
    */
    'deploymentId': string;
    'logs': model.DeploymentLogPage;
    'query': model.DeploymentLogQueryEcho;
    'coverage': model.DeploymentLogCoverage;

}

export namespace DeploymentLogCollection {





    export function getJsonObj(obj: DeploymentLogCollection): object {
        const jsonObj = {...obj, ...{
            

                'logs': obj.logs ?
                
                
                model.DeploymentLogPage.getJsonObj(obj.logs) : undefined,
                'query': obj.query ?
                
                
                model.DeploymentLogQueryEcho.getJsonObj(obj.query) : undefined,
                'coverage': obj.coverage ?
                
                
                model.DeploymentLogCoverage.getJsonObj(obj.coverage) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentLogCollection): object {
        const jsonObj = {...obj, ...{
            

                    'logs': obj.logs ?
                
                
                model.DeploymentLogPage.getDeserializedJsonObj(obj.logs) : undefined,
                    'query': obj.query ?
                
                
                model.DeploymentLogQueryEcho.getDeserializedJsonObj(obj.query) : undefined,
                    'coverage': obj.coverage ?
                
                
                model.DeploymentLogCoverage.getDeserializedJsonObj(obj.coverage) : undefined,
         }};

        
        
        return jsonObj;
    }
}
