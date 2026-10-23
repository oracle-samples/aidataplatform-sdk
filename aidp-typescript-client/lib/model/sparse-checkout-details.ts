// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Sparse checkout configuration for a git repository. Only cone mode is supported. Specify only when creating a sparse git folder; sparse checkout cannot be enabled later for a non-sparse git folder. For sparse git folders, settings updates can change cone folder patterns but cannot enable or disable sparse checkout.
*/
export interface SparseCheckoutDetails {
    /**
    * Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.
    */
    'patterns'?: Array<string>;
    /**
    * Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only.
    */
    'mode'?: SparseCheckoutDetails.Mode;

}

export namespace SparseCheckoutDetails {


    export enum Mode {
    
    Cone = "CONE",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}


    export function getJsonObj(obj: SparseCheckoutDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: SparseCheckoutDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
