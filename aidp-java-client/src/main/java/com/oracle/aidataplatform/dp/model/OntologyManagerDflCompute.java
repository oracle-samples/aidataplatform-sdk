// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Address and state of the service-managed DFL compute for a workspace.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyManagerDflCompute.Builder.class)

public final class OntologyManagerDflCompute  {
    @Deprecated
    @java.beans.ConstructorProperties({"gatewayUri", "clusterKey", "state", "isEnabled"})
    public OntologyManagerDflCompute(String gatewayUri, String clusterKey, String state, Boolean isEnabled) {
        super();
        this.gatewayUri = gatewayUri;
        this.clusterKey = clusterKey;
        this.state = state;
        this.isEnabled = isEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Base URI to address the compute through the DataFlow gateway, which is what a caller needs in order to send it a request. Already includes the API version and the compute key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gatewayUri")
private String gatewayUri;

        /**
         * Base URI to address the compute through the DataFlow gateway, which is what a caller needs in order to send it a request. Already includes the API version and the compute key.
         * @param gatewayUri the value to set
         * @return this builder
         **/
        

public Builder gatewayUri(String gatewayUri) {
    this.gatewayUri = gatewayUri;
    return this;
}
            /**
     * Key of the DFL compute.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
private String clusterKey;

        /**
         * Key of the DFL compute.
         * @param clusterKey the value to set
         * @return this builder
         **/
        

public Builder clusterKey(String clusterKey) {
    this.clusterKey = clusterKey;
    return this;
}
            /**
     * Lifecycle state of the compute, when it is known.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("state")
private String state;

        /**
         * Lifecycle state of the compute, when it is known.
         * @param state the value to set
         * @return this builder
         **/
        

public Builder state(String state) {
    this.state = state;
    return this;
}
            /**
     * Whether DI Agent compute is enabled for this AI Data Platform instance.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * Whether DI Agent compute is enabled for this AI Data Platform instance.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}


        public OntologyManagerDflCompute build() {
            OntologyManagerDflCompute model = new OntologyManagerDflCompute(this.gatewayUri
                , this.clusterKey
                , this.state
                , this.isEnabled);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyManagerDflCompute model) {
                this.gatewayUri(model.getGatewayUri());
    this.clusterKey(model.getClusterKey());
    this.state(model.getState());
    this.isEnabled(model.getIsEnabled());
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
     * Base URI to address the compute through the DataFlow gateway, which is what a caller needs in order to send it a request. Already includes the API version and the compute key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gatewayUri")
    private final String gatewayUri;

        /**
     * Base URI to address the compute through the DataFlow gateway, which is what a caller needs in order to send it a request. Already includes the API version and the compute key.
     * @return the value
     **/
    
    public String getGatewayUri() {
        return gatewayUri;
    }


        /**
     * Key of the DFL compute.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("clusterKey")
    private final String clusterKey;

        /**
     * Key of the DFL compute.
     * @return the value
     **/
    
    public String getClusterKey() {
        return clusterKey;
    }


        /**
     * Lifecycle state of the compute, when it is known.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

        /**
     * Lifecycle state of the compute, when it is known.
     * @return the value
     **/
    
    public String getState() {
        return state;
    }


        /**
     * Whether DI Agent compute is enabled for this AI Data Platform instance.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Whether DI Agent compute is enabled for this AI Data Platform instance.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
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
        sb.append("OntologyManagerDflCompute(");
        sb.append("gatewayUri=").append(String.valueOf(this.gatewayUri));
        sb.append(", clusterKey=").append(String.valueOf(this.clusterKey));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyManagerDflCompute)) {
            return false;
        }

        OntologyManagerDflCompute other = (OntologyManagerDflCompute) o;
        return java.util.Objects.equals(this.gatewayUri, other.gatewayUri) &&
            java.util.Objects.equals(this.clusterKey, other.clusterKey) &&
            java.util.Objects.equals(this.state, other.state) &&
            java.util.Objects.equals(this.isEnabled, other.isEnabled);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gatewayUri == null ? 43 : this.gatewayUri.hashCode());
        result = (result * PRIME) + (this.clusterKey == null ? 43 : this.clusterKey.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        return result;
    }


}
