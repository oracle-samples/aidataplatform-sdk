// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Summary of one DFL connection registry entry.
*/
export interface OntologyDflConnection {
    /**
    * Exact DFL connection URI, for example {@code oracle://biairline}.
    */
    'uri'?: string;
    /**
    * DFL connection kind reported by the registry, for example {@code jdbc} or {@code duckdb}.
    */
    'kind'?: string;
    /**
    * DFL's verdict from its last probe of this connection, for example {@code healthy} or {@code degraded}.
* Registration succeeding does not mean the connection works; this is what says whether it does.
* Absent until DFL has probed the connection, which happens shortly after it is registered.
* 
    */
    'healthStatus'?: string;

}

export namespace OntologyDflConnection {




    export function getJsonObj(obj: OntologyDflConnection): object {
        const jsonObj = {...obj, ...{
            



        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyDflConnection): object {
        const jsonObj = {...obj, ...{
            



         }};

        
        
        return jsonObj;
    }
}
