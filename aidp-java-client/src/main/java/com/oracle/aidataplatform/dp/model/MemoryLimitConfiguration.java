package com.oracle.aidataplatform.dp.model;



/**
 * Memory limit configuration for an agent node.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MemoryLimitConfiguration.Builder.class)

public final class MemoryLimitConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "config"})
    public MemoryLimitConfiguration(MemoryLimitStrategy type, MemoryLimitConfigurationDetails config) {
        super();
        this.type = type;
        this.config = config;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Type used for memory limiting. TRUNCATION applies truncation middleware.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private MemoryLimitStrategy type;

        /**
         * Type used for memory limiting. TRUNCATION applies truncation middleware.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(MemoryLimitStrategy type) {
    this.type = type;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("config")
private MemoryLimitConfigurationDetails config;



public Builder config(MemoryLimitConfigurationDetails config) {
    this.config = config;
    return this;
}


        public MemoryLimitConfiguration build() {
            MemoryLimitConfiguration model = new MemoryLimitConfiguration(this.type
                , this.config);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MemoryLimitConfiguration model) {
                this.type(model.getType());
    this.config(model.getConfig());
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
     * Type used for memory limiting. TRUNCATION applies truncation middleware.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final MemoryLimitStrategy type;

        /**
     * Type used for memory limiting. TRUNCATION applies truncation middleware.
     * @return the value
     **/
    
    public MemoryLimitStrategy getType() {
        return type;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final MemoryLimitConfigurationDetails config;

    
    public MemoryLimitConfigurationDetails getConfig() {
        return config;
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
        sb.append("MemoryLimitConfiguration(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MemoryLimitConfiguration)) {
            return false;
        }

        MemoryLimitConfiguration other = (MemoryLimitConfiguration) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.config, other.config);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        return result;
    }


}
