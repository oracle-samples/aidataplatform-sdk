// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Paginated design-time ontology tree search result set.
*/
export interface OntologyGraphTreeSearchResultSet {
    'maxResults': number;
    'hitsPerPage': number;
    'pageIndex': number;
    'results': Array<model.OntologyGraphTreeSearchNode>;

}

export namespace OntologyGraphTreeSearchResultSet {





    export function getJsonObj(obj: OntologyGraphTreeSearchResultSet): object {
        const jsonObj = {...obj, ...{
            



                'results': obj.results ?
                
                obj.results.map((item)=>{return model.OntologyGraphTreeSearchNode.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphTreeSearchResultSet): object {
        const jsonObj = {...obj, ...{
            



                    'results': obj.results ?
                
                obj.results.map((item)=>{return model.OntologyGraphTreeSearchNode.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
