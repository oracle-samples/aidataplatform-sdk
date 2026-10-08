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
    /**
    * Published ontology identity used by the deploy target. Defaults to the project key for older requests.
    */
    'publishedOntologyName'?: string;
    /**
    * Deployment target used for this publish attempt, for example duckdb, oracle, or ATP.
    */
    'deploymentTarget'?: string;
    /**
    * Target deployment connection or catalog reference used for this publish attempt when applicable.
    */
    'deploymentConnection'?: string;
    /**
    * Whether the deployed ontology used DFL's shared storage layout.
    */
    'isDeploymentShared'?: boolean;
    'status': OntologyProjectStatus.Status;
    'comment'?: string;
    'importDetails'?: model.OntologyProjectImportStatusDetails;
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
    Importing = "IMPORTING",
    Imported = "IMPORTED",
    ImportFailed = "IMPORT_FAILED",
    Archived = "ARCHIVED"

}










    export function getJsonObj(obj: OntologyProjectStatus): object {
        const jsonObj = {...obj, ...{
            










                'importDetails': obj.importDetails ?
                
                
                model.OntologyProjectImportStatusDetails.getJsonObj(obj.importDetails) : undefined,






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyProjectStatus): object {
        const jsonObj = {...obj, ...{
            










                    'importDetails': obj.importDetails ?
                
                
                model.OntologyProjectImportStatusDetails.getDeserializedJsonObj(obj.importDetails) : undefined,






         }};

        
        
        return jsonObj;
    }
}
