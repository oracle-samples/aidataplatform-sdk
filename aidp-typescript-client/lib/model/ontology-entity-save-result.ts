// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result envelope for a bundled ontology entity save/autosave.
*/
export interface OntologyEntitySaveResult {
    'success': boolean;
    'projectId': string;
    'baseRevision'?: string;
    'revision'?: string;
    'currentRevision'?: string;
    'clientMutationId': string;
    'mode'?: string;
    'duplicate'?: boolean;
    'appliedOperationIds'?: Array<string>;
    'entityResults'?: Array<model.OntologyEntityOperationResult>;
    'failedOperation'?: model.OntologyEntityFailedOperation;
    'error'?: model.OntologyEntitySaveError;

}

export namespace OntologyEntitySaveResult {













    export function getJsonObj(obj: OntologyEntitySaveResult): object {
        const jsonObj = {...obj, ...{
            









                'entityResults': obj.entityResults ?
                
                obj.entityResults.map((item)=>{return model.OntologyEntityOperationResult.getJsonObj(item)})
                
                 : undefined,
                'failedOperation': obj.failedOperation ?
                
                
                model.OntologyEntityFailedOperation.getJsonObj(obj.failedOperation) : undefined,
                'error': obj.error ?
                
                
                model.OntologyEntitySaveError.getJsonObj(obj.error) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntitySaveResult): object {
        const jsonObj = {...obj, ...{
            









                    'entityResults': obj.entityResults ?
                
                obj.entityResults.map((item)=>{return model.OntologyEntityOperationResult.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'failedOperation': obj.failedOperation ?
                
                
                model.OntologyEntityFailedOperation.getDeserializedJsonObj(obj.failedOperation) : undefined,
                    'error': obj.error ?
                
                
                model.OntologyEntitySaveError.getDeserializedJsonObj(obj.error) : undefined,
         }};

        
        
        return jsonObj;
    }
}
