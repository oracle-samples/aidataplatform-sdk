// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Configuration details for CLEAR_TOOL_USES context management.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ClearToolUsesContextManagementDetails.Builder.class)

public final class ClearToolUsesContextManagementDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"keepToolMessages"})
    public ClearToolUsesContextManagementDetails(Integer keepToolMessages) {
        super();
        this.keepToolMessages = keepToolMessages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Number of most-recent tool messages to keep unchanged.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("keepToolMessages")
private Integer keepToolMessages;

        /**
         * Number of most-recent tool messages to keep unchanged.
         * @param keepToolMessages the value to set
         * @return this builder
         **/
        

public Builder keepToolMessages(Integer keepToolMessages) {
    this.keepToolMessages = keepToolMessages;
    return this;
}


        public ClearToolUsesContextManagementDetails build() {
            ClearToolUsesContextManagementDetails model = new ClearToolUsesContextManagementDetails(this.keepToolMessages);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClearToolUsesContextManagementDetails model) {
                this.keepToolMessages(model.getKeepToolMessages());
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
     * Number of most-recent tool messages to keep unchanged.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("keepToolMessages")
    private final Integer keepToolMessages;

        /**
     * Number of most-recent tool messages to keep unchanged.
     * @return the value
     **/
    
    public Integer getKeepToolMessages() {
        return keepToolMessages;
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
        sb.append("ClearToolUsesContextManagementDetails(");
        sb.append("keepToolMessages=").append(String.valueOf(this.keepToolMessages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClearToolUsesContextManagementDetails)) {
            return false;
        }

        ClearToolUsesContextManagementDetails other = (ClearToolUsesContextManagementDetails) o;
        return java.util.Objects.equals(this.keepToolMessages, other.keepToolMessages);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keepToolMessages == null ? 43 : this.keepToolMessages.hashCode());
        return result;
    }


}
