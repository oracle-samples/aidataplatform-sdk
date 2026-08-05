// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for starting an ontology project publish.
*/
export interface PublishOntologyProjectDetails {
    /**
    * Workspace containing the ontology project when publishing by project name.
    */
    'workspaceId'?: string;
    /**
    * Ontology project key/name to publish.
    */
    'projectName'?: string;
    'comment'?: string;
    'targetConnection'?: model.OntologyPublishTargetConnectionReference;

}

export namespace PublishOntologyProjectDetails {





    export function getJsonObj(obj: PublishOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            



                'targetConnection': obj.targetConnection ?
                
                
                model.OntologyPublishTargetConnectionReference.getJsonObj(obj.targetConnection) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PublishOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            



                    'targetConnection': obj.targetConnection ?
                
                
                model.OntologyPublishTargetConnectionReference.getDeserializedJsonObj(obj.targetConnection) : undefined,
         }};

        
        
        return jsonObj;
    }
}
