package com.oracle.aidataplatform.dp.model;


/**
 * Notebook Session describes the Session context for a running instance of a Notebook. Each opened Notebook has a separate Session,
* but different Notebook kernels can use same Session if user wants to share data across various opened Notebooks.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Session.Builder.class)

public final class Session  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "path", "type", "clusterId", "kernel", "agentFlowKey", "lifecycleState"})
    public Session(String id, String name, String path, Type type, String clusterId, Kernel kernel, String agentFlowKey, LifecycleState lifecycleState) {
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
     * UUID of the notebook session.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

                /**
         * UUID of the notebook session.
         * @param id the value to set
         * @return this builder
         **/
        

        public Builder id(String id) {
        this.id = id;
        return this;
        }
            /**
     * A user-friendly name for the notebook session.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * A user-friendly name for the notebook session.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Path to notebook session. For example, /data/test.ipynb
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * Path to notebook session. For example, /data/test.ipynb
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }
            /**
     * Notebook session type.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

                /**
         * Notebook session type.
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(Type type) {
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
        private Kernel kernel;

        

        public Builder kernel(Kernel kernel) {
        this.kernel = kernel;
        return this;
        }
            /**
     * Agent Flow Key of an agent flow.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
        private String agentFlowKey;

                /**
         * Agent Flow Key of an agent flow.
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
        private LifecycleState lifecycleState;

                /**
         * lifecycleState of a Notebook Session.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

        public Builder lifecycleState(LifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
        }


        public Session build() {
            Session model = new Session(this.id
                    , this.name
                    , this.path
                    , this.type
                    , this.clusterId
                    , this.kernel
                    , this.agentFlowKey
                    , this.lifecycleState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Session model) {
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
     * UUID of the notebook session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * UUID of the notebook session.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * A user-friendly name for the notebook session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * A user-friendly name for the notebook session.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Path to notebook session. For example, /data/test.ipynb
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Path to notebook session. For example, /data/test.ipynb
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }

    /**
     * Notebook session type.
     **/
    public enum Type {
        Notebook("notebook"),
        File("file"),
        Agentflow("agentflow"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Notebook session type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Notebook session type.
     * @return the value
     **/
    
    public Type getType() {
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
    private final Kernel kernel;

    
    public Kernel getKernel() {
        return kernel;
    }


        /**
     * Agent Flow Key of an agent flow.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("agentFlowKey")
    private final String agentFlowKey;

        /**
     * Agent Flow Key of an agent flow.
     * @return the value
     **/
    
    public String getAgentFlowKey() {
        return agentFlowKey;
    }

    /**
     * lifecycleState of a Notebook Session.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Failed("FAILED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * lifecycleState of a Notebook Session.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

        /**
     * lifecycleState of a Notebook Session.
     * @return the value
     **/
    
    public LifecycleState getLifecycleState() {
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
        sb.append("Session(");
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
        if (!(o instanceof Session)) {
            return false;
        }

        Session other = (Session) o;
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
