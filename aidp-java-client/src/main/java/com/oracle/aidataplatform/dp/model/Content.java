package com.oracle.aidataplatform.dp.model;



/**
 * Content model provides a programmatic interface to interact with notebooks, files and directories within the AI Data Platform Workbench Notebook environment.
* Type field is used to describe content types like file, directory or notebook. 
* Other notable fields are content and format. The content and format keys may be null if content is not contained.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Content.Builder.class)

public final class Content  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "path", "type", "writable", "created", "lastModified", "size", "mimetype", "content", "format", "hash", "hashAlgorithm", "description"})
    public Content(String name, String path, Type type, Boolean writable, java.util.Date created, java.util.Date lastModified, Integer size, String mimetype, Object content, Format format, String hash, String hashAlgorithm, String description) {
        super();
        this.name = name;
        this.path = path;
        this.type = type;
        this.writable = writable;
        this.created = created;
        this.lastModified = lastModified;
        this.size = size;
        this.mimetype = mimetype;
        this.content = content;
        this.format = format;
        this.hash = hash;
        this.hashAlgorithm = hashAlgorithm;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of notebook, file or directory, equivalent to the last part of the path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of notebook, file or directory, equivalent to the last part of the path.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Full path for notebook, file or directory.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Full path for notebook, file or directory.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Type of content model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

        /**
         * Type of content model.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * Indicates whether the requester has permission to edit the file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("writable")
private Boolean writable;

        /**
         * Indicates whether the requester has permission to edit the file.
         * @param writable the value to set
         * @return this builder
         **/
        

public Builder writable(Boolean writable) {
    this.writable = writable;
    return this;
}
            /**
     * Creation timestamp.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("created")
private java.util.Date created;

        /**
         * Creation timestamp.
         * @param created the value to set
         * @return this builder
         **/
        

public Builder created(java.util.Date created) {
    this.created = created;
    return this;
}
            /**
     * Last modified timestamp.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("last_modified")
private java.util.Date lastModified;

        /**
         * Last modified timestamp.
         * @param lastModified the value to set
         * @return this builder
         **/
        

public Builder lastModified(java.util.Date lastModified) {
    this.lastModified = lastModified;
    return this;
}
            /**
     * Size of file or notebook in bytes. If no size is provided, defaults to null.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("size")
private Integer size;

        /**
         * Size of file or notebook in bytes. If no size is provided, defaults to null.
         * @param size the value to set
         * @return this builder
         **/
        

public Builder size(Integer size) {
    this.size = size;
    return this;
}
            /**
     * Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', 
* this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("mimetype")
private String mimetype;

        /**
         * Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', 
* this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
* 
         * @param mimetype the value to set
         * @return this builder
         **/
        

public Builder mimetype(String mimetype) {
    this.mimetype = mimetype;
    return this;
}
            /**
     * Content if requested, otherwise is Null. 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. 
* Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. 
* For Directory model, content field contains a list of content-free models representing the entities in the directory.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("content")
private Object content;

        /**
         * Content if requested, otherwise is Null. 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. 
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
     * Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. 
* For directory model, format field is always 'json'.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("format")
private Format format;

        /**
         * Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. 
* For directory model, format field is always 'json'.
* 
         * @param format the value to set
         * @return this builder
         **/
        

public Builder format(Format format) {
    this.format = format;
    return this;
}
            /**
     * [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("hash")
private String hash;

        /**
         * [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
* 
         * @param hash the value to set
         * @return this builder
         **/
        

public Builder hash(String hash) {
    this.hash = hash;
    return this;
}
            /**
     * [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. 
*  <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("hash_algorithm")
private String hashAlgorithm;

        /**
         * [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. 
*  <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
* 
         * @param hashAlgorithm the value to set
         * @return this builder
         **/
        

public Builder hashAlgorithm(String hashAlgorithm) {
    this.hashAlgorithm = hashAlgorithm;
    return this;
}
            /**
     * A user-provided description of the file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * A user-provided description of the file.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}


        public Content build() {
            Content model = new Content(this.name
                , this.path
                , this.type
                , this.writable
                , this.created
                , this.lastModified
                , this.size
                , this.mimetype
                , this.content
                , this.format
                , this.hash
                , this.hashAlgorithm
                , this.description);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Content model) {
                this.name(model.getName());
    this.path(model.getPath());
    this.type(model.getType());
    this.writable(model.getWritable());
    this.created(model.getCreated());
    this.lastModified(model.getLastModified());
    this.size(model.getSize());
    this.mimetype(model.getMimetype());
    this.content(model.getContent());
    this.format(model.getFormat());
    this.hash(model.getHash());
    this.hashAlgorithm(model.getHashAlgorithm());
    this.description(model.getDescription());
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
     * Name of notebook, file or directory, equivalent to the last part of the path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of notebook, file or directory, equivalent to the last part of the path.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Full path for notebook, file or directory.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Full path for notebook, file or directory.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }

    /**
     * Type of content model.
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Notebook("notebook"),
        File("file"),
        Directory("directory"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn("Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Type of content model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Type of content model.
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * Indicates whether the requester has permission to edit the file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("writable")
    private final Boolean writable;

        /**
     * Indicates whether the requester has permission to edit the file.
     * @return the value
     **/
    
    public Boolean getWritable() {
        return writable;
    }


        /**
     * Creation timestamp.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    private final java.util.Date created;

        /**
     * Creation timestamp.
     * @return the value
     **/
    
    public java.util.Date getCreated() {
        return created;
    }


        /**
     * Last modified timestamp.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("last_modified")
    private final java.util.Date lastModified;

        /**
     * Last modified timestamp.
     * @return the value
     **/
    
    public java.util.Date getLastModified() {
        return lastModified;
    }


        /**
     * Size of file or notebook in bytes. If no size is provided, defaults to null.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final Integer size;

        /**
     * Size of file or notebook in bytes. If no size is provided, defaults to null.
     * @return the value
     **/
    
    public Integer getSize() {
        return size;
    }


        /**
     * Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', 
* this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("mimetype")
    private final String mimetype;

        /**
     * Mimetype is only applicable for File model. For other models, it is None. If content is not null, and type is 'file', 
* this contains the mimetype of file. For example, text/plain application/octet-stream. Otherwise this is null.
* 
     * @return the value
     **/
    
    public String getMimetype() {
        return mimetype;
    }


        /**
     * Content if requested, otherwise is Null. 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. 
* Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. 
* For Directory model, content field contains a list of content-free models representing the entities in the directory.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final Object content;

        /**
     * Content if requested, otherwise is Null. 
* For Notebook model, this contains a nbformat NotebookNode representing the .ipynb file represented by the model. 
* For File model, content field is always Unicode type. For text-format file models, content simply contains the bytes of the file after decoding as UTF-8. 
* Non-text (base64) files are read as bytes, base64 encoded, and then decoded as UTF-8. 
* For Directory model, content field contains a list of content-free models representing the entities in the directory.
* 
     * @return the value
     **/
    
    public Object getContent() {
        return content;
    }

    /**
     * Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. 
* For directory model, format field is always 'json'.
* 
     **/
    public enum Format implements com.oracle.bmc.http.internal.BmcEnum {
        Null("NULL"),
        Json("json"),
        Text("text"),
        Base64("base64"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Format.class);

        private final String value;
        private static java.util.Map<String, Format> map;

        static {
            map = new java.util.HashMap<>();
            for (Format v : Format.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn("Received unknown value '{}' for enum 'Format', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. 
* For directory model, format field is always 'json'.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final Format format;

        /**
     * Format of content. For Notebook model, format field is always 'json'. For File model, format field is either 'text' or 'base64'. 
* For directory model, format field is always 'json'.
* 
     * @return the value
     **/
    
    public Format getFormat() {
        return format;
    }


        /**
     * [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("hash")
    private final String hash;

        /**
     * [optional] The hexdigest hash string of content, if requested, otherwise null. It cannot be null if hashAlgorithm is defined.
* 
     * @return the value
     **/
    
    public String getHash() {
        return hash;
    }


        /**
     * [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. 
*  <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("hash_algorithm")
    private final String hashAlgorithm;

        /**
     * [optional] The algorithm used to produce the hash, if requested, (otherwise null). It cannot be null if hash is defined. 
*  <a href="https://docs.python.org/3/library/hashlib.html#hashlib.algorithms_available" target="_blank" rel="noopener noreferrer">Available algorithms</a>.
* 
     * @return the value
     **/
    
    public String getHashAlgorithm() {
        return hashAlgorithm;
    }


        /**
     * A user-provided description of the file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * A user-provided description of the file.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
        sb.append("Content(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", writable=").append(String.valueOf(this.writable));
        sb.append(", created=").append(String.valueOf(this.created));
        sb.append(", lastModified=").append(String.valueOf(this.lastModified));
        sb.append(", size=").append(String.valueOf(this.size));
        sb.append(", mimetype=").append(String.valueOf(this.mimetype));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(", hash=").append(String.valueOf(this.hash));
        sb.append(", hashAlgorithm=").append(String.valueOf(this.hashAlgorithm));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Content)) {
            return false;
        }

        Content other = (Content) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.writable, other.writable) &&
            java.util.Objects.equals(this.created, other.created) &&
            java.util.Objects.equals(this.lastModified, other.lastModified) &&
            java.util.Objects.equals(this.size, other.size) &&
            java.util.Objects.equals(this.mimetype, other.mimetype) &&
            java.util.Objects.equals(this.content, other.content) &&
            java.util.Objects.equals(this.format, other.format) &&
            java.util.Objects.equals(this.hash, other.hash) &&
            java.util.Objects.equals(this.hashAlgorithm, other.hashAlgorithm) &&
            java.util.Objects.equals(this.description, other.description);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.writable == null ? 43 : this.writable.hashCode());
        result = (result * PRIME) + (this.created == null ? 43 : this.created.hashCode());
        result = (result * PRIME) + (this.lastModified == null ? 43 : this.lastModified.hashCode());
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.mimetype == null ? 43 : this.mimetype.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        result = (result * PRIME) + (this.hash == null ? 43 : this.hash.hashCode());
        result = (result * PRIME) + (this.hashAlgorithm == null ? 43 : this.hashAlgorithm.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }


}
