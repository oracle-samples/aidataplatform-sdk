// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Path of file to copy. A POST to /api/contents/path creates a New untitled, empty file or directory. A POST to /api/contents/path with body {'copy_from': '/path/to/OtherNotebook.ipynb'} creates a new copy of OtherNotebook in path.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateContentDetails.Builder.class)

public final class CreateContentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"copyFrom", "ext", "type", "format", "content", "uploadId", "uploadChunkIndex", "totalChunks", "totalSizeBytes", "sha256"})
    public CreateContentDetails(String copyFrom, String ext, Content.Type type, Format format, Object content, String uploadId, Integer uploadChunkIndex, Integer totalChunks, Integer totalSizeBytes, String sha256) {
        super();
        this.copyFrom = copyFrom;
        this.ext = ext;
        this.type = type;
        this.format = format;
        this.content = content;
        this.uploadId = uploadId;
        this.uploadChunkIndex = uploadChunkIndex;
        this.totalChunks = totalChunks;
        this.totalSizeBytes = totalSizeBytes;
        this.sha256 = sha256;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("copy_from")
private String copyFrom;

        /**
         * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
         * @param copyFrom the value to set
         * @return this builder
         **/
        

public Builder copyFrom(String copyFrom) {
    this.copyFrom = copyFrom;
    return this;
}
            /**
     * File format extension
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ext")
private String ext;

        /**
         * File format extension
         * @param ext the value to set
         * @return this builder
         **/
        

public Builder ext(String ext) {
    this.ext = ext;
    return this;
}
            /**
     * Type of Content model. Either notebook, file, or directory.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Content.Type type;

        /**
         * Type of Content model. Either notebook, file, or directory.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Content.Type type) {
    this.type = type;
    return this;
}
            /**
     * Content format. Chunked notebook uploads require json.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("format")
private Format format;

        /**
         * Content format. Chunked notebook uploads require json.
         * @param format the value to set
         * @return this builder
         **/
        

public Builder format(Format format) {
    this.format = format;
    return this;
}
            /**
     * Base64-encoded notebook content chunk when upload_id is supplied.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("content")
private Object content;

        /**
         * Base64-encoded notebook content chunk when upload_id is supplied.
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


        public CreateContentDetails build() {
            CreateContentDetails model = new CreateContentDetails(this.copyFrom
                , this.ext
                , this.type
                , this.format
                , this.content
                , this.uploadId
                , this.uploadChunkIndex
                , this.totalChunks
                , this.totalSizeBytes
                , this.sha256);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateContentDetails model) {
                this.copyFrom(model.getCopyFrom());
    this.ext(model.getExt());
    this.type(model.getType());
    this.format(model.getFormat());
    this.content(model.getContent());
    this.uploadId(model.getUploadId());
    this.uploadChunkIndex(model.getUploadChunkIndex());
    this.totalChunks(model.getTotalChunks());
    this.totalSizeBytes(model.getTotalSizeBytes());
    this.sha256(model.getSha256());
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
     * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("copy_from")
    private final String copyFrom;

        /**
     * Copy from Path. For example, /path/to/OtherNotebook.ipynb.
     * @return the value
     **/
    
    public String getCopyFrom() {
        return copyFrom;
    }


        /**
     * File format extension
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ext")
    private final String ext;

        /**
     * File format extension
     * @return the value
     **/
    
    public String getExt() {
        return ext;
    }


        /**
     * Type of Content model. Either notebook, file, or directory.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Content.Type type;

        /**
     * Type of Content model. Either notebook, file, or directory.
     * @return the value
     **/
    
    public Content.Type getType() {
        return type;
    }

    /**
     * Content format. Chunked notebook uploads require json.
     **/
    public enum Format implements com.oracle.bmc.http.internal.BmcEnum {
        Json("json"),
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
     * Content format. Chunked notebook uploads require json.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final Format format;

        /**
     * Content format. Chunked notebook uploads require json.
     * @return the value
     **/
    
    public Format getFormat() {
        return format;
    }


        /**
     * Base64-encoded notebook content chunk when upload_id is supplied.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final Object content;

        /**
     * Base64-encoded notebook content chunk when upload_id is supplied.
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
        sb.append("CreateContentDetails(");
        sb.append("copyFrom=").append(String.valueOf(this.copyFrom));
        sb.append(", ext=").append(String.valueOf(this.ext));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", uploadId=").append(String.valueOf(this.uploadId));
        sb.append(", uploadChunkIndex=").append(String.valueOf(this.uploadChunkIndex));
        sb.append(", totalChunks=").append(String.valueOf(this.totalChunks));
        sb.append(", totalSizeBytes=").append(String.valueOf(this.totalSizeBytes));
        sb.append(", sha256=").append(String.valueOf(this.sha256));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateContentDetails)) {
            return false;
        }

        CreateContentDetails other = (CreateContentDetails) o;
        return java.util.Objects.equals(this.copyFrom, other.copyFrom) &&
            java.util.Objects.equals(this.ext, other.ext) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.format, other.format) &&
            java.util.Objects.equals(this.content, other.content) &&
            java.util.Objects.equals(this.uploadId, other.uploadId) &&
            java.util.Objects.equals(this.uploadChunkIndex, other.uploadChunkIndex) &&
            java.util.Objects.equals(this.totalChunks, other.totalChunks) &&
            java.util.Objects.equals(this.totalSizeBytes, other.totalSizeBytes) &&
            java.util.Objects.equals(this.sha256, other.sha256);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.copyFrom == null ? 43 : this.copyFrom.hashCode());
        result = (result * PRIME) + (this.ext == null ? 43 : this.ext.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.uploadId == null ? 43 : this.uploadId.hashCode());
        result = (result * PRIME) + (this.uploadChunkIndex == null ? 43 : this.uploadChunkIndex.hashCode());
        result = (result * PRIME) + (this.totalChunks == null ? 43 : this.totalChunks.hashCode());
        result = (result * PRIME) + (this.totalSizeBytes == null ? 43 : this.totalSizeBytes.hashCode());
        result = (result * PRIME) + (this.sha256 == null ? 43 : this.sha256.hashCode());
        return result;
    }


}
