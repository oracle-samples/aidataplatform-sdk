// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * List of libraries to be installed on the cluster.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Libraries.Builder.class)

public final class Libraries  {
    @Deprecated
    @java.beans.ConstructorProperties({"jar"})
    public Libraries(String jar) {
        super();
        this.jar = jar;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * URI of the jar to be installed.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("jar")
        private String jar;

                /**
         * URI of the jar to be installed.
         * @param jar the value to set
         * @return this builder
         **/
        

        public Builder jar(String jar) {
        this.jar = jar;
        return this;
        }


        public Libraries build() {
            Libraries model = new Libraries(this.jar);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Libraries model) {
                this.jar(model.getJar());
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
     * URI of the jar to be installed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jar")
    private final String jar;

        /**
     * URI of the jar to be installed.
     * @return the value
     **/
    
    public String getJar() {
        return jar;
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
        sb.append("Libraries(");
        sb.append("jar=").append(String.valueOf(this.jar));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Libraries)) {
            return false;
        }

        Libraries other = (Libraries) o;
        return java.util.Objects.equals(this.jar, other.jar);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.jar == null ? 43 : this.jar.hashCode());
        return result;
    }


}
