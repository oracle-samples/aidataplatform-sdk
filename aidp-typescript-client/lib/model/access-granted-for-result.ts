// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Policy decision and enforcement artifacts. Null and empty values are distinct and are preserved.
*/
export interface AccessGrantedForResult {
    'resource': model.AccessGrantedForMasterCatalogResource| model.AccessGrantedForTableResource| model.AccessGrantedForFileResource| model.AccessGrantedForWorkspaceResource| model.AccessGrantedForCatalogResource| model.AccessGrantedForVolumeResource| model.AccessGrantedForDeltaShareResource| model.AccessGrantedForDatabaseResource| model.AccessGrantedForKnowledgeBaseResource| model.AccessGrantedForDatalakeResource| model.AccessGrantedForExternalCatalogResource| model.AccessGrantedForComputeResource| model.AccessGrantedForWorkflowResource| model.AccessGrantedForFolderResource| model.AccessGrantedForCredentialResource;
    /**
    * Lakeproxy evaluation decision, independent of permission to call this API.
    */
    'access': AccessGrantedForResult.Access;
    /**
    * Columns to filter, or null when not supplied by Lakeproxy.
    */
    'columnsToFilter'?: Array<string>;
    /**
    * Allowed columns, or null when enrichment is unavailable.
    */
    'allowedColumns'?: Array<string>;
    /**
    * Column names mapped to masking information, or null when enrichment is unavailable.
    */
    'maskedColumns'?: { [key: string]: model.AccessGrantedForMaskInfo; };
    /**
    * SQL row predicate verbatim, or null when not supplied.
    */
    'rowPredicate'?: string;

}

export namespace AccessGrantedForResult {


    export enum Access {
    
    Allowed = "ALLOWED",
    Denied = "DENIED",
    /**
    * This value is used if a service returns a value for this enum that is not recognized by this
    * version of the SDK.
    */
    UnknownValue = "UNKNOWN_VALUE"
}






    export function getJsonObj(obj: AccessGrantedForResult): object {
        const jsonObj = {...obj, ...{
            
                'resource': obj.resource ?
                
                
                model.AccessGrantedForResource.getJsonObj(obj.resource) : undefined,



                'maskedColumns': obj.maskedColumns ?
                
                
                common.mapContainer(obj.maskedColumns, model.AccessGrantedForMaskInfo.getJsonObj)
                 : undefined,

        }};

        
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: AccessGrantedForResult): object {
        const jsonObj = {...obj, ...{
            
                    'resource': obj.resource ?
                
                
                model.AccessGrantedForResource.getDeserializedJsonObj(obj.resource) : undefined,



                    'maskedColumns': obj.maskedColumns ?
                
                
                common.mapContainer(obj.maskedColumns, model.AccessGrantedForMaskInfo.getDeserializedJsonObj)
                 : undefined,

         }};

        
        
        return jsonObj;
    }
}
