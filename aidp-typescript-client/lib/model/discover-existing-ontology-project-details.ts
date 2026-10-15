// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request payload for discovering sources into an existing ontology project.
*/
export interface DiscoverExistingOntologyProjectDetails {
    'discovery': model.StartDiscoveryDetails;

}

export namespace DiscoverExistingOntologyProjectDetails {


    export function getJsonObj(obj: DiscoverExistingOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            
                'discovery': obj.discovery ?
                
                
                model.StartDiscoveryDetails.getJsonObj(obj.discovery) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DiscoverExistingOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            
                    'discovery': obj.discovery ?
                
                
                model.StartDiscoveryDetails.getDeserializedJsonObj(obj.discovery) : undefined,
         }};

        
        
        return jsonObj;
    }
}
