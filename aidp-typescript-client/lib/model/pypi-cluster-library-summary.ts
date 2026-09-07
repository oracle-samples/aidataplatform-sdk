// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details of a PyPI package installed as a library on a cluster.
*/
export interface PypiClusterLibrarySummary extends model.ClusterLibrarySummary {
    /**
    * PyPI package specifier, for example {@code requests==2.31.0}.
    */
    'pythonPackage'?: string;
    /**
    * Optional pip index URL used to resolve the package, for example {@code https://pypi.org/simple}.
    */
    'pipIndexUrl'?: string;

   "type": string;
}

export namespace PypiClusterLibrarySummary {



    export function getJsonObj(obj: PypiClusterLibrarySummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterLibrarySummary.getJsonObj(obj) as PypiClusterLibrarySummary, ...{
            


        }};

        
        
        return jsonObj;
    }
    export const type = 'PYPI';
    export function getDeserializedJsonObj(obj: PypiClusterLibrarySummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterLibrarySummary.getDeserializedJsonObj(obj) as PypiClusterLibrarySummary, ...{
            


         }};

        
        
        return jsonObj;
    }
}
