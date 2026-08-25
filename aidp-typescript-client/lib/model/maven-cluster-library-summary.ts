// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details of a Maven module installed as a library on a cluster.
*/
export interface MavenClusterLibrarySummary extends model.ClusterLibrarySummary {
    /**
    * Maven coordinate in {@code groupId:artifactId:version} format.
    */
    'coordinate'?: string;
    /**
    * Optional Maven repository name or URL used to resolve the module.
    */
    'repository'?: string;
    /**
    * Optional Maven dependency exclusions.
    */
    'exclusions'?: Array<string>;

   "type": string;
}

export namespace MavenClusterLibrarySummary {




    export function getJsonObj(obj: MavenClusterLibrarySummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterLibrarySummary.getJsonObj(obj) as MavenClusterLibrarySummary, ...{
            



        }};

        
        
        return jsonObj;
    }
    export const type = 'MAVEN';
    export function getDeserializedJsonObj(obj: MavenClusterLibrarySummary, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterLibrarySummary.getDeserializedJsonObj(obj) as MavenClusterLibrarySummary, ...{
            



         }};

        
        
        return jsonObj;
    }
}
