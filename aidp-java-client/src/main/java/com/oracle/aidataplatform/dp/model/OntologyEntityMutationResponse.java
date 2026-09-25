// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Response envelope for design-time ontology entity mutation results.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyEntityMutationResponse.Builder.class)

public final class OntologyEntityMutationResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"data", "status", "opcRequestId", "timestamp", "message"})
    public OntologyEntityMutationResponse(OntologyEntityMutationResult data, Integer status, String opcRequestId, java.util.Date timestamp, String message) {
        super();
        this.data = data;
        this.status = status;
        this.opcRequestId = opcRequestId;
        this.timestamp = timestamp;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("data")
private OntologyEntityMutationResult data;



public Builder data(OntologyEntityMutationResult data) {
    this.data = data;
    return this;
}
            /**
     * HTTP-equivalent status code reported by the Ontology Manager backend.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private Integer status;

        /**
         * HTTP-equivalent status code reported by the Ontology Manager backend.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(Integer status) {
    this.status = status;
    return this;
}
            /**
     * Backend request identifier for tracing.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
private String opcRequestId;

        /**
         * Backend request identifier for tracing.
         * @param opcRequestId the value to set
         * @return this builder
         **/
        

public Builder opcRequestId(String opcRequestId) {
    this.opcRequestId = opcRequestId;
    return this;
}
            /**
     * Time the response was produced.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timestamp")
private java.util.Date timestamp;

        /**
         * Time the response was produced.
         * @param timestamp the value to set
         * @return this builder
         **/
        

public Builder timestamp(java.util.Date timestamp) {
    this.timestamp = timestamp;
    return this;
}
            /**
     * Optional human-readable message describing the response.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Optional human-readable message describing the response.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}


        public OntologyEntityMutationResponse build() {
            OntologyEntityMutationResponse model = new OntologyEntityMutationResponse(this.data
                , this.status
                , this.opcRequestId
                , this.timestamp
                , this.message);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyEntityMutationResponse model) {
                this.data(model.getData());
    this.status(model.getStatus());
    this.opcRequestId(model.getOpcRequestId());
    this.timestamp(model.getTimestamp());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final OntologyEntityMutationResult data;

    
    public OntologyEntityMutationResult getData() {
        return data;
    }


        /**
     * HTTP-equivalent status code reported by the Ontology Manager backend.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Integer status;

        /**
     * HTTP-equivalent status code reported by the Ontology Manager backend.
     * @return the value
     **/
    
    public Integer getStatus() {
        return status;
    }


        /**
     * Backend request identifier for tracing.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

        /**
     * Backend request identifier for tracing.
     * @return the value
     **/
    
    public String getOpcRequestId() {
        return opcRequestId;
    }


        /**
     * Time the response was produced.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

        /**
     * Time the response was produced.
     * @return the value
     **/
    
    public java.util.Date getTimestamp() {
        return timestamp;
    }


        /**
     * Optional human-readable message describing the response.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Optional human-readable message describing the response.
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
        sb.append("OntologyEntityMutationResponse(");
        sb.append("data=").append(String.valueOf(this.data));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyEntityMutationResponse)) {
            return false;
        }

        OntologyEntityMutationResponse other = (OntologyEntityMutationResponse) o;
        return java.util.Objects.equals(this.data, other.data) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.opcRequestId, other.opcRequestId) &&
            java.util.Objects.equals(this.timestamp, other.timestamp) &&
            java.util.Objects.equals(this.message, other.message);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        return result;
    }


}
