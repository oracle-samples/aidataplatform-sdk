// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Collection of published Ontology Manager project summaries.
*/
export interface PublishedOntologyCollection {
    /**
    * Published ontology projects in the current page.
    */
    'items': Array<model.PublishedOntology>;
    /**
    * Token for fetching the next page of published ontology projects.
    */
    'nextPage'?: string;

}

export namespace PublishedOntologyCollection {



    export function getJsonObj(obj: PublishedOntologyCollection): object {
        const jsonObj = {...obj, ...{
            
                'items': obj.items ?
                
                obj.items.map((item)=>{return model.PublishedOntology.getJsonObj(item)})
                
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: PublishedOntologyCollection): object {
        const jsonObj = {...obj, ...{
            
                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.PublishedOntology.getDeserializedJsonObj(item)})
                
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
