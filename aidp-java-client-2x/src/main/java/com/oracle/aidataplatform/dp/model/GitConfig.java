package com.oracle.aidataplatform.dp.model;


/**
 * Git configuration used when source is GIT_PROVIDER.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitConfig.Builder.class)

public final class GitConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"provider", "credential", "repositoryUrl", "branch"})
    public GitConfig(Provider provider, String credential, String repositoryUrl, String branch) {
        super();
        this.provider = provider;
        this.credential = credential;
        this.repositoryUrl = repositoryUrl;
        this.branch = branch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Git provider.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("provider")
        private Provider provider;

                /**
         * Git provider.
         * @param provider the value to set
         * @return this builder
         **/
        

        public Builder provider(Provider provider) {
        this.provider = provider;
        return this;
        }
            /**
     * Git credential to access the repository.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("credential")
        private String credential;

                /**
         * Git credential to access the repository.
         * @param credential the value to set
         * @return this builder
         **/
        

        public Builder credential(String credential) {
        this.credential = credential;
        return this;
        }
            /**
     * Git repository URL.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
        private String repositoryUrl;

                /**
         * Git repository URL.
         * @param repositoryUrl the value to set
         * @return this builder
         **/
        

        public Builder repositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
        }
            /**
     * Git branch path.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("branch")
        private String branch;

                /**
         * Git branch path.
         * @param branch the value to set
         * @return this builder
         **/
        

        public Builder branch(String branch) {
        this.branch = branch;
        return this;
        }


        public GitConfig build() {
            GitConfig model = new GitConfig(this.provider
                    , this.credential
                    , this.repositoryUrl
                    , this.branch);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitConfig model) {
                this.provider(model.getProvider());
    this.credential(model.getCredential());
    this.repositoryUrl(model.getRepositoryUrl());
    this.branch(model.getBranch());
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
     * Git provider.
     **/
    public enum Provider {
        Github("GITHUB"),
        Bitbucket("BITBUCKET"),
        Gitlab("GITLAB"),
        OciDevops("OCI_DEVOPS"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Provider.class);

        private final String value;
        private static java.util.Map<String, Provider> map;

        static {
            map = new java.util.HashMap<>();
            for (Provider v : Provider.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Provider(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Provider create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Provider', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Git provider.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    private final Provider provider;

        /**
     * Git provider.
     * @return the value
     **/
    
    public Provider getProvider() {
        return provider;
    }


        /**
     * Git credential to access the repository.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credential")
    private final String credential;

        /**
     * Git credential to access the repository.
     * @return the value
     **/
    
    public String getCredential() {
        return credential;
    }


        /**
     * Git repository URL.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryUrl")
    private final String repositoryUrl;

        /**
     * Git repository URL.
     * @return the value
     **/
    
    public String getRepositoryUrl() {
        return repositoryUrl;
    }


        /**
     * Git branch path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("branch")
    private final String branch;

        /**
     * Git branch path.
     * @return the value
     **/
    
    public String getBranch() {
        return branch;
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
        sb.append("GitConfig(");
        sb.append("provider=").append(String.valueOf(this.provider));
        sb.append(", credential=").append(String.valueOf(this.credential));
        sb.append(", repositoryUrl=").append(String.valueOf(this.repositoryUrl));
        sb.append(", branch=").append(String.valueOf(this.branch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitConfig)) {
            return false;
        }

        GitConfig other = (GitConfig) o;
        return java.util.Objects.equals(this.provider, other.provider) &&
            java.util.Objects.equals(this.credential, other.credential) &&
            java.util.Objects.equals(this.repositoryUrl, other.repositoryUrl) &&
            java.util.Objects.equals(this.branch, other.branch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.provider == null ? 43 : this.provider.hashCode());
        result = (result * PRIME) + (this.credential == null ? 43 : this.credential.hashCode());
        result = (result * PRIME) + (this.repositoryUrl == null ? 43 : this.repositoryUrl.hashCode());
        result = (result * PRIME) + (this.branch == null ? 43 : this.branch.hashCode());
        return result;
    }


}
