// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Descriptor for a workspace resource (Job/Agentflow) to include in a bundle.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BundledResource.Builder.class)

public final class BundledResource  {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceType", "resourceKey"})
    public BundledResource(ResourceType resourceType, String resourceKey) {
        super();
        this.resourceType = resourceType;
        this.resourceKey = resourceKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Type of resource (job or agentflow).
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private ResourceType resourceType;

                /**
         * Type of resource (job or agentflow).
         * @param resourceType the value to set
         * @return this builder
         **/
        

        public Builder resourceType(ResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
        }
            /**
     * Workspace unique key for the resource.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("resourceKey")
        private String resourceKey;

                /**
         * Workspace unique key for the resource.
         * @param resourceKey the value to set
         * @return this builder
         **/
        

        public Builder resourceKey(String resourceKey) {
        this.resourceKey = resourceKey;
        return this;
        }


        public BundledResource build() {
            BundledResource model = new BundledResource(this.resourceType
                    , this.resourceKey);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BundledResource model) {
                this.resourceType(model.getResourceType());
    this.resourceKey(model.getResourceKey());
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
     * Type of resource (job or agentflow).
     **/
    public enum ResourceType {
        Job("JOB"),
        Agentflow("AGENTFLOW"),
        ;

        

        private final String value;
        private static java.util.Map<String, ResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceType v : ResourceType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        ResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ResourceType: " + key);
        }
    };
        /**
     * Type of resource (job or agentflow).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final ResourceType resourceType;

        /**
     * Type of resource (job or agentflow).
     * @return the value
     **/
    
    public ResourceType getResourceType() {
        return resourceType;
    }


        /**
     * Workspace unique key for the resource.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceKey")
    private final String resourceKey;

        /**
     * Workspace unique key for the resource.
     * @return the value
     **/
    
    public String getResourceKey() {
        return resourceKey;
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
        sb.append("BundledResource(");
        sb.append("resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", resourceKey=").append(String.valueOf(this.resourceKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BundledResource)) {
            return false;
        }

        BundledResource other = (BundledResource) o;
        return java.util.Objects.equals(this.resourceType, other.resourceType) &&
            java.util.Objects.equals(this.resourceKey, other.resourceKey);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result = (result * PRIME) + (this.resourceKey == null ? 43 : this.resourceKey.hashCode());
        return result;
    }


}
