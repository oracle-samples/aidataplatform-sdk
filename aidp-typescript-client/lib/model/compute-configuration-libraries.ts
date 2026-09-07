// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Cluster-scoped libraries configured on Spark Compute.
*/
export interface ComputeConfigurationLibraries {
    /**
    * Python package identifiers and workspace or volume paths.
    */
    'python'?: Array<string>;
    /**
    * JAR coordinates and workspace or volume paths.
    */
    'jars'?: Array<string>;

}

export namespace ComputeConfigurationLibraries {



    export function getJsonObj(obj: ComputeConfigurationLibraries): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ComputeConfigurationLibraries): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
