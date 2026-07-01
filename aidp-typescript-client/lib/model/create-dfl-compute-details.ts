// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Service-managed DI Agent compute cluster details for creation.
*/
export interface CreateDflComputeDetails extends model.CreateClusterDetails {

   "type": string;
}

export namespace CreateDflComputeDetails {

    export function getJsonObj(obj: CreateDflComputeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateClusterDetails.getJsonObj(obj) as CreateDflComputeDetails, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const type = 'DFL';
    export function getDeserializedJsonObj(obj: CreateDflComputeDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.CreateClusterDetails.getDeserializedJsonObj(obj) as CreateDflComputeDetails, ...{
            
         }};

        
        
        return jsonObj;
    }
}
