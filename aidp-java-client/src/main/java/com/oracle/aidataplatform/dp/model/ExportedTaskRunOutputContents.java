package com.oracle.aidataplatform.dp.model;



/**
 * This model represents a file with contents, format, and other details.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExportedTaskRunOutputContents.Builder.class)

public final class ExportedTaskRunOutputContents  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "path", "content", "format"})
    public ExportedTaskRunOutputContents(String name, String path, Object content, Format format) {
        super();
        this.name = name;
        this.path = path;
        this.content = content;
        this.format = format;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of file, equivalent to the last part of the path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of file, equivalent to the last part of the path.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Full path of the file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Full path of the file.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * For ipynb format, this contains a string representing the .ipynb file.
* For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("content")
private Object content;

        /**
         * For ipynb format, this contains a string representing the .ipynb file.
* For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images.
* 
         * @param content the value to set
         * @return this builder
         **/
        

public Builder content(Object content) {
    this.content = content;
    return this;
}
            /**
     * Format of content as requested by the client. HTML format by default.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("format")
private Format format;

        /**
         * Format of content as requested by the client. HTML format by default.
* 
         * @param format the value to set
         * @return this builder
         **/
        

public Builder format(Format format) {
    this.format = format;
    return this;
}


        public ExportedTaskRunOutputContents build() {
            ExportedTaskRunOutputContents model = new ExportedTaskRunOutputContents(this.name
                , this.path
                , this.content
                , this.format);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportedTaskRunOutputContents model) {
                this.name(model.getName());
    this.path(model.getPath());
    this.content(model.getContent());
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
     * Name of file, equivalent to the last part of the path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of file, equivalent to the last part of the path.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Full path of the file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Full path of the file.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * For ipynb format, this contains a string representing the .ipynb file.
* For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final Object content;

        /**
     * For ipynb format, this contains a string representing the .ipynb file.
* For HTML format, this contains a string representing the HTML page. It has base64-encoded data for images.
* 
     * @return the value
     **/
    
    public Object getContent() {
        return content;
    }

    /**
     * Format of content as requested by the client. HTML format by default.
* 
     **/
    public enum Format implements com.oracle.bmc.http.internal.BmcEnum {
        Html("HTML"),
        Ipynb("IPYNB"),
        

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
     * Format of content as requested by the client. HTML format by default.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final Format format;

        /**
     * Format of content as requested by the client. HTML format by default.
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
        sb.append("ExportedTaskRunOutputContents(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", format=").append(String.valueOf(this.format));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportedTaskRunOutputContents)) {
            return false;
        }

        ExportedTaskRunOutputContents other = (ExportedTaskRunOutputContents) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.content, other.content) &&
            java.util.Objects.equals(this.format, other.format);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        return result;
    }


}
