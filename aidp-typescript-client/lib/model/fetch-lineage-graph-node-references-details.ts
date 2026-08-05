// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The information needed to fetch child/parent nodes of desired lineage node details.
*/
export interface FetchLineageGraphNodeReferencesDetails {
    /**
    * ID of the node to fetch the details:
* 
    */
    'nodeId': string;
    /**
    * referenceType of the node
    */
    'referenceType': model.ReferenceType;

}

export namespace FetchLineageGraphNodeReferencesDetails {



    export function getJsonObj(obj: FetchLineageGraphNodeReferencesDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: FetchLineageGraphNodeReferencesDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
