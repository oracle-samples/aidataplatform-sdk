// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary view of a credential for public API consumers.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CredentialSummary.Builder.class)

public final class CredentialSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "displayName", "description", "credentialType", "timeCreated", "createdBy", "timeUpdated", "updatedBy", "lifeCycleState"})
    public CredentialSummary(String key, String displayName, String description, CredentialType credentialType, java.util.Date timeCreated, String createdBy, java.util.Date timeUpdated, String updatedBy, CredentialLifecycleState lifeCycleState) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.credentialType = credentialType;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
        this.lifeCycleState = lifeCycleState;
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
     * A brief summary of the credential object and its purpose.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * A brief summary of the credential object and its purpose.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * The type of credential stored. Allowed values are defined in CredentialType.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialType")
private CredentialType credentialType;

        /**
         * The type of credential stored. Allowed values are defined in CredentialType.
         * @param credentialType the value to set
         * @return this builder
         **/
        

public Builder credentialType(CredentialType credentialType) {
    this.credentialType = credentialType;
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
            /**
     * The current state of the credential object. Allowed values are defined in CredentialLifecycleState.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifeCycleState")
private CredentialLifecycleState lifeCycleState;

        /**
         * The current state of the credential object. Allowed values are defined in CredentialLifecycleState.
         * @param lifeCycleState the value to set
         * @return this builder
         **/
        

public Builder lifeCycleState(CredentialLifecycleState lifeCycleState) {
    this.lifeCycleState = lifeCycleState;
    return this;
}


        public CredentialSummary build() {
            CredentialSummary model = new CredentialSummary(this.key
                , this.displayName
                , this.description
                , this.credentialType
                , this.timeCreated
                , this.createdBy
                , this.timeUpdated
                , this.updatedBy
                , this.lifeCycleState);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CredentialSummary model) {
                this.key(model.getKey());
    this.displayName(model.getDisplayName());
    this.description(model.getDescription());
    this.credentialType(model.getCredentialType());
    this.timeCreated(model.getTimeCreated());
    this.createdBy(model.getCreatedBy());
    this.timeUpdated(model.getTimeUpdated());
    this.updatedBy(model.getUpdatedBy());
    this.lifeCycleState(model.getLifeCycleState());
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
     * A brief summary of the credential object and its purpose.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * A brief summary of the credential object and its purpose.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }

    
        /**
     * The type of credential stored. Allowed values are defined in CredentialType.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialType")
    private final CredentialType credentialType;

        /**
     * The type of credential stored. Allowed values are defined in CredentialType.
     * @return the value
     **/
    
    public CredentialType getCredentialType() {
        return credentialType;
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

    
        /**
     * The current state of the credential object. Allowed values are defined in CredentialLifecycleState.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifeCycleState")
    private final CredentialLifecycleState lifeCycleState;

        /**
     * The current state of the credential object. Allowed values are defined in CredentialLifecycleState.
     * @return the value
     **/
    
    public CredentialLifecycleState getLifeCycleState() {
        return lifeCycleState;
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
        sb.append("CredentialSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", credentialType=").append(String.valueOf(this.credentialType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", lifeCycleState=").append(String.valueOf(this.lifeCycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CredentialSummary)) {
            return false;
        }

        CredentialSummary other = (CredentialSummary) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.credentialType, other.credentialType) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.updatedBy, other.updatedBy) &&
            java.util.Objects.equals(this.lifeCycleState, other.lifeCycleState);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.credentialType == null ? 43 : this.credentialType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.lifeCycleState == null ? 43 : this.lifeCycleState.hashCode());
        return result;
    }


}
