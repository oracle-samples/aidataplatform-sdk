package com.oracle.aidataplatform.dp.model;


/**
 * The list of allowed tool names allowed on an MCP server.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AllowedToolDetails.Builder.class)

public final class AllowedToolDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"instruction", "argOverrides", "tool"})
    public AllowedToolDetails(String instruction, java.util.Map<String, String> argOverrides, McpToolObject tool) {
        super();
        this.instruction = instruction;
        this.argOverrides = argOverrides;
        this.tool = tool;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * custom instruction for tool
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("instruction")
        private String instruction;

                /**
         * custom instruction for tool
         * @param instruction the value to set
         * @return this builder
         **/
        

        public Builder instruction(String instruction) {
        this.instruction = instruction;
        return this;
        }
            /**
     * Map of parameter names to their default string values.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("argOverrides")
        private java.util.Map<String, String> argOverrides;

                /**
         * Map of parameter names to their default string values.
         * @param argOverrides the value to set
         * @return this builder
         **/
        

        public Builder argOverrides(java.util.Map<String, String> argOverrides) {
        this.argOverrides = argOverrides;
        return this;
        }
        
        @com.fasterxml.jackson.annotation.JsonProperty("tool")
        private McpToolObject tool;

        

        public Builder tool(McpToolObject tool) {
        this.tool = tool;
        return this;
        }


        public AllowedToolDetails build() {
            AllowedToolDetails model = new AllowedToolDetails(this.instruction
                    , this.argOverrides
                    , this.tool);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedToolDetails model) {
                this.instruction(model.getInstruction());
    this.argOverrides(model.getArgOverrides());
    this.tool(model.getTool());
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
     * custom instruction for tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("instruction")
    private final String instruction;

        /**
     * custom instruction for tool
     * @return the value
     **/
    
    public String getInstruction() {
        return instruction;
    }


        /**
     * Map of parameter names to their default string values.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("argOverrides")
    private final java.util.Map<String, String> argOverrides;

        /**
     * Map of parameter names to their default string values.
     * @return the value
     **/
    
    public java.util.Map<String, String> getArgOverrides() {
        return argOverrides;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("tool")
    private final McpToolObject tool;

    
    public McpToolObject getTool() {
        return tool;
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
        sb.append("AllowedToolDetails(");
        sb.append("instruction=").append(String.valueOf(this.instruction));
        sb.append(", argOverrides=").append(String.valueOf(this.argOverrides));
        sb.append(", tool=").append(String.valueOf(this.tool));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllowedToolDetails)) {
            return false;
        }

        AllowedToolDetails other = (AllowedToolDetails) o;
        return java.util.Objects.equals(this.instruction, other.instruction) &&
            java.util.Objects.equals(this.argOverrides, other.argOverrides) &&
            java.util.Objects.equals(this.tool, other.tool);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instruction == null ? 43 : this.instruction.hashCode());
        result = (result * PRIME) + (this.argOverrides == null ? 43 : this.argOverrides.hashCode());
        result = (result * PRIME) + (this.tool == null ? 43 : this.tool.hashCode());
        return result;
    }


}
