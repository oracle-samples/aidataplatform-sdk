// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Payload required to clear outputs of a notebook file.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClearOutputsDetails.Builder.class)

public final class ClearOutputsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"shouldClearExecMetadata"})
    public ClearOutputsDetails(Boolean shouldClearExecMetadata) {
        super();
        this.shouldClearExecMetadata = shouldClearExecMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * To clear execution metadata like execution count, command_metadata etc.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shouldClearExecMetadata")
private Boolean shouldClearExecMetadata;

        /**
         * To clear execution metadata like execution count, command_metadata etc.
         * @param shouldClearExecMetadata the value to set
         * @return this builder
         **/
        

public Builder shouldClearExecMetadata(Boolean shouldClearExecMetadata) {
    this.shouldClearExecMetadata = shouldClearExecMetadata;
    return this;
}


        public ClearOutputsDetails build() {
            ClearOutputsDetails model = new ClearOutputsDetails(this.shouldClearExecMetadata);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClearOutputsDetails model) {
                this.shouldClearExecMetadata(model.getShouldClearExecMetadata());
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
     * To clear execution metadata like execution count, command_metadata etc.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shouldClearExecMetadata")
    private final Boolean shouldClearExecMetadata;

        /**
     * To clear execution metadata like execution count, command_metadata etc.
     * @return the value
     **/
    
    public Boolean getShouldClearExecMetadata() {
        return shouldClearExecMetadata;
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
        sb.append("ClearOutputsDetails(");
        sb.append("shouldClearExecMetadata=").append(String.valueOf(this.shouldClearExecMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClearOutputsDetails)) {
            return false;
        }

        ClearOutputsDetails other = (ClearOutputsDetails) o;
        return java.util.Objects.equals(this.shouldClearExecMetadata, other.shouldClearExecMetadata);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shouldClearExecMetadata == null ? 43 : this.shouldClearExecMetadata.hashCode());
        return result;
    }


}
