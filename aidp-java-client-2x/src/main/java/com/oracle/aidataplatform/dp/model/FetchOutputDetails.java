// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The payload to fetch TaskRunOutput.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FetchOutputDetails.Builder.class)

public final class FetchOutputDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"outputKey"})
    public FetchOutputDetails(String outputKey) {
        super();
        this.outputKey = outputKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * A unique identifier for the output.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("outputKey")
        private String outputKey;

                /**
         * A unique identifier for the output.
         * @param outputKey the value to set
         * @return this builder
         **/
        

        public Builder outputKey(String outputKey) {
        this.outputKey = outputKey;
        return this;
        }


        public FetchOutputDetails build() {
            FetchOutputDetails model = new FetchOutputDetails(this.outputKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FetchOutputDetails model) {
                this.outputKey(model.getOutputKey());
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
     * A unique identifier for the output.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("outputKey")
    private final String outputKey;

        /**
     * A unique identifier for the output.
     * @return the value
     **/
    
    public String getOutputKey() {
        return outputKey;
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
        sb.append("FetchOutputDetails(");
        sb.append("outputKey=").append(String.valueOf(this.outputKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FetchOutputDetails)) {
            return false;
        }

        FetchOutputDetails other = (FetchOutputDetails) o;
        return java.util.Objects.equals(this.outputKey, other.outputKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.outputKey == null ? 43 : this.outputKey.hashCode());
        return result;
    }


}
