// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * File read/write configuration for an agent flow session. DataHub owns this
* as Agent Flow authoring metadata and passes it to downstream runtime
* components as structured JSON. Runtime and gateway components enforce
* file policy during session execution.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FileConfiguration.Builder.class)

public final class FileConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "read", "write"})
    public FileConfiguration(Boolean isEnabled, FileReadConfiguration read, FileWriteConfiguration write) {
        super();
        this.isEnabled = isEnabled;
        this.read = read;
        this.write = write;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Overall preview/codegen gate for runtime session-file helper tools.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * Overall preview/codegen gate for runtime session-file helper tools.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("read")
private FileReadConfiguration read;



public Builder read(FileReadConfiguration read) {
    this.read = read;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("write")
private FileWriteConfiguration write;



public Builder write(FileWriteConfiguration write) {
    this.write = write;
    return this;
}


        public FileConfiguration build() {
            FileConfiguration model = new FileConfiguration(this.isEnabled
                , this.read
                , this.write);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FileConfiguration model) {
                this.isEnabled(model.getIsEnabled());
    this.read(model.getRead());
    this.write(model.getWrite());
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
     * Overall preview/codegen gate for runtime session-file helper tools.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Overall preview/codegen gate for runtime session-file helper tools.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("read")
    private final FileReadConfiguration read;

    
    public FileReadConfiguration getRead() {
        return read;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("write")
    private final FileWriteConfiguration write;

    
    public FileWriteConfiguration getWrite() {
        return write;
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
        sb.append("FileConfiguration(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", read=").append(String.valueOf(this.read));
        sb.append(", write=").append(String.valueOf(this.write));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FileConfiguration)) {
            return false;
        }

        FileConfiguration other = (FileConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled) &&
            java.util.Objects.equals(this.read, other.read) &&
            java.util.Objects.equals(this.write, other.write);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.read == null ? 43 : this.read.hashCode());
        result = (result * PRIME) + (this.write == null ? 43 : this.write.hashCode());
        return result;
    }


}
