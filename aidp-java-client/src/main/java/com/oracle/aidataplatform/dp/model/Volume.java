package com.oracle.aidataplatform.dp.model;



/**
 * A volumes is a container to store data in its original form and can store semi-structured or unstructured data.
* Volumes can either be external or managed. To use any of the API operations, you must be authorized in an IAM policy. 
* If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give
* users access, see <a href="https://docs.oracle.com/en/cloud/paas/ai-data-platform/aidug/iam-policies-oracle-ai-data-platform.html" target="_blank" rel="noopener noreferrer">IAM Policies for Oracle AI Data Platform Workbench</a>.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Volume.Builder.class)

public final class Volume  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "catalogName", "schemaName", "fullName", "volumeType", "storageLocation", "lifecycleState", "lifecycleStateDetails", "systemTags"})
    public Volume(String key, String displayName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, String catalogName, String schemaName, String fullName, VolumeType volumeType, String storageLocation, LifecycleState lifecycleState, String lifecycleStateDetails, java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.catalogName = catalogName;
        this.schemaName = schemaName;
        this.fullName = fullName;
        this.volumeType = volumeType;
        this.storageLocation = storageLocation;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The key of the volume.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The key of the volume.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * A user-friendly name. Has to be unique within the schema and is changeable.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * A user-friendly name. Has to be unique within the schema and is changeable.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Short description of the volume
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Short description of the volume
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
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
     * The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
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
     * The ID of the user that created the volume.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The ID of the user that created the volume.
* 
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The ID of the user that last updated the volume
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The ID of the user that last updated the volume
* 
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * The name of the catalog to which this volume belongs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogName")
private String catalogName;

        /**
         * The name of the catalog to which this volume belongs.
         * @param catalogName the value to set
         * @return this builder
         **/
        

public Builder catalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
}
            /**
     * The name of the schema to which this volume belongs.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("schemaName")
private String schemaName;

        /**
         * The name of the schema to which this volume belongs.
         * @param schemaName the value to set
         * @return this builder
         **/
        

public Builder schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
}
            /**
     * The fully qualified name of this volume.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fullName")
private String fullName;

        /**
         * The fully qualified name of this volume.
         * @param fullName the value to set
         * @return this builder
         **/
        

public Builder fullName(String fullName) {
    this.fullName = fullName;
    return this;
}
            /**
     * The type of volume.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("volumeType")
private VolumeType volumeType;

        /**
         * The type of volume.
         * @param volumeType the value to set
         * @return this builder
         **/
        

public Builder volumeType(VolumeType volumeType) {
    this.volumeType = volumeType;
    return this;
}
            /**
     * The storage location of the external volume. Only applicable for external volumes.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("storageLocation")
private String storageLocation;

        /**
         * The storage location of the external volume. Only applicable for external volumes.
         * @param storageLocation the value to set
         * @return this builder
         **/
        

public Builder storageLocation(String storageLocation) {
    this.storageLocation = storageLocation;
    return this;
}
            /**
     * The lifecycle state of the volume. The volume is ready for use in ACTIVE state
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private LifecycleState lifecycleState;

        /**
         * The lifecycle state of the volume. The volume is ready for use in ACTIVE state
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * Additional details associated with the lifecycle state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

        /**
         * Additional details associated with the lifecycle state.
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
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


        public Volume build() {
            Volume model = new Volume(this.key
                , this.displayName
                , this.description
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy
                , this.catalogName
                , this.schemaName
                , this.fullName
                , this.volumeType
                , this.storageLocation
                , this.lifecycleState
                , this.lifecycleStateDetails
                , this.systemTags);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Volume model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.catalogName(model.getCatalogName());
    this.schemaName(model.getSchemaName());
    this.fullName(model.getFullName());
    this.volumeType(model.getVolumeType());
    this.storageLocation(model.getStorageLocation());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
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
     * The key of the volume.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The key of the volume.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name. Has to be unique within the schema and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name. Has to be unique within the schema and is changeable.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Short description of the volume
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Short description of the volume
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the Data Lake Volume was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the Data Lake Volume was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The ID of the user that created the volume.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The ID of the user that created the volume.
* 
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The ID of the user that last updated the volume
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the user that last updated the volume
* 
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * The name of the catalog to which this volume belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
    private final String catalogName;

        /**
     * The name of the catalog to which this volume belongs.
     * @return the value
     **/
    
    public String getCatalogName() {
        return catalogName;
    }


        /**
     * The name of the schema to which this volume belongs.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

        /**
     * The name of the schema to which this volume belongs.
     * @return the value
     **/
    
    public String getSchemaName() {
        return schemaName;
    }


        /**
     * The fully qualified name of this volume.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fullName")
    private final String fullName;

        /**
     * The fully qualified name of this volume.
     * @return the value
     **/
    
    public String getFullName() {
        return fullName;
    }

    /**
     * The type of volume.
     **/
    public enum VolumeType implements com.oracle.bmc.http.internal.BmcEnum {
        Managed("MANAGED"),
        External("EXTERNAL"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(VolumeType.class);

        private final String value;
        private static java.util.Map<String, VolumeType> map;

        static {
            map = new java.util.HashMap<>();
            for (VolumeType v : VolumeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        VolumeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VolumeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'VolumeType', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * The type of volume.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("volumeType")
    private final VolumeType volumeType;

        /**
     * The type of volume.
     * @return the value
     **/
    
    public VolumeType getVolumeType() {
        return volumeType;
    }


        /**
     * The storage location of the external volume. Only applicable for external volumes.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("storageLocation")
    private final String storageLocation;

        /**
     * The storage location of the external volume. Only applicable for external volumes.
     * @return the value
     **/
    
    public String getStorageLocation() {
        return storageLocation;
    }

    /**
     * The lifecycle state of the volume. The volume is ready for use in ACTIVE state
     **/
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Active("ACTIVE"),
        Deleted("DELETED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn("Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * The lifecycle state of the volume. The volume is ready for use in ACTIVE state
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

        /**
     * The lifecycle state of the volume. The volume is ready for use in ACTIVE state
     * @return the value
     **/
    
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * Additional details associated with the lifecycle state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

        /**
     * Additional details associated with the lifecycle state.
     * @return the value
     **/
    
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
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
        sb.append("Volume(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", catalogName=").append(String.valueOf(this.catalogName));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", fullName=").append(String.valueOf(this.fullName));
        sb.append(", volumeType=").append(String.valueOf(this.volumeType));
        sb.append(", storageLocation=").append(String.valueOf(this.storageLocation));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Volume)) {
            return false;
        }

        Volume other = (Volume) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.catalogName, other.catalogName) &&
            java.util.Objects.equals(this.schemaName, other.schemaName) &&
            java.util.Objects.equals(this.fullName, other.fullName) &&
            java.util.Objects.equals(this.volumeType, other.volumeType) &&
            java.util.Objects.equals(this.storageLocation, other.storageLocation) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails) &&
            java.util.Objects.equals(this.systemTags, other.systemTags);
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
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.fullName == null ? 43 : this.fullName.hashCode());
        result = (result * PRIME) + (this.volumeType == null ? 43 : this.volumeType.hashCode());
        result = (result * PRIME) + (this.storageLocation == null ? 43 : this.storageLocation.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }


}
