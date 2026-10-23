// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Workspace-volume location and contents of discovery artifacts.
*/
export interface OntologyDiscoveryArtifacts {
    /**
    * Artifact volume key.
    */
    'volumeKey'?: string;
    /**
    * Artifact folder path.
    */
    'folder'?: string;
    /**
    * Discovery artifacts.
    */
    'items'?: Array<model.OntologyDiscoveryArtifactItem>;

}

export namespace OntologyDiscoveryArtifacts {




    export function getJsonObj(obj: OntologyDiscoveryArtifacts): object {
        const jsonObj = {...obj, ...{
            


                'items': obj.items ?
                
                obj.items.map((item)=>{return model.OntologyDiscoveryArtifactItem.getJsonObj(item)})
                
                 : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: OntologyDiscoveryArtifacts): object {
        const jsonObj = {...obj, ...{
            


                    'items': obj.items ?
                
                obj.items.map((item)=>{return model.OntologyDiscoveryArtifactItem.getDeserializedJsonObj(item)})
                
                 : undefined,
         }};

        
        
        return jsonObj;
    }
}
