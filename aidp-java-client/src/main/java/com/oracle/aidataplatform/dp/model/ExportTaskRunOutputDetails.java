// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Payload required to export task run output content to a file.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ExportTaskRunOutputDetails.Builder.class)

public final class ExportTaskRunOutputDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"format"})
    public ExportTaskRunOutputDetails(Format format) {
        super();
        this.format = format;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The format in which task run output should be exported, supported formats are HTML and ipynb only.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("format")
private Format format;

        /**
         * The format in which task run output should be exported, supported formats are HTML and ipynb only.
         * @param format the value to set
         * @return this builder
         **/
        

public Builder format(Format format) {
    this.format = format;
    return this;
}


        public ExportTaskRunOutputDetails build() {
            ExportTaskRunOutputDetails model = new ExportTaskRunOutputDetails(this.format);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportTaskRunOutputDetails model) {
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
     * The format in which task run output should be exported, supported formats are HTML and ipynb only.
     **/
    public enum Format implements com.oracle.bmc.http.internal.BmcEnum {
        Html("HTML"),
        Ipynb("IPYNB"),
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
     * The format in which task run output should be exported, supported formats are HTML and ipynb only.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("format")
    private final Format format;

        /**
     * The format in which task run output should be exported, supported formats are HTML and ipynb only.
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
        sb.append("ExportTaskRunOutputDetails(");
        sb.append("format=").append(String.valueOf(this.format));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportTaskRunOutputDetails)) {
            return false;
        }

        ExportTaskRunOutputDetails other = (ExportTaskRunOutputDetails) o;
        return java.util.Objects.equals(this.format, other.format);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.format == null ? 43 : this.format.hashCode());
        return result;
    }


}
