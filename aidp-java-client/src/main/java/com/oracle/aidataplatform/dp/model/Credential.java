package com.oracle.aidataplatform.dp.model;



/**
 * Represents a credential object for public API consumers.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Credential.Builder.class)

public final class Credential  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "type", "credentialDetails", "credentialDescription", "lifecycleState", "lifecycleStateDetails", "timeCreated", "timeUpdated", "createdBy", "updatedBy"})
    public Credential(String key, String displayName, CredentialType type, CredentialDetails credentialDetails, String credentialDescription, CredentialLifecycleState lifecycleState, String lifecycleStateDetails, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String updatedBy) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.type = type;
        this.credentialDetails = credentialDetails;
        this.credentialDescription = credentialDescription;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The unique identifier for the credential object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * The unique identifier for the credential object.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * The type of credential stored. Allowed values are defined in CredentialType.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private CredentialType type;

        /**
         * The type of credential stored. Allowed values are defined in CredentialType.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(CredentialType type) {
    this.type = type;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
private CredentialDetails credentialDetails;



public Builder credentialDetails(CredentialDetails credentialDetails) {
    this.credentialDetails = credentialDetails;
    return this;
}
            /**
     * A brief summary of the credential object and its purpose.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialDescription")
private String credentialDescription;

        /**
         * A brief summary of the credential object and its purpose.
         * @param credentialDescription the value to set
         * @return this builder
         **/
        

public Builder credentialDescription(String credentialDescription) {
    this.credentialDescription = credentialDescription;
    return this;
}
            /**
     * The current state of the credential object. Allowed values are defined in CredentialLifecycleState.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private CredentialLifecycleState lifecycleState;

        /**
         * The current state of the credential object. Allowed values are defined in CredentialLifecycleState.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(CredentialLifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
private String lifecycleStateDetails;

        /**
         * Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state).
         * @param lifecycleStateDetails the value to set
         * @return this builder
         **/
        

public Builder lifecycleStateDetails(String lifecycleStateDetails) {
    this.lifecycleStateDetails = lifecycleStateDetails;
    return this;
}
            /**
     * The date and time when the credential object was created, in RFC 3339 timestamp format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time when the credential object was created, in RFC 3339 timestamp format.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * The unique identifier of the user who created the credential object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The unique identifier of the user who created the credential object.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The unique identifier of the user who last updated the credential object.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
private String updatedBy;

        /**
         * The unique identifier of the user who last updated the credential object.
         * @param updatedBy the value to set
         * @return this builder
         **/
        

public Builder updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
}


        public Credential build() {
            Credential model = new Credential(this.key
                , this.displayName
                , this.type
                , this.credentialDetails
                , this.credentialDescription
                , this.lifecycleState
                , this.lifecycleStateDetails
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.updatedBy);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Credential model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.type(model.getType());
    this.credentialDetails(model.getCredentialDetails());
    this.credentialDescription(model.getCredentialDescription());
    this.lifecycleState(model.getLifecycleState());
    this.lifecycleStateDetails(model.getLifecycleStateDetails());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
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
     * The unique identifier for the credential object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * The unique identifier for the credential object.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * A user-friendly name for the credential object. This value does not have to be unique and can be changed. Must start with a letter and contain only letters, numbers, or underscores. Avoid entering confidential information.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }

    
        /**
     * The type of credential stored. Allowed values are defined in CredentialType.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final CredentialType type;

        /**
     * The type of credential stored. Allowed values are defined in CredentialType.
     * @return the value
     **/
    
    public CredentialType getType() {
        return type;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final CredentialDetails credentialDetails;

    
    public CredentialDetails getCredentialDetails() {
        return credentialDetails;
    }


        /**
     * A brief summary of the credential object and its purpose.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialDescription")
    private final String credentialDescription;

        /**
     * A brief summary of the credential object and its purpose.
     * @return the value
     **/
    
    public String getCredentialDescription() {
        return credentialDescription;
    }

    
        /**
     * The current state of the credential object. Allowed values are defined in CredentialLifecycleState.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CredentialLifecycleState lifecycleState;

        /**
     * The current state of the credential object. Allowed values are defined in CredentialLifecycleState.
     * @return the value
     **/
    
    public CredentialLifecycleState getLifecycleState() {
        return lifecycleState;
    }


        /**
     * Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

        /**
     * Additional details or reasons regarding the current lifecycle state. Often used to provide actionable information (e.g., for resources in a Failed state).
     * @return the value
     **/
    
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }


        /**
     * The date and time when the credential object was created, in RFC 3339 timestamp format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time when the credential object was created, in RFC 3339 timestamp format.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * The date and time when the credential object was most recently updated, in RFC 3339 timestamp format.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * The unique identifier of the user who created the credential object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The unique identifier of the user who created the credential object.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The unique identifier of the user who last updated the credential object.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

        /**
     * The unique identifier of the user who last updated the credential object.
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
        sb.append("Credential(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", credentialDescription=").append(String.valueOf(this.credentialDescription));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Credential)) {
            return false;
        }

        Credential other = (Credential) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.credentialDetails, other.credentialDetails) &&
            java.util.Objects.equals(this.credentialDescription, other.credentialDescription) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result = (result * PRIME) + (this.credentialDescription == null ? 43 : this.credentialDescription.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.lifecycleStateDetails == null ? 43 : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        return result;
    }


}
