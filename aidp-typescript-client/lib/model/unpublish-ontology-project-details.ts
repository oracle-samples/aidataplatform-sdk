// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Details for removing published ontology project artifacts.
*/
export interface UnpublishOntologyProjectDetails {
    'comment'?: string;
    /**
    * Whether to delete stored publish artifacts such as compile reports. Defaults to true.
    */
    'deleteArtifacts'?: boolean;

}

export namespace UnpublishOntologyProjectDetails {



    export function getJsonObj(obj: UnpublishOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            


        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UnpublishOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            


         }};

        
        
        return jsonObj;
    }
}
