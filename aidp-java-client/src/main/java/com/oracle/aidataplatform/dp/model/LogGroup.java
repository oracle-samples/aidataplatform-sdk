// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Log group details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=LogGroup.Builder.class)

public final class LogGroup  {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "groupName", "logName"})
    public LogGroup(String compartmentId, String groupName, String logName) {
        super();
        this.compartmentId = compartmentId;
        this.groupName = groupName;
        this.logName = logName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The compartment ID of the log group.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
private String compartmentId;

        /**
         * The compartment ID of the log group.
         * @param compartmentId the value to set
         * @return this builder
         **/
        

public Builder compartmentId(String compartmentId) {
    this.compartmentId = compartmentId;
    return this;
}
            /**
     * Log group name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("groupName")
private String groupName;

        /**
         * Log group name.
         * @param groupName the value to set
         * @return this builder
         **/
        

public Builder groupName(String groupName) {
    this.groupName = groupName;
    return this;
}
            /**
     * Log name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("logName")
private String logName;

        /**
         * Log name.
         * @param logName the value to set
         * @return this builder
         **/
        

public Builder logName(String logName) {
    this.logName = logName;
    return this;
}


        public LogGroup build() {
            LogGroup model = new LogGroup(this.compartmentId
                , this.groupName
                , this.logName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogGroup model) {
                this.compartmentId(model.getCompartmentId());
    this.groupName(model.getGroupName());
    this.logName(model.getLogName());
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
     * The compartment ID of the log group.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

        /**
     * The compartment ID of the log group.
     * @return the value
     **/
    
    public String getCompartmentId() {
        return compartmentId;
    }


        /**
     * Log group name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

        /**
     * Log group name.
     * @return the value
     **/
    
    public String getGroupName() {
        return groupName;
    }


        /**
     * Log name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logName")
    private final String logName;

        /**
     * Log name.
     * @return the value
     **/
    
    public String getLogName() {
        return logName;
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
        sb.append("LogGroup(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(", logName=").append(String.valueOf(this.logName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogGroup)) {
            return false;
        }

        LogGroup other = (LogGroup) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId) &&
            java.util.Objects.equals(this.groupName, other.groupName) &&
            java.util.Objects.equals(this.logName, other.logName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + (this.logName == null ? 43 : this.logName.hashCode());
        return result;
    }


}
