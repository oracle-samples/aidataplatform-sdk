// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Metadata of the dataLake
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DataLakeMetadata.Builder.class)

public final class DataLakeMetadata  {
    @Deprecated
    @java.beans.ConstructorProperties({"auditLogId", "logGroupId", "isAuditEnabled", "auditRetentionPeriod"})
    public DataLakeMetadata(String auditLogId, String logGroupId, Boolean isAuditEnabled, Integer auditRetentionPeriod) {
        super();
        this.auditLogId = auditLogId;
        this.logGroupId = logGroupId;
        this.isAuditEnabled = isAuditEnabled;
        this.auditRetentionPeriod = auditRetentionPeriod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Log object Id for DataLake logs
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("auditLogId")
        private String auditLogId;

                /**
         * Log object Id for DataLake logs
         * @param auditLogId the value to set
         * @return this builder
         **/
        

        public Builder auditLogId(String auditLogId) {
        this.auditLogId = auditLogId;
        return this;
        }
            /**
     * log groupId for the DataLake
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
        private String logGroupId;

                /**
         * log groupId for the DataLake
         * @param logGroupId the value to set
         * @return this builder
         **/
        

        public Builder logGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
        }
            /**
     * is Audit enabled for the DataLake
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isAuditEnabled")
        private Boolean isAuditEnabled;

                /**
         * is Audit enabled for the DataLake
         * @param isAuditEnabled the value to set
         * @return this builder
         **/
        

        public Builder isAuditEnabled(Boolean isAuditEnabled) {
        this.isAuditEnabled = isAuditEnabled;
        return this;
        }
            /**
     * DataLake Retention period for audit logs
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("auditRetentionPeriod")
        private Integer auditRetentionPeriod;

                /**
         * DataLake Retention period for audit logs
         * @param auditRetentionPeriod the value to set
         * @return this builder
         **/
        

        public Builder auditRetentionPeriod(Integer auditRetentionPeriod) {
        this.auditRetentionPeriod = auditRetentionPeriod;
        return this;
        }


        public DataLakeMetadata build() {
            DataLakeMetadata model = new DataLakeMetadata(this.auditLogId
                    , this.logGroupId
                    , this.isAuditEnabled
                    , this.auditRetentionPeriod);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataLakeMetadata model) {
                this.auditLogId(model.getAuditLogId());
    this.logGroupId(model.getLogGroupId());
    this.isAuditEnabled(model.getIsAuditEnabled());
    this.auditRetentionPeriod(model.getAuditRetentionPeriod());
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
     * Log object Id for DataLake logs
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("auditLogId")
    private final String auditLogId;

        /**
     * Log object Id for DataLake logs
     * @return the value
     **/
    
    public String getAuditLogId() {
        return auditLogId;
    }


        /**
     * log groupId for the DataLake
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("logGroupId")
    private final String logGroupId;

        /**
     * log groupId for the DataLake
     * @return the value
     **/
    
    public String getLogGroupId() {
        return logGroupId;
    }


        /**
     * is Audit enabled for the DataLake
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isAuditEnabled")
    private final Boolean isAuditEnabled;

        /**
     * is Audit enabled for the DataLake
     * @return the value
     **/
    
    public Boolean getIsAuditEnabled() {
        return isAuditEnabled;
    }


        /**
     * DataLake Retention period for audit logs
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("auditRetentionPeriod")
    private final Integer auditRetentionPeriod;

        /**
     * DataLake Retention period for audit logs
     * @return the value
     **/
    
    public Integer getAuditRetentionPeriod() {
        return auditRetentionPeriod;
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
        sb.append("DataLakeMetadata(");
        sb.append("auditLogId=").append(String.valueOf(this.auditLogId));
        sb.append(", logGroupId=").append(String.valueOf(this.logGroupId));
        sb.append(", isAuditEnabled=").append(String.valueOf(this.isAuditEnabled));
        sb.append(", auditRetentionPeriod=").append(String.valueOf(this.auditRetentionPeriod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataLakeMetadata)) {
            return false;
        }

        DataLakeMetadata other = (DataLakeMetadata) o;
        return java.util.Objects.equals(this.auditLogId, other.auditLogId) &&
            java.util.Objects.equals(this.logGroupId, other.logGroupId) &&
            java.util.Objects.equals(this.isAuditEnabled, other.isAuditEnabled) &&
            java.util.Objects.equals(this.auditRetentionPeriod, other.auditRetentionPeriod);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.auditLogId == null ? 43 : this.auditLogId.hashCode());
        result = (result * PRIME) + (this.logGroupId == null ? 43 : this.logGroupId.hashCode());
        result = (result * PRIME) + (this.isAuditEnabled == null ? 43 : this.isAuditEnabled.hashCode());
        result = (result * PRIME) + (this.auditRetentionPeriod == null ? 43 : this.auditRetentionPeriod.hashCode());
        return result;
    }


}
