// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Workspace YAML files to import into an active Spark Compute.
*/
export interface ImportComputeConfigurationDetails {
    /**
    * Non-empty, unique workspace or volume paths ending in .yaml. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....
    */
    'yamlPaths': Array<string>;

}

export namespace ImportComputeConfigurationDetails {


    export function getJsonObj(obj: ImportComputeConfigurationDetails): object {
        const jsonObj = {...obj, ...{
            

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ImportComputeConfigurationDetails): object {
        const jsonObj = {...obj, ...{
            

         }};

        
        
        return jsonObj;
    }
}
