// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Diagnostic log entry produced while processing a lineage import.
*/
export interface LineageImportLog {
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

export namespace LineageImportLog {





    export function getJsonObj(obj: LineageImportLog): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageImportLog): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
