// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary information about a table exposed by an Oracle Analytics object.
*/
export interface OacObjectTableSummary {
    /**
    * The Oracle Analytics table identifier.
    */
    'id': string;
    /**
    * The Oracle Analytics table display name.
    */
    'name': string;
    /**
    * The Oracle Analytics table description.
    */
    'description'?: string;

}

export namespace OacObjectTableSummary {




    export function getJsonObj(obj: OacObjectTableSummary): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectTableSummary): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
