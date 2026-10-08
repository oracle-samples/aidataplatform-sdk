// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Filters and pagination for a model deployment search.
*/
export interface SearchModelDeploymentsDetails {
    /**
    * A filter over the registered model name.
    */
    'modelName': string;
    /**
    * A filter over deployment status.
    */
    'status'?: model.DeploymentStatus;
    /**
    * Maximum number of deployments desired. Default is 100. Max threshold is 1000. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'maxResults'?: number;
    /**
    * List of columns for ordering search results, e.g. 'created_time DESC'.
    */
    'orderBy'?: Array<string>;
    /**
    * Token indicating the page of deployments to fetch.
    */
    'pageToken'?: string;

}

export namespace SearchModelDeploymentsDetails {






    export function getJsonObj(obj: SearchModelDeploymentsDetails): object {
        const jsonObj = {...obj, ...{
            
                'model_name': obj.modelName,


                'max_results': obj.maxResults,

                'order_by': obj.orderBy,

                'page_token': obj.pageToken,

        }};

        delete (jsonObj as Partial<SearchModelDeploymentsDetails>).modelName;delete (jsonObj as Partial<SearchModelDeploymentsDetails>).maxResults;delete (jsonObj as Partial<SearchModelDeploymentsDetails>).orderBy;delete (jsonObj as Partial<SearchModelDeploymentsDetails>).pageToken;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: SearchModelDeploymentsDetails): object {
        const jsonObj = {...obj, ...{
            
                'modelName': (obj as any)["model_name"],


                'maxResults': (obj as any)["max_results"],

                'orderBy': (obj as any)["order_by"],

                'pageToken': (obj as any)["page_token"],

         }};

        delete (jsonObj as any)["model_name"];delete (jsonObj as any)["max_results"];delete (jsonObj as any)["order_by"];delete (jsonObj as any)["page_token"];
        
        return jsonObj;
    }
}
