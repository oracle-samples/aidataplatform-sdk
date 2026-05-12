package com.oracle.aidataplatform.dp.model;


/**
 * Summary of Setting
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UserSettingSummary.Builder.class)

public final class UserSettingSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "name", "type", "isDefault", "timeCreated", "timeUpdated", "properties"})
    public UserSettingSummary(String key, String name, SettingType type, Boolean isDefault, java.util.Date timeCreated, java.util.Date timeUpdated, java.util.Map<String, Object> properties) {
        super();
        this.key = key;
        this.name = name;
        this.type = type;
        this.isDefault = isDefault;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The unique identifier for the setting.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

                /**
         * The unique identifier for the setting.
         * @param key the value to set
         * @return this builder
         **/
        

        public Builder key(String key) {
        this.key = key;
        return this;
        }
            /**
     * A user-friendly name for the setting.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * A user-friendly name for the setting.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Setting data type discriminator
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private SettingType type;

                /**
         * Setting data type discriminator
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(SettingType type) {
        this.type = type;
        return this;
        }
            /**
     * Indicates whether this setting is the default.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

                /**
         * Indicates whether this setting is the default.
         * @param isDefault the value to set
         * @return this builder
         **/
        

        public Builder isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
        }
            /**
     * The date and time when the setting was created.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

                /**
         * The date and time when the setting was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

        public Builder timeCreated(java.util.Date timeCreated) {
        this.timeCreated = timeCreated;
        return this;
        }
            /**
     * The date and time when the setting was most recently updated.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

                /**
         * The date and time when the setting was most recently updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

        public Builder timeUpdated(java.util.Date timeUpdated) {
        this.timeUpdated = timeUpdated;
        return this;
        }
            /**
     * A generic property bag associated with the setting resource
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, Object> properties;

                /**
         * A generic property bag associated with the setting resource
         * @param properties the value to set
         * @return this builder
         **/
        

        public Builder properties(java.util.Map<String, Object> properties) {
        this.properties = properties;
        return this;
        }


        public UserSettingSummary build() {
            UserSettingSummary model = new UserSettingSummary(this.key
                    , this.name
                    , this.type
                    , this.isDefault
                    , this.timeCreated
                    , this.timeUpdated
                    , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UserSettingSummary model) {
                this.key(model.getKey());
    this.name(model.getName());
    this.type(model.getType());
    this.isDefault(model.getIsDefault());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.properties(model.getProperties());
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
     * The unique identifier for the setting.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The unique identifier for the setting.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name for the setting.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * A user-friendly name for the setting.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }

    
        /**
     * Setting data type discriminator
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final SettingType type;

        /**
     * Setting data type discriminator
     * @return the value
     **/
    
    public SettingType getType() {
        return type;
    }


        /**
     * Indicates whether this setting is the default.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

        /**
     * Indicates whether this setting is the default.
     * @return the value
     **/
    
    public Boolean getIsDefault() {
        return isDefault;
    }


        /**
     * The date and time when the setting was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time when the setting was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time when the setting was most recently updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time when the setting was most recently updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * A generic property bag associated with the setting resource
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, Object> properties;

        /**
     * A generic property bag associated with the setting resource
     * @return the value
     **/
    
    public java.util.Map<String, Object> getProperties() {
        return properties;
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
        sb.append("UserSettingSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UserSettingSummary)) {
            return false;
        }

        UserSettingSummary other = (UserSettingSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.isDefault, other.isDefault) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
