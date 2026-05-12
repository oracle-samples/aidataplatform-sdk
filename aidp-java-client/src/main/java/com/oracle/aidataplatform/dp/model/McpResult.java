package com.oracle.aidataplatform.dp.model;



/**
 * Generated text info for mcp result.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=McpResult.Builder.class)

public final class McpResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"data"})
    public McpResult(String data) {
        super();
        this.data = data;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The generated content from the mcp.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("data")
private String data;

        /**
         * The generated content from the mcp.
         * @param data the value to set
         * @return this builder
         **/
        

public Builder data(String data) {
    this.data = data;
    return this;
}


        public McpResult build() {
            McpResult model = new McpResult(this.data);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(McpResult model) {
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
     * The generated content from the mcp.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

        /**
     * The generated content from the mcp.
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
        sb.append("McpResult(");
        sb.append("data=").append(String.valueOf(this.data));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof McpResult)) {
            return false;
        }

        McpResult other = (McpResult) o;
        return java.util.Objects.equals(this.data, other.data);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        return result;
    }


}
