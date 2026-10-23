// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Metadata recorded with the inference request and response events.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InferenceInvocationMetadata.Builder.class)

public final class InferenceInvocationMetadata  {
    @Deprecated
    @java.beans.ConstructorProperties({"region", "replicaId", "caller"})
    public InferenceInvocationMetadata(String region, String replicaId, String caller) {
        super();
        this.region = region;
        this.replicaId = replicaId;
        this.caller = caller;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * OCI region that served the inference invocation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("region")
private String region;

        /**
         * OCI region that served the inference invocation.
         * @param region the value to set
         * @return this builder
         **/
        

public Builder region(String region) {
    this.region = region;
    return this;
}
            /**
     * Identifier of the model deployment replica that served the invocation.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("replicaId")
private String replicaId;

        /**
         * Identifier of the model deployment replica that served the invocation.
         * @param replicaId the value to set
         * @return this builder
         **/
        

public Builder replicaId(String replicaId) {
    this.replicaId = replicaId;
    return this;
}
            /**
     * Caller recorded on the inference request event.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("caller")
private String caller;

        /**
         * Caller recorded on the inference request event.
         * @param caller the value to set
         * @return this builder
         **/
        

public Builder caller(String caller) {
    this.caller = caller;
    return this;
}


        public InferenceInvocationMetadata build() {
            InferenceInvocationMetadata model = new InferenceInvocationMetadata(this.region
                , this.replicaId
                , this.caller);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InferenceInvocationMetadata model) {
                this.region(model.getRegion());
    this.replicaId(model.getReplicaId());
    this.caller(model.getCaller());
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
     * OCI region that served the inference invocation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

        /**
     * OCI region that served the inference invocation.
     * @return the value
     **/
    
    public String getRegion() {
        return region;
    }


        /**
     * Identifier of the model deployment replica that served the invocation.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("replicaId")
    private final String replicaId;

        /**
     * Identifier of the model deployment replica that served the invocation.
     * @return the value
     **/
    
    public String getReplicaId() {
        return replicaId;
    }


        /**
     * Caller recorded on the inference request event.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("caller")
    private final String caller;

        /**
     * Caller recorded on the inference request event.
     * @return the value
     **/
    
    public String getCaller() {
        return caller;
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
        sb.append("InferenceInvocationMetadata(");
        sb.append("region=").append(String.valueOf(this.region));
        sb.append(", replicaId=").append(String.valueOf(this.replicaId));
        sb.append(", caller=").append(String.valueOf(this.caller));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InferenceInvocationMetadata)) {
            return false;
        }

        InferenceInvocationMetadata other = (InferenceInvocationMetadata) o;
        return java.util.Objects.equals(this.region, other.region) &&
            java.util.Objects.equals(this.replicaId, other.replicaId) &&
            java.util.Objects.equals(this.caller, other.caller);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.replicaId == null ? 43 : this.replicaId.hashCode());
        result = (result * PRIME) + (this.caller == null ? 43 : this.caller.hashCode());
        return result;
    }


}
