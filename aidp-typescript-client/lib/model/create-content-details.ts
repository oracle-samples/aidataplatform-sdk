// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Path of file to copy. A POST to /api/contents/path creates a New untitled, empty file or directory. A POST to /api/contents/path with body {'copy_from': '/path/to/OtherNotebook.ipynb'} creates a new copy of OtherNotebook in path.
*/
export interface CreateContentDetails {
    /**
    * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
    */
    'copyFrom'?: string;
    /**
    * File format extension
    */
    'ext'?: string;
    /**
    * Type of Content model. Either notebook, file, or directory.
    */
    'type'?: string;
    /**
    * Content format. Chunked notebook uploads require json.
    */
    'format'?: CreateContentDetails.Format;
    /**
    * Base64-encoded notebook content chunk when upload_id is supplied.
    */
    'content'?: any;
    /**
    * UI-generated UUID that identifies one notebook upload.
    */
    'uploadId'?: string;
    /**
    * One-based upload chunk index, or -1 for the final upload chunk. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'uploadChunkIndex'?: number;
    /**
    * Total request chunks, including the final chunk. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'totalChunks'?: number;
    /**
    * Total decoded notebook bytes. Note: Numbers greater than Number.MAX_SAFE_INTEGER will result in rounding issues.
    */
    'totalSizeBytes'?: number;
    /**
    * SHA-256 digest of the complete decoded notebook content.
    */
    'sha256'?: string;

}

export namespace CreateContentDetails {




    export enum Format {
    
    Json = "json"

}








    export function getJsonObj(obj: CreateContentDetails): object {
        const jsonObj = {...obj, ...{
            
                'copy_from': obj.copyFrom,





                'upload_id': obj.uploadId,

                'upload_chunk_index': obj.uploadChunkIndex,

                'total_chunks': obj.totalChunks,

                'total_size_bytes': obj.totalSizeBytes,


        }};

        delete (jsonObj as Partial<CreateContentDetails>).copyFrom;delete (jsonObj as Partial<CreateContentDetails>).uploadId;delete (jsonObj as Partial<CreateContentDetails>).uploadChunkIndex;delete (jsonObj as Partial<CreateContentDetails>).totalChunks;delete (jsonObj as Partial<CreateContentDetails>).totalSizeBytes;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: CreateContentDetails): object {
        const jsonObj = {...obj, ...{
            
                'copyFrom': (obj as any)["copy_from"],





                'uploadId': (obj as any)["upload_id"],

                'uploadChunkIndex': (obj as any)["upload_chunk_index"],

                'totalChunks': (obj as any)["total_chunks"],

                'totalSizeBytes': (obj as any)["total_size_bytes"],


         }};

        delete (jsonObj as any)["copy_from"];delete (jsonObj as any)["upload_id"];delete (jsonObj as any)["upload_chunk_index"];delete (jsonObj as any)["total_chunks"];delete (jsonObj as any)["total_size_bytes"];
        
        return jsonObj;
    }
}
