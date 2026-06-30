// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Context management rule for clearing older tool-use outputs.
*/
export interface ClearToolUsesContextManagementRule extends model.ContextManagementRule {
    'config'?: model.ClearToolUsesContextManagementDetails;

   "type": string;
}

export namespace ClearToolUsesContextManagementRule {


    export function getJsonObj(obj: ClearToolUsesContextManagementRule, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ContextManagementRule.getJsonObj(obj) as ClearToolUsesContextManagementRule, ...{
            
                'config': obj.config ?
                
                
                model.ClearToolUsesContextManagementDetails.getJsonObj(obj.config) : undefined,
        }};

        
        
        return jsonObj;
    }
    export const type = 'CLEAR_TOOL_USES';
    export function getDeserializedJsonObj(obj: ClearToolUsesContextManagementRule, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ContextManagementRule.getDeserializedJsonObj(obj) as ClearToolUsesContextManagementRule, ...{
            
                    'config': obj.config ?
                
                
                model.ClearToolUsesContextManagementDetails.getDeserializedJsonObj(obj.config) : undefined,
         }};

        
        
        return jsonObj;
    }
}
