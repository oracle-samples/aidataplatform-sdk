// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Maven package search result.
*/
export interface MavenSearchSummary {
    /**
    * Maven group identifier.
    */
    'groupId'?: string;
    /**
    * Maven artifact identifier.
    */
    'artifactId'?: string;
    /**
    * Latest version reported for the Maven package.
    */
    'latestVersion'?: string;
    /**
    * Available versions reported for the Maven package.
    */
    'allVersions'?: Array<string>;
    /**
    * Free-form tags for this Maven package search result.
    */
    'freeformTags'?: { [key: string]: string; };
    /**
    * Defined tags for this Maven package search result.
    */
    'definedTags'?: { [key: string]: { [key: string]: any; }; };
    /**
    * System tags for this Maven package search result.
    */
    'systemTags'?: { [key: string]: { [key: string]: any; }; };

}

export namespace MavenSearchSummary {








    export function getJsonObj(obj: MavenSearchSummary): object {
        const jsonObj = {...obj, ...{
            







        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: MavenSearchSummary): object {
        const jsonObj = {...obj, ...{
            







         }};

        
        
        return jsonObj;
    }
}
