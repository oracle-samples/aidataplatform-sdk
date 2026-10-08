// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A deployment activity record.
*/
export interface DeploymentActivity {
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
    /**
    * Comment recorded with the activity.
    */
    'message'?: string;
    /**
    * Details on the status, if it is not SUCCESS.
    */
    'statusMessage'?: string;
    'deploymentDetails': model.DeploymentDetails;

}

export namespace DeploymentActivity {










    export function getJsonObj(obj: DeploymentActivity): object {
        const jsonObj = {...obj, ...{
            
                'activity_id': obj.activityId,

                'operation_type': obj.operationType,


                'start_time': obj.startTime,

                'end_time': obj.endTime,



                'status_message': obj.statusMessage,

                'deployment_details': obj.deploymentDetails ?
                
                
                model.DeploymentDetails.getJsonObj(obj.deploymentDetails) : undefined,
        }};

        delete (jsonObj as Partial<DeploymentActivity>).activityId;delete (jsonObj as Partial<DeploymentActivity>).operationType;delete (jsonObj as Partial<DeploymentActivity>).startTime;delete (jsonObj as Partial<DeploymentActivity>).endTime;delete (jsonObj as Partial<DeploymentActivity>).statusMessage;delete (jsonObj as Partial<DeploymentActivity>).deploymentDetails;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DeploymentActivity): object {
        const jsonObj = {...obj, ...{
            
                'activityId': (obj as any)["activity_id"],

                'operationType': (obj as any)["operation_type"],


                'startTime': (obj as any)["start_time"],

                'endTime': (obj as any)["end_time"],



                'statusMessage': (obj as any)["status_message"],

                    'deploymentDetails': (obj as any)["deployment_details"] ?
                
                
                model.DeploymentDetails.getDeserializedJsonObj((obj as any)["deployment_details"]) : undefined,
         }};

        delete (jsonObj as any)["activity_id"];delete (jsonObj as any)["operation_type"];delete (jsonObj as any)["start_time"];delete (jsonObj as any)["end_time"];delete (jsonObj as any)["status_message"];delete (jsonObj as any)["deployment_details"];
        
        return jsonObj;
    }
}
