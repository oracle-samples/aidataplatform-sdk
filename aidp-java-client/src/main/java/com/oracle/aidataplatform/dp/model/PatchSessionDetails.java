package com.oracle.aidataplatform.dp.model;



/**
 * Details to update a session.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PatchSessionDetails.Builder.class)

public final class PatchSessionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "path", "type", "kernel", "clusterId", "mustRefreshContext"})
    public PatchSessionDetails(String id, String name, String path, Session.Type type, Kernel kernel, String clusterId, Boolean mustRefreshContext) {
        super();
        this.id = id;
        this.name = name;
        this.path = path;
        this.type = type;
        this.kernel = kernel;
        this.clusterId = clusterId;
        this.mustRefreshContext = mustRefreshContext;
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
        
@com.fasterxml.jackson.annotation.JsonProperty("kernel")
private Kernel kernel;



public Builder kernel(Kernel kernel) {
    this.kernel = kernel;
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
     * Set as True, if a new execution context is needed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("must_refresh_context")
private Boolean mustRefreshContext;

        /**
         * Set as True, if a new execution context is needed.
         * @param mustRefreshContext the value to set
         * @return this builder
         **/
        

public Builder mustRefreshContext(Boolean mustRefreshContext) {
    this.mustRefreshContext = mustRefreshContext;
    return this;
}


        public PatchSessionDetails build() {
            PatchSessionDetails model = new PatchSessionDetails(this.id
                , this.name
                , this.path
                , this.type
                , this.kernel
                , this.clusterId
                , this.mustRefreshContext);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchSessionDetails model) {
                this.id(model.getId());
    this.name(model.getName());
    this.path(model.getPath());
    this.type(model.getType());
    this.kernel(model.getKernel());
    this.clusterId(model.getClusterId());
    this.mustRefreshContext(model.getMustRefreshContext());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("kernel")
    private final Kernel kernel;

    
    public Kernel getKernel() {
        return kernel;
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
     * Set as True, if a new execution context is needed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("must_refresh_context")
    private final Boolean mustRefreshContext;

        /**
     * Set as True, if a new execution context is needed.
     * @return the value
     **/
    
    public Boolean getMustRefreshContext() {
        return mustRefreshContext;
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
        sb.append("PatchSessionDetails(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", kernel=").append(String.valueOf(this.kernel));
        sb.append(", clusterId=").append(String.valueOf(this.clusterId));
        sb.append(", mustRefreshContext=").append(String.valueOf(this.mustRefreshContext));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchSessionDetails)) {
            return false;
        }

        PatchSessionDetails other = (PatchSessionDetails) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.kernel, other.kernel) &&
            java.util.Objects.equals(this.clusterId, other.clusterId) &&
            java.util.Objects.equals(this.mustRefreshContext, other.mustRefreshContext);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.kernel == null ? 43 : this.kernel.hashCode());
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.mustRefreshContext == null ? 43 : this.mustRefreshContext.hashCode());
        return result;
    }


}
