package com.oracle.aidataplatform.dp.model;



/**
 * A single feature and its value.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Feature.Builder.class)

public final class Feature  {
    @Deprecated
    @java.beans.ConstructorProperties({"featureName", "value"})
    public Feature(String featureName, String value) {
        super();
        this.featureName = featureName;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The name of the queried feature.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("featureName")
private String featureName;

        /**
         * The name of the queried feature.
         * @param featureName the value to set
         * @return this builder
         **/
        

public Builder featureName(String featureName) {
    this.featureName = featureName;
    return this;
}
            /**
     * The status value of the feature.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("value")
private String value;

        /**
         * The status value of the feature.
         * @param value the value to set
         * @return this builder
         **/
        

public Builder value(String value) {
    this.value = value;
    return this;
}


        public Feature build() {
            Feature model = new Feature(this.featureName
                , this.value);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Feature model) {
                this.featureName(model.getFeatureName());
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
     * The name of the queried feature.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("featureName")
    private final String featureName;

        /**
     * The name of the queried feature.
     * @return the value
     **/
    
    public String getFeatureName() {
        return featureName;
    }


        /**
     * The status value of the feature.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

        /**
     * The status value of the feature.
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
        sb.append("Feature(");
        sb.append("featureName=").append(String.valueOf(this.featureName));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Feature)) {
            return false;
        }

        Feature other = (Feature) o;
        return java.util.Objects.equals(this.featureName, other.featureName) &&
            java.util.Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.featureName == null ? 43 : this.featureName.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }


}
