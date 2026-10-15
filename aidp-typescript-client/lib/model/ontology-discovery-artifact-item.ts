// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* A single artifact produced by an ontology discovery job.
*/
export interface OntologyDiscoveryArtifactItem {
    /**
    * Artifact file name.
    */
    'name'?: string;
    /**
    * Artifact file path.
    */
    'path'?: string;
    /**
    * Artifact type.
    */
    'kind'?: string;
    /**
    * Owning ontology class.
    */
    'className'?: string;
    /**
    * Artifact size in bytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'bytes'?: number;
    /**
    * Artifact checksum.
    */
    'sha256'?: string;

}

export namespace OntologyDiscoveryArtifactItem {







    export function getJsonObj(obj: OntologyDiscoveryArtifactItem): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyDiscoveryArtifactItem): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
