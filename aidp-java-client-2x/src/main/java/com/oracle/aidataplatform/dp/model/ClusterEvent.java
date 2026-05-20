// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Properties of a event provided by the cluster.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=ClusterEvent.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ClusterStateEvent.class, name = "CLUSTER_STATE_EVENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ClusterPatchEvent.class, name = "CLUSTER_PATCH_EVENT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ClusterExecutionContextAvailabilityEvent.class, name = "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT")
})

public class ClusterEvent  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected ClusterEvent() {
        super();
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
        sb.append("ClusterEvent(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterEvent)) {
            return false;
        }

        ClusterEvent other = (ClusterEvent) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }

    /**
     * The type of the cluster event
     **/
    public enum Type {
        ClusterPatchEvent("CLUSTER_PATCH_EVENT"),
        ClusterExecutionContextAvailabilityEvent("CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT"),
        ClusterStateEvent("CLUSTER_STATE_EVENT"),
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
}
