// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Dataset referenced by an imported OpenLineage run event.
*/
export interface LineageImportRunEventDataset {
    /**
    * Catalog-object key when the dataset is linked to an AIDP object.
    */
    'key'?: string;
    /**
    * Namespace of the dataset.
    */
    'namespace'?: string;
    /**
    * Name of the dataset.
    */
    'name'?: string;
    /**
    * Type of the dataset when available.
    */
    'type'?: string;

}

export namespace LineageImportRunEventDataset {





    export function getJsonObj(obj: LineageImportRunEventDataset): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: LineageImportRunEventDataset): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
