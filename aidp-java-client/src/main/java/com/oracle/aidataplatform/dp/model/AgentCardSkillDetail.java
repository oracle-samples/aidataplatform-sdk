// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A single skill in the publish request.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AgentCardSkillDetail.Builder.class)

public final class AgentCardSkillDetail  {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "description", "tags", "examples"})
    public AgentCardSkillDetail(String id, String name, String description, java.util.List<String> tags, java.util.List<String> examples) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.examples = examples;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique skill identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("id")
private String id;

        /**
         * Unique skill identifier.
         * @param id the value to set
         * @return this builder
         **/
        

public Builder id(String id) {
    this.id = id;
    return this;
}
            /**
     * Display name of the skill.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Display name of the skill.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Description of what the skill does.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of what the skill does.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Optional tags for categorization/search.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tags")
private java.util.List<String> tags;

        /**
         * Optional tags for categorization/search.
         * @param tags the value to set
         * @return this builder
         **/
        

public Builder tags(java.util.List<String> tags) {
    this.tags = tags;
    return this;
}
            /**
     * Optional example prompts for this skill.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("examples")
private java.util.List<String> examples;

        /**
         * Optional example prompts for this skill.
         * @param examples the value to set
         * @return this builder
         **/
        

public Builder examples(java.util.List<String> examples) {
    this.examples = examples;
    return this;
}


        public AgentCardSkillDetail build() {
            AgentCardSkillDetail model = new AgentCardSkillDetail(this.id
                , this.name
                , this.description
                , this.tags
                , this.examples);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentCardSkillDetail model) {
                this.id(model.getId());
    this.name(model.getName());
    this.description(model.getDescription());
    this.tags(model.getTags());
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
     * Unique skill identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

        /**
     * Unique skill identifier.
     * @return the value
     **/
    
    public String getId() {
        return id;
    }


        /**
     * Display name of the skill.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Display name of the skill.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description of what the skill does.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of what the skill does.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Optional tags for categorization/search.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<String> tags;

        /**
     * Optional tags for categorization/search.
     * @return the value
     **/
    
    public java.util.List<String> getTags() {
        return tags;
    }


        /**
     * Optional example prompts for this skill.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("examples")
    private final java.util.List<String> examples;

        /**
     * Optional example prompts for this skill.
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
        sb.append("AgentCardSkillDetail(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", examples=").append(String.valueOf(this.examples));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentCardSkillDetail)) {
            return false;
        }

        AgentCardSkillDetail other = (AgentCardSkillDetail) o;
        return java.util.Objects.equals(this.id, other.id) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.tags, other.tags) &&
            java.util.Objects.equals(this.examples, other.examples);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.examples == null ? 43 : this.examples.hashCode());
        return result;
    }


}
