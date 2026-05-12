package com.oracle.aidataplatform.dp.model;


/**
 * Result from custom tool execution in MCP format.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CustomResult.Builder.class)

public final class CustomResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"content", "structuredContent", "isError", "toolName"})
    public CustomResult(java.util.List<java.util.Map<String, Object>> content, java.util.Map<String, Object> structuredContent, Boolean isError, String toolName) {
        super();
        this.content = content;
        this.structuredContent = structuredContent;
        this.isError = isError;
        this.toolName = toolName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * MCP-formatted content blocks
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private java.util.List<java.util.Map<String, Object>> content;

                /**
         * MCP-formatted content blocks
         * @param content the value to set
         * @return this builder
         **/
        

        public Builder content(java.util.List<java.util.Map<String, Object>> content) {
        this.content = content;
        return this;
        }
            /**
     * Structured result data
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("structuredContent")
        private java.util.Map<String, Object> structuredContent;

                /**
         * Structured result data
         * @param structuredContent the value to set
         * @return this builder
         **/
        

        public Builder structuredContent(java.util.Map<String, Object> structuredContent) {
        this.structuredContent = structuredContent;
        return this;
        }
            /**
     * Whether the result represents an error
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isError")
        private Boolean isError;

                /**
         * Whether the result represents an error
         * @param isError the value to set
         * @return this builder
         **/
        

        public Builder isError(Boolean isError) {
        this.isError = isError;
        return this;
        }
            /**
     * Name of the executed tool
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("toolName")
        private String toolName;

                /**
         * Name of the executed tool
         * @param toolName the value to set
         * @return this builder
         **/
        

        public Builder toolName(String toolName) {
        this.toolName = toolName;
        return this;
        }


        public CustomResult build() {
            CustomResult model = new CustomResult(this.content
                    , this.structuredContent
                    , this.isError
                    , this.toolName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomResult model) {
                this.content(model.getContent());
    this.structuredContent(model.getStructuredContent());
    this.isError(model.getIsError());
    this.toolName(model.getToolName());
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
     * MCP-formatted content blocks
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final java.util.List<java.util.Map<String, Object>> content;

        /**
     * MCP-formatted content blocks
     * @return the value
     **/
    
    public java.util.List<java.util.Map<String, Object>> getContent() {
        return content;
    }


        /**
     * Structured result data
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("structuredContent")
    private final java.util.Map<String, Object> structuredContent;

        /**
     * Structured result data
     * @return the value
     **/
    
    public java.util.Map<String, Object> getStructuredContent() {
        return structuredContent;
    }


        /**
     * Whether the result represents an error
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isError")
    private final Boolean isError;

        /**
     * Whether the result represents an error
     * @return the value
     **/
    
    public Boolean getIsError() {
        return isError;
    }


        /**
     * Name of the executed tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toolName")
    private final String toolName;

        /**
     * Name of the executed tool
     * @return the value
     **/
    
    public String getToolName() {
        return toolName;
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
        sb.append("CustomResult(");
        sb.append("content=").append(String.valueOf(this.content));
        sb.append(", structuredContent=").append(String.valueOf(this.structuredContent));
        sb.append(", isError=").append(String.valueOf(this.isError));
        sb.append(", toolName=").append(String.valueOf(this.toolName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomResult)) {
            return false;
        }

        CustomResult other = (CustomResult) o;
        return java.util.Objects.equals(this.content, other.content) &&
            java.util.Objects.equals(this.structuredContent, other.structuredContent) &&
            java.util.Objects.equals(this.isError, other.isError) &&
            java.util.Objects.equals(this.toolName, other.toolName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.structuredContent == null ? 43 : this.structuredContent.hashCode());
        result = (result * PRIME) + (this.isError == null ? 43 : this.isError.hashCode());
        result = (result * PRIME) + (this.toolName == null ? 43 : this.toolName.hashCode());
        return result;
    }


}
