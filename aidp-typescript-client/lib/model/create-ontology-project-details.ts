// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface CreateOntologyProjectDetails {
    'workspaceId'?: string;
    'key': string;
    'displayName': string;
    'description'?: string;
    'namespace'?: string;
    /**
    * Creator metadata for the ontology project.
    */
    'creator'?: string;
    /**
    * Initial semantic ontology version metadata for the ontology project.
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

}

export namespace CreateOntologyProjectDetails {
















    export function getJsonObj(obj: CreateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            














                'targetConnection': obj.targetConnection ?
                
                
                model.OntologyPublishTargetConnectionReference.getJsonObj(obj.targetConnection) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            














                    'targetConnection': obj.targetConnection ?
                
                
                model.OntologyPublishTargetConnectionReference.getDeserializedJsonObj(obj.targetConnection) : undefined,
         }};

        
        
        return jsonObj;
    }
}
