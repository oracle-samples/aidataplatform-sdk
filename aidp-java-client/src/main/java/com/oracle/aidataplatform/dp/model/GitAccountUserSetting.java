// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Git account setting details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitAccountUserSetting.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class GitAccountUserSetting extends SettingData {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The name of the Git provider.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("providerName")
private GitAccountProviderName providerName;

        /**
         * The name of the Git provider.
         * @param providerName the value to set
         * @return this builder
         **/
        

public Builder providerName(GitAccountProviderName providerName) {
    this.providerName = providerName;
    return this;
}
            /**
     * The type of Git account entity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("entityType")
private EntityType entityType;

        /**
         * The type of Git account entity.
         * @param entityType the value to set
         * @return this builder
         **/
        

public Builder entityType(EntityType entityType) {
    this.entityType = entityType;
    return this;
}
            /**
     * The username for the Git account.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("username")
private String username;

        /**
         * The username for the Git account.
         * @param username the value to set
         * @return this builder
         **/
        

public Builder username(String username) {
    this.username = username;
    return this;
}
            /**
     * The personal access token for the Git account.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("personalAccessToken")
private String personalAccessToken;

        /**
         * The personal access token for the Git account.
         * @param personalAccessToken the value to set
         * @return this builder
         **/
        

public Builder personalAccessToken(String personalAccessToken) {
    this.personalAccessToken = personalAccessToken;
    return this;
}


        public GitAccountUserSetting build() {
            GitAccountUserSetting model = new GitAccountUserSetting(this.providerName
                , this.entityType
                , this.username
                , this.personalAccessToken);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitAccountUserSetting model) {
                this.providerName(model.getProviderName());
    this.entityType(model.getEntityType());
    this.username(model.getUsername());
    this.personalAccessToken(model.getPersonalAccessToken());
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

    
    @Deprecated
    public GitAccountUserSetting(GitAccountProviderName providerName, EntityType entityType, String username, String personalAccessToken) {
    super();
        this.providerName = providerName;
        this.entityType = entityType;
        this.username = username;
        this.personalAccessToken = personalAccessToken;
    }

    
        /**
     * The name of the Git provider.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("providerName")
    private final GitAccountProviderName providerName;

        /**
     * The name of the Git provider.
     * @return the value
     **/
    
    public GitAccountProviderName getProviderName() {
        return providerName;
    }

    /**
     * The type of Git account entity.
     **/
    public enum EntityType implements com.oracle.bmc.http.internal.BmcEnum {
        PersonalAccessToken("PERSONAL_ACCESS_TOKEN"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(EntityType.class);

        private final String value;
        private static java.util.Map<String, EntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntityType v : EntityType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EntityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'EntityType', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * The type of Git account entity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final EntityType entityType;

        /**
     * The type of Git account entity.
     * @return the value
     **/
    
    public EntityType getEntityType() {
        return entityType;
    }


        /**
     * The username for the Git account.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

        /**
     * The username for the Git account.
     * @return the value
     **/
    
    public String getUsername() {
        return username;
    }


        /**
     * The personal access token for the Git account.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("personalAccessToken")
    private final String personalAccessToken;

        /**
     * The personal access token for the Git account.
     * @return the value
     **/
    
    public String getPersonalAccessToken() {
        return personalAccessToken;
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
        sb.append("GitAccountUserSetting(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", providerName=").append(String.valueOf(this.providerName));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", personalAccessToken=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitAccountUserSetting)) {
            return false;
        }

        GitAccountUserSetting other = (GitAccountUserSetting) o;
        return java.util.Objects.equals(this.providerName, other.providerName) &&
            java.util.Objects.equals(this.entityType, other.entityType) &&
            java.util.Objects.equals(this.username, other.username) &&
            java.util.Objects.equals(this.personalAccessToken, other.personalAccessToken) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.providerName == null ? 43 : this.providerName.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.personalAccessToken == null ? 43 : this.personalAccessToken.hashCode());
        return result;
    }


}
