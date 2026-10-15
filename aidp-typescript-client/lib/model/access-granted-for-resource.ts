// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Lakeproxy resource selected by resourceType.
*/
export interface AccessGrantedForResource {

   "resourceType": string;
}

export namespace AccessGrantedForResource {

    export function getJsonObj(obj: AccessGrantedForResource): object {
        const jsonObj = {...obj, ...{
            
        }};

        
        
        if (obj && "resourceType" in obj && obj.resourceType) {
            switch (obj.resourceType) {
                case "CENTRIFYCATALOG":
                    return model.AccessGrantedForMasterCatalogResource.getJsonObj(<model.AccessGrantedForMasterCatalogResource>(<object>jsonObj), true);
                case "TABLE":
                    return model.AccessGrantedForTableResource.getJsonObj(<model.AccessGrantedForTableResource>(<object>jsonObj), true);
                case "FILE":
                    return model.AccessGrantedForFileResource.getJsonObj(<model.AccessGrantedForFileResource>(<object>jsonObj), true);
                case "WORKSPACE":
                    return model.AccessGrantedForWorkspaceResource.getJsonObj(<model.AccessGrantedForWorkspaceResource>(<object>jsonObj), true);
                case "CATALOG":
                    return model.AccessGrantedForCatalogResource.getJsonObj(<model.AccessGrantedForCatalogResource>(<object>jsonObj), true);
                case "VOLUME":
                    return model.AccessGrantedForVolumeResource.getJsonObj(<model.AccessGrantedForVolumeResource>(<object>jsonObj), true);
                case "DELTASHARE":
                    return model.AccessGrantedForDeltaShareResource.getJsonObj(<model.AccessGrantedForDeltaShareResource>(<object>jsonObj), true);
                case "DATABASE":
                    return model.AccessGrantedForDatabaseResource.getJsonObj(<model.AccessGrantedForDatabaseResource>(<object>jsonObj), true);
                case "KNOWLEDGE_BASE":
                    return model.AccessGrantedForKnowledgeBaseResource.getJsonObj(<model.AccessGrantedForKnowledgeBaseResource>(<object>jsonObj), true);
                case "DATALAKE":
                    return model.AccessGrantedForDatalakeResource.getJsonObj(<model.AccessGrantedForDatalakeResource>(<object>jsonObj), true);
                case "EXTERNALCATALOG":
                    return model.AccessGrantedForExternalCatalogResource.getJsonObj(<model.AccessGrantedForExternalCatalogResource>(<object>jsonObj), true);
                case "COMPUTE":
                    return model.AccessGrantedForComputeResource.getJsonObj(<model.AccessGrantedForComputeResource>(<object>jsonObj), true);
                case "WORKFLOW":
                    return model.AccessGrantedForWorkflowResource.getJsonObj(<model.AccessGrantedForWorkflowResource>(<object>jsonObj), true);
                case "FOLDER":
                    return model.AccessGrantedForFolderResource.getJsonObj(<model.AccessGrantedForFolderResource>(<object>jsonObj), true);
                case "CREDENTIAL":
                    return model.AccessGrantedForCredentialResource.getJsonObj(<model.AccessGrantedForCredentialResource>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.resourceType}`)

        }
        }
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForResource): object {
        const jsonObj = {...obj, ...{
            
         }};

        
        
        if (obj && "resourceType" in obj && obj.resourceType) {
            switch (obj.resourceType) {
                case "CENTRIFYCATALOG":
                    return model.AccessGrantedForMasterCatalogResource.getDeserializedJsonObj(<model.AccessGrantedForMasterCatalogResource>(<object>jsonObj), true);
                case "TABLE":
                    return model.AccessGrantedForTableResource.getDeserializedJsonObj(<model.AccessGrantedForTableResource>(<object>jsonObj), true);
                case "FILE":
                    return model.AccessGrantedForFileResource.getDeserializedJsonObj(<model.AccessGrantedForFileResource>(<object>jsonObj), true);
                case "WORKSPACE":
                    return model.AccessGrantedForWorkspaceResource.getDeserializedJsonObj(<model.AccessGrantedForWorkspaceResource>(<object>jsonObj), true);
                case "CATALOG":
                    return model.AccessGrantedForCatalogResource.getDeserializedJsonObj(<model.AccessGrantedForCatalogResource>(<object>jsonObj), true);
                case "VOLUME":
                    return model.AccessGrantedForVolumeResource.getDeserializedJsonObj(<model.AccessGrantedForVolumeResource>(<object>jsonObj), true);
                case "DELTASHARE":
                    return model.AccessGrantedForDeltaShareResource.getDeserializedJsonObj(<model.AccessGrantedForDeltaShareResource>(<object>jsonObj), true);
                case "DATABASE":
                    return model.AccessGrantedForDatabaseResource.getDeserializedJsonObj(<model.AccessGrantedForDatabaseResource>(<object>jsonObj), true);
                case "KNOWLEDGE_BASE":
                    return model.AccessGrantedForKnowledgeBaseResource.getDeserializedJsonObj(<model.AccessGrantedForKnowledgeBaseResource>(<object>jsonObj), true);
                case "DATALAKE":
                    return model.AccessGrantedForDatalakeResource.getDeserializedJsonObj(<model.AccessGrantedForDatalakeResource>(<object>jsonObj), true);
                case "EXTERNALCATALOG":
                    return model.AccessGrantedForExternalCatalogResource.getDeserializedJsonObj(<model.AccessGrantedForExternalCatalogResource>(<object>jsonObj), true);
                case "COMPUTE":
                    return model.AccessGrantedForComputeResource.getDeserializedJsonObj(<model.AccessGrantedForComputeResource>(<object>jsonObj), true);
                case "WORKFLOW":
                    return model.AccessGrantedForWorkflowResource.getDeserializedJsonObj(<model.AccessGrantedForWorkflowResource>(<object>jsonObj), true);
                case "FOLDER":
                    return model.AccessGrantedForFolderResource.getDeserializedJsonObj(<model.AccessGrantedForFolderResource>(<object>jsonObj), true);
                case "CREDENTIAL":
                    return model.AccessGrantedForCredentialResource.getDeserializedJsonObj(<model.AccessGrantedForCredentialResource>(<object>jsonObj), true);
                default:
                    if (common.LOG.logger) common.LOG.logger.info(`Unknown value for: ${obj.resourceType}`)
        }
        }
        return jsonObj;
    }
}
