package com.oracle.aidataplatform.dp.model;



/**
 * Playground cache for an Agent Flow session.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateAgentFlowSessionPlaygroundCacheDetails.Builder.class)

public final class UpdateAgentFlowSessionPlaygroundCacheDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"variables"})
    public UpdateAgentFlowSessionPlaygroundCacheDetails(java.util.Map<String, SessionVariable> variables) {
        super();
        this.variables = variables;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Map of variable name to value for this session's playground cache.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("variables")
private java.util.Map<String, SessionVariable> variables;

        /**
         * Map of variable name to value for this session's playground cache.
         * @param variables the value to set
         * @return this builder
         **/
        

public Builder variables(java.util.Map<String, SessionVariable> variables) {
    this.variables = variables;
    return this;
}


        public UpdateAgentFlowSessionPlaygroundCacheDetails build() {
            UpdateAgentFlowSessionPlaygroundCacheDetails model = new UpdateAgentFlowSessionPlaygroundCacheDetails(this.variables);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAgentFlowSessionPlaygroundCacheDetails model) {
                this.variables(model.getVariables());
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
     * Map of variable name to value for this session's playground cache.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.Map<String, SessionVariable> variables;

        /**
     * Map of variable name to value for this session's playground cache.
     * @return the value
     **/
    
    public java.util.Map<String, SessionVariable> getVariables() {
        return variables;
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
        sb.append("UpdateAgentFlowSessionPlaygroundCacheDetails(");
        sb.append("variables=").append(String.valueOf(this.variables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAgentFlowSessionPlaygroundCacheDetails)) {
            return false;
        }

        UpdateAgentFlowSessionPlaygroundCacheDetails other = (UpdateAgentFlowSessionPlaygroundCacheDetails) o;
        return java.util.Objects.equals(this.variables, other.variables);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        return result;
    }


}
