// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result of searching model deployments.
*/
export interface ModelDeploymentCollection {
    /**
    * Deployments that match the search criteria.
    */
    'deployments': Array<model.ModelDeploymentSummary>;
    /**
    * Token that can be used to retrieve the next page of deployments. An empty token means that no more deployments are available for retrieval.
    */
    'nextPageToken'?: string;

}

export namespace ModelDeploymentCollection {



    export function getJsonObj(obj: ModelDeploymentCollection): object {
        const jsonObj = {...obj, ...{
            
                'deployments': obj.deployments ?
                
                obj.deployments.map((item)=>{return model.ModelDeploymentSummary.getJsonObj(item)})
                
                 : undefined,
                'next_page_token': obj.nextPageToken,

        }};

        delete (jsonObj as Partial<ModelDeploymentCollection>).nextPageToken;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ModelDeploymentCollection): object {
        const jsonObj = {...obj, ...{
            
                    'deployments': obj.deployments ?
                
                obj.deployments.map((item)=>{return model.ModelDeploymentSummary.getDeserializedJsonObj(item)})
                
                 : undefined,
                'nextPageToken': (obj as any)["next_page_token"],

         }};

        delete (jsonObj as any)["next_page_token"];
        
        return jsonObj;
    }
}
