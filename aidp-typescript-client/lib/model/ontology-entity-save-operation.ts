// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* One ordered entity operation inside an ontology save bundle.
*/
export interface OntologyEntitySaveOperation {
    'opId': string;
    /**
    * Operation type. Supported values are create, replace, patch, and delete.
    */
    'op': string;
    'entityType': string;
    'compactIri'?: string;
    'iri'?: string;
    /**
    * Full entity value for create or replace operations.
    */
    'value'?: any;
    /**
    * JSON Patch operations for patch operations.
    */
    'patches'?: Array<model.OntologyEntityPatchOperation>;

}

export namespace OntologyEntitySaveOperation {








    export function getJsonObj(obj: OntologyEntitySaveOperation): object {
        const jsonObj = {...obj, ...{
            






                'patches': obj.patches ?
                
                obj.patches.map((item)=>{return model.OntologyEntityPatchOperation.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntitySaveOperation): object {
        const jsonObj = {...obj, ...{
            






                    'patches': obj.patches ?
                
                obj.patches.map((item)=>{return model.OntologyEntityPatchOperation.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
