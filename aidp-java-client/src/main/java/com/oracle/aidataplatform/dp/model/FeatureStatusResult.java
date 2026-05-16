// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Model representing the response for checking the status of a single feature.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=FeatureStatusResult.Builder.class)

public final class FeatureStatusResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"feature"})
    public FeatureStatusResult(Feature feature) {
        super();
        this.feature = feature;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("feature")
private Feature feature;



public Builder feature(Feature feature) {
    this.feature = feature;
    return this;
}


        public FeatureStatusResult build() {
            FeatureStatusResult model = new FeatureStatusResult(this.feature);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FeatureStatusResult model) {
                this.feature(model.getFeature());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("feature")
    private final Feature feature;

    
    public Feature getFeature() {
        return feature;
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
        sb.append("FeatureStatusResult(");
        sb.append("feature=").append(String.valueOf(this.feature));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FeatureStatusResult)) {
            return false;
        }

        FeatureStatusResult other = (FeatureStatusResult) o;
        return java.util.Objects.equals(this.feature, other.feature);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.feature == null ? 43 : this.feature.hashCode());
        return result;
    }


}
