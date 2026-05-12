package com.oracle.aidataplatform.dp.model;


/**
 * Cluster runtime configurations.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=ClusterRuntimeConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SparkRuntimeConfig.class, name = "SPARK")
})

public class ClusterRuntimeConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"initScripts"})
    protected ClusterRuntimeConfig(java.util.List<InitScriptPath> initScripts) {
        super();
        this.initScripts = initScripts;
    }




        /**
     * Init script paths that are run in the order of definition.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("initScripts")
    private final java.util.List<InitScriptPath> initScripts;

        /**
     * Init script paths that are run in the order of definition.
     * @return the value
     **/
    
    public java.util.List<InitScriptPath> getInitScripts() {
        return initScripts;
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
        sb.append("ClusterRuntimeConfig(");
        sb.append("initScripts=").append(String.valueOf(this.initScripts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterRuntimeConfig)) {
            return false;
        }

        ClusterRuntimeConfig other = (ClusterRuntimeConfig) o;
        return java.util.Objects.equals(this.initScripts, other.initScripts);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.initScripts == null ? 43 : this.initScripts.hashCode());
        return result;
    }

    /**
     * Runtime type.
     **/
    public enum Type {
        Spark("SPARK"),
        

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
