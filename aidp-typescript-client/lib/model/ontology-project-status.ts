// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Status history row for an ontology project, including publish lifecycle records.
*/
export interface OntologyProjectStatus {
    'statusId': string;
    'projectId': string;
    /**
    * OMS project metadata version captured when publish starts. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'projectVersion': number;
    /**
    * Monotonic publish version for the project. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'publishVersion'?: number;
    'status': OntologyProjectStatus.Status;
    'comment'?: string;
    /**
    * JSON validation report produced by a compiler worker.
    */
    'validationReport'?: string;
    'compiledArtifactRef'?: string;
    'errorMessage'?: string;
    'idempotencyKey'?: string;
    'timeCreated'?: Date;
    'timeUpdated'?: Date;

}

export namespace OntologyProjectStatus {





    export enum Status {
    
    Created = "CREATED",
    Updated = "UPDATED",
    Validating = "VALIDATING",
    ValidationFailed = "VALIDATION_FAILED",
    Publishing = "PUBLISHING",
    Published = "PUBLISHED",
    PublishFailed = "PUBLISH_FAILED",
    Unpublishing = "UNPUBLISHING",
    Unpublished = "UNPUBLISHED",
    UnpublishFailed = "UNPUBLISH_FAILED",
    Archived = "ARCHIVED"

}









    export function getJsonObj(obj: OntologyProjectStatus): object {
        const jsonObj = {...obj, ...{
            












        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectStatus): object {
        const jsonObj = {...obj, ...{
            












         }};

        
        
        return jsonObj;
    }
}
