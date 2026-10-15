// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Address and state of the service-managed DFL compute for a workspace.
*/
export interface OntologyManagerDflCompute {
    /**
    * Base URI to address the compute through the DataFlow gateway, which is what a caller needs in order to send it a request. Already includes the API version and the compute key.
    */
    'gatewayUri'?: string;
    /**
    * Key of the DFL compute.
    */
    'clusterKey'?: string;
    /**
    * Lifecycle state of the compute, when it is known.
    */
    'state'?: string;
    /**
    * Whether DI Agent compute is enabled for this AI Data Platform instance.
    */
    'isEnabled': boolean;

}

export namespace OntologyManagerDflCompute {





    export function getJsonObj(obj: OntologyManagerDflCompute): object {
        const jsonObj = {...obj, ...{
            




        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyManagerDflCompute): object {
        const jsonObj = {...obj, ...{
            




         }};

        
        
        return jsonObj;
    }
}
