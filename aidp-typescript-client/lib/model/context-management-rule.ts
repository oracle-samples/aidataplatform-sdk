// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Base context management rule. Concrete rule configuration is selected by type.
*/
export interface ContextManagementRule {

   "type": string;
}

export namespace ContextManagementRule {

    export function getJsonObj(obj: ContextManagementRule): object {
        const jsonObj = {...obj, ...{
            
        }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "CLEAR_TOOL_USES":
                    return model.ClearToolUsesContextManagementRule.getJsonObj(<model.ClearToolUsesContextManagementRule>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)

        }
        }
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ContextManagementRule): object {
        const jsonObj = {...obj, ...{
            
         }};

        
        
        if (obj && "type" in obj && obj.type) {
            switch (obj.type) {
                case "CLEAR_TOOL_USES":
                    return model.ClearToolUsesContextManagementRule.getDeserializedJsonObj(<model.ClearToolUsesContextManagementRule>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.type}`)
        }
        }
        return jsonObj;
    }
}
