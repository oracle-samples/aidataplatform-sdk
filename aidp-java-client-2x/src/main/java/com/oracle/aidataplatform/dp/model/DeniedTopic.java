// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Denied topic configuration
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeniedTopic.Builder.class)

public final class DeniedTopic  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "definition", "examples"})
    public DeniedTopic(String name, String definition, java.util.List<String> examples) {
        super();
        this.name = name;
        this.definition = definition;
        this.examples = examples;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name of the denied topic
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Name of the denied topic
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Definition of the denied topic
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("definition")
        private String definition;

                /**
         * Definition of the denied topic
         * @param definition the value to set
         * @return this builder
         **/
        

        public Builder definition(String definition) {
        this.definition = definition;
        return this;
        }
            /**
     * Examples of content that would violate this topic
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("examples")
        private java.util.List<String> examples;

                /**
         * Examples of content that would violate this topic
         * @param examples the value to set
         * @return this builder
         **/
        

        public Builder examples(java.util.List<String> examples) {
        this.examples = examples;
        return this;
        }


        public DeniedTopic build() {
            DeniedTopic model = new DeniedTopic(this.name
                    , this.definition
                    , this.examples);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeniedTopic model) {
                this.name(model.getName());
    this.definition(model.getDefinition());
    this.examples(model.getExamples());
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
     * Name of the denied topic
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the denied topic
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Definition of the denied topic
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("definition")
    private final String definition;

        /**
     * Definition of the denied topic
     * @return the value
     **/
    
    public String getDefinition() {
        return definition;
    }


        /**
     * Examples of content that would violate this topic
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("examples")
    private final java.util.List<String> examples;

        /**
     * Examples of content that would violate this topic
     * @return the value
     **/
    
    public java.util.List<String> getExamples() {
        return examples;
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
        sb.append("DeniedTopic(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", definition=").append(String.valueOf(this.definition));
        sb.append(", examples=").append(String.valueOf(this.examples));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeniedTopic)) {
            return false;
        }

        DeniedTopic other = (DeniedTopic) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.definition, other.definition) &&
            java.util.Objects.equals(this.examples, other.examples);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.definition == null ? 43 : this.definition.hashCode());
        result = (result * PRIME) + (this.examples == null ? 43 : this.examples.hashCode());
        return result;
    }


}
