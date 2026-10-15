// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* One resource and requested access type.
*/
export interface AccessGrantedForRequestItem {
    'resource': model.AccessGrantedForMasterCatalogResource| model.AccessGrantedForTableResource| model.AccessGrantedForFileResource| model.AccessGrantedForWorkspaceResource| model.AccessGrantedForCatalogResource| model.AccessGrantedForVolumeResource| model.AccessGrantedForDeltaShareResource| model.AccessGrantedForDatabaseResource| model.AccessGrantedForKnowledgeBaseResource| model.AccessGrantedForDatalakeResource| model.AccessGrantedForExternalCatalogResource| model.AccessGrantedForComputeResource| model.AccessGrantedForWorkflowResource| model.AccessGrantedForFolderResource| model.AccessGrantedForCredentialResource;
    /**
    * Lakeproxy access type for the selected resource.
    */
    'accessType': string;

}

export namespace AccessGrantedForRequestItem {



    export function getJsonObj(obj: AccessGrantedForRequestItem): object {
        const jsonObj = {...obj, ...{
            
                'resource': obj.resource ?
                
                
                model.AccessGrantedForResource.getJsonObj(obj.resource) : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForRequestItem): object {
        const jsonObj = {...obj, ...{
            
                    'resource': obj.resource ?
                
                
                model.AccessGrantedForResource.getDeserializedJsonObj(obj.resource) : undefined,

         }};

        
        
        return jsonObj;
    }
}
