package com.oracle.aidataplatform.dp.model;


/**
 * Derived model for topic of a ATP external catalog.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AtpSchemaSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="entityType")

public final class AtpSchemaSummary extends SchemaSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

            public Builder key(String key) {
            this.key = key;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

            public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

            public Builder description(String description) {
            this.description = description;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

            public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

            public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

            public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

            public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SchemaLifecycleState lifecycleState;

            public Builder lifecycleState(SchemaLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.Map<String, String> details;

            public Builder details(java.util.Map<String, String> details) {
            this.details = details;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("lastRefreshStatus")
        private CrawlerLastRefreshStatus lastRefreshStatus;

            public Builder lastRefreshStatus(CrawlerLastRefreshStatus lastRefreshStatus) {
            this.lastRefreshStatus = lastRefreshStatus;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRefresh")
        private java.util.Date timeLastRefresh;

            public Builder timeLastRefresh(java.util.Date timeLastRefresh) {
            this.timeLastRefresh = timeLastRefresh;
            return this;
            }


        public AtpSchemaSummary build() {
            AtpSchemaSummary model = new AtpSchemaSummary(this.key
                    , this.displayName
                    , this.description
                    , this.timeCreated
                    , this.timeUpdated
                    , this.createdBy
                    , this.updatedBy
                    , this.lifecycleState
                    , this.details
                    , this.lastRefreshStatus
                    , this.timeLastRefresh);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AtpSchemaSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.lifecycleState(model.getLifecycleState());
    this.details(model.getDetails());
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

    
    @Deprecated
    public AtpSchemaSummary(String key, String displayName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, SchemaLifecycleState lifecycleState, java.util.Map<String, String> details, CrawlerLastRefreshStatus lastRefreshStatus, java.util.Date timeLastRefresh) {
        super(key, displayName, description, timeCreated, timeUpdated, createdBy, updatedBy, lifecycleState, details, lastRefreshStatus, timeLastRefresh);
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
        sb.append("AtpSchemaSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AtpSchemaSummary)) {
            return false;
        }

        AtpSchemaSummary other = (AtpSchemaSummary) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        return result;
    }


}
