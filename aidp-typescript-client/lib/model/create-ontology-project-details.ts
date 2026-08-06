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
    * Creator name written into the generated project.yaml metadata file.
    */
    'creator'?: string;
    /**
    * Initial semantic ontology version written into project.yaml.
    */
    'ontologyVersion'?: string;
    /**
    * Base URI written as baseURI in project.yaml.
    */
    'baseUri'?: string;
    /**
    * Default language tag written into project.yaml.
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

}

export namespace CreateOntologyProjectDetails {















    export function getJsonObj(obj: CreateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            














        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            














         }};

        
        
        return jsonObj;
    }
}
