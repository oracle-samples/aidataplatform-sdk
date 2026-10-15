// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Content model provides a programmatic interface to interact with notebooks, files and directories within DataLake Notebook environment.
* Type field is used to describe content types like file, directory or notebook. 
* Other notable fields are content and format. The content and format keys may be null if content is not contained.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateContentDetails.Builder.class)

public final class UpdateContentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "path", "type", "content", "uploadId", "uploadChunkIndex", "totalChunks", "totalSizeBytes", "sha256", "format"})
    public UpdateContentDetails(String name, String path, Type type, Object content, String uploadId, Integer uploadChunkIndex, Integer totalChunks, Integer totalSizeBytes, String sha256, Format format) {
        super();
        this.name = name;
        this.path = path;
        this.type = type;
        this.content = content;
        this.uploadId = uploadId;
        this.uploadChunkIndex = uploadChunkIndex;
        this.totalChunks = totalChunks;
        this.totalSizeBytes = totalSizeBytes;
        this.sha256 = sha256;
        this.format = format;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of notebook, file or directory, equivalent to the last part of the path
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of notebook, file or directory, equivalent to the last part of the path
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Full path for notebook, file, or directory.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Full path for notebook, file, or directory.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Type of Content model
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

        /**
         * Type of Content model
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * Content if requested (otherwise null). 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always of type unicode. For text-format file models, content simply contains the file\u2019s bytes after decoding as UTF-8. 
* Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. 
* For Directory model, content field contains a list of content-free models representing the entities in the directory.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("content")
private Object content;

        /**
         * Content if requested (otherwise null). 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always of type unicode. For text-format file models, content simply contains the file\u2019s bytes after decoding as UTF-8. 
* Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. 
* For Directory model, content field contains a list of content-free models representing the entities in the directory.
* 
         * @param content the value to set
         * @return this builder
         **/
        

public Builder content(Object content) {
    this.content = content;
    return this;
}
            /**
     * UI-generated UUID that identifies one notebook upload.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("upload_id")
private String uploadId;

        /**
         * UI-generated UUID that identifies one notebook upload.
         * @param uploadId the value to set
         * @return this builder
         **/
        

public Builder uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
}
            /**
     * One-based upload chunk index, or -1 for the final upload chunk.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("upload_chunk_index")
private Integer uploadChunkIndex;

        /**
         * One-based upload chunk index, or -1 for the final upload chunk.
         * @param uploadChunkIndex the value to set
         * @return this builder
         **/
        

public Builder uploadChunkIndex(Integer uploadChunkIndex) {
    this.uploadChunkIndex = uploadChunkIndex;
    return this;
}
            /**
     * Total request chunks, including the final chunk.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("total_chunks")
private Integer totalChunks;

        /**
         * Total request chunks, including the final chunk.
         * @param totalChunks the value to set
         * @return this builder
         **/
        

public Builder totalChunks(Integer totalChunks) {
    this.totalChunks = totalChunks;
    return this;
}
            /**
     * Total decoded notebook bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("total_size_bytes")
private Integer totalSizeBytes;

        /**
         * Total decoded notebook bytes.
         * @param totalSizeBytes the value to set
         * @return this builder
         **/
        

public Builder totalSizeBytes(Integer totalSizeBytes) {
    this.totalSizeBytes = totalSizeBytes;
    return this;
}
            /**
     * SHA-256 digest of the complete decoded notebook content.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sha256")
private String sha256;

        /**
         * SHA-256 digest of the complete decoded notebook content.
         * @param sha256 the value to set
         * @return this builder
         **/
        

public Builder sha256(String sha256) {
    this.sha256 = sha256;
    return this;
}
            /**
     * Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64. 
* For Directory model, format field is always JSON.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("format")
private Format format;

        /**
         * Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64. 
* For Directory model, format field is always JSON.
* 
         * @param format the value to set
         * @return this builder
         **/
        

public Builder format(Format format) {
    this.format = format;
    return this;
}


        public UpdateContentDetails build() {
            UpdateContentDetails model = new UpdateContentDetails(this.name
                , this.path
                , this.type
                , this.content
                , this.uploadId
                , this.uploadChunkIndex
                , this.totalChunks
                , this.totalSizeBytes
                , this.sha256
                , this.format);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateContentDetails model) {
                this.name(model.getName());
    this.path(model.getPath());
    this.type(model.getType());
    this.content(model.getContent());
    this.uploadId(model.getUploadId());
    this.uploadChunkIndex(model.getUploadChunkIndex());
    this.totalChunks(model.getTotalChunks());
    this.totalSizeBytes(model.getTotalSizeBytes());
    this.sha256(model.getSha256());
    this.format(model.getFormat());
return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }


    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    


        /**
     * Name of notebook, file or directory, equivalent to the last part of the path
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of notebook, file or directory, equivalent to the last part of the path
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Full path for notebook, file, or directory.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Full path for notebook, file, or directory.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }

    /**
     * Type of Content model
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Notebook("notebook"),
        File("file"),
        Directory("directory"),
        ;

        

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
        /**
     * Type of Content model
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Type of Content model
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * Content if requested (otherwise null). 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always of type unicode. For text-format file models, content simply contains the file\u2019s bytes after decoding as UTF-8. 
* Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. 
* For Directory model, content field contains a list of content-free models representing the entities in the directory.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final Object content;

        /**
     * Content if requested (otherwise null). 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always of type unicode. For text-format file models, content simply contains the file\u2019s bytes after decoding as UTF-8. 
* Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. 
* For Directory model, content field contains a list of content-free models representing the entities in the directory.
* 
     * @return the value
     **/
    
    public Object getContent() {
        return content;
    }


        /**
     * UI-generated UUID that identifies one notebook upload.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("upload_id")
    private final String uploadId;

        /**
     * UI-generated UUID that identifies one notebook upload.
     * @return the value
     **/
    
    public String getUploadId() {
        return uploadId;
    }


        /**
     * One-based upload chunk index, or -1 for the final upload chunk.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("upload_chunk_index")
    private final Integer uploadChunkIndex;

        /**
     * One-based upload chunk index, or -1 for the final upload chunk.
     * @return the value
     **/
    
    public Integer getUploadChunkIndex() {
        return uploadChunkIndex;
    }


        /**
     * Total request chunks, including the final chunk.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("total_chunks")
    private final Integer totalChunks;

        /**
     * Total request chunks, including the final chunk.
     * @return the value
     **/
    
    public Integer getTotalChunks() {
        return totalChunks;
    }


        /**
     * Total decoded notebook bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("total_size_bytes")
    private final Integer totalSizeBytes;

        /**
     * Total decoded notebook bytes.
     * @return the value
     **/
    
    public Integer getTotalSizeBytes() {
        return totalSizeBytes;
    }


        /**
     * SHA-256 digest of the complete decoded notebook content.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sha256")
    private final String sha256;

        /**
     * SHA-256 digest of the complete decoded notebook content.
     * @return the value
     **/
    
    public String getSha256() {
        return sha256;
    }

    /**
     * Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64. 
* For Directory model, format field is always JSON.
* 
     **/
    public enum Format implements com.oracle.bmc.http.internal.BmcEnum {
        Null("NULL"),
        Json("json"),
        Text("text"),
        Base64("base64"),
        ;

        

        private final String value;
        private static java.util.Map<String, Format> map;

        static {
            map = new java.util.HashMap<>();
            for (Format v : Format.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Format(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Format create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Format: " + key);
        }
    };
        /**
     * Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64. 
* For Directory model, format field is always JSON.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final Format format;

        /**
     * Format of content. For Notebook model, format field is always JSON. For File model, format field is either Text or Base64. 
* For Directory model, format field is always JSON.
* 
     * @return the value
     **/
    
    public Format getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateContentDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", uploadId=").append(String.valueOf(this.uploadId));
        sb.append(", uploadChunkIndex=").append(String.valueOf(this.uploadChunkIndex));
        sb.append(", totalChunks=").append(String.valueOf(this.totalChunks));
        sb.append(", totalSizeBytes=").append(String.valueOf(this.totalSizeBytes));
        sb.append(", sha256=").append(String.valueOf(this.sha256));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateContentDetails)) {
            return false;
        }

        UpdateContentDetails other = (UpdateContentDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.content, other.content) &&
            java.util.Objects.equals(this.uploadId, other.uploadId) &&
            java.util.Objects.equals(this.uploadChunkIndex, other.uploadChunkIndex) &&
            java.util.Objects.equals(this.totalChunks, other.totalChunks) &&
            java.util.Objects.equals(this.totalSizeBytes, other.totalSizeBytes) &&
            java.util.Objects.equals(this.sha256, other.sha256) &&
            java.util.Objects.equals(this.format, other.format);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.uploadId == null ? 43 : this.uploadId.hashCode());
        result = (result * PRIME) + (this.uploadChunkIndex == null ? 43 : this.uploadChunkIndex.hashCode());
        result = (result * PRIME) + (this.totalChunks == null ? 43 : this.totalChunks.hashCode());
        result = (result * PRIME) + (this.totalSizeBytes == null ? 43 : this.totalSizeBytes.hashCode());
        result = (result * PRIME) + (this.sha256 == null ? 43 : this.sha256.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        return result;
    }


}
