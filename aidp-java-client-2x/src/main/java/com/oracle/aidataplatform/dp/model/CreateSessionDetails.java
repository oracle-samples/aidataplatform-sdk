package com.oracle.aidataplatform.dp.model;


/**
 * Details to create a session.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateSessionDetails.Builder.class)

public final class CreateSessionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "path", "name", "type", "clusterId", "agentFlowKey", "kernel"})
    public CreateSessionDetails(String id, String path, String name, String type, String clusterId, String agentFlowKey, Kernel kernel) {
        super();
        this.id = id;
        this.path = path;
        this.name = name;
        this.type = type;
        this.clusterId = clusterId;
        this.agentFlowKey = agentFlowKey;
        this.kernel = kernel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * UUID of the session.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

                /**
         * UUID of the session.
         * @param id the value to set
         * @return this builder
         **/
        

        public Builder id(String id) {
        this.id = id;
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
     * Type of session.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

                /**
         * Type of session.
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(String type) {
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
            /**
     * Key of the agent flow.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
        private String agentFlowKey;

                /**
         * Key of the agent flow.
         * @param agentFlowKey the value to set
         * @return this builder
         **/
        

        public Builder agentFlowKey(String agentFlowKey) {
        this.agentFlowKey = agentFlowKey;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("kernel")
        private Kernel kernel;

        

        public Builder kernel(Kernel kernel) {
        this.kernel = kernel;
        return this;
        }


        public CreateSessionDetails build() {
            CreateSessionDetails model = new CreateSessionDetails(this.id
                    , this.path
                    , this.name
                    , this.type
                    , this.clusterId
                    , this.agentFlowKey
                    , this.kernel);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSessionDetails model) {
                this.id(model.getId());
    this.path(model.getPath());
    this.name(model.getName());
    this.type(model.getType());
    this.clusterId(model.getClusterId());
    this.agentFlowKey(model.getAgentFlowKey());
    this.kernel(model.getKernel());
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
     * UUID of the session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * UUID of the session.
     * @return the value
     **/
    
    public String getId() {
        return id;
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
     * Type of session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Type of session.
     * @return the value
     **/
    
    public String getType() {
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


        /**
     * Key of the agent flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
    private final String agentFlowKey;

        /**
     * Key of the agent flow.
     * @return the value
     **/
    
    public String getAgentFlowKey() {
        return agentFlowKey;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("kernel")
    private final Kernel kernel;

    
    public Kernel getKernel() {
        return kernel;
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
        sb.append("CreateSessionDetails(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", agentFlowKey=").append(String.valueOf(this.agentFlowKey));
        sb.append(", kernel=").append(String.valueOf(this.kernel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSessionDetails)) {
            return false;
        }

        CreateSessionDetails other = (CreateSessionDetails) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.clusterId, other.clusterId) &&
            java.util.Objects.equals(this.agentFlowKey, other.agentFlowKey) &&
            java.util.Objects.equals(this.kernel, other.kernel);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.agentFlowKey == null ? 43 : this.agentFlowKey.hashCode());
        result = (result * PRIME) + (this.kernel == null ? 43 : this.kernel.hashCode());
        return result;
    }


}
