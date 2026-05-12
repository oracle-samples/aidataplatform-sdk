package com.oracle.aidataplatform.dp.model;


/**
 * A user in the tenancy.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=IdentityUserSummary.Builder.class)

public final class IdentityUserSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"userId", "userName", "userEmail"})
    public IdentityUserSummary(String userId, String userName, String userEmail) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The ID of the user.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

                /**
         * The ID of the user.
         * @param userId the value to set
         * @return this builder
         **/
        

        public Builder userId(String userId) {
        this.userId = userId;
        return this;
        }
            /**
     * The login userName used by the user
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

                /**
         * The login userName used by the user
         * @param userName the value to set
         * @return this builder
         **/
        

        public Builder userName(String userName) {
        this.userName = userName;
        return this;
        }
            /**
     * The email of the user.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("userEmail")
        private String userEmail;

                /**
         * The email of the user.
         * @param userEmail the value to set
         * @return this builder
         **/
        

        public Builder userEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
        }


        public IdentityUserSummary build() {
            IdentityUserSummary model = new IdentityUserSummary(this.userId
                    , this.userName
                    , this.userEmail);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityUserSummary model) {
                this.userId(model.getUserId());
    this.userName(model.getUserName());
    this.userEmail(model.getUserEmail());
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
     * The ID of the user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

        /**
     * The ID of the user.
     * @return the value
     **/
    
    public String getUserId() {
        return userId;
    }


        /**
     * The login userName used by the user
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

        /**
     * The login userName used by the user
     * @return the value
     **/
    
    public String getUserName() {
        return userName;
    }


        /**
     * The email of the user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("userEmail")
    private final String userEmail;

        /**
     * The email of the user.
     * @return the value
     **/
    
    public String getUserEmail() {
        return userEmail;
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
        sb.append("IdentityUserSummary(");
        sb.append("userId=").append(String.valueOf(this.userId));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", userEmail=").append(String.valueOf(this.userEmail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityUserSummary)) {
            return false;
        }

        IdentityUserSummary other = (IdentityUserSummary) o;
        return java.util.Objects.equals(this.userId, other.userId) &&
            java.util.Objects.equals(this.userName, other.userName) &&
            java.util.Objects.equals(this.userEmail, other.userEmail);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.userEmail == null ? 43 : this.userEmail.hashCode());
        return result;
    }


}
