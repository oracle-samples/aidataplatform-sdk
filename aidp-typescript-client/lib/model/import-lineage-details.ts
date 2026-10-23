// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details used to submit a lineage payload for import.
*/
export interface ImportLineageDetails {
    /**
    * User-friendly lineage producer name.
    */
    'producerName': string;
    /**
    * Type of the lineage payload. Currently, {@code OPEN_LINEAGE_RUN_EVENT} is supported.
    */
    'payloadType': ImportLineageDetails.PayloadType;
    /**
    * Base64-encoded GZIP-compressed UTF-8 JSON array of payloads of the specified {@code payloadType}. The Base64-decoded GZIP payload must not exceed 5 MiB and the decompressed JSON must not exceed 50 MiB.
    */
    'lineagePayload': string;

}

export namespace ImportLineageDetails {


    export enum PayloadType {
    
    OpenLineageRunEvent = "OPEN_LINEAGE_RUN_EVENT"

}



    export function getJsonObj(obj: ImportLineageDetails): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ImportLineageDetails): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
