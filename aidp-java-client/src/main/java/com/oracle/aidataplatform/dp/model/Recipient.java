package com.oracle.aidataplatform.dp.model;



/**
 * A Delta Share recipient can access the data assets in AI Data Platform Workbench through Delta Share Protocol.
* 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Recipient.Builder.class)

public final class Recipient  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "timeCreated", "timeUpdated", "shareCount", "createdBy", "updatedBy", "properties", "lifecycleState", "lifecycleStateDetails"})
    public Recipient(String key, String displayName, String description, java.util.Date timeCreated, java.util.Date timeUpdated, Integer shareCount, String createdBy, String updatedBy, java.util.Map<String, String> properties, RecipientLifecycleState lifecycleState, String lifecycleStateDetails) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.shareCount = shareCount;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.properties = properties;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier for this recipient in AI Data Platform Workbench instance.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Unique identifier for this recipient in AI Data Platform Workbench instance.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * Short description of the Recipient
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Short description of the Recipient
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
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
     * The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
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
     * The number of shares this recipient has access on.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shareCount")
private Integer shareCount;

        /**
         * The number of shares this recipient has access on.
* 
         * @param shareCount the value to set
         * @return this builder
         **/
        

public Builder shareCount(Integer shareCount) {
    this.shareCount = shareCount;
    return this;
}
            /**
     * The ID of the user who created the recipient.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The ID of the user who created the recipient.
* 
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The ID of the user who last updated the recipient.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The ID of the user who last updated the recipient.
* 
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}
            /**
     * Key-value pair representing a defined tag key and value.
* Example: {@code { "CostCenter": "42" }}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("properties")
private java.util.Map<String, String> properties;

        /**
         * Key-value pair representing a defined tag key and value.
* Example: {@code { "CostCenter": "42" }}
* 
         * @param properties the value to set
         * @return this builder
         **/
        

public Builder properties(java.util.Map<String, String> properties) {
    this.properties = properties;
    return this;
}
            /**
     * The state of the recipient.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private RecipientLifecycleState lifecycleState;

        /**
         * The state of the recipient.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(RecipientLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * A message describing the current state in more detail.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

        /**
         * A message describing the current state in more detail.
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}


        public Recipient build() {
            Recipient model = new Recipient(this.key
                , this.displayName
                , this.description
                , this.timeCreated
                , this.timeUpdated
                , this.shareCount
                , this.createdBy
                , this.updatedBy
                , this.properties
                , this.lifecycleState
                , this.lifecycleStateDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recipient model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.shareCount(model.getShareCount());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.properties(model.getProperties());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
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
     * Unique identifier for this recipient in AI Data Platform Workbench instance.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique identifier for this recipient in AI Data Platform Workbench instance.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name. Has to be unique within the AI Data Platform Workbench instance.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Short description of the Recipient
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Short description of the Recipient
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the Delta Share recipient was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the Delta Share recipient was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The number of shares this recipient has access on.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shareCount")
    private final Integer shareCount;

        /**
     * The number of shares this recipient has access on.
* 
     * @return the value
     **/
    
    public Integer getShareCount() {
        return shareCount;
    }


        /**
     * The ID of the user who created the recipient.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The ID of the user who created the recipient.
* 
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The ID of the user who last updated the recipient.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the user who last updated the recipient.
* 
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }


        /**
     * Key-value pair representing a defined tag key and value.
* Example: {@code { "CostCenter": "42" }}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

        /**
     * Key-value pair representing a defined tag key and value.
* Example: {@code { "CostCenter": "42" }}
* 
     * @return the value
     **/
    
    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    
        /**
     * The state of the recipient.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final RecipientLifecycleState lifecycleState;

        /**
     * The state of the recipient.
     * @return the value
     **/
    
    public RecipientLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * A message describing the current state in more detail.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

        /**
     * A message describing the current state in more detail.
     * @return the value
     **/
    
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
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
        sb.append("Recipient(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", shareCount=").append(String.valueOf(this.shareCount));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Recipient)) {
            return false;
        }

        Recipient other = (Recipient) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.shareCount, other.shareCount) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.properties, other.properties) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails);
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
        result = (result * PRIME) + (this.shareCount == null ? 43 : this.shareCount.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        return result;
    }


}
