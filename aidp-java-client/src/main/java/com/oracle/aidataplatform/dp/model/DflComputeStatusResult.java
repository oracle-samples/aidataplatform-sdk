// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Status of DI Agent enablement and managed compute lifecycle for an AI Data Platform instance.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DflComputeStatusResult.Builder.class)

public final class DflComputeStatusResult  {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "lifecycleState", "enablementStatus", "statusDetails"})
    public DflComputeStatusResult(Boolean isEnabled, Cluster.State lifecycleState, String enablementStatus, String statusDetails) {
        super();
        this.isEnabled = isEnabled;
        this.lifecycleState = lifecycleState;
        this.enablementStatus = enablementStatus;
        this.statusDetails = statusDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether DI Agent enablement is enabled for the AI Data Platform instance.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
private Boolean isEnabled;

        /**
         * Whether DI Agent enablement is enabled for the AI Data Platform instance.
         * @param isEnabled the value to set
         * @return this builder
         **/
        

public Builder isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
}
            /**
     * The current DI Agent managed compute lifecycle state when compute exists.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private Cluster.State lifecycleState;

        /**
         * The current DI Agent managed compute lifecycle state when compute exists.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(Cluster.State lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * Durable DI Agent enablement state, such as InProgress, Succeeded, or Failed.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("enablementStatus")
private String enablementStatus;

        /**
         * Durable DI Agent enablement state, such as InProgress, Succeeded, or Failed.
         * @param enablementStatus the value to set
         * @return this builder
         **/
        

public Builder enablementStatus(String enablementStatus) {
    this.enablementStatus = enablementStatus;
    return this;
}
            /**
     * Additional sanitized details for the durable enablement state, populated when available.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
private String statusDetails;

        /**
         * Additional sanitized details for the durable enablement state, populated when available.
         * @param statusDetails the value to set
         * @return this builder
         **/
        

public Builder statusDetails(String statusDetails) {
    this.statusDetails = statusDetails;
    return this;
}


        public DflComputeStatusResult build() {
            DflComputeStatusResult model = new DflComputeStatusResult(this.isEnabled
                , this.lifecycleState
                , this.enablementStatus
                , this.statusDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DflComputeStatusResult model) {
                this.isEnabled(model.getIsEnabled());
    this.lifecycleState(model.getLifecycleState());
    this.enablementStatus(model.getEnablementStatus());
    this.statusDetails(model.getStatusDetails());
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
     * Whether DI Agent enablement is enabled for the AI Data Platform instance.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

        /**
     * Whether DI Agent enablement is enabled for the AI Data Platform instance.
     * @return the value
     **/
    
    public Boolean getIsEnabled() {
        return isEnabled;
    }


        /**
     * The current DI Agent managed compute lifecycle state when compute exists.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Cluster.State lifecycleState;

        /**
     * The current DI Agent managed compute lifecycle state when compute exists.
     * @return the value
     **/
    
    public Cluster.State getLifecycleState() {
        return lifecycleState;
    }


        /**
     * Durable DI Agent enablement state, such as InProgress, Succeeded, or Failed.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("enablementStatus")
    private final String enablementStatus;

        /**
     * Durable DI Agent enablement state, such as InProgress, Succeeded, or Failed.
     * @return the value
     **/
    
    public String getEnablementStatus() {
        return enablementStatus;
    }


        /**
     * Additional sanitized details for the durable enablement state, populated when available.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    private final String statusDetails;

        /**
     * Additional sanitized details for the durable enablement state, populated when available.
     * @return the value
     **/
    
    public String getStatusDetails() {
        return statusDetails;
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
        sb.append("DflComputeStatusResult(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", enablementStatus=").append(String.valueOf(this.enablementStatus));
        sb.append(", statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DflComputeStatusResult)) {
            return false;
        }

        DflComputeStatusResult other = (DflComputeStatusResult) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.enablementStatus, other.enablementStatus) &&
            java.util.Objects.equals(this.statusDetails, other.statusDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.enablementStatus == null ? 43 : this.enablementStatus.hashCode());
        result = (result * PRIME) + (this.statusDetails == null ? 43 : this.statusDetails.hashCode());
        return result;
    }


}
