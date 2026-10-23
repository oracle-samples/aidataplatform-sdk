// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Destination, window, and filters for exporting correlated inference invocation records.
*/
export interface ExportInferenceInvocationsDetails {
    /**
    * Destination JSON file, as /Volumes/<catalog>/<schema>/<volume>/<path>.json. The caller must have write access to the destination volume. If the file already exists it is preserved and the export is written to a non-colliding name instead, unless is_overwrite is true. The path actually written is returned in the aidp-export-destination response header.
    */
    'volumeLocation': string;
    /**
    * Whether an existing destination file may be replaced in place. Defaults to false, in which case the existing file is preserved and _copy is appended before the extension until the name is free; the resolved path is returned in the aidp-export-destination response header. The request is rejected only when the requested name and its first 10 generated alternatives are all taken.
    */
    'isOverwrite'?: boolean;
    /**
    * Start of the exported publish-time window (RFC 3339, inclusive). Defaults to 30 days before timeEnd. The window must not exceed 30 days; export a longer history as consecutive windows. Body timestamps require millisecond precision. Example: 2026-09-01T00:00:00.000Z.
    */
    'timeStart'?: Date;
    /**
    * End of the exported publish-time window (RFC 3339, exclusive). Defaults to the current time. Must not be in the future. Body timestamps require millisecond precision. Example: 2026-10-01T00:00:00.000Z.
    */
    'timeEnd'?: Date;
    'filters'?: model.ExportInferenceInvocationsFilters;

}

export namespace ExportInferenceInvocationsDetails {






    export function getJsonObj(obj: ExportInferenceInvocationsDetails): object {
        const jsonObj = {...obj, ...{
            
                'volume_location': obj.volumeLocation,

                'is_overwrite': obj.isOverwrite,



                'filters': obj.filters ?
                
                
                model.ExportInferenceInvocationsFilters.getJsonObj(obj.filters) : undefined,
        }};

        delete (jsonObj as Partial<ExportInferenceInvocationsDetails>).volumeLocation;delete (jsonObj as Partial<ExportInferenceInvocationsDetails>).isOverwrite;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ExportInferenceInvocationsDetails): object {
        const jsonObj = {...obj, ...{
            
                'volumeLocation': (obj as any)["volume_location"],

                'isOverwrite': (obj as any)["is_overwrite"],



                    'filters': obj.filters ?
                
                
                model.ExportInferenceInvocationsFilters.getDeserializedJsonObj(obj.filters) : undefined,
         }};

        delete (jsonObj as any)["volume_location"];delete (jsonObj as any)["is_overwrite"];
        
        return jsonObj;
    }
}
