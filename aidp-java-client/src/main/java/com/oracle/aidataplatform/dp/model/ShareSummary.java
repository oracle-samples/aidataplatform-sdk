package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a share.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ShareSummary.Builder.class)

public final class ShareSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "recipientCount", "assetCount", "description", "timeCreated", "createdBy", "lifecycleState", "timeUpdated", "updatedBy"})
    public ShareSummary(String key, String displayName, Integer recipientCount, Integer assetCount, String description, java.util.Date timeCreated, String createdBy, ShareLifecycleState lifecycleState, java.util.Date timeUpdated, String updatedBy) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.recipientCount = recipientCount;
        this.assetCount = assetCount;
        this.description = description;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.lifecycleState = lifecycleState;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique identifier for this share in AI Data Platform Workbench instance.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Unique identifier for this share in AI Data Platform Workbench instance.
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
     * The number of recipients who have access on this share.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("recipientCount")
private Integer recipientCount;

        /**
         * The number of recipients who have access on this share.
* 
         * @param recipientCount the value to set
         * @return this builder
         **/
        

public Builder recipientCount(Integer recipientCount) {
    this.recipientCount = recipientCount;
    return this;
}
            /**
     * The number of assets in this share.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("assetCount")
private Integer assetCount;

        /**
         * The number of assets in this share.
* 
         * @param assetCount the value to set
         * @return this builder
         **/
        

public Builder assetCount(Integer assetCount) {
    this.assetCount = assetCount;
    return this;
}
            /**
     * A description associated with this share.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * A description associated with this share.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
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
     * The ID of the user who created the share.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The ID of the user who created the share.
* 
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The state of the Share.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private ShareLifecycleState lifecycleState;

        /**
         * The state of the Share.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(ShareLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
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
     * The ID of the user who last updated the share.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The ID of the user who last updated the share.
* 
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}


        public ShareSummary build() {
            ShareSummary model = new ShareSummary(this.key
                , this.displayName
                , this.recipientCount
                , this.assetCount
                , this.description
                , this.timeCreated
                , this.createdBy
                , this.lifecycleState
                , this.timeUpdated
                , this.updatedBy);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShareSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.recipientCount(model.getRecipientCount());
    this.assetCount(model.getAssetCount());
    this.description(model.getDescription());
    this.timeCreated(model.getTimeCreated());
    this.createdBy(model.getCreatedBy());
    this.lifecycleState(model.getLifecycleState());
    this.timeUpdated(model.getTimeUpdated());
    this.updatedBy(model.getUpdatedBy());
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
     * Unique identifier for this share in AI Data Platform Workbench instance.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique identifier for this share in AI Data Platform Workbench instance.
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
     * The number of recipients who have access on this share.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("recipientCount")
    private final Integer recipientCount;

        /**
     * The number of recipients who have access on this share.
* 
     * @return the value
     **/
    
    public Integer getRecipientCount() {
        return recipientCount;
    }


        /**
     * The number of assets in this share.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("assetCount")
    private final Integer assetCount;

        /**
     * The number of assets in this share.
* 
     * @return the value
     **/
    
    public Integer getAssetCount() {
        return assetCount;
    }


        /**
     * A description associated with this share.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * A description associated with this share.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the Delta Share was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The ID of the user who created the share.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The ID of the user who created the share.
* 
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }

    
        /**
     * The state of the Share.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ShareLifecycleState lifecycleState;

        /**
     * The state of the Share.
     * @return the value
     **/
    
    public ShareLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the Delta Share was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The ID of the user who last updated the share.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the user who last updated the share.
* 
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
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
        sb.append("ShareSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", recipientCount=").append(String.valueOf(this.recipientCount));
        sb.append(", assetCount=").append(String.valueOf(this.assetCount));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShareSummary)) {
            return false;
        }

        ShareSummary other = (ShareSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.recipientCount, other.recipientCount) &&
            java.util.Objects.equals(this.assetCount, other.assetCount) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.recipientCount == null ? 43 : this.recipientCount.hashCode());
        result = (result * PRIME) + (this.assetCount == null ? 43 : this.assetCount.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        return result;
    }


}
