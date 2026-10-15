// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Request payload for creating an ontology project from discovered sources.
*/
export interface DiscoverOntologyProjectDetails {
    'project': model.CreateOntologyProjectDetails;
    'discovery': model.StartDiscoveryDetails;

}

export namespace DiscoverOntologyProjectDetails {



    export function getJsonObj(obj: DiscoverOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            
                'project': obj.project ?
                
                
                model.CreateOntologyProjectDetails.getJsonObj(obj.project) : undefined,
                'discovery': obj.discovery ?
                
                
                model.StartDiscoveryDetails.getJsonObj(obj.discovery) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DiscoverOntologyProjectDetails): object {
        const jsonObj = {...obj, ...{
            
                    'project': obj.project ?
                
                
                model.CreateOntologyProjectDetails.getDeserializedJsonObj(obj.project) : undefined,
                    'discovery': obj.discovery ?
                
                
                model.StartDiscoveryDetails.getDeserializedJsonObj(obj.discovery) : undefined,
         }};

        
        
        return jsonObj;
    }
}
