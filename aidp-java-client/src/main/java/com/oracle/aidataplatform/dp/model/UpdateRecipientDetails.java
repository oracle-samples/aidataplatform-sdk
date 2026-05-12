package com.oracle.aidataplatform.dp.model;



/**
 * The data to update a recipient.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateRecipientDetails.Builder.class)

public final class UpdateRecipientDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "properties"})
    public UpdateRecipientDetails(String displayName, String description, java.util.Map<String, String> properties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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


        public UpdateRecipientDetails build() {
            UpdateRecipientDetails model = new UpdateRecipientDetails(this.displayName
                , this.description
                , this.properties);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRecipientDetails model) {
                this.displayName(model.getDisplayName());
    this.description(model.getDescription());
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
        sb.append("UpdateRecipientDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRecipientDetails)) {
            return false;
        }

        UpdateRecipientDetails other = (UpdateRecipientDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
