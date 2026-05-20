// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The data to update cluster async operation status.
*/
export interface UpdateClusterAsyncOperationStatusDetails {
    /**
    * Descriptive message of the current state.
    */
    'stateMessage'?: string;
    /**
    * State of cluster.
    */
    'state': UpdateClusterAsyncOperationStatusDetails.State;
    /**
    * External work-request-id if applicable.
    */
    'externalId'?: string;
    /**
    * Metrics for the cluster operation.
    */
    'metrics'?: { [key: string]: string; };
    /**
    * Properties of operation on cluster.
    */
    'properties'?: { [key: string]: any; };

}

export namespace UpdateClusterAsyncOperationStatusDetails {


    export enum State {
    
    Accepted = "ACCEPTED",
    Creating = "CREATING",
    Active = "ACTIVE",
    Deleting = "DELETING",
    Deleted = "DELETED",
    Failed = "FAILED",
    Stopping = "STOPPING",
    Stopped = "STOPPED",
    Updating = "UPDATING",
    Restarting = "RESTARTING",
    Starting = "STARTING",
    NetworkConfigurationAttachInProgress = "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS",
    NetworkConfigurationAttachSuccessful = "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL",
    NetworkConfigurationAttachFailed = "NETWORK_CONFIGURATION_ATTACH_FAILED",
    NetworkConfigurationDetachInProgress = "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS",
    NetworkConfigurationDetachSuccessful = "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL",
    NetworkConfigurationDetachFailed = "NETWORK_CONFIGURATION_DETACH_FAILED"

}





    export function getJsonObj(obj: UpdateClusterAsyncOperationStatusDetails): object {
        const jsonObj = {...obj, ...{
            





        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateClusterAsyncOperationStatusDetails): object {
        const jsonObj = {...obj, ...{
            





         }};

        
        
        return jsonObj;
    }
}
