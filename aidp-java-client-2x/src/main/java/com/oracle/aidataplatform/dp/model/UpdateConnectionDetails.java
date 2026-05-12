package com.oracle.aidataplatform.dp.model;


/**
 * The details of a connection associated with a catalog.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateConnectionDetails.Builder.class)

public final class UpdateConnectionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"connectionProperties"})
    public UpdateConnectionDetails(java.util.Map<String, String> connectionProperties) {
        super();
        this.connectionProperties = connectionProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Connection properties.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
        private java.util.Map<String, String> connectionProperties;

                /**
         * Connection properties.
         * @param connectionProperties the value to set
         * @return this builder
         **/
        

        public Builder connectionProperties(java.util.Map<String, String> connectionProperties) {
        this.connectionProperties = connectionProperties;
        return this;
        }


        public UpdateConnectionDetails build() {
            UpdateConnectionDetails model = new UpdateConnectionDetails(this.connectionProperties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConnectionDetails model) {
                this.connectionProperties(model.getConnectionProperties());
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
     * Connection properties.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
    private final java.util.Map<String, String> connectionProperties;

        /**
     * Connection properties.
     * @return the value
     **/
    
    public java.util.Map<String, String> getConnectionProperties() {
        return connectionProperties;
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
        sb.append("UpdateConnectionDetails(");
        sb.append("connectionProperties=").append(String.valueOf(this.connectionProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConnectionDetails)) {
            return false;
        }

        UpdateConnectionDetails other = (UpdateConnectionDetails) o;
        return java.util.Objects.equals(this.connectionProperties, other.connectionProperties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.connectionProperties == null ? 43 : this.connectionProperties.hashCode());
        return result;
    }


}
