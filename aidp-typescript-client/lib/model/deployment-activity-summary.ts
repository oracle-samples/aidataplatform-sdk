// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A deployment activity record for a table listing: the activity fields plus a minimal deployment_details snapshot (model name + served versions). The full configuration snapshot and the message comment are returned only by the single-activity read.
*/
export interface DeploymentActivitySummary {
    /**
    * ID of the deployment activity.
    */
    'activityId': string;
    /**
    * Operation type of the activity.
    */
    'operationType': model.DeploymentOperationType;
    /**
    * Status of the activity.
    */
    'status': model.DeploymentActivityStatus;
    /**
    * Unix timestamp in milliseconds of when the activity started.
    */
    'startTime': string;
    /**
    * Unix timestamp in milliseconds of when the activity ended.
    */
    'endTime': string;
    /**
    * User that created the activity.
    */
    'user': string;
    'deploymentDetails'?: model.DeploymentDetailsSummary;

}

export namespace DeploymentActivitySummary {








    export function getJsonObj(obj: DeploymentActivitySummary): object {
        const jsonObj = {...obj, ...{
            
                'activity_id': obj.activityId,

                'operation_type': obj.operationType,


                'start_time': obj.startTime,

                'end_time': obj.endTime,


                'deployment_details': obj.deploymentDetails ?
                
                
                model.DeploymentDetailsSummary.getJsonObj(obj.deploymentDetails) : undefined,
        }};

        delete (jsonObj as Partial<DeploymentActivitySummary>).activityId;delete (jsonObj as Partial<DeploymentActivitySummary>).operationType;delete (jsonObj as Partial<DeploymentActivitySummary>).startTime;delete (jsonObj as Partial<DeploymentActivitySummary>).endTime;delete (jsonObj as Partial<DeploymentActivitySummary>).deploymentDetails;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentActivitySummary): object {
        const jsonObj = {...obj, ...{
            
                'activityId': (obj as any)["activity_id"],

                'operationType': (obj as any)["operation_type"],


                'startTime': (obj as any)["start_time"],

                'endTime': (obj as any)["end_time"],


                    'deploymentDetails': (obj as any)["deployment_details"] ?
                
                
                model.DeploymentDetailsSummary.getDeserializedJsonObj((obj as any)["deployment_details"]) : undefined,
         }};

        delete (jsonObj as any)["activity_id"];delete (jsonObj as any)["operation_type"];delete (jsonObj as any)["start_time"];delete (jsonObj as any)["end_time"];delete (jsonObj as any)["deployment_details"];
        
        return jsonObj;
    }
}
