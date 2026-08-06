// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Session configuration for an Agent.
*/
export interface SessionConfiguration {
    /**
    * Map of session variable name to variable definition.
    */
    'variables'?: { [key: string]: model.SessionVariableDetails; };
    'sessionRetentionConfig'?: model.SessionRetentionConfiguration;
    'fileConfig'?: model.FileConfiguration;

}

export namespace SessionConfiguration {




    export function getJsonObj(obj: SessionConfiguration): object {
        const jsonObj = {...obj, ...{
            
                'variables': obj.variables ?
                
                
                common.mapContainer(obj.variables, model.SessionVariableDetails.getJsonObj)
                 : undefined,
                'sessionRetentionConfig': obj.sessionRetentionConfig ?
                
                
                model.SessionRetentionConfiguration.getJsonObj(obj.sessionRetentionConfig) : undefined,
                'fileConfig': obj.fileConfig ?
                
                
                model.FileConfiguration.getJsonObj(obj.fileConfig) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: SessionConfiguration): object {
        const jsonObj = {...obj, ...{
            
                    'variables': obj.variables ?
                
                
                common.mapContainer(obj.variables, model.SessionVariableDetails.getDeserializedJsonObj)
                 : undefined,
                    'sessionRetentionConfig': obj.sessionRetentionConfig ?
                
                
                model.SessionRetentionConfiguration.getDeserializedJsonObj(obj.sessionRetentionConfig) : undefined,
                    'fileConfig': obj.fileConfig ?
                
                
                model.FileConfiguration.getDeserializedJsonObj(obj.fileConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
