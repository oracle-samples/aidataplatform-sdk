package com.oracle.aidataplatform.dp.model;



/**
 * Generated text info for prompt result.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PromptResult.Builder.class)

public final class PromptResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "data"})
    public PromptResult(String type, String data) {
        super();
        this.type = type;
        this.data = data;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Format of the prompt result (e.g., "text", "markdown", "image").
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Format of the prompt result (e.g., "text", "markdown", "image").
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * The generated content from the prompt.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("data")
private String data;

        /**
         * The generated content from the prompt.
         * @param data the value to set
         * @return this builder
         **/
        

public Builder data(String data) {
    this.data = data;
    return this;
}


        public PromptResult build() {
            PromptResult model = new PromptResult(this.type
                , this.data);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PromptResult model) {
                this.type(model.getType());
    this.data(model.getData());
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
     * Format of the prompt result (e.g., "text", "markdown", "image").
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Format of the prompt result (e.g., "text", "markdown", "image").
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * The generated content from the prompt.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

        /**
     * The generated content from the prompt.
     * @return the value
     **/
    
    public String getData() {
        return data;
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
        sb.append("PromptResult(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PromptResult)) {
            return false;
        }

        PromptResult other = (PromptResult) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        return result;
    }


}
