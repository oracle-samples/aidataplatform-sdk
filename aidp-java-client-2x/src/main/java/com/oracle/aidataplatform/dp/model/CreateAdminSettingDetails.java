// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Settings details for the new admin.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateAdminSettingDetails.Builder.class)

public final class CreateAdminSettingDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "isDefault", "data"})
    public CreateAdminSettingDetails(String name, Boolean isDefault, SettingData data) {
        super();
        this.name = name;
        this.isDefault = isDefault;
        this.data = data;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private SettingData data;

        

        public Builder data(SettingData data) {
        this.data = data;
        return this;
        }


        public CreateAdminSettingDetails build() {
            CreateAdminSettingDetails model = new CreateAdminSettingDetails(this.name
                    , this.isDefault
                    , this.data);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAdminSettingDetails model) {
                this.name(model.getName());
    this.isDefault(model.getIsDefault());
    this.data(model.getData());
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


    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final SettingData data;

    
    public SettingData getData() {
        return data;
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
        sb.append("CreateAdminSettingDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAdminSettingDetails)) {
            return false;
        }

        CreateAdminSettingDetails other = (CreateAdminSettingDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.isDefault, other.isDefault) &&
            java.util.Objects.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        return result;
    }


}
