// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Information about a cluster library to install or uninstall.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="operation", defaultImpl=ClusterLibraryDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UninstallClusterLibraryDetails.class, name = "UNINSTALL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = InstallClusterLibraryDetails.class, name = "INSTALL")
})

public class ClusterLibraryDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"type"})
    protected ClusterLibraryDetails(Type type) {
        super();
        this.type = type;
    }



    /**
     * Library type.
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        WorkspaceFile("WORKSPACE_FILE"),
        VolumeFile("VOLUME_FILE"),
        ;

        

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                    map.put(v.getValue(), v);
                
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
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
        /**
     * Library type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Library type.
     * @return the value
     **/
    
    public Type getType() {
        return type;
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
        sb.append("ClusterLibraryDetails(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterLibraryDetails)) {
            return false;
        }

        ClusterLibraryDetails other = (ClusterLibraryDetails) o;
        return java.util.Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        return result;
    }

    /**
     * Operation to perform on this library from the cluster. Install or uninstall.
     **/
    public enum Operation implements com.oracle.bmc.http.internal.BmcEnum {
        Install("INSTALL"),
        Uninstall("UNINSTALL"),
        ;

        

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Operation: " + key);
        }
    };
}
