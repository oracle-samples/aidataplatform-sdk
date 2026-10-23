// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Optional exact-match filters applied to correlated inference invocations before export.
*/
export interface ExportInferenceInvocationsFilters {
    /**
    * Only export invocations with this outcome. Accepts every status the export emits, including MALFORMED (a 4xx response) and UNKNOWN (no status code on the response event).
    */
    'status'?: model.InferenceInvocationStatus;
    /**
    * Only export invocations served by this model version. Accepted for forward compatibility; producer records do not carry a model version yet, so this filter currently matches no records.
    */
    'modelVersion'?: string;
    /**
    * Only export invocations whose request URI exactly matches this value.
    */
    'requestUri'?: string;

}

export namespace ExportInferenceInvocationsFilters {




    export function getJsonObj(obj: ExportInferenceInvocationsFilters): object {
        const jsonObj = {...obj, ...{
            

                'model_version': obj.modelVersion,

                'request_uri': obj.requestUri,

        }};

        delete (jsonObj as Partial<ExportInferenceInvocationsFilters>).modelVersion;delete (jsonObj as Partial<ExportInferenceInvocationsFilters>).requestUri;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: ExportInferenceInvocationsFilters): object {
        const jsonObj = {...obj, ...{
            

                'modelVersion': (obj as any)["model_version"],

                'requestUri': (obj as any)["request_uri"],

         }};

        delete (jsonObj as any)["model_version"];delete (jsonObj as any)["request_uri"];
        
        return jsonObj;
    }
}
