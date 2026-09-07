// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A cluster-scoped library entry in the Compute configuration YAML.
*/
export interface ComputeConfigurationLibraryEntry {
    /**
    * Workspace or volume path containing library configuration.
    */
    'path'?: string;
    /**
    * Python package identifier.
    */
    'pip'?: string;
    /**
    * JAR coordinate or workspace/volume path.
    */
    'jar'?: string;

}

export namespace ComputeConfigurationLibraryEntry {




    export function getJsonObj(obj: ComputeConfigurationLibraryEntry): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ComputeConfigurationLibraryEntry): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
