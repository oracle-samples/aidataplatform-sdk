package com.oracle.aidataplatform.dp.model;



/**
 * Tool configurations are set by the agent developer when they create the tool. | The agent does not see those configurations and can NOT modify their values
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RagToolConfiguration.Builder.class)

public final class RagToolConfiguration  {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogKey", "schemaKey", "knowledgeBase", "llm", "modelSettings", "topK"})
    public RagToolConfiguration(String catalogKey, String schemaKey, String knowledgeBase, LlmConfig llm, java.util.Map<String, Object> modelSettings, Integer topK) {
        super();
        this.catalogKey = catalogKey;
        this.schemaKey = schemaKey;
        this.knowledgeBase = knowledgeBase;
        this.llm = llm;
        this.modelSettings = modelSettings;
        this.topK = topK;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Catalog to use for KB tool execution
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
private String catalogKey;

        /**
         * The Catalog to use for KB tool execution
         * @param catalogKey the value to set
         * @return this builder
         **/
        

public Builder catalogKey(String catalogKey) {
    this.catalogKey = catalogKey;
    return this;
}
            /**
     * The Schema to use for KB tool execution
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
private String schemaKey;

        /**
         * The Schema to use for KB tool execution
         * @param schemaKey the value to set
         * @return this builder
         **/
        

public Builder schemaKey(String schemaKey) {
    this.schemaKey = schemaKey;
    return this;
}
            /**
     * The name of the Knowledge Base to use for RAG query
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("knowledgeBase")
private String knowledgeBase;

        /**
         * The name of the Knowledge Base to use for RAG query
         * @param knowledgeBase the value to set
         * @return this builder
         **/
        

public Builder knowledgeBase(String knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("llm")
private LlmConfig llm;



public Builder llm(LlmConfig llm) {
    this.llm = llm;
    return this;
}
            /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("modelSettings")
private java.util.Map<String, Object> modelSettings;

        /**
         * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
         * @param modelSettings the value to set
         * @return this builder
         **/
        

public Builder modelSettings(java.util.Map<String, Object> modelSettings) {
    this.modelSettings = modelSettings;
    return this;
}
            /**
     * Number of top chunks to retrieve from the KB
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("topK")
private Integer topK;

        /**
         * Number of top chunks to retrieve from the KB
         * @param topK the value to set
         * @return this builder
         **/
        

public Builder topK(Integer topK) {
    this.topK = topK;
    return this;
}


        public RagToolConfiguration build() {
            RagToolConfiguration model = new RagToolConfiguration(this.catalogKey
                , this.schemaKey
                , this.knowledgeBase
                , this.llm
                , this.modelSettings
                , this.topK);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RagToolConfiguration model) {
                this.catalogKey(model.getCatalogKey());
    this.schemaKey(model.getSchemaKey());
    this.knowledgeBase(model.getKnowledgeBase());
    this.llm(model.getLlm());
    this.modelSettings(model.getModelSettings());
    this.topK(model.getTopK());
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
     * The Catalog to use for KB tool execution
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogKey")
    private final String catalogKey;

        /**
     * The Catalog to use for KB tool execution
     * @return the value
     **/
    
    public String getCatalogKey() {
        return catalogKey;
    }


        /**
     * The Schema to use for KB tool execution
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("schemaKey")
    private final String schemaKey;

        /**
     * The Schema to use for KB tool execution
     * @return the value
     **/
    
    public String getSchemaKey() {
        return schemaKey;
    }


        /**
     * The name of the Knowledge Base to use for RAG query
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBase")
    private final String knowledgeBase;

        /**
     * The name of the Knowledge Base to use for RAG query
     * @return the value
     **/
    
    public String getKnowledgeBase() {
        return knowledgeBase;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("llm")
    private final LlmConfig llm;

    
    public LlmConfig getLlm() {
        return llm;
    }


        /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("modelSettings")
    private final java.util.Map<String, Object> modelSettings;

        /**
     * Model specific inference parameters such as temperature, top-k, max length, response format, etc.
     * @return the value
     **/
    
    public java.util.Map<String, Object> getModelSettings() {
        return modelSettings;
    }


        /**
     * Number of top chunks to retrieve from the KB
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("topK")
    private final Integer topK;

        /**
     * Number of top chunks to retrieve from the KB
     * @return the value
     **/
    
    public Integer getTopK() {
        return topK;
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
        sb.append("RagToolConfiguration(");
        sb.append("catalogKey=").append(String.valueOf(this.catalogKey));
        sb.append(", schemaKey=").append(String.valueOf(this.schemaKey));
        sb.append(", knowledgeBase=").append(String.valueOf(this.knowledgeBase));
        sb.append(", llm=").append(String.valueOf(this.llm));
        sb.append(", modelSettings=").append(String.valueOf(this.modelSettings));
        sb.append(", topK=").append(String.valueOf(this.topK));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RagToolConfiguration)) {
            return false;
        }

        RagToolConfiguration other = (RagToolConfiguration) o;
        return java.util.Objects.equals(this.catalogKey, other.catalogKey) &&
            java.util.Objects.equals(this.schemaKey, other.schemaKey) &&
            java.util.Objects.equals(this.knowledgeBase, other.knowledgeBase) &&
            java.util.Objects.equals(this.llm, other.llm) &&
            java.util.Objects.equals(this.modelSettings, other.modelSettings) &&
            java.util.Objects.equals(this.topK, other.topK);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogKey == null ? 43 : this.catalogKey.hashCode());
        result = (result * PRIME) + (this.schemaKey == null ? 43 : this.schemaKey.hashCode());
        result = (result * PRIME) + (this.knowledgeBase == null ? 43 : this.knowledgeBase.hashCode());
        result = (result * PRIME) + (this.llm == null ? 43 : this.llm.hashCode());
        result = (result * PRIME) + (this.modelSettings == null ? 43 : this.modelSettings.hashCode());
        result = (result * PRIME) + (this.topK == null ? 43 : this.topK.hashCode());
        return result;
    }


}
