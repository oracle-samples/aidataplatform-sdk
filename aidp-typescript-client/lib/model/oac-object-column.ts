// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Column metadata for a table exposed by an Oracle Analytics object.
*/
export interface OacObjectColumn {
    /**
    * The Oracle Analytics column name.
    */
    'name'?: string;
    /**
    * The Oracle Analytics column description.
    */
    'description'?: string;
    /**
    * The Oracle Analytics expression backing the column.
    */
    'formula'?: string;
    /**
    * Indicates whether this Oracle Analytics column represents time.
    */
    'isTime'?: boolean;
    /**
    * The Oracle Analytics column type.
    */
    'type'?: string;
    /**
    * Additional SQL metadata reported by Oracle Analytics for the column.
    */
    'sqlInfo'?: any;

}

export namespace OacObjectColumn {







    export function getJsonObj(obj: OacObjectColumn): object {
        const jsonObj = {...obj, ...{
            






        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OacObjectColumn): object {
        const jsonObj = {...obj, ...{
            






         }};

        
        
        return jsonObj;
    }
}
