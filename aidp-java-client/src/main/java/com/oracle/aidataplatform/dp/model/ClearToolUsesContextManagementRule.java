// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Context management rule for clearing older tool-use outputs.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClearToolUsesContextManagementRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class ClearToolUsesContextManagementRule extends ContextManagementRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("config")
private ClearToolUsesContextManagementDetails config;



public Builder config(ClearToolUsesContextManagementDetails config) {
    this.config = config;
    return this;
}


        public ClearToolUsesContextManagementRule build() {
            ClearToolUsesContextManagementRule model = new ClearToolUsesContextManagementRule(this.config);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClearToolUsesContextManagementRule model) {
                this.config(model.getConfig());
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
    public ClearToolUsesContextManagementRule(ClearToolUsesContextManagementDetails config) {
    super();
        this.config = config;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    private final ClearToolUsesContextManagementDetails config;

    
    public ClearToolUsesContextManagementDetails getConfig() {
        return config;
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
        sb.append("ClearToolUsesContextManagementRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", config=").append(String.valueOf(this.config));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClearToolUsesContextManagementRule)) {
            return false;
        }

        ClearToolUsesContextManagementRule other = (ClearToolUsesContextManagementRule) o;
        return java.util.Objects.equals(this.config, other.config) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.config == null ? 43 : this.config.hashCode());
        return result;
    }


}
