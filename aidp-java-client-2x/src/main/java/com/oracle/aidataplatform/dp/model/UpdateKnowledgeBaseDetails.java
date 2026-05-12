package com.oracle.aidataplatform.dp.model;


/**
 * The information to be updated.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateKnowledgeBaseDetails.Builder.class)

public final class UpdateKnowledgeBaseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "indexDetails", "updateKnowledgeBaseMetadataUpdateDetails", "updateKnowledgeBaseSourceUpdateDetails"})
    public UpdateKnowledgeBaseDetails(KnowledgeBaseUpdateOperationType action, KnowledgeBaseVectorIndexDetails indexDetails, UpdateKnowledgeBaseMetadataUpdateDetails updateKnowledgeBaseMetadataUpdateDetails, UpdateKnowledgeBaseSourceUpdateDetails updateKnowledgeBaseSourceUpdateDetails) {
        super();
        this.action = action;
        this.indexDetails = indexDetails;
        this.updateKnowledgeBaseMetadataUpdateDetails = updateKnowledgeBaseMetadataUpdateDetails;
        this.updateKnowledgeBaseSourceUpdateDetails = updateKnowledgeBaseSourceUpdateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The update operation we want to perform on KnowledgeBase.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private KnowledgeBaseUpdateOperationType action;

                /**
         * The update operation we want to perform on KnowledgeBase.
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(KnowledgeBaseUpdateOperationType action) {
        this.action = action;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("indexDetails")
        private KnowledgeBaseVectorIndexDetails indexDetails;

        

        public Builder indexDetails(KnowledgeBaseVectorIndexDetails indexDetails) {
        this.indexDetails = indexDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("updateKnowledgeBaseMetadataUpdateDetails")
        private UpdateKnowledgeBaseMetadataUpdateDetails updateKnowledgeBaseMetadataUpdateDetails;

        

        public Builder updateKnowledgeBaseMetadataUpdateDetails(UpdateKnowledgeBaseMetadataUpdateDetails updateKnowledgeBaseMetadataUpdateDetails) {
        this.updateKnowledgeBaseMetadataUpdateDetails = updateKnowledgeBaseMetadataUpdateDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("updateKnowledgeBaseSourceUpdateDetails")
        private UpdateKnowledgeBaseSourceUpdateDetails updateKnowledgeBaseSourceUpdateDetails;

        

        public Builder updateKnowledgeBaseSourceUpdateDetails(UpdateKnowledgeBaseSourceUpdateDetails updateKnowledgeBaseSourceUpdateDetails) {
        this.updateKnowledgeBaseSourceUpdateDetails = updateKnowledgeBaseSourceUpdateDetails;
        return this;
        }


        public UpdateKnowledgeBaseDetails build() {
            UpdateKnowledgeBaseDetails model = new UpdateKnowledgeBaseDetails(this.action
                    , this.indexDetails
                    , this.updateKnowledgeBaseMetadataUpdateDetails
                    , this.updateKnowledgeBaseSourceUpdateDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateKnowledgeBaseDetails model) {
                this.action(model.getAction());
    this.indexDetails(model.getIndexDetails());
    this.updateKnowledgeBaseMetadataUpdateDetails(model.getUpdateKnowledgeBaseMetadataUpdateDetails());
    this.updateKnowledgeBaseSourceUpdateDetails(model.getUpdateKnowledgeBaseSourceUpdateDetails());
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
     * The update operation we want to perform on KnowledgeBase.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final KnowledgeBaseUpdateOperationType action;

        /**
     * The update operation we want to perform on KnowledgeBase.
     * @return the value
     **/
    
    public KnowledgeBaseUpdateOperationType getAction() {
        return action;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("indexDetails")
    private final KnowledgeBaseVectorIndexDetails indexDetails;

    
    public KnowledgeBaseVectorIndexDetails getIndexDetails() {
        return indexDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("updateKnowledgeBaseMetadataUpdateDetails")
    private final UpdateKnowledgeBaseMetadataUpdateDetails updateKnowledgeBaseMetadataUpdateDetails;

    
    public UpdateKnowledgeBaseMetadataUpdateDetails getUpdateKnowledgeBaseMetadataUpdateDetails() {
        return updateKnowledgeBaseMetadataUpdateDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("updateKnowledgeBaseSourceUpdateDetails")
    private final UpdateKnowledgeBaseSourceUpdateDetails updateKnowledgeBaseSourceUpdateDetails;

    
    public UpdateKnowledgeBaseSourceUpdateDetails getUpdateKnowledgeBaseSourceUpdateDetails() {
        return updateKnowledgeBaseSourceUpdateDetails;
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
        sb.append("UpdateKnowledgeBaseDetails(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", indexDetails=").append(String.valueOf(this.indexDetails));
        sb.append(", updateKnowledgeBaseMetadataUpdateDetails=").append(String.valueOf(this.updateKnowledgeBaseMetadataUpdateDetails));
        sb.append(", updateKnowledgeBaseSourceUpdateDetails=").append(String.valueOf(this.updateKnowledgeBaseSourceUpdateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateKnowledgeBaseDetails)) {
            return false;
        }

        UpdateKnowledgeBaseDetails other = (UpdateKnowledgeBaseDetails) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.indexDetails, other.indexDetails) &&
            java.util.Objects.equals(this.updateKnowledgeBaseMetadataUpdateDetails, other.updateKnowledgeBaseMetadataUpdateDetails) &&
            java.util.Objects.equals(this.updateKnowledgeBaseSourceUpdateDetails, other.updateKnowledgeBaseSourceUpdateDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.indexDetails == null ? 43 : this.indexDetails.hashCode());
        result = (result * PRIME) + (this.updateKnowledgeBaseMetadataUpdateDetails == null ? 43 : this.updateKnowledgeBaseMetadataUpdateDetails.hashCode());
        result = (result * PRIME) + (this.updateKnowledgeBaseSourceUpdateDetails == null ? 43 : this.updateKnowledgeBaseSourceUpdateDetails.hashCode());
        return result;
    }


}
