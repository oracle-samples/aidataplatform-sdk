// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Schema in data catalogs are constructs to organize data. Schema can contain tables, which contain structured data,
* and volumes, which contain unstructured data. A default schema is created in all standard catalogs created in the
* Master Catalog. To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to
* an administrator. If you're an administrator who needs to write policies to give users access, see
* <a href="https://docs.oracle.com/en/cloud/paas/ai-data-platform/aidug/iam-policies-oracle-ai-data-platform.html" target="_blank" rel="noopener noreferrer">IAM Policies for Oracle AI Data Platform Workbench</a>.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="entityType", defaultImpl=Schema.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OracleSchema.class, name = "ORACLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AlhSchema.class, name = "ALH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AdwSchema.class, name = "ADW"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = KafkaTopicSchema.class, name = "KAFKA_TOPIC"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AtpSchema.class, name = "ATP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = StandardSchema.class, name = "STANDARD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = OacSchema.class, name = "ORACLE_ANALYTICS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = ExadataSchema.class, name = "EXADATA")
})

public class Schema  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "properties", "catalogName", "lifecycleState", "lifecycleStateDetails", "details"})
    protected Schema(String key, String displayName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, java.util.Map<String, String> properties, String catalogName, SchemaLifecycleState lifecycleState, String lifecycleStateDetails, java.util.Map<String, String> details) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.properties = properties;
        this.catalogName = catalogName;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.details = details;
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
     * Key-value pair representing a defined tag key and value.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

        /**
     * Key-value pair representing a defined tag key and value.
     * @return the value
     **/
    
    public java.util.Map<String, String> getProperties() {
        return properties;
    }


        /**
     * The name of the catalog to which this schema belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
    private final String catalogName;

        /**
     * The name of the catalog to which this schema belongs.
     * @return the value
     **/
    
    public String getCatalogName() {
        return catalogName;
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
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

        /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
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
        sb.append("Schema(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", catalogName=").append(String.valueOf(this.catalogName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schema)) {
            return false;
        }

        Schema other = (Schema) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.properties, other.properties) &&
            java.util.Objects.equals(this.catalogName, other.catalogName) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails) &&
            java.util.Objects.equals(this.details, other.details);
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
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        return result;
    }


}
