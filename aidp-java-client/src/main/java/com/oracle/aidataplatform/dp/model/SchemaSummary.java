// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a schema.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="entityType", defaultImpl=SchemaSummary.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AlhSchemaSummary.class, name = "ALH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ExadataSchemaSummary.class, name = "EXADATA"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OracleSchemaSummary.class, name = "ORACLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OacSchemaSummary.class, name = "ORACLE_ANALYTICS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AtpSchemaSummary.class, name = "ATP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = KafkaTopicSchemaSummary.class, name = "KAFKA_TOPIC"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AdwSchemaSummary.class, name = "ADW"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = StandardSchemaSummary.class, name = "STANDARD")
})

public class SchemaSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "lifecycleState", "details", "lastRefreshStatus", "timeLastRefresh"})
    protected SchemaSummary(String key, String displayName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, SchemaLifecycleState lifecycleState, java.util.Map<String, String> details, CrawlerLastRefreshStatus lastRefreshStatus, java.util.Date timeLastRefresh) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lifecycleState = lifecycleState;
        this.details = details;
        this.lastRefreshStatus = lastRefreshStatus;
        this.timeLastRefresh = timeLastRefresh;
    }




        /**
     * The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The fully qualified name of the schema in the format <catalog_name>.<schema_name>.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Schema name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Schema name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Schema description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Schema description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The date and time the schema was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the schema was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the schema was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the schema was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * ID of the user who created the schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * ID of the user who created the schema.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * ID of the user who last updated the schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * ID of the user who last updated the schema.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }

    
        /**
     * The current state of the schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SchemaLifecycleState lifecycleState;

        /**
     * The current state of the schema.
     * @return the value
     **/
    
    public SchemaLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.Map<String, String> details;

        /**
     * Deprecated field. Map of key-value pairs. This object will be only provided when the parent catalog is external.
     * @return the value
     **/
    
    public java.util.Map<String, String> getDetails() {
        return details;
    }

    
        /**
     * The status for last refresh performed on schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lastRefreshStatus")
    private final CrawlerLastRefreshStatus lastRefreshStatus;

        /**
     * The status for last refresh performed on schema.
     * @return the value
     **/
    
    public CrawlerLastRefreshStatus getLastRefreshStatus() {
        return lastRefreshStatus;
    }


        /**
     * The timestamp for last refresh performed on schema.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRefresh")
    private final java.util.Date timeLastRefresh;

        /**
     * The timestamp for last refresh performed on schema.
     * @return the value
     **/
    
    public java.util.Date getTimeLastRefresh() {
        return timeLastRefresh;
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
        sb.append("SchemaSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", lastRefreshStatus=").append(String.valueOf(this.lastRefreshStatus));
        sb.append(", timeLastRefresh=").append(String.valueOf(this.timeLastRefresh));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SchemaSummary)) {
            return false;
        }

        SchemaSummary other = (SchemaSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.details, other.details) &&
            java.util.Objects.equals(this.lastRefreshStatus, other.lastRefreshStatus) &&
            java.util.Objects.equals(this.timeLastRefresh, other.timeLastRefresh);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + (this.lastRefreshStatus == null ? 43 : this.lastRefreshStatus.hashCode());
        result = (result * PRIME) + (this.timeLastRefresh == null ? 43 : this.timeLastRefresh.hashCode());
        return result;
    }


}
