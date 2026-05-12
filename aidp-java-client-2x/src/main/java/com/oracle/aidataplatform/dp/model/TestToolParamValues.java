package com.oracle.aidataplatform.dp.model;


/**
 * Named parameters and their values for the test action.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TestToolParamValues.Builder.class)

public final class TestToolParamValues  {
    @Deprecated
    @java.beans.ConstructorProperties({"values"})
    public TestToolParamValues(java.util.Map<String, String> values) {
        super();
        this.values = values;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Map of parameter names to their string values.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.Map<String, String> values;

                /**
         * Map of parameter names to their string values.
         * @param values the value to set
         * @return this builder
         **/
        

        public Builder values(java.util.Map<String, String> values) {
        this.values = values;
        return this;
        }


        public TestToolParamValues build() {
            TestToolParamValues model = new TestToolParamValues(this.values);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestToolParamValues model) {
                this.values(model.getValues());
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
     * Map of parameter names to their string values.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.Map<String, String> values;

        /**
     * Map of parameter names to their string values.
     * @return the value
     **/
    
    public java.util.Map<String, String> getValues() {
        return values;
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
        sb.append("TestToolParamValues(");
        sb.append("values=").append(String.valueOf(this.values));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestToolParamValues)) {
            return false;
        }

        TestToolParamValues other = (TestToolParamValues) o;
        return java.util.Objects.equals(this.values, other.values);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        return result;
    }


}
