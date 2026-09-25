// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Base Large Language Model configuration.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=BaseLlmConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = LlmConfig.class, name = "OCI_GEN_AI"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ThirdPartyLlmConfig.class, name = "THIRD_PARTY")
})

public class BaseLlmConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelId", "compartmentId", "endpointUrl"})
    protected BaseLlmConfig(String modelId, String compartmentId, String endpointUrl) {
        super();
        this.modelId = modelId;
        this.compartmentId = compartmentId;
        this.endpointUrl = endpointUrl;
    }




        /**
     * The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

        /**
     * The unique identifier of the Large Language Model (LLM) to use in the Agent or Tool.
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
    }


        /**
     * The compartment id of the Large Language Model (LLM) to use in the Agent or Tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

        /**
     * The compartment id of the Large Language Model (LLM) to use in the Agent or Tool
     * @return the value
     **/
    
    public String getCompartmentId() {
        return compartmentId;
    }


        /**
     * The endpoint URL of the Large Language Model (LLM) to use in the Agent or Tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endpointUrl")
    private final String endpointUrl;

        /**
     * The endpoint URL of the Large Language Model (LLM) to use in the Agent or Tool
     * @return the value
     **/
    
    public String getEndpointUrl() {
        return endpointUrl;
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
        sb.append("BaseLlmConfig(");
        sb.append("modelId=").append(String.valueOf(this.modelId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", endpointUrl=").append(String.valueOf(this.endpointUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BaseLlmConfig)) {
            return false;
        }

        BaseLlmConfig other = (BaseLlmConfig) o;
        return java.util.Objects.equals(this.modelId, other.modelId) &&
            java.util.Objects.equals(this.compartmentId, other.compartmentId) &&
            java.util.Objects.equals(this.endpointUrl, other.endpointUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.endpointUrl == null ? 43 : this.endpointUrl.hashCode());
        return result;
    }

    /**
     * The type of the Large Language Model configuration.
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        OciGenAi("OCI_GEN_AI"),
        ThirdParty("THIRD_PARTY"),
        

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
}
