// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * A single retrieved document chunk with metadata.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RetrievedChunk.Builder.class)

public final class RetrievedChunk  {
    @Deprecated
    @java.beans.ConstructorProperties({"documentId", "content", "score"})
    public RetrievedChunk(String documentId, String content, Float score) {
        super();
        this.documentId = documentId;
        this.content = content;
        this.score = score;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Unique identifier or URI for the document chunk.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("documentId")
        private String documentId;

                /**
         * Unique identifier or URI for the document chunk.
         * @param documentId the value to set
         * @return this builder
         **/
        

        public Builder documentId(String documentId) {
        this.documentId = documentId;
        return this;
        }
            /**
     * Text content of the retrieved chunk.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

                /**
         * Text content of the retrieved chunk.
         * @param content the value to set
         * @return this builder
         **/
        

        public Builder content(String content) {
        this.content = content;
        return this;
        }
            /**
     * Relevance score assigned to the chunk during retrieval.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("score")
        private Float score;

                /**
         * Relevance score assigned to the chunk during retrieval.
         * @param score the value to set
         * @return this builder
         **/
        

        public Builder score(Float score) {
        this.score = score;
        return this;
        }


        public RetrievedChunk build() {
            RetrievedChunk model = new RetrievedChunk(this.documentId
                    , this.content
                    , this.score);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetrievedChunk model) {
                this.documentId(model.getDocumentId());
    this.content(model.getContent());
    this.score(model.getScore());
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
     * Unique identifier or URI for the document chunk.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("documentId")
    private final String documentId;

        /**
     * Unique identifier or URI for the document chunk.
     * @return the value
     **/
    
    public String getDocumentId() {
        return documentId;
    }


        /**
     * Text content of the retrieved chunk.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

        /**
     * Text content of the retrieved chunk.
     * @return the value
     **/
    
    public String getContent() {
        return content;
    }


        /**
     * Relevance score assigned to the chunk during retrieval.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    private final Float score;

        /**
     * Relevance score assigned to the chunk during retrieval.
     * @return the value
     **/
    
    public Float getScore() {
        return score;
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
        sb.append("RetrievedChunk(");
        sb.append("documentId=").append(String.valueOf(this.documentId));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", score=").append(String.valueOf(this.score));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetrievedChunk)) {
            return false;
        }

        RetrievedChunk other = (RetrievedChunk) o;
        return java.util.Objects.equals(this.documentId, other.documentId) &&
            java.util.Objects.equals(this.content, other.content) &&
            java.util.Objects.equals(this.score, other.score);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.documentId == null ? 43 : this.documentId.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.score == null ? 43 : this.score.hashCode());
        return result;
    }


}
