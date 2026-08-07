// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface UpdateOntologyProjectDetails {
    'key'?: string;
    'displayName'?: string;
    'description'?: string;
    'namespace'?: string;
    /**
    * Root path for volume-backed ontology project content. Defaults to a workspace-relative path; managed-volume deployments may store this as an OMS managed-volume path.
    */
    'workspaceBasePath'?: string;
    /**
    * Project content source.
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
    'lifecycleState'?: string;

}

export namespace UpdateOntologyProjectDetails {











    export function getJsonObj(obj: UpdateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            










        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            










         }};

        
        
        return jsonObj;
    }
}
