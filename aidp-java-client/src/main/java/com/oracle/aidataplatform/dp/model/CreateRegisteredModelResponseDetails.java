package com.oracle.aidataplatform.dp.model;



/**
 * Response object for creating a RegisteredModel
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateRegisteredModelResponseDetails.Builder.class)

public final class CreateRegisteredModelResponseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"registeredModel"})
    public CreateRegisteredModelResponseDetails(RegisteredModel registeredModel) {
        super();
        this.registeredModel = registeredModel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("registered_model")
private RegisteredModel registeredModel;



public Builder registeredModel(RegisteredModel registeredModel) {
    this.registeredModel = registeredModel;
    return this;
}


        public CreateRegisteredModelResponseDetails build() {
            CreateRegisteredModelResponseDetails model = new CreateRegisteredModelResponseDetails(this.registeredModel);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRegisteredModelResponseDetails model) {
                this.registeredModel(model.getRegisteredModel());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("registered_model")
    private final RegisteredModel registeredModel;

    
    public RegisteredModel getRegisteredModel() {
        return registeredModel;
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
        sb.append("CreateRegisteredModelResponseDetails(");
        sb.append("registeredModel=").append(String.valueOf(this.registeredModel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRegisteredModelResponseDetails)) {
            return false;
        }

        CreateRegisteredModelResponseDetails other = (CreateRegisteredModelResponseDetails) o;
        return java.util.Objects.equals(this.registeredModel, other.registeredModel);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.registeredModel == null ? 43 : this.registeredModel.hashCode());
        return result;
    }


}
