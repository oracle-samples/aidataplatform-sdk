// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The set of details required to update an existing credential object.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateDataLakeCredentialDetails.Builder.class)

public final class UpdateDataLakeCredentialDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "credentialDescription", "type", "credentialDetails"})
    public UpdateDataLakeCredentialDetails(String displayName, String credentialDescription, CredentialType type, CredentialDetails credentialDetails) {
        super();
        this.displayName = displayName;
        this.credentialDescription = credentialDescription;
        this.type = type;
        this.credentialDetails = credentialDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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


        public UpdateDataLakeCredentialDetails build() {
            UpdateDataLakeCredentialDetails model = new UpdateDataLakeCredentialDetails(this.displayName
                    , this.credentialDescription
                    , this.type
                    , this.credentialDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataLakeCredentialDetails model) {
                this.displayName(model.getDisplayName());
    this.credentialDescription(model.getCredentialDescription());
    this.type(model.getType());
    this.credentialDetails(model.getCredentialDetails());
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
        sb.append("UpdateDataLakeCredentialDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", credentialDescription=").append(String.valueOf(this.credentialDescription));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDataLakeCredentialDetails)) {
            return false;
        }

        UpdateDataLakeCredentialDetails other = (UpdateDataLakeCredentialDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.credentialDescription, other.credentialDescription) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.credentialDetails, other.credentialDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.credentialDescription == null ? 43 : this.credentialDescription.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        return result;
    }


}
