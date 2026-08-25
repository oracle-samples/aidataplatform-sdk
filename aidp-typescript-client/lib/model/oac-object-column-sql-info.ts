// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* SQL metadata for a column in an OAC data object.
*/
export interface OacObjectColumnSqlInfo {
    /**
    * The aggregation rule for the column in the OAC data object.
    */
    'aggRule'?: string;
    /**
    * The data type for the column in the OAC data object.
    */
    'dataType'?: string;
    /**
    * The aggregation type for the column in the OAC data object.
    */
    'aggType'?: string;

}

export namespace OacObjectColumnSqlInfo {




    export function getJsonObj(obj: OacObjectColumnSqlInfo): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectColumnSqlInfo): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
