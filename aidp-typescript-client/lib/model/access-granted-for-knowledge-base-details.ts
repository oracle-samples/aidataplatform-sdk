// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy KnowledgeBase resource details.
*/
export interface AccessGrantedForKnowledgeBaseDetails {
    /**
    * Lakeproxy catalogName.
    */
    'catalogName': string;
    /**
    * Lakeproxy databaseName.
    */
    'databaseName': string;
    /**
    * Lakeproxy knowledgeBaseName.
    */
    'knowledgeBaseName': string;

}

export namespace AccessGrantedForKnowledgeBaseDetails {




    export function getJsonObj(obj: AccessGrantedForKnowledgeBaseDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForKnowledgeBaseDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
