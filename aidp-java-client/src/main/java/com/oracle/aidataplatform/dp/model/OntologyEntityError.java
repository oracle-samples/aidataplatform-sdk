// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Entity mutation error details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityError.Builder.class)

public final class OntologyEntityError  {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "errorMessage"})
    public OntologyEntityError(String code, String errorMessage) {
        super();
        this.code = code;
        this.errorMessage = errorMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Machine-readable error code.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("code")
private String code;

        /**
         * Machine-readable error code.
         * @param code the value to set
         * @return this builder
         **/
        

public Builder code(String code) {
    this.code = code;
    return this;
}
            /**
     * Human-readable error message.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
private String errorMessage;

        /**
         * Human-readable error message.
         * @param errorMessage the value to set
         * @return this builder
         **/
        

public Builder errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
}


        public OntologyEntityError build() {
            OntologyEntityError model = new OntologyEntityError(this.code
                , this.errorMessage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityError model) {
                this.code(model.getCode());
    this.errorMessage(model.getErrorMessage());
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
     * Machine-readable error code.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

        /**
     * Machine-readable error code.
     * @return the value
     **/
    
    public String getCode() {
        return code;
    }


        /**
     * Human-readable error message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

        /**
     * Human-readable error message.
     * @return the value
     **/
    
    public String getErrorMessage() {
        return errorMessage;
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
        sb.append("OntologyEntityError(");
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityError)) {
            return false;
        }

        OntologyEntityError other = (OntologyEntityError) o;
        return java.util.Objects.equals(this.code, other.code) &&
            java.util.Objects.equals(this.errorMessage, other.errorMessage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        return result;
    }


}
