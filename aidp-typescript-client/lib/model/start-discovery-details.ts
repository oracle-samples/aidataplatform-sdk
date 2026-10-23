// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Source selection and options for ontology discovery.
*/
export interface StartDiscoveryDetails {
    /**
    * Workspace key associated with the discovery request.
    */
    'workspace'?: string;
    /**
    * Project key. The service derives this from the target project for the action route.
    */
    'projectKey'?: string;
    /**
    * Optional label for the discovery job.
    */
    'displayName'?: string;
    /**
    * Sources selected for ontology discovery.
    */
    'sources': Array<model.DiscoverySource>;
    'options'?: model.DiscoveryOptions;

}

export namespace StartDiscoveryDetails {






    export function getJsonObj(obj: StartDiscoveryDetails): object {
        const jsonObj = {...obj, ...{
            



                'sources': obj.sources ?
                
                obj.sources.map((item)=>{return model.DiscoverySource.getJsonObj(item)})
                
                 : undefined,
                'options': obj.options ?
                
                
                model.DiscoveryOptions.getJsonObj(obj.options) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: StartDiscoveryDetails): object {
        const jsonObj = {...obj, ...{
            



                    'sources': obj.sources ?
                
                obj.sources.map((item)=>{return model.DiscoverySource.getDeserializedJsonObj(item)})
                
                 : undefined,
                    'options': obj.options ?
                
                
                model.DiscoveryOptions.getDeserializedJsonObj(obj.options) : undefined,
         }};

        
        
        return jsonObj;
    }
}
