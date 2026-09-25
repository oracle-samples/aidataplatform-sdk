// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Save-level error details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntitySaveError.Builder.class)

public final class OntologyEntitySaveError  {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "message"})
    public OntologyEntitySaveError(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("code")
private String code;



public Builder code(String code) {
    this.code = code;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;



public Builder message(String message) {
    this.message = message;
    return this;
}


        public OntologyEntitySaveError build() {
            OntologyEntitySaveError model = new OntologyEntitySaveError(this.code
                , this.message);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntitySaveError model) {
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    
    public String getCode() {
        return code;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    
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
        sb.append("OntologyEntitySaveError(");
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
        if (!(o instanceof OntologyEntitySaveError)) {
            return false;
        }

        OntologyEntitySaveError other = (OntologyEntitySaveError) o;
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
