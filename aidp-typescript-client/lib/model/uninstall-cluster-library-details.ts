// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details required to uninstall a library from a cluster.
*/
export interface UninstallClusterLibraryDetails extends model.ClusterLibraryDetails {
    /**
    * Name of the workspace or volume file library to uninstall.
    */
    'name'?: string;
    /**
    * PyPI package specifier to uninstall. Example - {@code requests==2.31.0}.
    */
    'pythonPackage'?: string;
    /**
    * Optional pip index URL associated with the PyPI package. Example - {@code https://pypi.org/simple}.
    */
    'pipIndexUrl'?: string;
    /**
    * Maven coordinate in {@code groupId:artifactId:version} format.
    */
    'coordinate'?: string;
    /**
    * Optional Maven repository name or URL associated with the module.
    */
    'repository'?: string;
    /**
    * Optional Maven dependency exclusions.
    */
    'exclusions'?: Array<string>;

   "operation": string;
}

export namespace UninstallClusterLibraryDetails {







    export function getJsonObj(obj: UninstallClusterLibraryDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterLibraryDetails.getJsonObj(obj) as UninstallClusterLibraryDetails, ...{
            






        }};

        
        
        return jsonObj;
    }
    export const operation = 'UNINSTALL';
    export function getDeserializedJsonObj(obj: UninstallClusterLibraryDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterLibraryDetails.getDeserializedJsonObj(obj) as UninstallClusterLibraryDetails, ...{
            






         }};

        
        
        return jsonObj;
    }
}
