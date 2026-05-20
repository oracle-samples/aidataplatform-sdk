// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Kernel summary
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KernelSummary.Builder.class)

public final class KernelSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "lastActivity", "connections", "executionState"})
    public KernelSummary(String id, String name, String lastActivity, Integer connections, String executionState) {
        super();
        this.id = id;
        this.name = name;
        this.lastActivity = lastActivity;
        this.connections = connections;
        this.executionState = executionState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * UUID of the kernel.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * UUID of the kernel.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Kernel spec name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Kernel spec name.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * ISO 8601 timestamp for the last-seen activity on this kernel.
* Use this in combination with execution_state == 'idle' to identify
* which kernels have been idle since a given time.
* Timestamps will be UTC, indicated 'Z' suffix.
* Added in notebook server 5.0.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("last_activity")
private String lastActivity;

        /**
         * ISO 8601 timestamp for the last-seen activity on this kernel.
* Use this in combination with execution_state == 'idle' to identify
* which kernels have been idle since a given time.
* Timestamps will be UTC, indicated 'Z' suffix.
* Added in notebook server 5.0.
* 
         * @param lastActivity the value to set
         * @return this builder
         **/
        

public Builder lastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
    return this;
}
            /**
     * The number of active connections to this kernel.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("connections")
private Integer connections;

        /**
         * The number of active connections to this kernel.
* 
         * @param connections the value to set
         * @return this builder
         **/
        

public Builder connections(Integer connections) {
    this.connections = connections;
    return this;
}
            /**
     * Current execution state of the kernel. Typically 'idle' or 'busy', but may be other values, such as 'starting'.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("execution_state")
private String executionState;

        /**
         * Current execution state of the kernel. Typically 'idle' or 'busy', but may be other values, such as 'starting'.
* 
         * @param executionState the value to set
         * @return this builder
         **/
        

public Builder executionState(String executionState) {
    this.executionState = executionState;
    return this;
}


        public KernelSummary build() {
            KernelSummary model = new KernelSummary(this.id
                , this.name
                , this.lastActivity
                , this.connections
                , this.executionState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KernelSummary model) {
                this.id(model.getId());
    this.name(model.getName());
    this.lastActivity(model.getLastActivity());
    this.connections(model.getConnections());
    this.executionState(model.getExecutionState());
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
     * UUID of the kernel.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * UUID of the kernel.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * Kernel spec name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Kernel spec name.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * ISO 8601 timestamp for the last-seen activity on this kernel.
* Use this in combination with execution_state == 'idle' to identify
* which kernels have been idle since a given time.
* Timestamps will be UTC, indicated 'Z' suffix.
* Added in notebook server 5.0.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("last_activity")
    private final String lastActivity;

        /**
     * ISO 8601 timestamp for the last-seen activity on this kernel.
* Use this in combination with execution_state == 'idle' to identify
* which kernels have been idle since a given time.
* Timestamps will be UTC, indicated 'Z' suffix.
* Added in notebook server 5.0.
* 
     * @return the value
     **/
    
    public String getLastActivity() {
        return lastActivity;
    }


        /**
     * The number of active connections to this kernel.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("connections")
    private final Integer connections;

        /**
     * The number of active connections to this kernel.
* 
     * @return the value
     **/
    
    public Integer getConnections() {
        return connections;
    }


        /**
     * Current execution state of the kernel. Typically 'idle' or 'busy', but may be other values, such as 'starting'.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("execution_state")
    private final String executionState;

        /**
     * Current execution state of the kernel. Typically 'idle' or 'busy', but may be other values, such as 'starting'.
* 
     * @return the value
     **/
    
    public String getExecutionState() {
        return executionState;
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
        sb.append("KernelSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", lastActivity=").append(String.valueOf(this.lastActivity));
        sb.append(", connections=").append(String.valueOf(this.connections));
        sb.append(", executionState=").append(String.valueOf(this.executionState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KernelSummary)) {
            return false;
        }

        KernelSummary other = (KernelSummary) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.lastActivity, other.lastActivity) &&
            java.util.Objects.equals(this.connections, other.connections) &&
            java.util.Objects.equals(this.executionState, other.executionState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.lastActivity == null ? 43 : this.lastActivity.hashCode());
        result = (result * PRIME) + (this.connections == null ? 43 : this.connections.hashCode());
        result = (result * PRIME) + (this.executionState == null ? 43 : this.executionState.hashCode());
        return result;
    }


}
