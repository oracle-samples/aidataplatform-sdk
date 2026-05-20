// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary information about a Workspace.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WorkspaceSummary.Builder.class)

public final class WorkspaceSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "type", "description", "timeCreated", "timeUpdated", "lifecycleState", "lifecycleDetails", "systemTags", "createdBy", "createdByName", "updatedBy", "updatedByName", "defaultCatalogKey", "isPrivateNetworkEnabled", "aicUserSchemaName"})
    public WorkspaceSummary(String key, String displayName, Type type, String description, java.util.Date timeCreated, java.util.Date timeUpdated, Workspace.LifecycleState lifecycleState, String lifecycleDetails, java.util.Map<String, java.util.Map<String, Object>> systemTags, String createdBy, String createdByName, String updatedBy, String updatedByName, String defaultCatalogKey, Boolean isPrivateNetworkEnabled, String aicUserSchemaName) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.type = type;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.systemTags = systemTags;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
        this.updatedBy = updatedBy;
        this.updatedByName = updatedByName;
        this.defaultCatalogKey = defaultCatalogKey;
        this.isPrivateNetworkEnabled = isPrivateNetworkEnabled;
        this.aicUserSchemaName = aicUserSchemaName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The key of the AI Data Platform Workbench workspace.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * The key of the AI Data Platform Workbench workspace.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

                /**
         * Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(Type type) {
        this.type = type;
        return this;
        }
            /**
     * Description of the workspace.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Description of the workspace.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

                /**
         * The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeCreated the value to set
         * @return this builder
         **/
        

        public Builder timeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
        return this;
        }
            /**
     * The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

                /**
         * The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

        public Builder timeUpdated(java.util.Date timeUpdated) {
        this.timeUpdated = timeUpdated;
        return this;
        }
            /**
     * The current state of the AI Data Platform Workbench workspace.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Workspace.LifecycleState lifecycleState;

                /**
         * The current state of the AI Data Platform Workbench workspace.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

        public Builder lifecycleState(Workspace.LifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
        }
            /**
     * A message that describes the current state of the workspace in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

                /**
         * A message that describes the current state of the workspace in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        

        public Builder lifecycleDetails(String lifecycleDetails) {
        this.lifecycleDetails = lifecycleDetails;
        return this;
        }
            /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

                /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
         * @param systemTags the value to set
         * @return this builder
         **/
        

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        this.systemTags = systemTags;
        return this;
        }
            /**
     * OCID of the user who created this record.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

                /**
         * OCID of the user who created this record.
         * @param createdBy the value to set
         * @return this builder
         **/
        

        public Builder createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
        }
            /**
     * Name of the user who created this record.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
        private String createdByName;

                /**
         * Name of the user who created this record.
         * @param createdByName the value to set
         * @return this builder
         **/
        

        public Builder createdByName(String createdByName) {
        this.createdByName = createdByName;
        return this;
        }
            /**
     * OCID of the user who updated this record.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

                /**
         * OCID of the user who updated this record.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

        public Builder updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
        }
            /**
     * Name of the user who updated this record.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
        private String updatedByName;

                /**
         * Name of the user who updated this record.
         * @param updatedByName the value to set
         * @return this builder
         **/
        

        public Builder updatedByName(String updatedByName) {
        this.updatedByName = updatedByName;
        return this;
        }
            /**
     * The key of the catalog to be used as the default catalog for this workspace.
* A default catalog in the workspace will allow users to use that
* catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
* schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("defaultCatalogKey")
        private String defaultCatalogKey;

                /**
         * The key of the catalog to be used as the default catalog for this workspace.
* A default catalog in the workspace will allow users to use that
* catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
* schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
* 
         * @param defaultCatalogKey the value to set
         * @return this builder
         **/
        

        public Builder defaultCatalogKey(String defaultCatalogKey) {
        this.defaultCatalogKey = defaultCatalogKey;
        return this;
        }
            /**
     * A flag to display whether workspace is private network enabled or not.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isPrivateNetworkEnabled")
        private Boolean isPrivateNetworkEnabled;

                /**
         * A flag to display whether workspace is private network enabled or not.
         * @param isPrivateNetworkEnabled the value to set
         * @return this builder
         **/
        

        public Builder isPrivateNetworkEnabled(Boolean isPrivateNetworkEnabled) {
        this.isPrivateNetworkEnabled = isPrivateNetworkEnabled;
        return this;
        }
            /**
     * The name of the AIC user schema if created.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("aicUserSchemaName")
        private String aicUserSchemaName;

                /**
         * The name of the AIC user schema if created.
         * @param aicUserSchemaName the value to set
         * @return this builder
         **/
        

        public Builder aicUserSchemaName(String aicUserSchemaName) {
        this.aicUserSchemaName = aicUserSchemaName;
        return this;
        }


        public WorkspaceSummary build() {
            WorkspaceSummary model = new WorkspaceSummary(this.key
                    , this.displayName
                    , this.type
                    , this.description
                    , this.timeCreated
                    , this.timeUpdated
                    , this.lifecycleState
                    , this.lifecycleDetails
                    , this.systemTags
                    , this.createdBy
                    , this.createdByName
                    , this.updatedBy
                    , this.updatedByName
                    , this.defaultCatalogKey
                    , this.isPrivateNetworkEnabled
                    , this.aicUserSchemaName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkspaceSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.type(model.getType());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleDetails(model.getLifecycleDetails());
    this.systemTags(model.getSystemTags());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
    this.updatedBy(model.getUpdatedBy());
    this.updatedByName(model.getUpdatedByName());
    this.defaultCatalogKey(model.getDefaultCatalogKey());
    this.isPrivateNetworkEnabled(model.getIsPrivateNetworkEnabled());
    this.aicUserSchemaName(model.getAicUserSchemaName());
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
     * The key of the AI Data Platform Workbench workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The key of the AI Data Platform Workbench workspace.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name that has to be unique in a AI Data Platform Workbench instance.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.
     **/
    public enum Type {
        Default("DEFAULT"),
        User("USER"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn("Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Workspace type. Type is DEFAULT for workspace created at AI Data Platform Workbench creation, type is USER for workspace created by AI Data Platform Workbench user.
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * Description of the workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the workspace.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the AI Data Platform Workbench workspace was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the AI Data Platform Workbench workspace was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The current state of the AI Data Platform Workbench workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Workspace.LifecycleState lifecycleState;

        /**
     * The current state of the AI Data Platform Workbench workspace.
     * @return the value
     **/
    
    public Workspace.LifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * A message that describes the current state of the workspace in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

        /**
     * A message that describes the current state of the workspace in more detail. For example,
* can be used to provide actionable information for a resource in the Failed state.
* 
     * @return the value
     **/
    
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }


        /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
* <p>
Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
* 
     * @return the value
     **/
    
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }


        /**
     * OCID of the user who created this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * OCID of the user who created this record.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Name of the user who created this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * Name of the user who created this record.
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
    }


        /**
     * OCID of the user who updated this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * OCID of the user who updated this record.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * Name of the user who updated this record.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
    private final String updatedByName;

        /**
     * Name of the user who updated this record.
     * @return the value
     **/
    
    public String getUpdatedByName() {
        return updatedByName;
    }


        /**
     * The key of the catalog to be used as the default catalog for this workspace.
* A default catalog in the workspace will allow users to use that
* catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
* schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("defaultCatalogKey")
    private final String defaultCatalogKey;

        /**
     * The key of the catalog to be used as the default catalog for this workspace.
* A default catalog in the workspace will allow users to use that
* catalog without the need to refer it in the notebook. For example, if default catalog is iCat1, and it has
* schema1 and table1, you can refer to the table in a notebook using: schema1.table1.
* 
     * @return the value
     **/
    
    public String getDefaultCatalogKey() {
        return defaultCatalogKey;
    }


        /**
     * A flag to display whether workspace is private network enabled or not.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivateNetworkEnabled")
    private final Boolean isPrivateNetworkEnabled;

        /**
     * A flag to display whether workspace is private network enabled or not.
     * @return the value
     **/
    
    public Boolean getIsPrivateNetworkEnabled() {
        return isPrivateNetworkEnabled;
    }


        /**
     * The name of the AIC user schema if created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aicUserSchemaName")
    private final String aicUserSchemaName;

        /**
     * The name of the AIC user schema if created.
     * @return the value
     **/
    
    public String getAicUserSchemaName() {
        return aicUserSchemaName;
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
        sb.append("WorkspaceSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", updatedByName=").append(String.valueOf(this.updatedByName));
        sb.append(", defaultCatalogKey=").append(String.valueOf(this.defaultCatalogKey));
        sb.append(", isPrivateNetworkEnabled=").append(String.valueOf(this.isPrivateNetworkEnabled));
        sb.append(", aicUserSchemaName=").append(String.valueOf(this.aicUserSchemaName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkspaceSummary)) {
            return false;
        }

        WorkspaceSummary other = (WorkspaceSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails) &&
            java.util.Objects.equals(this.systemTags, other.systemTags) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.updatedByName, other.updatedByName) &&
            java.util.Objects.equals(this.defaultCatalogKey, other.defaultCatalogKey) &&
            java.util.Objects.equals(this.isPrivateNetworkEnabled, other.isPrivateNetworkEnabled) &&
            java.util.Objects.equals(this.aicUserSchemaName, other.aicUserSchemaName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.updatedByName == null ? 43 : this.updatedByName.hashCode());
        result = (result * PRIME) + (this.defaultCatalogKey == null ? 43 : this.defaultCatalogKey.hashCode());
        result = (result * PRIME) + (this.isPrivateNetworkEnabled == null ? 43 : this.isPrivateNetworkEnabled.hashCode());
        result = (result * PRIME) + (this.aicUserSchemaName == null ? 43 : this.aicUserSchemaName.hashCode());
        return result;
    }


}
