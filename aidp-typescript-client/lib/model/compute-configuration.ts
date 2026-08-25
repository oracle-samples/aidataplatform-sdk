// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Selectable Spark Compute configuration returned by Compute.
*/
export interface ComputeConfiguration {
    /**
    * Source cluster key.
    */
    'clusterKey'?: string;
    /**
    * Environment-variable keys and authoritative values configured on the source Compute.
    */
    'environmentVariables'?: { [key: string]: string; };
    'libraries'?: model.ComputeConfigurationLibraries;

}

export namespace ComputeConfiguration {




    export function getJsonObj(obj: ComputeConfiguration): object {
        const jsonObj = {...obj, ...{
            


                'libraries': obj.libraries ?
                
                
                model.ComputeConfigurationLibraries.getJsonObj(obj.libraries) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ComputeConfiguration): object {
        const jsonObj = {...obj, ...{
            


                    'libraries': obj.libraries ?
                
                
                model.ComputeConfigurationLibraries.getDeserializedJsonObj(obj.libraries) : undefined,
         }};

        
        
        return jsonObj;
    }
}
