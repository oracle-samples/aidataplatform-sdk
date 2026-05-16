// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * span status
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SpanStatus.Builder.class)

public final class SpanStatus  {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "message"})
    public SpanStatus(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * span status code
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("code")
private String code;

        /**
         * span status code
         * @param code the value to set
         * @return this builder
         **/
        

public Builder code(String code) {
    this.code = code;
    return this;
}
            /**
     * span message
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * span message
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}


        public SpanStatus build() {
            SpanStatus model = new SpanStatus(this.code
                , this.message);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SpanStatus model) {
                this.code(model.getCode());
    this.message(model.getMessage());
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
     * span status code
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

        /**
     * span status code
     * @return the value
     **/
    
    public String getCode() {
        return code;
    }


        /**
     * span message
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * span message
     * @return the value
     **/
    
    public String getMessage() {
        return message;
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
        sb.append("SpanStatus(");
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SpanStatus)) {
            return false;
        }

        SpanStatus other = (SpanStatus) o;
        return java.util.Objects.equals(this.code, other.code) &&
            java.util.Objects.equals(this.message, other.message);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        return result;
    }


}
