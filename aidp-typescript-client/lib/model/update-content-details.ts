// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

import * as model from '../model';
import common = require("oci-common");


/**
* Content model provides a programmatic interface to interact with notebooks, files and directories within DataLake Notebook environment.
* Type field is used to describe content types like file, directory or notebook. 
* Other notable fields are content and format. The content and format keys may be null if content is not contained.
* 
*/
export interface UpdateContentDetails {
    /**
    * Name of notebook, file or directory, equivalent to the last part of the path
    */
    'name'?: string;
    /**
    * Full path for notebook, file, or directory.
    */
    'path'?: string;
    /**
    * Type of Content model
    */
    'type'?: UpdateContentDetails.Type;
    /**
    * Content if requested (otherwise null). 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always of type unicode. For text-format file models, content simply contains the file\u2019s bytes after decoding as UTF-8. 
* Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. 
* For Directory model, content field contains a list of content-free models representing the entities in the directory.
* 
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
    /**
    * Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64. 
* For Directory model, format field is always JSON.
* 
    */
    'format'?: UpdateContentDetails.Format;

}

export namespace UpdateContentDetails {



    export enum Type {
    
    Notebook = "notebook",
    File = "file",
    Directory = "directory"

}








    export enum Format {
    
    Null = "NULL",
    Json = "json",
    Text = "text",
    Base64 = "base64"

}


    export function getJsonObj(obj: UpdateContentDetails): object {
        const jsonObj = {...obj, ...{
            




                'upload_id': obj.uploadId,

                'upload_chunk_index': obj.uploadChunkIndex,

                'total_chunks': obj.totalChunks,

                'total_size_bytes': obj.totalSizeBytes,



        }};

        delete (jsonObj as Partial<UpdateContentDetails>).uploadId;delete (jsonObj as Partial<UpdateContentDetails>).uploadChunkIndex;delete (jsonObj as Partial<UpdateContentDetails>).totalChunks;delete (jsonObj as Partial<UpdateContentDetails>).totalSizeBytes;
        
        return jsonObj;
    }
    ;
    export function getDeserializedJsonObj(obj: UpdateContentDetails): object {
        const jsonObj = {...obj, ...{
            




                'uploadId': (obj as any)["upload_id"],

                'uploadChunkIndex': (obj as any)["upload_chunk_index"],

                'totalChunks': (obj as any)["total_chunks"],

                'totalSizeBytes': (obj as any)["total_size_bytes"],



         }};

        delete (jsonObj as any)["upload_id"];delete (jsonObj as any)["upload_chunk_index"];delete (jsonObj as any)["total_chunks"];delete (jsonObj as any)["total_size_bytes"];
        
        return jsonObj;
    }
}
