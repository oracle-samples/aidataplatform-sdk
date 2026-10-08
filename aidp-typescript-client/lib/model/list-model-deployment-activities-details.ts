// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Filters and pagination for a deployment activity search.
*/
export interface ListModelDeploymentActivitiesDetails {
    /**
    * ID of the deployment whose activities to list.
    */
    'deploymentId': string;
    /**
    * A filter over activity status.
    */
    'status'?: model.DeploymentActivityStatus;
    /**
    * Maximum number of activities desired. Default is 100. Max threshold is 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxResults'?: number;
    /**
    * List of columns for ordering search results, e.g. 'start_time DESC'.
    */
    'orderBy'?: Array<string>;
    /**
    * Token indicating the page of activities to fetch.
    */
    'pageToken'?: string;

}

export namespace ListModelDeploymentActivitiesDetails {






    export function getJsonObj(obj: ListModelDeploymentActivitiesDetails): object {
        const jsonObj = {...obj, ...{
            
                'deployment_id': obj.deploymentId,


                'max_results': obj.maxResults,

                'order_by': obj.orderBy,

                'page_token': obj.pageToken,

        }};

        delete (jsonObj as Partial<ListModelDeploymentActivitiesDetails>).deploymentId;delete (jsonObj as Partial<ListModelDeploymentActivitiesDetails>).maxResults;delete (jsonObj as Partial<ListModelDeploymentActivitiesDetails>).orderBy;delete (jsonObj as Partial<ListModelDeploymentActivitiesDetails>).pageToken;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ListModelDeploymentActivitiesDetails): object {
        const jsonObj = {...obj, ...{
            
                'deploymentId': (obj as any)["deployment_id"],


                'maxResults': (obj as any)["max_results"],

                'orderBy': (obj as any)["order_by"],

                'pageToken': (obj as any)["page_token"],

         }};

        delete (jsonObj as any)["deployment_id"];delete (jsonObj as any)["max_results"];delete (jsonObj as any)["order_by"];delete (jsonObj as any)["page_token"];
        
        return jsonObj;
    }
}
