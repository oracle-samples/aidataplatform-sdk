// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Selected metadata of a log event. Every field may be null when the event does not carry it.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentLogMetadata.Builder.class)

public final class DeploymentLogMetadata  {
    @Deprecated
    @java.beans.ConstructorProperties({"replicaId", "opcRequestId", "source", "region", "errorCode"})
    public DeploymentLogMetadata(String replicaId, String opcRequestId, String source, String region, String errorCode) {
        super();
        this.replicaId = replicaId;
        this.opcRequestId = opcRequestId;
        this.source = source;
        this.region = region;
        this.errorCode = errorCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Emitting replica or source scope, when the event carries one.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("replicaId")
private String replicaId;

        /**
         * Emitting replica or source scope, when the event carries one.
         * @param replicaId the value to set
         * @return this builder
         **/
        

public Builder replicaId(String replicaId) {
    this.replicaId = replicaId;
    return this;
}
            /**
     * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
private String opcRequestId;

        /**
         * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
         * @param opcRequestId the value to set
         * @return this builder
         **/
        

public Builder opcRequestId(String opcRequestId) {
    this.opcRequestId = opcRequestId;
    return this;
}
            /**
     * Logical producer of the event within the deployment runtime.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("source")
private String source;

        /**
         * Logical producer of the event within the deployment runtime.
         * @param source the value to set
         * @return this builder
         **/
        

public Builder source(String source) {
    this.source = source;
    return this;
}
            /**
     * Region the event was emitted from, when the event carries one.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("region")
private String region;

        /**
         * Region the event was emitted from, when the event carries one.
         * @param region the value to set
         * @return this builder
         **/
        

public Builder region(String region) {
    this.region = region;
    return this;
}
            /**
     * Producer error code, when the event carries one.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("errorCode")
private String errorCode;

        /**
         * Producer error code, when the event carries one.
         * @param errorCode the value to set
         * @return this builder
         **/
        

public Builder errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
}


        public DeploymentLogMetadata build() {
            DeploymentLogMetadata model = new DeploymentLogMetadata(this.replicaId
                , this.opcRequestId
                , this.source
                , this.region
                , this.errorCode);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentLogMetadata model) {
                this.replicaId(model.getReplicaId());
    this.opcRequestId(model.getOpcRequestId());
    this.source(model.getSource());
    this.region(model.getRegion());
    this.errorCode(model.getErrorCode());
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
     * Emitting replica or source scope, when the event carries one.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("replicaId")
    private final String replicaId;

        /**
     * Emitting replica or source scope, when the event carries one.
     * @return the value
     **/
    
    public String getReplicaId() {
        return replicaId;
    }


        /**
     * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("opcRequestId")
    private final String opcRequestId;

        /**
     * Original request identifier. Absent when the event carries none. Model deployment lifecycle events are not emitted per request and never carry one.
     * @return the value
     **/
    
    public String getOpcRequestId() {
        return opcRequestId;
    }


        /**
     * Logical producer of the event within the deployment runtime.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

        /**
     * Logical producer of the event within the deployment runtime.
     * @return the value
     **/
    
    public String getSource() {
        return source;
    }


        /**
     * Region the event was emitted from, when the event carries one.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

        /**
     * Region the event was emitted from, when the event carries one.
     * @return the value
     **/
    
    public String getRegion() {
        return region;
    }


        /**
     * Producer error code, when the event carries one.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final String errorCode;

        /**
     * Producer error code, when the event carries one.
     * @return the value
     **/
    
    public String getErrorCode() {
        return errorCode;
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
        sb.append("DeploymentLogMetadata(");
        sb.append("replicaId=").append(String.valueOf(this.replicaId));
        sb.append(", opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", errorCode=").append(String.valueOf(this.errorCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentLogMetadata)) {
            return false;
        }

        DeploymentLogMetadata other = (DeploymentLogMetadata) o;
        return java.util.Objects.equals(this.replicaId, other.replicaId) &&
            java.util.Objects.equals(this.opcRequestId, other.opcRequestId) &&
            java.util.Objects.equals(this.source, other.source) &&
            java.util.Objects.equals(this.region, other.region) &&
            java.util.Objects.equals(this.errorCode, other.errorCode);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.replicaId == null ? 43 : this.replicaId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        return result;
    }


}
