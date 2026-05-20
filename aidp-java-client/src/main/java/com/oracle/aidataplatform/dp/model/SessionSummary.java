// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a notebook session.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SessionSummary.Builder.class)

public final class SessionSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "path", "type", "clusterId", "kernel", "agentFlowKey", "lifecycleState"})
    public SessionSummary(String id, String name, String path, Session.Type type, String clusterId, KernelSummary kernel, String agentFlowKey, Session.LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.name = name;
        this.path = path;
        this.type = type;
        this.clusterId = clusterId;
        this.kernel = kernel;
        this.agentFlowKey = agentFlowKey;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * UUID if the session.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * UUID if the session.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * A user-friendly name for the session.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * A user-friendly name for the session.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("path")
private String path;

        /**
         * Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.
         * @param path the value to set
         * @return this builder
         **/
        

public Builder path(String path) {
    this.path = path;
    return this;
}
            /**
     * Type of session.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Session.Type type;

        /**
         * Type of session.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Session.Type type) {
    this.type = type;
    return this;
}
            /**
     * Cluster ID.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("cluster_id")
private String clusterId;

        /**
         * Cluster ID.
         * @param clusterId the value to set
         * @return this builder
         **/
        

public Builder clusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("kernel")
private KernelSummary kernel;



public Builder kernel(KernelSummary kernel) {
    this.kernel = kernel;
    return this;
}
            /**
     * Agent flow key of an agent flow.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
private String agentFlowKey;

        /**
         * Agent flow key of an agent flow.
         * @param agentFlowKey the value to set
         * @return this builder
         **/
        

public Builder agentFlowKey(String agentFlowKey) {
    this.agentFlowKey = agentFlowKey;
    return this;
}
            /**
     * lifecycleState of a Notebook Session.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private Session.LifecycleState lifecycleState;

        /**
         * lifecycleState of a Notebook Session.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(Session.LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}


        public SessionSummary build() {
            SessionSummary model = new SessionSummary(this.id
                , this.name
                , this.path
                , this.type
                , this.clusterId
                , this.kernel
                , this.agentFlowKey
                , this.lifecycleState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionSummary model) {
                this.id(model.getId());
    this.name(model.getName());
    this.path(model.getPath());
    this.type(model.getType());
    this.clusterId(model.getClusterId());
    this.kernel(model.getKernel());
    this.agentFlowKey(model.getAgentFlowKey());
    this.lifecycleState(model.getLifecycleState());
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
     * UUID if the session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * UUID if the session.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * A user-friendly name for the session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * A user-friendly name for the session.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Path to the session. A directory where notebook server is started and where notebooks are saved. For example, /data/test.ipynb.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * Type of session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Session.Type type;

        /**
     * Type of session.
     * @return the value
     **/
    
    public Session.Type getType() {
        return type;
    }


        /**
     * Cluster ID.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("cluster_id")
    private final String clusterId;

        /**
     * Cluster ID.
     * @return the value
     **/
    
    public String getClusterId() {
        return clusterId;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("kernel")
    private final KernelSummary kernel;

    
    public KernelSummary getKernel() {
        return kernel;
    }


        /**
     * Agent flow key of an agent flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
    private final String agentFlowKey;

        /**
     * Agent flow key of an agent flow.
     * @return the value
     **/
    
    public String getAgentFlowKey() {
        return agentFlowKey;
    }


        /**
     * lifecycleState of a Notebook Session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Session.LifecycleState lifecycleState;

        /**
     * lifecycleState of a Notebook Session.
     * @return the value
     **/
    
    public Session.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("SessionSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", kernel=").append(String.valueOf(this.kernel));
        sb.append(", agentFlowKey=").append(String.valueOf(this.agentFlowKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionSummary)) {
            return false;
        }

        SessionSummary other = (SessionSummary) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.clusterId, other.clusterId) &&
            java.util.Objects.equals(this.kernel, other.kernel) &&
            java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.kernel == null ? 43 : this.kernel.hashCode());
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }


}
