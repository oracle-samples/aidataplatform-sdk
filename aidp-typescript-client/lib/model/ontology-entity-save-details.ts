// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Ordered transaction envelope for ontology entity save and autosave.
*/
export interface OntologyEntitySaveDetails {
    /**
    * Project being saved. The path projectId is authoritative.
    */
    'projectId'?: string;
    /**
    * Server revision the client edited from.
    */
    'baseRevision': string;
    /**
    * Unique ID for this save/autosave request, used for retry safety.
    */
    'clientMutationId': string;
    /**
    * Save mode. Supported values are save and autosave.
    */
    'mode': string;
    /**
    * Ordered list of entity changes to apply atomically.
    */
    'operations': Array<model.OntologyEntitySaveOperation>;

}

export namespace OntologyEntitySaveDetails {






    export function getJsonObj(obj: OntologyEntitySaveDetails): object {
        const jsonObj = {...obj, ...{
            




                'operations': obj.operations ?
                
                obj.operations.map((item)=>{return model.OntologyEntitySaveOperation.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntitySaveDetails): object {
        const jsonObj = {...obj, ...{
            




                    'operations': obj.operations ?
                
                obj.operations.map((item)=>{return model.OntologyEntitySaveOperation.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
