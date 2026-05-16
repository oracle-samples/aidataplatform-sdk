// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A domain in the tenancy.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=IdentityDomainSummary.Builder.class)

public final class IdentityDomainSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"domainId", "domainName", "lifecycleState", "homeRegionUrl"})
    public IdentityDomainSummary(String domainId, String domainName, LifecycleState lifecycleState, String homeRegionUrl) {
        super();
        this.domainId = domainId;
        this.domainName = domainName;
        this.lifecycleState = lifecycleState;
        this.homeRegionUrl = homeRegionUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The ID of the domain.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("domainId")
private String domainId;

        /**
         * The ID of the domain.
         * @param domainId the value to set
         * @return this builder
         **/
        

public Builder domainId(String domainId) {
    this.domainId = domainId;
    return this;
}
            /**
     * The name of the domain.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("domainName")
private String domainName;

        /**
         * The name of the domain.
         * @param domainName the value to set
         * @return this builder
         **/
        

public Builder domainName(String domainName) {
    this.domainName = domainName;
    return this;
}
            /**
     * The current state of the domain in its lifecycle.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private LifecycleState lifecycleState;

        /**
         * The current state of the domain in its lifecycle.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * The primary region-specific URL for accessing the domain.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("homeRegionUrl")
private String homeRegionUrl;

        /**
         * The primary region-specific URL for accessing the domain.
         * @param homeRegionUrl the value to set
         * @return this builder
         **/
        

public Builder homeRegionUrl(String homeRegionUrl) {
    this.homeRegionUrl = homeRegionUrl;
    return this;
}


        public IdentityDomainSummary build() {
            IdentityDomainSummary model = new IdentityDomainSummary(this.domainId
                , this.domainName
                , this.lifecycleState
                , this.homeRegionUrl);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityDomainSummary model) {
                this.domainId(model.getDomainId());
    this.domainName(model.getDomainName());
    this.lifecycleState(model.getLifecycleState());
    this.homeRegionUrl(model.getHomeRegionUrl());
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
     * The ID of the domain.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("domainId")
    private final String domainId;

        /**
     * The ID of the domain.
     * @return the value
     **/
    
    public String getDomainId() {
        return domainId;
    }


        /**
     * The name of the domain.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    private final String domainName;

        /**
     * The name of the domain.
     * @return the value
     **/
    
    public String getDomainName() {
        return domainName;
    }

    /**
     * The current state of the domain in its lifecycle.
     **/
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Inactive("INACTIVE"),
        ;

        

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                    map.put(v.getValue(), v);
                
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
        /**
     * The current state of the domain in its lifecycle.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

        /**
     * The current state of the domain in its lifecycle.
     * @return the value
     **/
    
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * The primary region-specific URL for accessing the domain.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("homeRegionUrl")
    private final String homeRegionUrl;

        /**
     * The primary region-specific URL for accessing the domain.
     * @return the value
     **/
    
    public String getHomeRegionUrl() {
        return homeRegionUrl;
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
        sb.append("IdentityDomainSummary(");
        sb.append("domainId=").append(String.valueOf(this.domainId));
        sb.append(", domainName=").append(String.valueOf(this.domainName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", homeRegionUrl=").append(String.valueOf(this.homeRegionUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityDomainSummary)) {
            return false;
        }

        IdentityDomainSummary other = (IdentityDomainSummary) o;
        return java.util.Objects.equals(this.domainId, other.domainId) &&
            java.util.Objects.equals(this.domainName, other.domainName) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.homeRegionUrl, other.homeRegionUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domainId == null ? 43 : this.domainId.hashCode());
        result = (result * PRIME) + (this.domainName == null ? 43 : this.domainName.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.homeRegionUrl == null ? 43 : this.homeRegionUrl.hashCode());
        return result;
    }


}
