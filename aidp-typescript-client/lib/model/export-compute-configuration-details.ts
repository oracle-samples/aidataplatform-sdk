// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Customer-selected Compute configuration values and YAML destination.
*/
export interface ExportComputeConfigurationDetails {
    /**
    * Destination folder. Use /Workspace/... for a workspace file or /Volumes/<catalog>/<schema>/<volume>/... for a volume file. Defaults to /Workspace/configurations/.
    */
    'destinationPath'?: string;
    /**
    * Optional YAML filename. API-handler appends .yaml when omitted.
    */
    'fileName'?: string;
    /**
    * Selected cluster-scoped library entries. Each entry must set exactly one of path, pip, or jar.
    */
    'clusterScopedLibraries'?: Array<model.ComputeConfigurationLibraryEntry>;
    /**
    * Selected environment-variable keys and values to write to the YAML file.
    */
    'environmentVariables'?: { [key: string]: string; };

}

export namespace ExportComputeConfigurationDetails {





    export function getJsonObj(obj: ExportComputeConfigurationDetails): object {
        const jsonObj = {...obj, ...{
            


                'clusterScopedLibraries': obj.clusterScopedLibraries ?
                
                obj.clusterScopedLibraries.map((item)=>{return model.ComputeConfigurationLibraryEntry.getJsonObj(item)})
                
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ExportComputeConfigurationDetails): object {
        const jsonObj = {...obj, ...{
            


                    'clusterScopedLibraries': obj.clusterScopedLibraries ?
                
                obj.clusterScopedLibraries.map((item)=>{return model.ComputeConfigurationLibraryEntry.getDeserializedJsonObj(item)})
                
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
