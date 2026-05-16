// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The information to be updated for KnowledgeBase source.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateKnowledgeBaseSourceUpdateDetails.Builder.class)

public final class UpdateKnowledgeBaseSourceUpdateDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"sources"})
    public UpdateKnowledgeBaseSourceUpdateDetails(java.util.List<UpdateKnowledgeBaseSourceUpdateDetailsItem> sources) {
        super();
        this.sources = sources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Batch Payload for updating KnowledgeBase sources. Items marked for deletion are processed before items marked for addition
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<UpdateKnowledgeBaseSourceUpdateDetailsItem> sources;

                /**
         * Batch Payload for updating KnowledgeBase sources. Items marked for deletion are processed before items marked for addition
         * @param sources the value to set
         * @return this builder
         **/
        

        public Builder sources(java.util.List<UpdateKnowledgeBaseSourceUpdateDetailsItem> sources) {
        this.sources = sources;
        return this;
        }


        public UpdateKnowledgeBaseSourceUpdateDetails build() {
            UpdateKnowledgeBaseSourceUpdateDetails model = new UpdateKnowledgeBaseSourceUpdateDetails(this.sources);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateKnowledgeBaseSourceUpdateDetails model) {
                this.sources(model.getSources());
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
     * Batch Payload for updating KnowledgeBase sources. Items marked for deletion are processed before items marked for addition
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<UpdateKnowledgeBaseSourceUpdateDetailsItem> sources;

        /**
     * Batch Payload for updating KnowledgeBase sources. Items marked for deletion are processed before items marked for addition
     * @return the value
     **/
    
    public java.util.List<UpdateKnowledgeBaseSourceUpdateDetailsItem> getSources() {
        return sources;
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
        sb.append("UpdateKnowledgeBaseSourceUpdateDetails(");
        sb.append("sources=").append(String.valueOf(this.sources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateKnowledgeBaseSourceUpdateDetails)) {
            return false;
        }

        UpdateKnowledgeBaseSourceUpdateDetails other = (UpdateKnowledgeBaseSourceUpdateDetails) o;
        return java.util.Objects.equals(this.sources, other.sources);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        return result;
    }


}
