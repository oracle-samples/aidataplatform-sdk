package com.oracle.aidataplatform.dp.model;



/**
 * Properties specific to a text file.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TxtFileDefinition.Builder.class)

public final class TxtFileDefinition  {
    @Deprecated
    @java.beans.ConstructorProperties({"delimiter", "quote"})
    public TxtFileDefinition(String delimiter, String quote) {
        super();
        this.delimiter = delimiter;
        this.quote = quote;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Delimiter to be used with text file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("delimiter")
private String delimiter;

        /**
         * Delimiter to be used with text file.
         * @param delimiter the value to set
         * @return this builder
         **/
        

public Builder delimiter(String delimiter) {
    this.delimiter = delimiter;
    return this;
}
            /**
     * Type of quote to be used with text file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("quote")
private String quote;

        /**
         * Type of quote to be used with text file.
         * @param quote the value to set
         * @return this builder
         **/
        

public Builder quote(String quote) {
    this.quote = quote;
    return this;
}


        public TxtFileDefinition build() {
            TxtFileDefinition model = new TxtFileDefinition(this.delimiter
                , this.quote);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TxtFileDefinition model) {
                this.delimiter(model.getDelimiter());
    this.quote(model.getQuote());
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
     * Delimiter to be used with text file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("delimiter")
    private final String delimiter;

        /**
     * Delimiter to be used with text file.
     * @return the value
     **/
    
    public String getDelimiter() {
        return delimiter;
    }


        /**
     * Type of quote to be used with text file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("quote")
    private final String quote;

        /**
     * Type of quote to be used with text file.
     * @return the value
     **/
    
    public String getQuote() {
        return quote;
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
        sb.append("TxtFileDefinition(");
        sb.append("delimiter=").append(String.valueOf(this.delimiter));
        sb.append(", quote=").append(String.valueOf(this.quote));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TxtFileDefinition)) {
            return false;
        }

        TxtFileDefinition other = (TxtFileDefinition) o;
        return java.util.Objects.equals(this.delimiter, other.delimiter) &&
            java.util.Objects.equals(this.quote, other.quote);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.delimiter == null ? 43 : this.delimiter.hashCode());
        result = (result * PRIME) + (this.quote == null ? 43 : this.quote.hashCode());
        return result;
    }


}
