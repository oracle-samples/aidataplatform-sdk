package com.oracle.aidataplatform.dp.model;


/**
 * Specifies the name and value of the output parameter.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OutputParameter.Builder.class)

public final class OutputParameter  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "value"})
    public OutputParameter(String name, String value) {
        super();
        this.name = name;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * The name of the parameter defined by user.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * The name of the parameter defined by user.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Value of the output parameter.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

                /**
         * Value of the output parameter.
         * @param value the value to set
         * @return this builder
         **/
        

        public Builder value(String value) {
        this.value = value;
        return this;
        }


        public OutputParameter build() {
            OutputParameter model = new OutputParameter(this.name
                    , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OutputParameter model) {
                this.name(model.getName());
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
     * The name of the parameter defined by user.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * The name of the parameter defined by user.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Value of the output parameter.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

        /**
     * Value of the output parameter.
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
        sb.append("OutputParameter(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OutputParameter)) {
            return false;
        }

        OutputParameter other = (OutputParameter) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
