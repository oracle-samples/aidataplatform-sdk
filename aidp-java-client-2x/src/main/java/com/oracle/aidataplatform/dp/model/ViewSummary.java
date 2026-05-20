// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary information of view in the schema.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ViewSummary.Builder.class)

public final class ViewSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "isTemporary", "timeCreated", "timeUpdated", "createdBy", "updatedBy", "lifecycleState"})
    public ViewSummary(String key, String displayName, Boolean isTemporary, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy, ViewLifecycleState lifecycleState) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.isTemporary = isTemporary;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * A user-friendly name. Has to be unique within the scope of the schema and is changeable.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

                /**
         * A user-friendly name. Has to be unique within the scope of the schema and is changeable.
         * @param displayName the value to set
         * @return this builder
         **/
        

        public Builder displayName(String displayName) {
        this.displayName = displayName;
        return this;
        }
            /**
     * Denotes whether the view is temporary or permanent.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isTemporary")
        private Boolean isTemporary;

                /**
         * Denotes whether the view is temporary or permanent.
         * @param isTemporary the value to set
         * @return this builder
         **/
        

        public Builder isTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
        }
            /**
     * The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

                /**
         * The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
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
     * The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

                /**
         * The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
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
     * The ID of the user/principal who created the view.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

                /**
         * The ID of the user/principal who created the view.
         * @param createdBy the value to set
         * @return this builder
         **/
        

        public Builder createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
        }
            /**
     * The ID of the user who last updated the view.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

                /**
         * The ID of the user who last updated the view.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

        public Builder updatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
        }
            /**
     * The state of the Table.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private ViewLifecycleState lifecycleState;

                /**
         * The state of the Table.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

        public Builder lifecycleState(ViewLifecycleState lifecycleState) {
        this.lifecycleState = lifecycleState;
        return this;
        }


        public ViewSummary build() {
            ViewSummary model = new ViewSummary(this.key
                    , this.displayName
                    , this.isTemporary
                    , this.timeCreated
                    , this.timeUpdated
                    , this.createdBy
                    , this.updatedBy
                    , this.lifecycleState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ViewSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.isTemporary(model.getIsTemporary());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.updatedBy(model.getUpdatedBy());
    this.lifecycleState(model.getLifecycleState());
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
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The fully qualified name of the view in the format <catalog_name>.<schema_name>.<view_name>
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name. Has to be unique within the scope of the schema and is changeable.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name. Has to be unique within the scope of the schema and is changeable.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Denotes whether the view is temporary or permanent.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isTemporary")
    private final Boolean isTemporary;

        /**
     * Denotes whether the view is temporary or permanent.
     * @return the value
     **/
    
    public Boolean getIsTemporary() {
        return isTemporary;
    }


        /**
     * The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the View was created, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time the View was updated, in the format defined by <a href="https://tools.ietf.org/html/rfc3339" target="_blank" rel="noopener noreferrer">RFC 3339</a>.
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The ID of the user/principal who created the view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The ID of the user/principal who created the view.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The ID of the user who last updated the view.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The ID of the user who last updated the view.
     * @return the value
     **/
    
    public String getUpdatedBy() {
        return updatedBy;
    }

    
        /**
     * The state of the Table.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final ViewLifecycleState lifecycleState;

        /**
     * The state of the Table.
     * @return the value
     **/
    
    public ViewLifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("ViewSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", isTemporary=").append(String.valueOf(this.isTemporary));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ViewSummary)) {
            return false;
        }

        ViewSummary other = (ViewSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.isTemporary, other.isTemporary) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isTemporary == null ? 43 : this.isTemporary.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        return result;
    }


}
