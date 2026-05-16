// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The detail summary of each model parameter
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelParameterDetail.Builder.class)

public final class ModelParameterDetail  {
    @Deprecated
    @java.beans.ConstructorProperties({"codeGenName", "name", "description"})
    public ModelParameterDetail(String codeGenName, String name, String description) {
        super();
        this.codeGenName = codeGenName;
        this.name = name;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Internal code-friendly name for the parameter
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("codeGenName")
        private String codeGenName;

                /**
         * Internal code-friendly name for the parameter
         * @param codeGenName the value to set
         * @return this builder
         **/
        

        public Builder codeGenName(String codeGenName) {
        this.codeGenName = codeGenName;
        return this;
        }
            /**
     * Human-readable name for the parameter
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Human-readable name for the parameter
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Description of the parameter
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Description of the parameter
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }


        public ModelParameterDetail build() {
            ModelParameterDetail model = new ModelParameterDetail(this.codeGenName
                    , this.name
                    , this.description);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelParameterDetail model) {
                this.codeGenName(model.getCodeGenName());
    this.name(model.getName());
    this.description(model.getDescription());
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
     * Internal code-friendly name for the parameter
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("codeGenName")
    private final String codeGenName;

        /**
     * Internal code-friendly name for the parameter
     * @return the value
     **/
    
    public String getCodeGenName() {
        return codeGenName;
    }


        /**
     * Human-readable name for the parameter
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Human-readable name for the parameter
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description of the parameter
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the parameter
     * @return the value
     **/
    
    public String getDescription() {
        return description;
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
        sb.append("ModelParameterDetail(");
        sb.append("codeGenName=").append(String.valueOf(this.codeGenName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelParameterDetail)) {
            return false;
        }

        ModelParameterDetail other = (ModelParameterDetail) o;
        return java.util.Objects.equals(this.codeGenName, other.codeGenName) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.codeGenName == null ? 43 : this.codeGenName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        return result;
    }


}
