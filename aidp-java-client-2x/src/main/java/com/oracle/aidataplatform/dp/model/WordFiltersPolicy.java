// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Word filters safety policy
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=WordFiltersPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="policyType")

public final class WordFiltersPolicy extends SafetyPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("policyName")
        private String policyName;

            public Builder policyName(String policyName) {
            this.policyName = policyName;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("policyDescription")
        private String policyDescription;

            public Builder policyDescription(String policyDescription) {
            this.policyDescription = policyDescription;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private PolicyScope scope;

            public Builder scope(PolicyScope scope) {
            this.scope = scope;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private PolicyAction action;

            public Builder action(PolicyAction action) {
            this.action = action;
            return this;
            }
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private Float threshold;

            public Builder threshold(Float threshold) {
            this.threshold = threshold;
            return this;
            }
            /**
     * List of banned words or regex patterns
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("words")
        private java.util.List<String> words;

                /**
         * List of banned words or regex patterns
         * @param words the value to set
         * @return this builder
         **/
        

        public Builder words(java.util.List<String> words) {
        this.words = words;
        return this;
        }
            /**
     * List of regex patterns to filter
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("regexPatterns")
        private java.util.List<String> regexPatterns;

                /**
         * List of regex patterns to filter
         * @param regexPatterns the value to set
         * @return this builder
         **/
        

        public Builder regexPatterns(java.util.List<String> regexPatterns) {
        this.regexPatterns = regexPatterns;
        return this;
        }


        public WordFiltersPolicy build() {
            WordFiltersPolicy model = new WordFiltersPolicy(this.policyName
                    , this.policyDescription
                    , this.scope
                    , this.action
                    , this.threshold
                    , this.words
                    , this.regexPatterns);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WordFiltersPolicy model) {
                this.policyName(model.getPolicyName());
    this.policyDescription(model.getPolicyDescription());
    this.scope(model.getScope());
    this.action(model.getAction());
    this.threshold(model.getThreshold());
    this.words(model.getWords());
    this.regexPatterns(model.getRegexPatterns());
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

    
    @Deprecated
    public WordFiltersPolicy(String policyName, String policyDescription, PolicyScope scope, PolicyAction action, Float threshold, java.util.List<String> words, java.util.List<String> regexPatterns) {
        super(policyName, policyDescription, scope, action, threshold);
        this.words = words;
        this.regexPatterns = regexPatterns;
    }


        /**
     * List of banned words or regex patterns
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("words")
    private final java.util.List<String> words;

        /**
     * List of banned words or regex patterns
     * @return the value
     **/
    
    public java.util.List<String> getWords() {
        return words;
    }


        /**
     * List of regex patterns to filter
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("regexPatterns")
    private final java.util.List<String> regexPatterns;

        /**
     * List of regex patterns to filter
     * @return the value
     **/
    
    public java.util.List<String> getRegexPatterns() {
        return regexPatterns;
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
        sb.append("WordFiltersPolicy(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", words=").append(String.valueOf(this.words));
        sb.append(", regexPatterns=").append(String.valueOf(this.regexPatterns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WordFiltersPolicy)) {
            return false;
        }

        WordFiltersPolicy other = (WordFiltersPolicy) o;
        return java.util.Objects.equals(this.words, other.words) &&
            java.util.Objects.equals(this.regexPatterns, other.regexPatterns) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.words == null ? 43 : this.words.hashCode());
        result = (result * PRIME) + (this.regexPatterns == null ? 43 : this.regexPatterns.hashCode());
        return result;
    }


}
