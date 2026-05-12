package com.oracle.aidataplatform.dp.model;


/**
 * Result of validating bundle structure/resources. Contains status and lists of error or warning messages.
* 
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BundleValidationResult.Builder.class)

public final class BundleValidationResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "errors", "warnings"})
    public BundleValidationResult(Status status, java.util.List<String> errors, java.util.List<String> warnings) {
        super();
        this.status = status;
        this.errors = errors;
        this.warnings = warnings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Validation status.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

                /**
         * Validation status.
         * @param status the value to set
         * @return this builder
         **/
        

        public Builder status(Status status) {
        this.status = status;
        return this;
        }
            /**
     * List of validation error messages.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<String> errors;

                /**
         * List of validation error messages.
         * @param errors the value to set
         * @return this builder
         **/
        

        public Builder errors(java.util.List<String> errors) {
        this.errors = errors;
        return this;
        }
            /**
     * List of validation warning messages.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("warnings")
        private java.util.List<String> warnings;

                /**
         * List of validation warning messages.
         * @param warnings the value to set
         * @return this builder
         **/
        

        public Builder warnings(java.util.List<String> warnings) {
        this.warnings = warnings;
        return this;
        }


        public BundleValidationResult build() {
            BundleValidationResult model = new BundleValidationResult(this.status
                    , this.errors
                    , this.warnings);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BundleValidationResult model) {
                this.status(model.getStatus());
    this.errors(model.getErrors());
    this.warnings(model.getWarnings());
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
     * Validation status.
     **/
    public enum Status {
        Valid("VALID"),
        Invalid("INVALID"),
        Warnings("WARNINGS"),
        ;

        

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
        /**
     * Validation status.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

        /**
     * Validation status.
     * @return the value
     **/
    
    public Status getStatus() {
        return status;
    }


        /**
     * List of validation error messages.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<String> errors;

        /**
     * List of validation error messages.
     * @return the value
     **/
    
    public java.util.List<String> getErrors() {
        return errors;
    }


        /**
     * List of validation warning messages.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("warnings")
    private final java.util.List<String> warnings;

        /**
     * List of validation warning messages.
     * @return the value
     **/
    
    public java.util.List<String> getWarnings() {
        return warnings;
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
        sb.append("BundleValidationResult(");
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", errors=").append(String.valueOf(this.errors));
        sb.append(", warnings=").append(String.valueOf(this.warnings));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BundleValidationResult)) {
            return false;
        }

        BundleValidationResult other = (BundleValidationResult) o;
        return java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.errors, other.errors) &&
            java.util.Objects.equals(this.warnings, other.warnings);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + (this.warnings == null ? 43 : this.warnings.hashCode());
        return result;
    }


}
