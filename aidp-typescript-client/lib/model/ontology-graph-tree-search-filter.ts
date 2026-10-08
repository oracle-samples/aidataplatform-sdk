// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Search filter for design-time ontology tree traversal.
*/
export interface OntologyGraphTreeSearchFilter {
    /**
    * Filter attribute. Supported values include parentUid, type, name, hitsPerPage, sortField, sortOrder, and pageIndex.
    */
    'attribute': string;
    /**
    * Filter operator. The current search contract supports '='.
    */
    'operator': string;
    /**
    * Filter values. Numeric pagination values may be sent as strings.
    */
    'values'?: Array<string>;

}

export namespace OntologyGraphTreeSearchFilter {




    export function getJsonObj(obj: OntologyGraphTreeSearchFilter): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyGraphTreeSearchFilter): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
