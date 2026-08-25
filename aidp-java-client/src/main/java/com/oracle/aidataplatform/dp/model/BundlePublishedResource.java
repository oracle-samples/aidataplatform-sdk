// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Published resource.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BundlePublishedResource.Builder.class)

public final class BundlePublishedResource  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "key", "name"})
    public BundlePublishedResource(Type type, String key, String name) {
        super();
        this.type = type;
        this.key = key;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Type of resource
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

        /**
         * Type of resource
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * Resource key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Resource key.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Resource name
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Resource name
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}


        public BundlePublishedResource build() {
            BundlePublishedResource model = new BundlePublishedResource(this.type
                , this.key
                , this.name);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BundlePublishedResource model) {
                this.type(model.getType());
    this.key(model.getKey());
    this.name(model.getName());
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
     * Type of resource
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Job("JOB"),
        Agentflow("AGENTFLOW"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Type of resource
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Type of resource
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * Resource key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Resource key.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Resource name
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Resource name
     * @return the value
     **/
    
    public String getName() {
        return name;
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
        sb.append("BundlePublishedResource(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BundlePublishedResource)) {
            return false;
        }

        BundlePublishedResource other = (BundlePublishedResource) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        return result;
    }


}
