// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Playground cache for an Agent Flow session.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PlaygroundCache.Builder.class)

public final class PlaygroundCache  {
    @Deprecated
    @java.beans.ConstructorProperties({"variables"})
    public PlaygroundCache(java.util.Map<String, SessionVariable> variables) {
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


        public PlaygroundCache build() {
            PlaygroundCache model = new PlaygroundCache(this.variables);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PlaygroundCache model) {
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
        sb.append("PlaygroundCache(");
        sb.append("variables=").append(String.valueOf(this.variables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlaygroundCache)) {
            return false;
        }

        PlaygroundCache other = (PlaygroundCache) o;
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
