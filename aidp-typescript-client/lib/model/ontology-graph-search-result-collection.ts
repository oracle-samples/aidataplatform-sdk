// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface OntologyGraphSearchResultCollection {
    'items': Array<model.OntologyGraphSearchResult>;
    'nextPage'?: string;

}

export namespace OntologyGraphSearchResultCollection {



    export function getJsonObj(obj: OntologyGraphSearchResultCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.OntologyGraphSearchResult.getJsonObj(item)})
                
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphSearchResultCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.OntologyGraphSearchResult.getDeserializedJsonObj(item)})
                
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
