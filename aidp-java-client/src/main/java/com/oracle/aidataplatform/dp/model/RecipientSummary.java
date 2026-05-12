package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a recipient.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RecipientSummary.Builder.class)

public final class RecipientSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "shareCount", "timeCreated", "createdBy", "lifecycleState", "lifecycleDetails", "updatedBy", "timeUpdated"})
    public RecipientSummary(String key, String displayName, String description, Integer shareCount, java.util.Date timeCreated, String createdBy, RecipientLifecycleState lifecycleState, String lifecycleDetails, String updatedBy, java.util.Date timeUpdated) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.shareCount = shareCount;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.updatedBy = updatedBy;
        this.timeUpdated = timeUpdated;
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
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
private String lifecycleDetails;

        /**
         * A message describing the current state in more detail.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleDetails(String lifecycleDetails) {
    this.lifecycleDetails = lifecycleDetails;
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


        public RecipientSummary build() {
            RecipientSummary model = new RecipientSummary(this.key
                , this.displayName
                , this.description
                , this.shareCount
                , this.timeCreated
                , this.createdBy
                , this.lifecycleState
                , this.lifecycleDetails
                , this.updatedBy
                , this.timeUpdated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecipientSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.shareCount(model.getShareCount());
    this.timeCreated(model.getTimeCreated());
    this.createdBy(model.getCreatedBy());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleDetails(model.getLifecycleDetails());
    this.updatedBy(model.getUpdatedBy());
    this.timeUpdated(model.getTimeUpdated());
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
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

        /**
     * A message describing the current state in more detail.
     * @return the value
     **/
    
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("RecipientSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", shareCount=").append(String.valueOf(this.shareCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecipientSummary)) {
            return false;
        }

        RecipientSummary other = (RecipientSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.shareCount, other.shareCount) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.shareCount == null ? 43 : this.shareCount.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        return result;
    }


}
