package com.oracle.aidataplatform.dp.model;


/**
 * Response when toolType = RAG.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RagTestToolResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType")

public final class RagTestToolResult extends TestToolResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private RagResult result;

        

        public Builder result(RagResult result) {
        this.result = result;
        return this;
        }


        public RagTestToolResult build() {
            RagTestToolResult model = new RagTestToolResult(this.result);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RagTestToolResult model) {
                this.result(model.getResult());
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

    
    @Deprecated
    public RagTestToolResult(RagResult result) {
        super();
        this.result = result;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final RagResult result;

    
    public RagResult getResult() {
        return result;
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
        sb.append("RagTestToolResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RagTestToolResult)) {
            return false;
        }

        RagTestToolResult other = (RagTestToolResult) o;
        return java.util.Objects.equals(this.result, other.result) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        return result;
    }


}
