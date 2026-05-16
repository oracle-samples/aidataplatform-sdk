// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * An object representing execution output of a command.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RunOutputData.Builder.class)

public final class RunOutputData  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "length", "charset", "isBase64", "compression", "value"})
    public RunOutputData(Type type, String length, Charset charset, Boolean isBase64, Compression compression, String value) {
        super();
        this.type = type;
        this.length = length;
        this.charset = charset;
        this.isBase64 = isBase64;
        this.compression = compression;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The type of the RunOutputData. For example, {@code TEXT_PLAIN}, {@code TEXT_HTML}, or {@code IMAGE}.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

        /**
         * The type of the RunOutputData. For example, {@code TEXT_PLAIN}, {@code TEXT_HTML}, or {@code IMAGE}.
* 
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * Size of object in bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("length")
private String length;

        /**
         * Size of object in bytes.
         * @param length the value to set
         * @return this builder
         **/
        

public Builder length(String length) {
    this.length = length;
    return this;
}
            /**
     * Charset of the result.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("charset")
private Charset charset;

        /**
         * Charset of the result.
         * @param charset the value to set
         * @return this builder
         **/
        

public Builder charset(Charset charset) {
    this.charset = charset;
    return this;
}
            /**
     * Boolean to identify if output data is base64-encoded.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isBase64")
private Boolean isBase64;

        /**
         * Boolean to identify if output data is base64-encoded.
         * @param isBase64 the value to set
         * @return this builder
         **/
        

public Builder isBase64(Boolean isBase64) {
    this.isBase64 = isBase64;
    return this;
}
            /**
     * Content-Encoding or compression
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("compression")
private Compression compression;

        /**
         * Content-Encoding or compression
         * @param compression the value to set
         * @return this builder
         **/
        

public Builder compression(Compression compression) {
    this.compression = compression;
    return this;
}
            /**
     * The output content string format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("value")
private String value;

        /**
         * The output content string format.
         * @param value the value to set
         * @return this builder
         **/
        

public Builder value(String value) {
    this.value = value;
    return this;
}


        public RunOutputData build() {
            RunOutputData model = new RunOutputData(this.type
                , this.length
                , this.charset
                , this.isBase64
                , this.compression
                , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunOutputData model) {
                this.type(model.getType());
    this.length(model.getLength());
    this.charset(model.getCharset());
    this.isBase64(model.getIsBase64());
    this.compression(model.getCompression());
    this.value(model.getValue());
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
     * The type of the RunOutputData. For example, {@code TEXT_PLAIN}, {@code TEXT_HTML}, or {@code IMAGE}.
* 
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        TextPlain("TEXT_PLAIN"),
        Notebook("NOTEBOOK"),
        TextHtml("TEXT_HTML"),
        ImagePng("IMAGE_PNG"),
        ImageSvg("IMAGE_SVG"),
        ImageJpeg("IMAGE_JPEG"),
        ApplicationPdf("APPLICATION_PDF"),
        ApplicationJson("APPLICATION_JSON"),
        FilePath("FILE_PATH"),
        NotebookPath("NOTEBOOK_PATH"),
        

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
     * The type of the RunOutputData. For example, {@code TEXT_PLAIN}, {@code TEXT_HTML}, or {@code IMAGE}.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * The type of the RunOutputData. For example, {@code TEXT_PLAIN}, {@code TEXT_HTML}, or {@code IMAGE}.
* 
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * Size of object in bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final String length;

        /**
     * Size of object in bytes.
     * @return the value
     **/
    
    public String getLength() {
        return length;
    }

    /**
     * Charset of the result.
     **/
    public enum Charset implements com.oracle.bmc.http.internal.BmcEnum {
        Utf8("UTF_8"),
        Utf16("UTF_16"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Charset.class);

        private final String value;
        private static java.util.Map<String, Charset> map;

        static {
            map = new java.util.HashMap<>();
            for (Charset v : Charset.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Charset(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Charset create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Charset', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Charset of the result.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("charset")
    private final Charset charset;

        /**
     * Charset of the result.
     * @return the value
     **/
    
    public Charset getCharset() {
        return charset;
    }


        /**
     * Boolean to identify if output data is base64-encoded.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isBase64")
    private final Boolean isBase64;

        /**
     * Boolean to identify if output data is base64-encoded.
     * @return the value
     **/
    
    public Boolean getIsBase64() {
        return isBase64;
    }

    /**
     * Content-Encoding or compression
     **/
    public enum Compression implements com.oracle.bmc.http.internal.BmcEnum {
        Gzip("GZIP"),
        Deflate("DEFLATE"),
        Compress("COMPRESS"),
        Bzip2("BZIP2"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Compression.class);

        private final String value;
        private static java.util.Map<String, Compression> map;

        static {
            map = new java.util.HashMap<>();
            for (Compression v : Compression.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Compression(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Compression create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Compression', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Content-Encoding or compression
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compression")
    private final Compression compression;

        /**
     * Content-Encoding or compression
     * @return the value
     **/
    
    public Compression getCompression() {
        return compression;
    }


        /**
     * The output content string format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

        /**
     * The output content string format.
     * @return the value
     **/
    
    public String getValue() {
        return value;
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
        sb.append("RunOutputData(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(", charset=").append(String.valueOf(this.charset));
        sb.append(", isBase64=").append(String.valueOf(this.isBase64));
        sb.append(", compression=").append(String.valueOf(this.compression));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunOutputData)) {
            return false;
        }

        RunOutputData other = (RunOutputData) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.length, other.length) &&
            java.util.Objects.equals(this.charset, other.charset) &&
            java.util.Objects.equals(this.isBase64, other.isBase64) &&
            java.util.Objects.equals(this.compression, other.compression) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + (this.charset == null ? 43 : this.charset.hashCode());
        result = (result * PRIME) + (this.isBase64 == null ? 43 : this.isBase64.hashCode());
        result = (result * PRIME) + (this.compression == null ? 43 : this.compression.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
