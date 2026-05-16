// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details of subscription.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SubscriptionDetails.Builder.class)

public final class SubscriptionDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"callbackUrl", "serviceName"})
    public SubscriptionDetails(String callbackUrl, String serviceName) {
        super();
        this.callbackUrl = callbackUrl;
        this.serviceName = serviceName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The notification callback URL.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("callbackUrl")
private String callbackUrl;

        /**
         * The notification callback URL.
         * @param callbackUrl the value to set
         * @return this builder
         **/
        

public Builder callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
}
            /**
     * The name of the service.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("serviceName")
private String serviceName;

        /**
         * The name of the service.
         * @param serviceName the value to set
         * @return this builder
         **/
        

public Builder serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
}


        public SubscriptionDetails build() {
            SubscriptionDetails model = new SubscriptionDetails(this.callbackUrl
                , this.serviceName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionDetails model) {
                this.callbackUrl(model.getCallbackUrl());
    this.serviceName(model.getServiceName());
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
     * The notification callback URL.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("callbackUrl")
    private final String callbackUrl;

        /**
     * The notification callback URL.
     * @return the value
     **/
    
    public String getCallbackUrl() {
        return callbackUrl;
    }


        /**
     * The name of the service.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

        /**
     * The name of the service.
     * @return the value
     **/
    
    public String getServiceName() {
        return serviceName;
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
        sb.append("SubscriptionDetails(");
        sb.append("callbackUrl=").append(String.valueOf(this.callbackUrl));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionDetails)) {
            return false;
        }

        SubscriptionDetails other = (SubscriptionDetails) o;
        return java.util.Objects.equals(this.callbackUrl, other.callbackUrl) &&
            java.util.Objects.equals(this.serviceName, other.serviceName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.callbackUrl == null ? 43 : this.callbackUrl.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        return result;
    }


}
