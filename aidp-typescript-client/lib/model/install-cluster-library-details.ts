// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details required to install a library on a cluster.
*/
export interface InstallClusterLibraryDetails extends model.ClusterLibraryDetails {
    /**
    * File path for the library to install. Example - /Workspace/shared/example/test.txt or /Volumes/catalogName/schemaName/volumeName/test.txt
    */
    'path'?: string;
    /**
    * PyPI package specifier to install. Example - {@code requests==2.31.0}.
    */
    'pythonPackage'?: string;
    /**
    * Optional pip index URL used to resolve a PyPI package. Example - {@code https://pypi.org/simple}.
    */
    'pipIndexUrl'?: string;
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

   "operation": string;
}

export namespace InstallClusterLibraryDetails {







    export function getJsonObj(obj: InstallClusterLibraryDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterLibraryDetails.getJsonObj(obj) as InstallClusterLibraryDetails, ...{
            






        }};

        
        
        return jsonObj;
    }
    export const operation = 'INSTALL';
    export function getDeserializedJsonObj(obj: InstallClusterLibraryDetails, isParentJsonObj?: boolean): object {
        const jsonObj = {...isParentJsonObj? obj : model.ClusterLibraryDetails.getDeserializedJsonObj(obj) as InstallClusterLibraryDetails, ...{
            






         }};

        
        
        return jsonObj;
    }
}
