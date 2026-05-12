package com.oracle.aidataplatform.dp.model;



/**
 * Summary information for an endpoint resource.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DacEndpointSummary.Builder.class)

public final class DacEndpointSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "displayName", "description", "modelId", "compartmentId", "dedicatedAiClusterId", "timeCreated", "timeUpdated", "lifecycleState", "lifecycleDetails", "contentModerationConfig", "systemTags"})
    public DacEndpointSummary(String id, String displayName, String description, String modelId, String compartmentId, String dedicatedAiClusterId, java.util.Date timeCreated, java.util.Date timeUpdated, LifecycleState lifecycleState, String lifecycleDetails, ContentModerationConfig contentModerationConfig, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.modelId = modelId;
        this.compartmentId = compartmentId;
        this.dedicatedAiClusterId = dedicatedAiClusterId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.contentModerationConfig = contentModerationConfig;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * An OCID that uniquely identifies this endpoint resource.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * An OCID that uniquely identifies this endpoint resource.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * An optional description of the endpoint.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * An optional description of the endpoint.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The OCID of the model that's used to create this endpoint.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelId")
private String modelId;

        /**
         * The OCID of the model that's used to create this endpoint.
         * @param modelId the value to set
         * @return this builder
         **/
        

public Builder modelId(String modelId) {
    this.modelId = modelId;
    return this;
}
            /**
     * The compartment OCID to create the endpoint in.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
private String compartmentId;

        /**
         * The compartment OCID to create the endpoint in.
         * @param compartmentId the value to set
         * @return this builder
         **/
        

public Builder compartmentId(String compartmentId) {
    this.compartmentId = compartmentId;
    return this;
}
            /**
     * The OCID of the dedicated AI cluster on which a model will be deployed to.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dedicatedAiClusterId")
private String dedicatedAiClusterId;

        /**
         * The OCID of the dedicated AI cluster on which a model will be deployed to.
         * @param dedicatedAiClusterId the value to set
         * @return this builder
         **/
        

public Builder dedicatedAiClusterId(String dedicatedAiClusterId) {
    this.dedicatedAiClusterId = dedicatedAiClusterId;
    return this;
}
            /**
     * The date and time that the endpoint was created in the format of an RFC3339 datetime string.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time that the endpoint was created in the format of an RFC3339 datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The date and time the endpoint was updated in the format of n RFC3339 datetime string.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the endpoint was updated in the format of n RFC3339 datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The current state of the endpoint.
* Allowed values are:
* - ACTIVE
* - CREATING
* - UPDATING
* - DELETING
* - DELETED
* - FAILED
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private LifecycleState lifecycleState;

        /**
         * The current state of the endpoint.
* Allowed values are:
* - ACTIVE
* - CREATING
* - UPDATING
* - DELETING
* - DELETED
* - FAILED
* 
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(LifecycleState lifecycleState) {
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
        
@com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
private ContentModerationConfig contentModerationConfig;



public Builder contentModerationConfig(ContentModerationConfig contentModerationConfig) {
    this.contentModerationConfig = contentModerationConfig;
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


        public DacEndpointSummary build() {
            DacEndpointSummary model = new DacEndpointSummary(this.id
                , this.displayName
                , this.description
                , this.modelId
                , this.compartmentId
                , this.dedicatedAiClusterId
                , this.timeCreated
                , this.timeUpdated
                , this.lifecycleState
                , this.lifecycleDetails
                , this.contentModerationConfig
                , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DacEndpointSummary model) {
                this.id(model.getId());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.modelId(model.getModelId());
    this.compartmentId(model.getCompartmentId());
    this.dedicatedAiClusterId(model.getDedicatedAiClusterId());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleDetails(model.getLifecycleDetails());
    this.contentModerationConfig(model.getContentModerationConfig());
    this.systemTags(model.getSystemTags());
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
     * An OCID that uniquely identifies this endpoint resource.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * An OCID that uniquely identifies this endpoint resource.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * An optional description of the endpoint.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * An optional description of the endpoint.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The OCID of the model that's used to create this endpoint.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

        /**
     * The OCID of the model that's used to create this endpoint.
     * @return the value
     **/
    
    public String getModelId() {
        return modelId;
    }


        /**
     * The compartment OCID to create the endpoint in.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

        /**
     * The compartment OCID to create the endpoint in.
     * @return the value
     **/
    
    public String getCompartmentId() {
        return compartmentId;
    }


        /**
     * The OCID of the dedicated AI cluster on which a model will be deployed to.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedAiClusterId")
    private final String dedicatedAiClusterId;

        /**
     * The OCID of the dedicated AI cluster on which a model will be deployed to.
     * @return the value
     **/
    
    public String getDedicatedAiClusterId() {
        return dedicatedAiClusterId;
    }


        /**
     * The date and time that the endpoint was created in the format of an RFC3339 datetime string.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time that the endpoint was created in the format of an RFC3339 datetime string.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the endpoint was updated in the format of n RFC3339 datetime string.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the endpoint was updated in the format of n RFC3339 datetime string.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the endpoint.
* Allowed values are:
* - ACTIVE
* - CREATING
* - UPDATING
* - DELETING
* - DELETED
* - FAILED
* 
     **/
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        ;

        

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };
        /**
     * The current state of the endpoint.
* Allowed values are:
* - ACTIVE
* - CREATING
* - UPDATING
* - DELETING
* - DELETED
* - FAILED
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

        /**
     * The current state of the endpoint.
* Allowed values are:
* - ACTIVE
* - CREATING
* - UPDATING
* - DELETING
* - DELETED
* - FAILED
* 
     * @return the value
     **/
    
    public LifecycleState getLifecycleState() {
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("contentModerationConfig")
    private final ContentModerationConfig contentModerationConfig;

    
    public ContentModerationConfig getContentModerationConfig() {
        return contentModerationConfig;
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
        sb.append("DacEndpointSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dedicatedAiClusterId=").append(String.valueOf(this.dedicatedAiClusterId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", contentModerationConfig=").append(String.valueOf(this.contentModerationConfig));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DacEndpointSummary)) {
            return false;
        }

        DacEndpointSummary other = (DacEndpointSummary) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.modelId, other.modelId) &&
            java.util.Objects.equals(this.compartmentId, other.compartmentId) &&
            java.util.Objects.equals(this.dedicatedAiClusterId, other.dedicatedAiClusterId) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails) &&
            java.util.Objects.equals(this.contentModerationConfig, other.contentModerationConfig) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result = (result * PRIME) + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dedicatedAiClusterId == null ? 43 : this.dedicatedAiClusterId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.contentModerationConfig == null ? 43 : this.contentModerationConfig.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
