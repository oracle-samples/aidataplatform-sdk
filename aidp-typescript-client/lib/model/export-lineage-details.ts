// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* The information needed to export lineage as CSV.
*/
export interface ExportLineageDetails {
    /**
    * Root entity node from which lineage is to be exported.
* Example format: {@code aidp://catalogs@<aidpocid>/o/{catalog.db.table}}.
* 
    */
    'anchorNode': string;
    /**
    * Direction of the lineage returned.
    */
    'direction': model.LineageDirection;

}

export namespace ExportLineageDetails {



    export function getJsonObj(obj: ExportLineageDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ExportLineageDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
