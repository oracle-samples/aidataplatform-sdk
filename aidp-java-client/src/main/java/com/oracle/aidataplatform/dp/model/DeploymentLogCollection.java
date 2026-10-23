// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Result of searching deployment lifecycle logs.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentLogCollection.Builder.class)

public final class DeploymentLogCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"deploymentId", "logs", "query", "coverage"})
    public DeploymentLogCollection(String deploymentId, DeploymentLogPage logs, DeploymentLogQueryEcho query, DeploymentLogCoverage coverage) {
        super();
        this.deploymentId = deploymentId;
        this.logs = logs;
        this.query = query;
        this.coverage = coverage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The model deployment the logs belong to.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
private String deploymentId;

        /**
         * The model deployment the logs belong to.
         * @param deploymentId the value to set
         * @return this builder
         **/
        

public Builder deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("logs")
private DeploymentLogPage logs;



public Builder logs(DeploymentLogPage logs) {
    this.logs = logs;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("query")
private DeploymentLogQueryEcho query;



public Builder query(DeploymentLogQueryEcho query) {
    this.query = query;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("coverage")
private DeploymentLogCoverage coverage;



public Builder coverage(DeploymentLogCoverage coverage) {
    this.coverage = coverage;
    return this;
}


        public DeploymentLogCollection build() {
            DeploymentLogCollection model = new DeploymentLogCollection(this.deploymentId
                , this.logs
                , this.query
                , this.coverage);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentLogCollection model) {
                this.deploymentId(model.getDeploymentId());
    this.logs(model.getLogs());
    this.query(model.getQuery());
    this.coverage(model.getCoverage());
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
     * The model deployment the logs belong to.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentId")
    private final String deploymentId;

        /**
     * The model deployment the logs belong to.
     * @return the value
     **/
    
    public String getDeploymentId() {
        return deploymentId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("logs")
    private final DeploymentLogPage logs;

    
    public DeploymentLogPage getLogs() {
        return logs;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final DeploymentLogQueryEcho query;

    
    public DeploymentLogQueryEcho getQuery() {
        return query;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("coverage")
    private final DeploymentLogCoverage coverage;

    
    public DeploymentLogCoverage getCoverage() {
        return coverage;
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
        sb.append("DeploymentLogCollection(");
        sb.append("deploymentId=").append(String.valueOf(this.deploymentId));
        sb.append(", logs=").append(String.valueOf(this.logs));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", coverage=").append(String.valueOf(this.coverage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentLogCollection)) {
            return false;
        }

        DeploymentLogCollection other = (DeploymentLogCollection) o;
        return java.util.Objects.equals(this.deploymentId, other.deploymentId) &&
            java.util.Objects.equals(this.logs, other.logs) &&
            java.util.Objects.equals(this.query, other.query) &&
            java.util.Objects.equals(this.coverage, other.coverage);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deploymentId == null ? 43 : this.deploymentId.hashCode());
        result = (result * PRIME) + (this.logs == null ? 43 : this.logs.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.coverage == null ? 43 : this.coverage.hashCode());
        return result;
    }


}
