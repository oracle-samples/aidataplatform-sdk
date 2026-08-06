// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* File read/write configuration for an agent flow session. DataHub owns this
* as Agent Flow authoring metadata and passes it to downstream runtime
* components as structured JSON. Runtime and gateway components enforce
* file policy during session execution.
* 
*/
export interface FileConfiguration {
    /**
    * Overall preview/codegen gate for runtime session-file helper tools.
    */
    'isEnabled'?: boolean;
    'read'?: model.FileReadConfiguration;
    'write'?: model.FileWriteConfiguration;

}

export namespace FileConfiguration {




    export function getJsonObj(obj: FileConfiguration): object {
        const jsonObj = {...obj, ...{
            

                'read': obj.read ?
                
                
                model.FileReadConfiguration.getJsonObj(obj.read) : undefined,
                'write': obj.write ?
                
                
                model.FileWriteConfiguration.getJsonObj(obj.write) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: FileConfiguration): object {
        const jsonObj = {...obj, ...{
            

                    'read': obj.read ?
                
                
                model.FileReadConfiguration.getDeserializedJsonObj(obj.read) : undefined,
                    'write': obj.write ?
                
                
                model.FileWriteConfiguration.getDeserializedJsonObj(obj.write) : undefined,
         }};

        
        
        return jsonObj;
    }
}
