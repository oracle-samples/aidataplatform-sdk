// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * A single feature summary and its value.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FeatureStatusSummary.Builder.class)

public final class FeatureStatusSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"featureName", "value", "error"})
    public FeatureStatusSummary(String featureName, String value, String error) {
        super();
        this.featureName = featureName;
        this.value = value;
        this.error = error;
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
            /**
     * Error message, if error with featureName like unsupported.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private String error;

                /**
         * Error message, if error with featureName like unsupported.
         * @param error the value to set
         * @return this builder
         **/
        

        public Builder error(String error) {
        this.error = error;
        return this;
        }


        public FeatureStatusSummary build() {
            FeatureStatusSummary model = new FeatureStatusSummary(this.featureName
                    , this.value
                    , this.error);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FeatureStatusSummary model) {
                this.featureName(model.getFeatureName());
    this.value(model.getValue());
    this.error(model.getError());
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


        /**
     * Error message, if error with featureName like unsupported.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final String error;

        /**
     * Error message, if error with featureName like unsupported.
     * @return the value
     **/
    
    public String getError() {
        return error;
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
        sb.append("FeatureStatusSummary(");
        sb.append("featureName=").append(String.valueOf(this.featureName));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FeatureStatusSummary)) {
            return false;
        }

        FeatureStatusSummary other = (FeatureStatusSummary) o;
        return java.util.Objects.equals(this.featureName, other.featureName) &&
            java.util.Objects.equals(this.value, other.value) &&
            java.util.Objects.equals(this.error, other.error);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.featureName == null ? 43 : this.featureName.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        return result;
    }


}
