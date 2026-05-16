// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * The data to rename a RegisteredModel.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=RenameRegisteredModelDetails.Builder.class)

public final class RenameRegisteredModelDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "newName"})
    public RenameRegisteredModelDetails(String name, String newName) {
        super();
        this.name = name;
        this.newName = newName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Current name of the registered model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Current name of the registered model.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * New name for the registered model.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("new_name")
        private String newName;

                /**
         * New name for the registered model.
         * @param newName the value to set
         * @return this builder
         **/
        

        public Builder newName(String newName) {
        this.newName = newName;
        return this;
        }


        public RenameRegisteredModelDetails build() {
            RenameRegisteredModelDetails model = new RenameRegisteredModelDetails(this.name
                    , this.newName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameRegisteredModelDetails model) {
                this.name(model.getName());
    this.newName(model.getNewName());
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
     * Current name of the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Current name of the registered model.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * New name for the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("new_name")
    private final String newName;

        /**
     * New name for the registered model.
     * @return the value
     **/
    
    public String getNewName() {
        return newName;
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
        sb.append("RenameRegisteredModelDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", newName=").append(String.valueOf(this.newName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RenameRegisteredModelDetails)) {
            return false;
        }

        RenameRegisteredModelDetails other = (RenameRegisteredModelDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.newName, other.newName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.newName == null ? 43 : this.newName.hashCode());
        return result;
    }


}
