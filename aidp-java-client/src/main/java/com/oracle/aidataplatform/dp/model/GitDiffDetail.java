// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Unified diff details for a Git file.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitDiffDetail.Builder.class)

public final class GitDiffDetail  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFilePath", "isConflict", "isBinary", "patch", "isTruncated", "truncatedReason"})
    public GitDiffDetail(String gitFilePath, Boolean isConflict, Boolean isBinary, String patch, Boolean isTruncated, TruncatedReason truncatedReason) {
        super();
        this.gitFilePath = gitFilePath;
        this.isConflict = isConflict;
        this.isBinary = isBinary;
        this.patch = patch;
        this.isTruncated = isTruncated;
        this.truncatedReason = truncatedReason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * File path relative to repository root.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("gitFilePath")
private String gitFilePath;

        /**
         * File path relative to repository root.
         * @param gitFilePath the value to set
         * @return this builder
         **/
        

public Builder gitFilePath(String gitFilePath) {
    this.gitFilePath = gitFilePath;
    return this;
}
            /**
     * Indicates whether the file is currently in a conflicted state.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isConflict")
private Boolean isConflict;

        /**
         * Indicates whether the file is currently in a conflicted state.
         * @param isConflict the value to set
         * @return this builder
         **/
        

public Builder isConflict(Boolean isConflict) {
    this.isConflict = isConflict;
    return this;
}
            /**
     * Indicates whether the file is binary.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isBinary")
private Boolean isBinary;

        /**
         * Indicates whether the file is binary.
         * @param isBinary the value to set
         * @return this builder
         **/
        

public Builder isBinary(Boolean isBinary) {
    this.isBinary = isBinary;
    return this;
}
            /**
     * Unified diff patch text.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("patch")
private String patch;

        /**
         * Unified diff patch text.
         * @param patch the value to set
         * @return this builder
         **/
        

public Builder patch(String patch) {
    this.patch = patch;
    return this;
}
            /**
     * Indicates whether the diff output was truncated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isTruncated")
private Boolean isTruncated;

        /**
         * Indicates whether the diff output was truncated.
         * @param isTruncated the value to set
         * @return this builder
         **/
        

public Builder isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
}
            /**
     * Indicates the reason for the truncated diff to be returned.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("truncatedReason")
private TruncatedReason truncatedReason;

        /**
         * Indicates the reason for the truncated diff to be returned.
         * @param truncatedReason the value to set
         * @return this builder
         **/
        

public Builder truncatedReason(TruncatedReason truncatedReason) {
    this.truncatedReason = truncatedReason;
    return this;
}


        public GitDiffDetail build() {
            GitDiffDetail model = new GitDiffDetail(this.gitFilePath
                , this.isConflict
                , this.isBinary
                , this.patch
                , this.isTruncated
                , this.truncatedReason);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitDiffDetail model) {
                this.gitFilePath(model.getGitFilePath());
    this.isConflict(model.getIsConflict());
    this.isBinary(model.getIsBinary());
    this.patch(model.getPatch());
    this.isTruncated(model.getIsTruncated());
    this.truncatedReason(model.getTruncatedReason());
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
     * File path relative to repository root.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("gitFilePath")
    private final String gitFilePath;

        /**
     * File path relative to repository root.
     * @return the value
     **/
    
    public String getGitFilePath() {
        return gitFilePath;
    }


        /**
     * Indicates whether the file is currently in a conflicted state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isConflict")
    private final Boolean isConflict;

        /**
     * Indicates whether the file is currently in a conflicted state.
     * @return the value
     **/
    
    public Boolean getIsConflict() {
        return isConflict;
    }


        /**
     * Indicates whether the file is binary.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isBinary")
    private final Boolean isBinary;

        /**
     * Indicates whether the file is binary.
     * @return the value
     **/
    
    public Boolean getIsBinary() {
        return isBinary;
    }


        /**
     * Unified diff patch text.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("patch")
    private final String patch;

        /**
     * Unified diff patch text.
     * @return the value
     **/
    
    public String getPatch() {
        return patch;
    }


        /**
     * Indicates whether the diff output was truncated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isTruncated")
    private final Boolean isTruncated;

        /**
     * Indicates whether the diff output was truncated.
     * @return the value
     **/
    
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * Indicates the reason for the truncated diff to be returned.
     **/
    public enum TruncatedReason implements com.oracle.bmc.http.internal.BmcEnum {
        MaxPatchBytes("MAX_PATCH_BYTES"),
        Binary("BINARY"),
        TooLarge("TOO_LARGE"),
        Unknown("UNKNOWN"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(TruncatedReason.class);

        private final String value;
        private static java.util.Map<String, TruncatedReason> map;

        static {
            map = new java.util.HashMap<>();
            for (TruncatedReason v : TruncatedReason.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TruncatedReason(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TruncatedReason create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'TruncatedReason', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Indicates the reason for the truncated diff to be returned.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("truncatedReason")
    private final TruncatedReason truncatedReason;

        /**
     * Indicates the reason for the truncated diff to be returned.
     * @return the value
     **/
    
    public TruncatedReason getTruncatedReason() {
        return truncatedReason;
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
        sb.append("GitDiffDetail(");
        sb.append("gitFilePath=").append(String.valueOf(this.gitFilePath));
        sb.append(", isConflict=").append(String.valueOf(this.isConflict));
        sb.append(", isBinary=").append(String.valueOf(this.isBinary));
        sb.append(", patch=").append(String.valueOf(this.patch));
        sb.append(", isTruncated=").append(String.valueOf(this.isTruncated));
        sb.append(", truncatedReason=").append(String.valueOf(this.truncatedReason));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitDiffDetail)) {
            return false;
        }

        GitDiffDetail other = (GitDiffDetail) o;
        return java.util.Objects.equals(this.gitFilePath, other.gitFilePath) &&
            java.util.Objects.equals(this.isConflict, other.isConflict) &&
            java.util.Objects.equals(this.isBinary, other.isBinary) &&
            java.util.Objects.equals(this.patch, other.patch) &&
            java.util.Objects.equals(this.isTruncated, other.isTruncated) &&
            java.util.Objects.equals(this.truncatedReason, other.truncatedReason);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFilePath == null ? 43 : this.gitFilePath.hashCode());
        result = (result * PRIME) + (this.isConflict == null ? 43 : this.isConflict.hashCode());
        result = (result * PRIME) + (this.isBinary == null ? 43 : this.isBinary.hashCode());
        result = (result * PRIME) + (this.patch == null ? 43 : this.patch.hashCode());
        result = (result * PRIME) + (this.isTruncated == null ? 43 : this.isTruncated.hashCode());
        result = (result * PRIME) + (this.truncatedReason == null ? 43 : this.truncatedReason.hashCode());
        return result;
    }


}
