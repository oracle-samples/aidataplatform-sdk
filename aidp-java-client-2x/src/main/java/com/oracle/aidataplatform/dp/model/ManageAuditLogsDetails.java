// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * manage audit log details
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ManageAuditLogsDetails.Builder.class)

public final class ManageAuditLogsDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "retentionPeriod"})
    public ManageAuditLogsDetails(Action action, Integer retentionPeriod) {
        super();
        this.action = action;
        this.retentionPeriod = retentionPeriod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * action to enable or disable the logs
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

                /**
         * action to enable or disable the logs
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(Action action) {
        this.action = action;
        return this;
        }
            /**
     * Retention period of the audit logs
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
        private Integer retentionPeriod;

                /**
         * Retention period of the audit logs
         * @param retentionPeriod the value to set
         * @return this builder
         **/
        

        public Builder retentionPeriod(Integer retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
        return this;
        }


        public ManageAuditLogsDetails build() {
            ManageAuditLogsDetails model = new ManageAuditLogsDetails(this.action
                    , this.retentionPeriod);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManageAuditLogsDetails model) {
                this.action(model.getAction());
    this.retentionPeriod(model.getRetentionPeriod());
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
     * action to enable or disable the logs
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

        /**
     * action to enable or disable the logs
     * @return the value
     **/
    
    public Action getAction() {
        return action;
    }


        /**
     * Retention period of the audit logs
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriod")
    private final Integer retentionPeriod;

        /**
     * Retention period of the audit logs
     * @return the value
     **/
    
    public Integer getRetentionPeriod() {
        return retentionPeriod;
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
        sb.append("ManageAuditLogsDetails(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", retentionPeriod=").append(String.valueOf(this.retentionPeriod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManageAuditLogsDetails)) {
            return false;
        }

        ManageAuditLogsDetails other = (ManageAuditLogsDetails) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.retentionPeriod, other.retentionPeriod);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.retentionPeriod == null ? 43 : this.retentionPeriod.hashCode());
        return result;
    }


}
