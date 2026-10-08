// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Key of the model deployment tag. At most 250 characters and 250 UTF-8 bytes.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelDeploymentTagKey.Builder.class)

public final class ModelDeploymentTagKey  {
    @Deprecated
    @java.beans.ConstructorProperties({"key"})
    public ModelDeploymentTagKey(String key) {
        super();
        this.key = key;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Tag key. At most 250 characters and 250 UTF-8 bytes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Tag key. At most 250 characters and 250 UTF-8 bytes.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}


        public ModelDeploymentTagKey build() {
            ModelDeploymentTagKey model = new ModelDeploymentTagKey(this.key);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDeploymentTagKey model) {
                this.key(model.getKey());
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
     * Tag key. At most 250 characters and 250 UTF-8 bytes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Tag key. At most 250 characters and 250 UTF-8 bytes.
     * @return the value
     **/
    
    public String getKey() {
        return key;
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
        sb.append("ModelDeploymentTagKey(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDeploymentTagKey)) {
            return false;
        }

        ModelDeploymentTagKey other = (ModelDeploymentTagKey) o;
        return java.util.Objects.equals(this.key, other.key);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        return result;
    }


}
