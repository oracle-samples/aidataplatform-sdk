package com.oracle.aidataplatform.dp.model;


/**
 * The information to be updated for KnowledgeBase source.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateKnowledgeBaseSourceUpdateDetailsItem.Builder.class)

public final class UpdateKnowledgeBaseSourceUpdateDetailsItem  {
    @Deprecated
    @java.beans.ConstructorProperties({"action", "updateKnowledgeBaseAddSourceDetails", "updateKnowledgeBaseDeleteSourceDetails"})
    public UpdateKnowledgeBaseSourceUpdateDetailsItem(KnowledgeBaseSourceUpdateOperationType action, UpdateKnowledgeBaseAddSourceDetails updateKnowledgeBaseAddSourceDetails, UpdateKnowledgeBaseDeleteSourceDetails updateKnowledgeBaseDeleteSourceDetails) {
        super();
        this.action = action;
        this.updateKnowledgeBaseAddSourceDetails = updateKnowledgeBaseAddSourceDetails;
        this.updateKnowledgeBaseDeleteSourceDetails = updateKnowledgeBaseDeleteSourceDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Source update action type
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private KnowledgeBaseSourceUpdateOperationType action;

                /**
         * Source update action type
         * @param action the value to set
         * @return this builder
         **/
        

        public Builder action(KnowledgeBaseSourceUpdateOperationType action) {
        this.action = action;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("updateKnowledgeBaseAddSourceDetails")
        private UpdateKnowledgeBaseAddSourceDetails updateKnowledgeBaseAddSourceDetails;

        

        public Builder updateKnowledgeBaseAddSourceDetails(UpdateKnowledgeBaseAddSourceDetails updateKnowledgeBaseAddSourceDetails) {
        this.updateKnowledgeBaseAddSourceDetails = updateKnowledgeBaseAddSourceDetails;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("updateKnowledgeBaseDeleteSourceDetails")
        private UpdateKnowledgeBaseDeleteSourceDetails updateKnowledgeBaseDeleteSourceDetails;

        

        public Builder updateKnowledgeBaseDeleteSourceDetails(UpdateKnowledgeBaseDeleteSourceDetails updateKnowledgeBaseDeleteSourceDetails) {
        this.updateKnowledgeBaseDeleteSourceDetails = updateKnowledgeBaseDeleteSourceDetails;
        return this;
        }


        public UpdateKnowledgeBaseSourceUpdateDetailsItem build() {
            UpdateKnowledgeBaseSourceUpdateDetailsItem model = new UpdateKnowledgeBaseSourceUpdateDetailsItem(this.action
                    , this.updateKnowledgeBaseAddSourceDetails
                    , this.updateKnowledgeBaseDeleteSourceDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateKnowledgeBaseSourceUpdateDetailsItem model) {
                this.action(model.getAction());
    this.updateKnowledgeBaseAddSourceDetails(model.getUpdateKnowledgeBaseAddSourceDetails());
    this.updateKnowledgeBaseDeleteSourceDetails(model.getUpdateKnowledgeBaseDeleteSourceDetails());
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
     * Source update action type
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final KnowledgeBaseSourceUpdateOperationType action;

        /**
     * Source update action type
     * @return the value
     **/
    
    public KnowledgeBaseSourceUpdateOperationType getAction() {
        return action;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("updateKnowledgeBaseAddSourceDetails")
    private final UpdateKnowledgeBaseAddSourceDetails updateKnowledgeBaseAddSourceDetails;

    
    public UpdateKnowledgeBaseAddSourceDetails getUpdateKnowledgeBaseAddSourceDetails() {
        return updateKnowledgeBaseAddSourceDetails;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("updateKnowledgeBaseDeleteSourceDetails")
    private final UpdateKnowledgeBaseDeleteSourceDetails updateKnowledgeBaseDeleteSourceDetails;

    
    public UpdateKnowledgeBaseDeleteSourceDetails getUpdateKnowledgeBaseDeleteSourceDetails() {
        return updateKnowledgeBaseDeleteSourceDetails;
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
        sb.append("UpdateKnowledgeBaseSourceUpdateDetailsItem(");
        sb.append("action=").append(String.valueOf(this.action));
        sb.append(", updateKnowledgeBaseAddSourceDetails=").append(String.valueOf(this.updateKnowledgeBaseAddSourceDetails));
        sb.append(", updateKnowledgeBaseDeleteSourceDetails=").append(String.valueOf(this.updateKnowledgeBaseDeleteSourceDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateKnowledgeBaseSourceUpdateDetailsItem)) {
            return false;
        }

        UpdateKnowledgeBaseSourceUpdateDetailsItem other = (UpdateKnowledgeBaseSourceUpdateDetailsItem) o;
        return java.util.Objects.equals(this.action, other.action) &&
            java.util.Objects.equals(this.updateKnowledgeBaseAddSourceDetails, other.updateKnowledgeBaseAddSourceDetails) &&
            java.util.Objects.equals(this.updateKnowledgeBaseDeleteSourceDetails, other.updateKnowledgeBaseDeleteSourceDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.updateKnowledgeBaseAddSourceDetails == null ? 43 : this.updateKnowledgeBaseAddSourceDetails.hashCode());
        result = (result * PRIME) + (this.updateKnowledgeBaseDeleteSourceDetails == null ? 43 : this.updateKnowledgeBaseDeleteSourceDetails.hashCode());
        return result;
    }


}
