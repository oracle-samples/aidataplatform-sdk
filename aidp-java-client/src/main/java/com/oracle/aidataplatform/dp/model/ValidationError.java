package com.oracle.aidataplatform.dp.model;



/**
 * Validation error for a component in agent flow diagram.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ValidationError.Builder.class)

public final class ValidationError  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "message", "name", "key"})
    public ValidationError(String type, String message, String name, String key) {
        super();
        this.type = type;
        this.message = message;
        this.name = name;
        this.key = key;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Type of error.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private String type;

        /**
         * Type of error.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(String type) {
    this.type = type;
    return this;
}
            /**
     * Error message.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("message")
private String message;

        /**
         * Error message.
         * @param message the value to set
         * @return this builder
         **/
        

public Builder message(String message) {
    this.message = message;
    return this;
}
            /**
     * Error name
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Error name
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Id of the component that caused the error
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Id of the component that caused the error
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}


        public ValidationError build() {
            ValidationError model = new ValidationError(this.type
                , this.message
                , this.name
                , this.key);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidationError model) {
                this.type(model.getType());
    this.message(model.getMessage());
    this.name(model.getName());
    this.key(model.getKey());
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
     * Type of error.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

        /**
     * Type of error.
     * @return the value
     **/
    
    public String getType() {
        return type;
    }


        /**
     * Error message.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

        /**
     * Error message.
     * @return the value
     **/
    
    public String getMessage() {
        return message;
    }


        /**
     * Error name
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Error name
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Id of the component that caused the error
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Id of the component that caused the error
     * @return the value
     **/
    
    public String getKey() {
        return key;
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
        sb.append("ValidationError(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidationError)) {
            return false;
        }

        ValidationError other = (ValidationError) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.message, other.message) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.key, other.key);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        return result;
    }


}
