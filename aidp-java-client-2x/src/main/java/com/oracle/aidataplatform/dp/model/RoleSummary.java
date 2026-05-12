package com.oracle.aidataplatform.dp.model;


/**
 * The summary of the role.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RoleSummary.Builder.class)

public final class RoleSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "roleType", "timeCreated", "timeUpdated", "isAssigned", "createdBy", "updatedBy", "lifecycleState", "lifecycleDetails", "description"})
    public RoleSummary(String key, String displayName, RoleType roleType, java.util.Date timeCreated, java.util.Date timeUpdated, Boolean isAssigned, String createdBy, String updatedBy, Role.LifecycleState lifecycleState, String lifecycleDetails, String description) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.roleType = roleType;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.isAssigned = isAssigned;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * A unique key for the role summary. It cannot be changed.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * A unique key for the role summary. It cannot be changed.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * The role summary name. It can be changed.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * The role summary name. It can be changed.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * Type of role.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("roleType")
        private RoleType roleType;

                /**
         * Type of role.
         * @param roleType the value to set
         * @return this builder
         **/
        

        public Builder roleType(RoleType roleType) {
        this.roleType = roleType;
        return this;
        }
            /**
     * The time the role summary was created. An RFC3339 formatted datetime string.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

                /**
         * The time the role summary was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

        public Builder timeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
        return this;
        }
            /**
     * The time the role summary was updated. An RFC3339 formatted datetime string.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

                /**
         * The time the role summary was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

        public Builder timeUpdated(java.util.Date timeUpdated) {
        this.timeUpdated = timeUpdated;
        return this;
        }
            /**
     * The role summary is assigned to the current user or a group that the user is part of.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isAssigned")
        private Boolean isAssigned;

                /**
         * The role summary is assigned to the current user or a group that the user is part of.
         * @param isAssigned the value to set
         * @return this builder
         **/
        

        public Builder isAssigned(Boolean isAssigned) {
        this.isAssigned = isAssigned;
        return this;
        }
            /**
     * The user name of the user/principal who created the role.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

                /**
         * The user name of the user/principal who created the role.
         * @param createdBy the value to set
         * @return this builder
         **/
        

        public Builder createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
        }
            /**
     * The user name of the user/principal who updated the role.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

                /**
         * The user name of the user/principal who updated the role.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

        public Builder updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
        }
            /**
     * The current state of the role summary.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Role.LifecycleState lifecycleState;

                /**
         * The current state of the role summary.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

        public Builder lifecycleState(Role.LifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
        }
            /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

                /**
         * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        

        public Builder lifecycleDetails(String lifecycleDetails) {
        this.lifecycleDetails = lifecycleDetails;
        return this;
        }
            /**
     * The description of the role summary.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * The description of the role summary.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }


        public RoleSummary build() {
            RoleSummary model = new RoleSummary(this.key
                    , this.displayName
                    , this.roleType
                    , this.timeCreated
                    , this.timeUpdated
                    , this.isAssigned
                    , this.createdBy
                    , this.updatedBy
                    , this.lifecycleState
                    , this.lifecycleDetails
                    , this.description);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoleSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.roleType(model.getRoleType());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.isAssigned(model.getIsAssigned());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleDetails(model.getLifecycleDetails());
    this.description(model.getDescription());
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
     * A unique key for the role summary. It cannot be changed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * A unique key for the role summary. It cannot be changed.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * The role summary name. It can be changed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * The role summary name. It can be changed.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }

    
        /**
     * Type of role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("roleType")
    private final RoleType roleType;

        /**
     * Type of role.
     * @return the value
     **/
    
    public RoleType getRoleType() {
        return roleType;
    }


        /**
     * The time the role summary was created. An RFC3339 formatted datetime string.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The time the role summary was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The time the role summary was updated. An RFC3339 formatted datetime string.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The time the role summary was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The role summary is assigned to the current user or a group that the user is part of.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isAssigned")
    private final Boolean isAssigned;

        /**
     * The role summary is assigned to the current user or a group that the user is part of.
     * @return the value
     **/
    
    public Boolean getIsAssigned() {
        return isAssigned;
    }


        /**
     * The user name of the user/principal who created the role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The user name of the user/principal who created the role.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The user name of the user/principal who updated the role.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The user name of the user/principal who updated the role.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * The current state of the role summary.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Role.LifecycleState lifecycleState;

        /**
     * The current state of the role summary.
     * @return the value
     **/
    
    public Role.LifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

        /**
     * A message describing the current state in more detail. For example, it can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }


        /**
     * The description of the role summary.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description of the role summary.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
        sb.append("RoleSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", roleType=").append(String.valueOf(this.roleType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", isAssigned=").append(String.valueOf(this.isAssigned));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoleSummary)) {
            return false;
        }

        RoleSummary other = (RoleSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.roleType, other.roleType) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.isAssigned, other.isAssigned) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails) &&
            java.util.Objects.equals(this.description, other.description);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.roleType == null ? 43 : this.roleType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.isAssigned == null ? 43 : this.isAssigned.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }


}
