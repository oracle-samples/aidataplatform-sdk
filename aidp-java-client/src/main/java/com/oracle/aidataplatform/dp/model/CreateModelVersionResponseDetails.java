// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Created ModelVersion details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateModelVersionResponseDetails.Builder.class)

public final class CreateModelVersionResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"modelVersion"})
    public CreateModelVersionResponseDetails(ModelVersion modelVersion) {
        super();
        this.modelVersion = modelVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("model_version")
private ModelVersion modelVersion;



public Builder modelVersion(ModelVersion modelVersion) {
    this.modelVersion = modelVersion;
    return this;
}


        public CreateModelVersionResponseDetails build() {
            CreateModelVersionResponseDetails model = new CreateModelVersionResponseDetails(this.modelVersion);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateModelVersionResponseDetails model) {
                this.modelVersion(model.getModelVersion());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("model_version")
    private final ModelVersion modelVersion;

    
    public ModelVersion getModelVersion() {
        return modelVersion;
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
        sb.append("CreateModelVersionResponseDetails(");
        sb.append("modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateModelVersionResponseDetails)) {
            return false;
        }

        CreateModelVersionResponseDetails other = (CreateModelVersionResponseDetails) o;
        return java.util.Objects.equals(this.modelVersion, other.modelVersion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        return result;
    }


}
