// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary information about a cluster library.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type", defaultImpl=ClusterLibrarySummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = WorkspaceFileClusterLibrarySummary.class, name = "WORKSPACE_FILE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = VolumeFileClusterLibrarySummary.class, name = "VOLUME_FILE")
})

public class ClusterLibrarySummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"timeCreated", "timeUpdated", "stateMessage", "status"})
    protected ClusterLibrarySummary(java.util.Date timeCreated, java.util.Date timeUpdated, String stateMessage, Status status) {
        super();
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.stateMessage = stateMessage;
        this.status = status;
    }




        /**
     * Date and time the library was installed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Date and time the library was installed.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Date and time the library was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * Date and time the library was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * Additional context or detail about the current state of the library, especially useful when the status is {@code FAILED}, {@code SKIPPED}, or requires user intervention.
* This message can contain information such as the reason for failure, the step where the installation failed, or other diagnostic messages.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

        /**
     * Additional context or detail about the current state of the library, especially useful when the status is {@code FAILED}, {@code SKIPPED}, or requires user intervention.
* This message can contain information such as the reason for failure, the step where the installation failed, or other diagnostic messages.
* 
     * @return the value
     **/
    
    public String getStateMessage() {
        return stateMessage;
    }

    /**
     * Status of the library installed on the cluster.
     **/
    public enum Status {
        Pending("PENDING"),
        Resolving("RESOLVING"),
        Installing("INSTALLING"),
        Installed("INSTALLED"),
        Failed("FAILED"),
        InstallOnRestart("INSTALL_ON_RESTART"),
        UninstallOnRestart("UNINSTALL_ON_RESTART"),
        Skipped("SKIPPED"),
        Deleted("DELETED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Status', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Status of the library installed on the cluster.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

        /**
     * Status of the library installed on the cluster.
     * @return the value
     **/
    
    public Status getStatus() {
        return status;
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
        sb.append("ClusterLibrarySummary(");
        sb.append("timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterLibrarySummary)) {
            return false;
        }

        ClusterLibrarySummary other = (ClusterLibrarySummary) o;
        return java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.stateMessage, other.stateMessage) &&
            java.util.Objects.equals(this.status, other.status);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        return result;
    }


}
