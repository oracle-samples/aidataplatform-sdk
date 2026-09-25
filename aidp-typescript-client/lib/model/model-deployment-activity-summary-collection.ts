// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result of listing deployment activity summaries.
*/
export interface ModelDeploymentActivitySummaryCollection {
    /**
    * Activity summaries that match the search criteria.
    */
    'activities': Array<model.DeploymentActivitySummary>;
    /**
    * Token that can be used to retrieve the next page of activities. An empty token means that no more activities are available for retrieval.
    */
    'nextPageToken'?: string;

}

export namespace ModelDeploymentActivitySummaryCollection {



    export function getJsonObj(obj: ModelDeploymentActivitySummaryCollection): object {
        const jsonObj = {...obj, ...{
            
                'activities': obj.activities ?
                
                obj.activities.map((item)=>{return model.DeploymentActivitySummary.getJsonObj(item)})
                
                 : undefined,
                'next_page_token': obj.nextPageToken,

        }};

        delete (jsonObj as Partial<ModelDeploymentActivitySummaryCollection>).nextPageToken;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ModelDeploymentActivitySummaryCollection): object {
        const jsonObj = {...obj, ...{
            
                    'activities': obj.activities ?
                
                obj.activities.map((item)=>{return model.DeploymentActivitySummary.getDeserializedJsonObj(item)})
                
                 : undefined,
                'nextPageToken': (obj as any)["next_page_token"],

         }};

        delete (jsonObj as any)["next_page_token"];
        
        return jsonObj;
    }
}
