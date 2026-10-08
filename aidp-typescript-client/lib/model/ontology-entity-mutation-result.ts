// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Result envelope for a design-time ontology entity mutation.
*/
export interface OntologyEntityMutationResult {
    /**
    * Whether the mutation completed successfully.
    */
    'success': boolean;
    /**
    * HTTP-like status code for the mutation result. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'code': number;
    /**
    * Entity identifiers created by this mutation.
    */
    'createdEntities'?: Array<string>;
    /**
    * Entity identifiers deleted by this mutation.
    */
    'deletedEntities'?: Array<string>;
    /**
    * Entity identifiers updated by this mutation.
    */
    'updatedEntities'?: Array<string>;
    /**
    * Mutation errors when success is false.
    */
    'errors'?: Array<model.OntologyEntityError>;

}

export namespace OntologyEntityMutationResult {







    export function getJsonObj(obj: OntologyEntityMutationResult): object {
        const jsonObj = {...obj, ...{
            





                'errors': obj.errors ?
                
                obj.errors.map((item)=>{return model.OntologyEntityError.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyEntityMutationResult): object {
        const jsonObj = {...obj, ...{
            





                    'errors': obj.errors ?
                
                obj.errors.map((item)=>{return model.OntologyEntityError.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
