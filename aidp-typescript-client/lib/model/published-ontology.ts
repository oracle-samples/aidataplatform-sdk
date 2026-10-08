// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Published ontology identity and runtime binding metadata.
*/
export interface PublishedOntology {
    /**
    * Unique identifier of the source Ontology Manager project.
    */
    'projectId': string;
    /**
    * Unique identifier of the workspace that owns the source project.
    */
    'workspaceId': string;
    /**
    * Workspace-scoped project key of the source Ontology Manager project.
    */
    'projectKey': string;
    /**
    * Display name of the published ontology project.
    */
    'displayName': string;
    /**
    * Ontology namespace associated with the published project.
    */
    'namespace'?: string;
    /**
    * Ontology identity requested at publish time; omitted for legacy project-key publishes.
    */
    'publishedOntologyName'?: string;
    /**
    * Runtime publish target used by the deployed ontology.
    */
    'deploymentTarget'?: string;
    /**
    * Runtime target connection used by the deployed ontology, when one was requested.
    */
    'deploymentConnection'?: string;
    /**
    * Whether the runtime deployment target is shared.
    */
    'isDeploymentShared'?: boolean;
    /**
    * Logical data source connection references declared by the project RML mappings. These are refs, not credential payloads.
    */
    'dataConnectionRefs'?: Array<string>;
    /**
    * Latest effective publish lifecycle state for the ontology project.
    */
    'status': string;
    /**
    * Time when the ontology project was most recently published.
    */
    'timePublished'?: Date;
    /**
    * Principal that most recently published the ontology project.
    */
    'publishedBy'?: string;

}

export namespace PublishedOntology {














    export function getJsonObj(obj: PublishedOntology): object {
        const jsonObj = {...obj, ...{
            













        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PublishedOntology): object {
        const jsonObj = {...obj, ...{
            













         }};

        
        
        return jsonObj;
    }
}
