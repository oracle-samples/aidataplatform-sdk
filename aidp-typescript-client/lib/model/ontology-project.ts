// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Ontology Manager project metadata.
*/
export interface OntologyProject {
    'id': string;
    'workspaceId': string;
    'key': string;
    'displayName': string;
    'description'?: string;
    'namespace'?: string;
    /**
    * Creator metadata for the ontology project.
    */
    'creator'?: string;
    /**
    * Semantic ontology version metadata for the ontology project.
    */
    'ontologyVersion'?: string;
    /**
    * Base URI metadata for ontology files.
    */
    'baseUri'?: string;
    /**
    * Default language tag metadata for ontology files.
    */
    'defaultLanguage'?: string;
    /**
    * Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.
    */
    'workspaceBasePath'?: string;
    /**
    * Project content source. Defaults to VOLUME when omitted.
    */
    'sourceType'?: model.OntologyProjectSourceType;
    /**
    * Git repository key for git-backed ontology projects.
    */
    'gitRepositoryKey'?: string;
    /**
    * Git branch name for git-backed ontology projects.
    */
    'gitBranchName'?: string;
    /**
    * Workspace-relative Git folder path for git-backed ontology project content.
    */
    'gitFolderPath'?: string;
    'targetConnection'?: model.OntologyPublishTargetConnectionReference;
    /**
    * Project lifecycle state. Volume-backed creates initially return CREATING and transition to ACTIVE or FAILED after asynchronous scaffold creation.
    */
    'lifecycleState': string;
    /**
    * Latest publish or operational status for the project; falls back to lifecycleState when no publish status exists.
    */
    'status'?: string;
    'timeCreated'?: Date;
    'timeUpdated'?: Date;
    /**
    * Actor identifier for the most recent project metadata update.
    */
    'updatedBy'?: string;
    /**
    * Time when the most recent publish request was created for the project.
    */
    'timePublished'?: Date;
    /**
    * Actor identifier for the most recent publish request on the project.
    */
    'publishedBy'?: string;
    'version'?: number;
    'freeformTags'?: { [key: string]: string; };
    'definedTags'?: { [key: string]: { [key: string]: any; }; };
    'systemTags'?: { [key: string]: { [key: string]: any; }; };

}

export namespace OntologyProject {




























    export function getJsonObj(obj: OntologyProject): object {
        const jsonObj = {...obj, ...{
            















                'targetConnection': obj.targetConnection ?
                
                
                model.OntologyPublishTargetConnectionReference.getJsonObj(obj.targetConnection) : undefined,











        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProject): object {
        const jsonObj = {...obj, ...{
            















                    'targetConnection': obj.targetConnection ?
                
                
                model.OntologyPublishTargetConnectionReference.getDeserializedJsonObj(obj.targetConnection) : undefined,











         }};

        
        
        return jsonObj;
    }
}
