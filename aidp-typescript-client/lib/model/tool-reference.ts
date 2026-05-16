// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Derived model for Tool Reference
*/
export interface ToolReference extends model.Tool {

   "toolType": string;
}

export namespace ToolReference {

    export function getJsonObj(obj: ToolReference, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Tool.getJsonObj(obj) as ToolReference, ...{
            
        }};

        
        
        return jsonObj;
    }
    export const toolType = 'REFERENCE';
    export function getDeserializedJsonObj(obj: ToolReference, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.Tool.getDeserializedJsonObj(obj) as ToolReference, ...{
            
         }};

        
        
        return jsonObj;
    }
}
