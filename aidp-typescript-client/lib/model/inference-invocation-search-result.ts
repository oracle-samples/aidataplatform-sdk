// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Paginated correlated inference invocation rows. Each response contains at most 20 rows; pagination is backed by OCI Logging. At most 10,000 matching rows can be retrieved.
*/
export interface InferenceInvocationSearchResult {
    /**
    * Inclusive start time resolved for this search query.
    */
    'timeStart': Date;
    /**
    * Inclusive end time resolved for this search query.
    */
    'timeEnd': Date;
    /**
    * Correlated inference invocation rows for the requested page.
    */
    'items': Array<model.InferenceInvocationSummary>;
    /**
    * Opaque token for retrieving the next page. Omitted when no additional page is available.
    */
    'nextPageToken'?: string;
    /**
    * Available filter values: the distinct invocation statuses found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
    */
    'statuses': Array<model.InferenceInvocationStatus>;
    /**
    * Available filter values: the distinct inference endpoint URIs found across the whole requested time range. This is not narrowed by the filters in the request, so it stays stable while a caller changes filters.
    */
    'requestUris': Array<string>;
    /**
    * Model versions configured on the requested deployment.
    */
    'modelVersions': Array<string>;

}

export namespace InferenceInvocationSearchResult {








    export function getJsonObj(obj: InferenceInvocationSearchResult): object {
        const jsonObj = {...obj, ...{
            


                'items': obj.items ?
                
                obj.items.map((item)=>{return model.InferenceInvocationSummary.getJsonObj(item)})
                
                 : undefined,

                'statuses': obj.statuses ?
                
                obj.statuses.map((item)=>{return model.InferenceInvocationStatus.getJsonObj(item)})
                
                 : undefined,


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: InferenceInvocationSearchResult): object {
        const jsonObj = {...obj, ...{
            


                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.InferenceInvocationSummary.getDeserializedJsonObj(item)})
                
                 : undefined,

                    'statuses': obj.statuses ?
                
                obj.statuses.map((item)=>{return model.InferenceInvocationStatus.getDeserializedJsonObj(item)})
                
                 : undefined,


         }};

        
        
        return jsonObj;
    }
}
