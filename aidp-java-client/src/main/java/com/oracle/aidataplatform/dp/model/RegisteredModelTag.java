package com.oracle.aidataplatform.dp.model;



/**
 * Tag for the registered model.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RegisteredModelTag.Builder.class)

public final class RegisteredModelTag  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "value"})
    public RegisteredModelTag(String key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Key of the registered model tag.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Key of the registered model tag.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Value of the registered model tag.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("value")
private String value;

        /**
         * Value of the registered model tag.
         * @param value the value to set
         * @return this builder
         **/
        

public Builder value(String value) {
    this.value = value;
    return this;
}


        public RegisteredModelTag build() {
            RegisteredModelTag model = new RegisteredModelTag(this.key
                , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegisteredModelTag model) {
                this.key(model.getKey());
    this.value(model.getValue());
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
     * Key of the registered model tag.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Key of the registered model tag.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Value of the registered model tag.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

        /**
     * Value of the registered model tag.
     * @return the value
     **/
    
    public String getValue() {
        return value;
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
        sb.append("RegisteredModelTag(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegisteredModelTag)) {
            return false;
        }

        RegisteredModelTag other = (RegisteredModelTag) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
