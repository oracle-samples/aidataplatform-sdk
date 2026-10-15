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
    'automaticSummarizationConfig'?: model.AutomaticSummarizationConfiguration;
    'longTermMemoryConfig'?: model.LongTermMemoryConfiguration;
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
                'automaticSummarizationConfig': obj.automaticSummarizationConfig ?
                
                
                model.AutomaticSummarizationConfiguration.getJsonObj(obj.automaticSummarizationConfig) : undefined,
                'longTermMemoryConfig': obj.longTermMemoryConfig ?
                
                
                model.LongTermMemoryConfiguration.getJsonObj(obj.longTermMemoryConfig) : undefined,
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
                    'automaticSummarizationConfig': obj.automaticSummarizationConfig ?
                
                
                model.AutomaticSummarizationConfiguration.getDeserializedJsonObj(obj.automaticSummarizationConfig) : undefined,
                    'longTermMemoryConfig': obj.longTermMemoryConfig ?
                
                
                model.LongTermMemoryConfiguration.getDeserializedJsonObj(obj.longTermMemoryConfig) : undefined,
                    'fileConfig': obj.fileConfig ?
                
                
                model.FileConfiguration.getDeserializedJsonObj(obj.fileConfig) : undefined,
         }};

        
        
        return jsonObj;
    }
}
