// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Description of KB Job Run Statistics.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=KnowledgeBaseJobRunData.Builder.class)

public final class KnowledgeBaseJobRunData  {
    @Deprecated
    @java.beans.ConstructorProperties({"recordsAdded", "recordsDeleted", "recordsUpdated", "recordsAddedUpdatedSize", "triggerType"})
    public KnowledgeBaseJobRunData(Long recordsAdded, Long recordsDeleted, Long recordsUpdated, Long recordsAddedUpdatedSize, KnowledgeBaseJobRunTriggerType triggerType) {
        super();
        this.recordsAdded = recordsAdded;
        this.recordsDeleted = recordsDeleted;
        this.recordsUpdated = recordsUpdated;
        this.recordsAddedUpdatedSize = recordsAddedUpdatedSize;
        this.triggerType = triggerType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Number of records/files added as part of this job run
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("recordsAdded")
        private Long recordsAdded;

                /**
         * Number of records/files added as part of this job run
         * @param recordsAdded the value to set
         * @return this builder
         **/
        

        public Builder recordsAdded(Long recordsAdded) {
        this.recordsAdded = recordsAdded;
        return this;
        }
            /**
     * Number of records/files deleted as part of this job run
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("recordsDeleted")
        private Long recordsDeleted;

                /**
         * Number of records/files deleted as part of this job run
         * @param recordsDeleted the value to set
         * @return this builder
         **/
        

        public Builder recordsDeleted(Long recordsDeleted) {
        this.recordsDeleted = recordsDeleted;
        return this;
        }
            /**
     * Number of records/files updated as part of this job run
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("recordsUpdated")
        private Long recordsUpdated;

                /**
         * Number of records/files updated as part of this job run
         * @param recordsUpdated the value to set
         * @return this builder
         **/
        

        public Builder recordsUpdated(Long recordsUpdated) {
        this.recordsUpdated = recordsUpdated;
        return this;
        }
            /**
     * Size of all the records/files processed as part of this job run
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("recordsAddedUpdatedSize")
        private Long recordsAddedUpdatedSize;

                /**
         * Size of all the records/files processed as part of this job run
         * @param recordsAddedUpdatedSize the value to set
         * @return this builder
         **/
        

        public Builder recordsAddedUpdatedSize(Long recordsAddedUpdatedSize) {
        this.recordsAddedUpdatedSize = recordsAddedUpdatedSize;
        return this;
        }
            /**
     * Hint for how job run is getting started.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("triggerType")
        private KnowledgeBaseJobRunTriggerType triggerType;

                /**
         * Hint for how job run is getting started.
         * @param triggerType the value to set
         * @return this builder
         **/
        

        public Builder triggerType(KnowledgeBaseJobRunTriggerType triggerType) {
        this.triggerType = triggerType;
        return this;
        }


        public KnowledgeBaseJobRunData build() {
            KnowledgeBaseJobRunData model = new KnowledgeBaseJobRunData(this.recordsAdded
                    , this.recordsDeleted
                    , this.recordsUpdated
                    , this.recordsAddedUpdatedSize
                    , this.triggerType);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseJobRunData model) {
                this.recordsAdded(model.getRecordsAdded());
    this.recordsDeleted(model.getRecordsDeleted());
    this.recordsUpdated(model.getRecordsUpdated());
    this.recordsAddedUpdatedSize(model.getRecordsAddedUpdatedSize());
    this.triggerType(model.getTriggerType());
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
     * Number of records/files added as part of this job run
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("recordsAdded")
    private final Long recordsAdded;

        /**
     * Number of records/files added as part of this job run
     * @return the value
     **/
    
    public Long getRecordsAdded() {
        return recordsAdded;
    }


        /**
     * Number of records/files deleted as part of this job run
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("recordsDeleted")
    private final Long recordsDeleted;

        /**
     * Number of records/files deleted as part of this job run
     * @return the value
     **/
    
    public Long getRecordsDeleted() {
        return recordsDeleted;
    }


        /**
     * Number of records/files updated as part of this job run
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("recordsUpdated")
    private final Long recordsUpdated;

        /**
     * Number of records/files updated as part of this job run
     * @return the value
     **/
    
    public Long getRecordsUpdated() {
        return recordsUpdated;
    }


        /**
     * Size of all the records/files processed as part of this job run
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("recordsAddedUpdatedSize")
    private final Long recordsAddedUpdatedSize;

        /**
     * Size of all the records/files processed as part of this job run
     * @return the value
     **/
    
    public Long getRecordsAddedUpdatedSize() {
        return recordsAddedUpdatedSize;
    }

    
        /**
     * Hint for how job run is getting started.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("triggerType")
    private final KnowledgeBaseJobRunTriggerType triggerType;

        /**
     * Hint for how job run is getting started.
     * @return the value
     **/
    
    public KnowledgeBaseJobRunTriggerType getTriggerType() {
        return triggerType;
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
        sb.append("KnowledgeBaseJobRunData(");
        sb.append("recordsAdded=").append(String.valueOf(this.recordsAdded));
        sb.append(", recordsDeleted=").append(String.valueOf(this.recordsDeleted));
        sb.append(", recordsUpdated=").append(String.valueOf(this.recordsUpdated));
        sb.append(", recordsAddedUpdatedSize=").append(String.valueOf(this.recordsAddedUpdatedSize));
        sb.append(", triggerType=").append(String.valueOf(this.triggerType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseJobRunData)) {
            return false;
        }

        KnowledgeBaseJobRunData other = (KnowledgeBaseJobRunData) o;
        return java.util.Objects.equals(this.recordsAdded, other.recordsAdded) &&
            java.util.Objects.equals(this.recordsDeleted, other.recordsDeleted) &&
            java.util.Objects.equals(this.recordsUpdated, other.recordsUpdated) &&
            java.util.Objects.equals(this.recordsAddedUpdatedSize, other.recordsAddedUpdatedSize) &&
            java.util.Objects.equals(this.triggerType, other.triggerType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.recordsAdded == null ? 43 : this.recordsAdded.hashCode());
        result = (result * PRIME) + (this.recordsDeleted == null ? 43 : this.recordsDeleted.hashCode());
        result = (result * PRIME) + (this.recordsUpdated == null ? 43 : this.recordsUpdated.hashCode());
        result = (result * PRIME) + (this.recordsAddedUpdatedSize == null ? 43 : this.recordsAddedUpdatedSize.hashCode());
        result = (result * PRIME) + (this.triggerType == null ? 43 : this.triggerType.hashCode());
        return result;
    }


}
