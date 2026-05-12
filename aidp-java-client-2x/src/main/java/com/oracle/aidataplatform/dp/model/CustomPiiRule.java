package com.oracle.aidataplatform.dp.model;


/**
 * Custom PII detection rule
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CustomPiiRule.Builder.class)

public final class CustomPiiRule  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "pattern", "prefix", "suffix", "isCaseSensitive", "maxDistance", "priority"})
    public CustomPiiRule(String name, String pattern, String prefix, String suffix, Boolean isCaseSensitive, Integer maxDistance, Integer priority) {
        super();
        this.name = name;
        this.pattern = pattern;
        this.prefix = prefix;
        this.suffix = suffix;
        this.isCaseSensitive = isCaseSensitive;
        this.maxDistance = maxDistance;
        this.priority = priority;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name of the custom rule
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Name of the custom rule
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Regex pattern for detection
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

                /**
         * Regex pattern for detection
         * @param pattern the value to set
         * @return this builder
         **/
        

        public Builder pattern(String pattern) {
        this.pattern = pattern;
        return this;
        }
            /**
     * Prefix pattern to match
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

                /**
         * Prefix pattern to match
         * @param prefix the value to set
         * @return this builder
         **/
        

        public Builder prefix(String prefix) {
        this.prefix = prefix;
        return this;
        }
            /**
     * Suffix pattern to match
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("suffix")
        private String suffix;

                /**
         * Suffix pattern to match
         * @param suffix the value to set
         * @return this builder
         **/
        

        public Builder suffix(String suffix) {
        this.suffix = suffix;
        return this;
        }
            /**
     * Whether the pattern is case sensitive
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
        private Boolean isCaseSensitive;

                /**
         * Whether the pattern is case sensitive
         * @param isCaseSensitive the value to set
         * @return this builder
         **/
        

        public Builder isCaseSensitive(Boolean isCaseSensitive) {
        this.isCaseSensitive = isCaseSensitive;
        return this;
        }
            /**
     * Maximum distance for pattern matching
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("maxDistance")
        private Integer maxDistance;

                /**
         * Maximum distance for pattern matching
         * @param maxDistance the value to set
         * @return this builder
         **/
        

        public Builder maxDistance(Integer maxDistance) {
        this.maxDistance = maxDistance;
        return this;
        }
            /**
     * Priority of this rule
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

                /**
         * Priority of this rule
         * @param priority the value to set
         * @return this builder
         **/
        

        public Builder priority(Integer priority) {
        this.priority = priority;
        return this;
        }


        public CustomPiiRule build() {
            CustomPiiRule model = new CustomPiiRule(this.name
                    , this.pattern
                    , this.prefix
                    , this.suffix
                    , this.isCaseSensitive
                    , this.maxDistance
                    , this.priority);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomPiiRule model) {
                this.name(model.getName());
    this.pattern(model.getPattern());
    this.prefix(model.getPrefix());
    this.suffix(model.getSuffix());
    this.isCaseSensitive(model.getIsCaseSensitive());
    this.maxDistance(model.getMaxDistance());
    this.priority(model.getPriority());
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
     * Name of the custom rule
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the custom rule
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Regex pattern for detection
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

        /**
     * Regex pattern for detection
     * @return the value
     **/
    
    public String getPattern() {
        return pattern;
    }


        /**
     * Prefix pattern to match
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

        /**
     * Prefix pattern to match
     * @return the value
     **/
    
    public String getPrefix() {
        return prefix;
    }


        /**
     * Suffix pattern to match
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("suffix")
    private final String suffix;

        /**
     * Suffix pattern to match
     * @return the value
     **/
    
    public String getSuffix() {
        return suffix;
    }


        /**
     * Whether the pattern is case sensitive
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
    private final Boolean isCaseSensitive;

        /**
     * Whether the pattern is case sensitive
     * @return the value
     **/
    
    public Boolean getIsCaseSensitive() {
        return isCaseSensitive;
    }


        /**
     * Maximum distance for pattern matching
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("maxDistance")
    private final Integer maxDistance;

        /**
     * Maximum distance for pattern matching
     * @return the value
     **/
    
    public Integer getMaxDistance() {
        return maxDistance;
    }


        /**
     * Priority of this rule
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

        /**
     * Priority of this rule
     * @return the value
     **/
    
    public Integer getPriority() {
        return priority;
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
        sb.append("CustomPiiRule(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", suffix=").append(String.valueOf(this.suffix));
        sb.append(", isCaseSensitive=").append(String.valueOf(this.isCaseSensitive));
        sb.append(", maxDistance=").append(String.valueOf(this.maxDistance));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomPiiRule)) {
            return false;
        }

        CustomPiiRule other = (CustomPiiRule) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.pattern, other.pattern) &&
            java.util.Objects.equals(this.prefix, other.prefix) &&
            java.util.Objects.equals(this.suffix, other.suffix) &&
            java.util.Objects.equals(this.isCaseSensitive, other.isCaseSensitive) &&
            java.util.Objects.equals(this.maxDistance, other.maxDistance) &&
            java.util.Objects.equals(this.priority, other.priority);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.suffix == null ? 43 : this.suffix.hashCode());
        result = (result * PRIME) + (this.isCaseSensitive == null ? 43 : this.isCaseSensitive.hashCode());
        result = (result * PRIME) + (this.maxDistance == null ? 43 : this.maxDistance.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        return result;
    }


}
