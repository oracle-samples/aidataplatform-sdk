// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");

/**
 * Ontology project content source type.
**/
export enum OntologyProjectSourceType {
    Volume = "VOLUME",
    Git = "GIT"
    
}

export namespace OntologyProjectSourceType {
    export function getJsonObj(obj: OntologyProjectSourceType): OntologyProjectSourceType {
        return obj;
    }
    export function getDeserializedJsonObj(obj: OntologyProjectSourceType): OntologyProjectSourceType {
        return obj;
    }
}

