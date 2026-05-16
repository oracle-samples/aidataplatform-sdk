// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a catalog.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CatalogSummary.Builder.class)

public final class CatalogSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "catalogType", "catalogGuid", "sourceType", "lifecycleState", "lifecycleStateDetails", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "lastRefreshStatus", "timeLastRefresh"})
    public CatalogSummary(String key, String displayName, String description, CatalogType catalogType, String catalogGuid, ExternalCatalogSourceType sourceType, CatalogLifecycleState lifecycleState, String lifecycleStateDetails, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, CrawlerLastRefreshStatus lastRefreshStatus, java.util.Date timeLastRefresh) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.catalogType = catalogType;
        this.catalogGuid = catalogGuid;
        this.sourceType = sourceType;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lastRefreshStatus = lastRefreshStatus;
        this.timeLastRefresh = timeLastRefresh;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The AI Data Platform Workbench catalog key.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The AI Data Platform Workbench catalog key.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Catalog display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * Catalog display name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Short description of the catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Short description of the catalog.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Type of catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogType")
private CatalogType catalogType;

        /**
         * Type of catalog.
         * @param catalogType the value to set
         * @return this builder
         **/
        

public Builder catalogType(CatalogType catalogType) {
    this.catalogType = catalogType;
    return this;
}
            /**
     * Unique identifier for catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogGuid")
private String catalogGuid;

        /**
         * Unique identifier for catalog.
         * @param catalogGuid the value to set
         * @return this builder
         **/
        

public Builder catalogGuid(String catalogGuid) {
    this.catalogGuid = catalogGuid;
    return this;
}
            /**
     * External catalog source type.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("sourceType")
private ExternalCatalogSourceType sourceType;

        /**
         * External catalog source type.
         * @param sourceType the value to set
         * @return this builder
         **/
        

public Builder sourceType(ExternalCatalogSourceType sourceType) {
    this.sourceType = sourceType;
    return this;
}
            /**
     * The current status of the catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private CatalogLifecycleState lifecycleState;

        /**
         * The current status of the catalog.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(CatalogLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

        /**
         * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}
            /**
     * The date and time the AI Data Platform Workbench catalog was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the AI Data Platform Workbench catalog was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The date and time the AI Data Platform Workbench catalog was updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the AI Data Platform Workbench catalog was updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The ID of the user that created the catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The ID of the user that created the catalog.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The ID of the last user to update the catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The ID of the last user to update the catalog.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * The status for last refresh performed on catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lastRefreshStatus")
private CrawlerLastRefreshStatus lastRefreshStatus;

        /**
         * The status for last refresh performed on catalog.
         * @param lastRefreshStatus the value to set
         * @return this builder
         **/
        

public Builder lastRefreshStatus(CrawlerLastRefreshStatus lastRefreshStatus) {
    this.lastRefreshStatus = lastRefreshStatus;
    return this;
}
            /**
     * The timestamp for last refresh performed on catalog.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeLastRefresh")
private java.util.Date timeLastRefresh;

        /**
         * The timestamp for last refresh performed on catalog.
         * @param timeLastRefresh the value to set
         * @return this builder
         **/
        

public Builder timeLastRefresh(java.util.Date timeLastRefresh) {
    this.timeLastRefresh = timeLastRefresh;
    return this;
}


        public CatalogSummary build() {
            CatalogSummary model = new CatalogSummary(this.key
                , this.displayName
                , this.description
                , this.catalogType
                , this.catalogGuid
                , this.sourceType
                , this.lifecycleState
                , this.lifecycleStateDetails
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy
                , this.lastRefreshStatus
                , this.timeLastRefresh);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CatalogSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.catalogType(model.getCatalogType());
    this.catalogGuid(model.getCatalogGuid());
    this.sourceType(model.getSourceType());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.lastRefreshStatus(model.getLastRefreshStatus());
    this.timeLastRefresh(model.getTimeLastRefresh());
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
     * The AI Data Platform Workbench catalog key.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The AI Data Platform Workbench catalog key.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Catalog display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Catalog display name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Short description of the catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Short description of the catalog.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }

    
        /**
     * Type of catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogType")
    private final CatalogType catalogType;

        /**
     * Type of catalog.
     * @return the value
     **/
    
    public CatalogType getCatalogType() {
        return catalogType;
    }


        /**
     * Unique identifier for catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogGuid")
    private final String catalogGuid;

        /**
     * Unique identifier for catalog.
     * @return the value
     **/
    
    public String getCatalogGuid() {
        return catalogGuid;
    }

    
        /**
     * External catalog source type.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final ExternalCatalogSourceType sourceType;

        /**
     * External catalog source type.
     * @return the value
     **/
    
    public ExternalCatalogSourceType getSourceType() {
        return sourceType;
    }

    
        /**
     * The current status of the catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CatalogLifecycleState lifecycleState;

        /**
     * The current status of the catalog.
     * @return the value
     **/
    
    public CatalogLifecycleState getLifecycleState() {
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
     * The date and time the AI Data Platform Workbench catalog was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the AI Data Platform Workbench catalog was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the AI Data Platform Workbench catalog was updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the AI Data Platform Workbench catalog was updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The ID of the user that created the catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The ID of the user that created the catalog.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The ID of the last user to update the catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the last user to update the catalog.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }

    
        /**
     * The status for last refresh performed on catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lastRefreshStatus")
    private final CrawlerLastRefreshStatus lastRefreshStatus;

        /**
     * The status for last refresh performed on catalog.
     * @return the value
     **/
    
    public CrawlerLastRefreshStatus getLastRefreshStatus() {
        return lastRefreshStatus;
    }


        /**
     * The timestamp for last refresh performed on catalog.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRefresh")
    private final java.util.Date timeLastRefresh;

        /**
     * The timestamp for last refresh performed on catalog.
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
        sb.append("CatalogSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogType=").append(String.valueOf(this.catalogType));
        sb.append(", catalogGuid=").append(String.valueOf(this.catalogGuid));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
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
        if (!(o instanceof CatalogSummary)) {
            return false;
        }

        CatalogSummary other = (CatalogSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.catalogType, other.catalogType) &&
            java.util.Objects.equals(this.catalogGuid, other.catalogGuid) &&
            java.util.Objects.equals(this.sourceType, other.sourceType) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
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
        result = (result * PRIME) + (this.catalogType == null ? 43 : this.catalogType.hashCode());
        result = (result * PRIME) + (this.catalogGuid == null ? 43 : this.catalogGuid.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lastRefreshStatus == null ? 43 : this.lastRefreshStatus.hashCode());
        result = (result * PRIME) + (this.timeLastRefresh == null ? 43 : this.timeLastRefresh.hashCode());
        return result;
    }


}
