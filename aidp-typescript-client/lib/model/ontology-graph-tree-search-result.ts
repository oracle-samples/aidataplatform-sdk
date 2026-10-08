// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Search API envelope for design-time ontology tree traversal.
*/
export interface OntologyGraphTreeSearchResult {
    'success': boolean;
    'response': model.OntologyGraphTreeSearchResultSet;

}

export namespace OntologyGraphTreeSearchResult {



    export function getJsonObj(obj: OntologyGraphTreeSearchResult): object {
        const jsonObj = {...obj, ...{
            

                'response': obj.response ?
                
                
                model.OntologyGraphTreeSearchResultSet.getJsonObj(obj.response) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphTreeSearchResult): object {
        const jsonObj = {...obj, ...{
            

                    'response': obj.response ?
                
                
                model.OntologyGraphTreeSearchResultSet.getDeserializedJsonObj(obj.response) : undefined,
         }};

        
        
        return jsonObj;
    }
}
