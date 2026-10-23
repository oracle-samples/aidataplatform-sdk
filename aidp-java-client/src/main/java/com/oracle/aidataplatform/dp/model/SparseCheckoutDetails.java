// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Sparse checkout configuration for a git repository. Only cone mode is supported. Specify only when creating a sparse git folder; sparse checkout cannot be enabled later for a non-sparse git folder. For sparse git folders, settings updates can change cone folder patterns but cannot enable or disable sparse checkout.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SparseCheckoutDetails.Builder.class)

public final class SparseCheckoutDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"patterns", "mode"})
    public SparseCheckoutDetails(java.util.List<String> patterns, Mode mode) {
        super();
        this.patterns = patterns;
        this.mode = mode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("patterns")
private java.util.List<String> patterns;

        /**
         * Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.
         * @param patterns the value to set
         * @return this builder
         **/
        

public Builder patterns(java.util.List<String> patterns) {
    this.patterns = patterns;
    return this;
}
            /**
     * Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("mode")
private Mode mode;

        /**
         * Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only.
         * @param mode the value to set
         * @return this builder
         **/
        

public Builder mode(Mode mode) {
    this.mode = mode;
    return this;
}


        public SparseCheckoutDetails build() {
            SparseCheckoutDetails model = new SparseCheckoutDetails(this.patterns
                , this.mode);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SparseCheckoutDetails model) {
                this.patterns(model.getPatterns());
    this.mode(model.getMode());
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
     * Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("patterns")
    private final java.util.List<String> patterns;

        /**
     * Repository-root-relative folder paths to include in the sparse worktree. Cone patterns apply only to folders; root-level files in the repository are always materialized. Empty or omitted patterns materialize root-level files only.
     * @return the value
     **/
    
    public java.util.List<String> getPatterns() {
        return patterns;
    }

    /**
     * Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only.
     **/
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        Cone("CONE"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Mode.class);

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'Mode', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

        /**
     * Sparse checkout matching mode. Git supports cone and non-cone sparse checkout pattern styles; AIDP supports cone mode only.
     * @return the value
     **/
    
    public Mode getMode() {
        return mode;
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
        sb.append("SparseCheckoutDetails(");
        sb.append("patterns=").append(String.valueOf(this.patterns));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SparseCheckoutDetails)) {
            return false;
        }

        SparseCheckoutDetails other = (SparseCheckoutDetails) o;
        return java.util.Objects.equals(this.patterns, other.patterns) &&
            java.util.Objects.equals(this.mode, other.mode);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.patterns == null ? 43 : this.patterns.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        return result;
    }


}
