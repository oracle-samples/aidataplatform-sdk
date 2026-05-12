package com.oracle.aidataplatform.dp.model;


/**
 * Request body for creating a new job run for a job in a KnowledgeBase.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateKnowledgeBaseJobRunDetails.Builder.class)

public final class CreateKnowledgeBaseJobRunDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"description"})
    public CreateKnowledgeBaseJobRunDetails(String description) {
        super();
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The description of KB Job
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * The description of KB Job
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }


        public CreateKnowledgeBaseJobRunDetails build() {
            CreateKnowledgeBaseJobRunDetails model = new CreateKnowledgeBaseJobRunDetails(this.description);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateKnowledgeBaseJobRunDetails model) {
                this.description(model.getDescription());
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
     * The description of KB Job
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * The description of KB Job
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
        sb.append("CreateKnowledgeBaseJobRunDetails(");
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateKnowledgeBaseJobRunDetails)) {
            return false;
        }

        CreateKnowledgeBaseJobRunDetails other = (CreateKnowledgeBaseJobRunDetails) o;
        return java.util.Objects.equals(this.description, other.description);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }


}
