// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


export interface DiscoverySource {
    'sourceType': DiscoverySource.SourceType;
    /**
    * Source kind forwarded to DFL; defaults per sourceType (catalog, credential_store, volume)
    */
    'kind'?: string;
    /**
    * Connection or catalog key; volume key for DOCUMENTS and TTL sources
    */
    'key'?: string;
    'catalogType'?: DiscoverySource.CatalogType;
    'profiling'?: boolean;
    'location'?: model.DiscoveryLocation;
    'ontologyTtl'?: model.DiscoveryLocation;
    'mode'?: DiscoverySource.Mode;
    'validateOnly'?: boolean;
    'selection'?: model.DiscoverySelection;

}

export namespace DiscoverySource {

    export enum SourceType {
    
    CatalogConnection = "CATALOG_CONNECTION",
    CredStore = "CRED_STORE",
    Ttl = "TTL",
    Documents = "DOCUMENTS"

}




    export enum CatalogType {
    
    Internal = "INTERNAL",
    External = "EXTERNAL"

}





    export enum Mode {
    
    BuildFromScratch = "BUILD_FROM_SCRATCH",
    Enrich = "ENRICH",
    Discover = "DISCOVER"

}




    export function getJsonObj(obj: DiscoverySource): object {
        const jsonObj = {...obj, ...{
            





                'location': obj.location ?
                
                
                model.DiscoveryLocation.getJsonObj(obj.location) : undefined,
                'ontologyTtl': obj.ontologyTtl ?
                
                
                model.DiscoveryLocation.getJsonObj(obj.ontologyTtl) : undefined,


                'selection': obj.selection ?
                
                
                model.DiscoverySelection.getJsonObj(obj.selection) : undefined,
        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: DiscoverySource): object {
        const jsonObj = {...obj, ...{
            





                    'location': obj.location ?
                
                
                model.DiscoveryLocation.getDeserializedJsonObj(obj.location) : undefined,
                    'ontologyTtl': obj.ontologyTtl ?
                
                
                model.DiscoveryLocation.getDeserializedJsonObj(obj.ontologyTtl) : undefined,


                    'selection': obj.selection ?
                
                
                model.DiscoverySelection.getDeserializedJsonObj(obj.selection) : undefined,
         }};

        
        
        return jsonObj;
    }
}
