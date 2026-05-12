package com.oracle.aidataplatform.dp.model;


/**
 * Structured RAG result containing generated answer and retrieved document chunks.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RagResult.Builder.class)

public final class RagResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"answer", "retrievedChunks"})
    public RagResult(String answer, java.util.List<RetrievedChunk> retrievedChunks) {
        super();
        this.answer = answer;
        this.retrievedChunks = retrievedChunks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The synthesized response generated using retrieved documents.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("answer")
        private String answer;

                /**
         * The synthesized response generated using retrieved documents.
         * @param answer the value to set
         * @return this builder
         **/
        

        public Builder answer(String answer) {
        this.answer = answer;
        return this;
        }
            /**
     * List of document chunks retrieved during RAG processing.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("retrievedChunks")
        private java.util.List<RetrievedChunk> retrievedChunks;

                /**
         * List of document chunks retrieved during RAG processing.
         * @param retrievedChunks the value to set
         * @return this builder
         **/
        

        public Builder retrievedChunks(java.util.List<RetrievedChunk> retrievedChunks) {
        this.retrievedChunks = retrievedChunks;
        return this;
        }


        public RagResult build() {
            RagResult model = new RagResult(this.answer
                    , this.retrievedChunks);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RagResult model) {
                this.answer(model.getAnswer());
    this.retrievedChunks(model.getRetrievedChunks());
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
     * The synthesized response generated using retrieved documents.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("answer")
    private final String answer;

        /**
     * The synthesized response generated using retrieved documents.
     * @return the value
     **/
    
    public String getAnswer() {
        return answer;
    }


        /**
     * List of document chunks retrieved during RAG processing.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("retrievedChunks")
    private final java.util.List<RetrievedChunk> retrievedChunks;

        /**
     * List of document chunks retrieved during RAG processing.
     * @return the value
     **/
    
    public java.util.List<RetrievedChunk> getRetrievedChunks() {
        return retrievedChunks;
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
        sb.append("RagResult(");
        sb.append("answer=").append(String.valueOf(this.answer));
        sb.append(", retrievedChunks=").append(String.valueOf(this.retrievedChunks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RagResult)) {
            return false;
        }

        RagResult other = (RagResult) o;
        return java.util.Objects.equals(this.answer, other.answer) &&
            java.util.Objects.equals(this.retrievedChunks, other.retrievedChunks);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.answer == null ? 43 : this.answer.hashCode());
        result = (result * PRIME) + (this.retrievedChunks == null ? 43 : this.retrievedChunks.hashCode());
        return result;
    }


}
