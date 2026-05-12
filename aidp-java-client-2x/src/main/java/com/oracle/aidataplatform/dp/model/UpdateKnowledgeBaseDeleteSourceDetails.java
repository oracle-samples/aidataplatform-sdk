package com.oracle.aidataplatform.dp.model;


/**
 * The information about a source to be delete from a KnowledgeBase
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UpdateKnowledgeBaseDeleteSourceDetails.Builder.class)

public final class UpdateKnowledgeBaseDeleteSourceDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "type"})
    public UpdateKnowledgeBaseDeleteSourceDetails(String name, KnowledgeBaseSourceType type) {
        super();
        this.name = name;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * name for source
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * name for source
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * The type of source
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private KnowledgeBaseSourceType type;

                /**
         * The type of source
         * @param type the value to set
         * @return this builder
         **/
        

        public Builder type(KnowledgeBaseSourceType type) {
        this.type = type;
        return this;
        }


        public UpdateKnowledgeBaseDeleteSourceDetails build() {
            UpdateKnowledgeBaseDeleteSourceDetails model = new UpdateKnowledgeBaseDeleteSourceDetails(this.name
                    , this.type);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateKnowledgeBaseDeleteSourceDetails model) {
                this.name(model.getName());
    this.type(model.getType());
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
     * name for source
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * name for source
     * @return the value
     **/
    
    public String getName() {
        return name;
    }

    
        /**
     * The type of source
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final KnowledgeBaseSourceType type;

        /**
     * The type of source
     * @return the value
     **/
    
    public KnowledgeBaseSourceType getType() {
        return type;
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
        sb.append("UpdateKnowledgeBaseDeleteSourceDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateKnowledgeBaseDeleteSourceDetails)) {
            return false;
        }

        UpdateKnowledgeBaseDeleteSourceDetails other = (UpdateKnowledgeBaseDeleteSourceDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        return result;
    }


}
