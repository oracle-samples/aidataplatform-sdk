// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Summary information about a file that differs in a Git folder context.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=GitDiffSummary.Builder.class)

public final class GitDiffSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"gitFilePath", "changeType", "oldGitFilePath", "isConflict", "conflictType"})
    public GitDiffSummary(String gitFilePath, ChangeType changeType, String oldGitFilePath, Boolean isConflict, ConflictType conflictType) {
        super();
        this.gitFilePath = gitFilePath;
        this.changeType = changeType;
        this.oldGitFilePath = oldGitFilePath;
        this.isConflict = isConflict;
        this.conflictType = conflictType;
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
     * Type of change for this file.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("changeType")
        private ChangeType changeType;

                /**
         * Type of change for this file.
         * @param changeType the value to set
         * @return this builder
         **/
        

        public Builder changeType(ChangeType changeType) {
        this.changeType = changeType;
        return this;
        }
            /**
     * Previous path if the file was renamed.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("oldGitFilePath")
        private String oldGitFilePath;

                /**
         * Previous path if the file was renamed.
         * @param oldGitFilePath the value to set
         * @return this builder
         **/
        

        public Builder oldGitFilePath(String oldGitFilePath) {
        this.oldGitFilePath = oldGitFilePath;
        return this;
        }
            /**
     * Whether the file is currently in an unmerged/conflicted state.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isConflict")
        private Boolean isConflict;

                /**
         * Whether the file is currently in an unmerged/conflicted state.
         * @param isConflict the value to set
         * @return this builder
         **/
        

        public Builder isConflict(Boolean isConflict) {
        this.isConflict = isConflict;
        return this;
        }
            /**
     * Conflict classification when isConflict is true.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("conflictType")
        private ConflictType conflictType;

                /**
         * Conflict classification when isConflict is true.
         * @param conflictType the value to set
         * @return this builder
         **/
        

        public Builder conflictType(ConflictType conflictType) {
        this.conflictType = conflictType;
        return this;
        }


        public GitDiffSummary build() {
            GitDiffSummary model = new GitDiffSummary(this.gitFilePath
                    , this.changeType
                    , this.oldGitFilePath
                    , this.isConflict
                    , this.conflictType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GitDiffSummary model) {
                this.gitFilePath(model.getGitFilePath());
    this.changeType(model.getChangeType());
    this.oldGitFilePath(model.getOldGitFilePath());
    this.isConflict(model.getIsConflict());
    this.conflictType(model.getConflictType());
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
     * Type of change for this file.
     **/
    public enum ChangeType {
        Added("ADDED"),
        Modified("MODIFIED"),
        Deleted("DELETED"),
        Renamed("RENAMED"),
        Copied("COPIED"),
        TypeChanged("TYPE_CHANGED"),
        Unmerged("UNMERGED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ChangeType.class);

        private final String value;
        private static java.util.Map<String, ChangeType> map;

        static {
            map = new java.util.HashMap<>();
            for (ChangeType v : ChangeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ChangeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ChangeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'ChangeType', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Type of change for this file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("changeType")
    private final ChangeType changeType;

        /**
     * Type of change for this file.
     * @return the value
     **/
    
    public ChangeType getChangeType() {
        return changeType;
    }


        /**
     * Previous path if the file was renamed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("oldGitFilePath")
    private final String oldGitFilePath;

        /**
     * Previous path if the file was renamed.
     * @return the value
     **/
    
    public String getOldGitFilePath() {
        return oldGitFilePath;
    }


        /**
     * Whether the file is currently in an unmerged/conflicted state.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isConflict")
    private final Boolean isConflict;

        /**
     * Whether the file is currently in an unmerged/conflicted state.
     * @return the value
     **/
    
    public Boolean getIsConflict() {
        return isConflict;
    }

    /**
     * Conflict classification when isConflict is true.
     **/
    public enum ConflictType {
        BothModified("BOTH_MODIFIED"),
        BothAdded("BOTH_ADDED"),
        BothDeleted("BOTH_DELETED"),
        AddedByUs("ADDED_BY_US"),
        AddedByThem("ADDED_BY_THEM"),
        DeletedByUs("DELETED_BY_US"),
        DeletedByThem("DELETED_BY_THEM"),
        Unknown("UNKNOWN"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ConflictType.class);

        private final String value;
        private static java.util.Map<String, ConflictType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConflictType v : ConflictType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConflictType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConflictType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'ConflictType', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Conflict classification when isConflict is true.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("conflictType")
    private final ConflictType conflictType;

        /**
     * Conflict classification when isConflict is true.
     * @return the value
     **/
    
    public ConflictType getConflictType() {
        return conflictType;
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
        sb.append("GitDiffSummary(");
        sb.append("gitFilePath=").append(String.valueOf(this.gitFilePath));
        sb.append(", changeType=").append(String.valueOf(this.changeType));
        sb.append(", oldGitFilePath=").append(String.valueOf(this.oldGitFilePath));
        sb.append(", isConflict=").append(String.valueOf(this.isConflict));
        sb.append(", conflictType=").append(String.valueOf(this.conflictType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GitDiffSummary)) {
            return false;
        }

        GitDiffSummary other = (GitDiffSummary) o;
        return java.util.Objects.equals(this.gitFilePath, other.gitFilePath) &&
            java.util.Objects.equals(this.changeType, other.changeType) &&
            java.util.Objects.equals(this.oldGitFilePath, other.oldGitFilePath) &&
            java.util.Objects.equals(this.isConflict, other.isConflict) &&
            java.util.Objects.equals(this.conflictType, other.conflictType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.gitFilePath == null ? 43 : this.gitFilePath.hashCode());
        result = (result * PRIME) + (this.changeType == null ? 43 : this.changeType.hashCode());
        result = (result * PRIME) + (this.oldGitFilePath == null ? 43 : this.oldGitFilePath.hashCode());
        result = (result * PRIME) + (this.isConflict == null ? 43 : this.isConflict.hashCode());
        result = (result * PRIME) + (this.conflictType == null ? 43 : this.conflictType.hashCode());
        return result;
    }


}
