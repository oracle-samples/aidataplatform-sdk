// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Status and metadata for an asynchronous lineage import.
*/
export interface LineageImport {
    /**
    * Generated lineage import key.
    */
    'key': string;
    /**
    * Name of the producer that emitted the lineage event.
    */
    'producerName': string;
    /**
    * URI of the lineage producer.
    */
    'producerUri'?: string;
    /**
    * Namespace of the OpenLineage job.
    */
    'jobNamespace'?: string;
    /**
    * Time the import was accepted.
    */
    'timeCreated': Date;
    /**
    * Time import processing completed.
    */
    'timeFinished'?: Date;
    /**
    * Principal that submitted the import.
    */
    'createdBy'?: string;
    /**
    * Current processing state of the lineage import.
    */
    'lifecycleState': model.LineageImportLifecycleState;

}

export namespace LineageImport {









    export function getJsonObj(obj: LineageImport): object {
        const jsonObj = {...obj, ...{
            








        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageImport): object {
        const jsonObj = {...obj, ...{
            








         }};

        
        
        return jsonObj;
    }
}
