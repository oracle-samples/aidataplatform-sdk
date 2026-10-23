// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary of a lineage import log entry.
*/
export interface LineageImportLogSummary {
    /**
    * Generated identifier for the log entry.
    */
    'key'?: string;
    /**
    * Time the log entry was created.
    */
    'timeCreated'?: Date;
    /**
    * Type of diagnostic log entry.
    */
    'logType'?: string;
    /**
    * Human-readable diagnostic message.
    */
    'message'?: string;

}

export namespace LineageImportLogSummary {





    export function getJsonObj(obj: LineageImportLogSummary): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageImportLogSummary): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
