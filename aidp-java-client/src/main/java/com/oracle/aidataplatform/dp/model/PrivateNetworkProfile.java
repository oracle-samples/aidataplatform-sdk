// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * A reusable private network profile for Git repository connectivity.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PrivateNetworkProfile.Builder.class)

public final class PrivateNetworkProfile  {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "name", "description", "customerCompartmentId", "customerVcnId", "customerSubnetId", "lifecycleState", "validationState", "timeLastValidated", "lastValidationErrorCode", "lastValidationErrorMessage", "timeCreated", "timeUpdated", "createdBy", "createdByName"})
    public PrivateNetworkProfile(String key, String name, String description, String customerCompartmentId, String customerVcnId, String customerSubnetId, LifecycleState lifecycleState, ValidationState validationState, java.util.Date timeLastValidated, String lastValidationErrorCode, String lastValidationErrorMessage, java.util.Date timeCreated, java.util.Date timeUpdated, String createdBy, String createdByName) {
        super();
        this.key = key;
        this.name = name;
        this.description = description;
        this.customerCompartmentId = customerCompartmentId;
        this.customerVcnId = customerVcnId;
        this.customerSubnetId = customerSubnetId;
        this.lifecycleState = lifecycleState;
        this.validationState = validationState;
        this.timeLastValidated = timeLastValidated;
        this.lastValidationErrorCode = lastValidationErrorCode;
        this.lastValidationErrorMessage = lastValidationErrorMessage;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdBy = createdBy;
        this.createdByName = createdByName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique key for the Git connectivity profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Unique key for the Git connectivity profile.
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
            /**
     * Display name of the Git connectivity profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Display name of the Git connectivity profile.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Optional description of the Git connectivity profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Optional description of the Git connectivity profile.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Customer compartment identifier containing the private network resources.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("customerCompartmentId")
private String customerCompartmentId;

        /**
         * Customer compartment identifier containing the private network resources.
         * @param customerCompartmentId the value to set
         * @return this builder
         **/
        

public Builder customerCompartmentId(String customerCompartmentId) {
    this.customerCompartmentId = customerCompartmentId;
    return this;
}
            /**
     * Customer VCN identifier used for Git connectivity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("customerVcnId")
private String customerVcnId;

        /**
         * Customer VCN identifier used for Git connectivity.
         * @param customerVcnId the value to set
         * @return this builder
         **/
        

public Builder customerVcnId(String customerVcnId) {
    this.customerVcnId = customerVcnId;
    return this;
}
            /**
     * Customer subnet identifier used for Git connectivity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("customerSubnetId")
private String customerSubnetId;

        /**
         * Customer subnet identifier used for Git connectivity.
         * @param customerSubnetId the value to set
         * @return this builder
         **/
        

public Builder customerSubnetId(String customerSubnetId) {
    this.customerSubnetId = customerSubnetId;
    return this;
}
            /**
     * Current lifecycle state of the profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
private LifecycleState lifecycleState;

        /**
         * Current lifecycle state of the profile.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        

public Builder lifecycleState(LifecycleState lifecycleState) {
    this.lifecycleState = lifecycleState;
    return this;
}
            /**
     * Latest validation state of the profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("validationState")
private ValidationState validationState;

        /**
         * Latest validation state of the profile.
         * @param validationState the value to set
         * @return this builder
         **/
        

public Builder validationState(ValidationState validationState) {
    this.validationState = validationState;
    return this;
}
            /**
     * Time at which the profile was last validated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeLastValidated")
private java.util.Date timeLastValidated;

        /**
         * Time at which the profile was last validated.
         * @param timeLastValidated the value to set
         * @return this builder
         **/
        

public Builder timeLastValidated(java.util.Date timeLastValidated) {
    this.timeLastValidated = timeLastValidated;
    return this;
}
            /**
     * Non-sensitive code for the latest validation failure.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lastValidationErrorCode")
private String lastValidationErrorCode;

        /**
         * Non-sensitive code for the latest validation failure.
         * @param lastValidationErrorCode the value to set
         * @return this builder
         **/
        

public Builder lastValidationErrorCode(String lastValidationErrorCode) {
    this.lastValidationErrorCode = lastValidationErrorCode;
    return this;
}
            /**
     * Non-sensitive message for the latest validation failure.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("lastValidationErrorMessage")
private String lastValidationErrorMessage;

        /**
         * Non-sensitive message for the latest validation failure.
         * @param lastValidationErrorMessage the value to set
         * @return this builder
         **/
        

public Builder lastValidationErrorMessage(String lastValidationErrorMessage) {
    this.lastValidationErrorMessage = lastValidationErrorMessage;
    return this;
}
            /**
     * Time at which the profile was created.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * Time at which the profile was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}
            /**
     * Time at which the profile was last updated.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
private java.util.Date timeUpdated;

        /**
         * Time at which the profile was last updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        

public Builder timeUpdated(java.util.Date timeUpdated) {
    this.timeUpdated = timeUpdated;
    return this;
}
            /**
     * Identifier of the user who created the profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * Identifier of the user who created the profile.
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * Display name of the user who created the profile.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdByName")
private String createdByName;

        /**
         * Display name of the user who created the profile.
         * @param createdByName the value to set
         * @return this builder
         **/
        

public Builder createdByName(String createdByName) {
    this.createdByName = createdByName;
    return this;
}


        public PrivateNetworkProfile build() {
            PrivateNetworkProfile model = new PrivateNetworkProfile(this.key
                , this.name
                , this.description
                , this.customerCompartmentId
                , this.customerVcnId
                , this.customerSubnetId
                , this.lifecycleState
                , this.validationState
                , this.timeLastValidated
                , this.lastValidationErrorCode
                , this.lastValidationErrorMessage
                , this.timeCreated
                , this.timeUpdated
                , this.createdBy
                , this.createdByName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateNetworkProfile model) {
                this.key(model.getKey());
    this.name(model.getName());
    this.description(model.getDescription());
    this.customerCompartmentId(model.getCustomerCompartmentId());
    this.customerVcnId(model.getCustomerVcnId());
    this.customerSubnetId(model.getCustomerSubnetId());
    this.lifecycleState(model.getLifecycleState());
    this.validationState(model.getValidationState());
    this.timeLastValidated(model.getTimeLastValidated());
    this.lastValidationErrorCode(model.getLastValidationErrorCode());
    this.lastValidationErrorMessage(model.getLastValidationErrorMessage());
    this.timeCreated(model.getTimeCreated());
    this.timeUpdated(model.getTimeUpdated());
    this.createdBy(model.getCreatedBy());
    this.createdByName(model.getCreatedByName());
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
     * Unique key for the Git connectivity profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Unique key for the Git connectivity profile.
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }


        /**
     * Display name of the Git connectivity profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Display name of the Git connectivity profile.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Optional description of the Git connectivity profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Optional description of the Git connectivity profile.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Customer compartment identifier containing the private network resources.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("customerCompartmentId")
    private final String customerCompartmentId;

        /**
     * Customer compartment identifier containing the private network resources.
     * @return the value
     **/
    
    public String getCustomerCompartmentId() {
        return customerCompartmentId;
    }


        /**
     * Customer VCN identifier used for Git connectivity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("customerVcnId")
    private final String customerVcnId;

        /**
     * Customer VCN identifier used for Git connectivity.
     * @return the value
     **/
    
    public String getCustomerVcnId() {
        return customerVcnId;
    }


        /**
     * Customer subnet identifier used for Git connectivity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("customerSubnetId")
    private final String customerSubnetId;

        /**
     * Customer subnet identifier used for Git connectivity.
     * @return the value
     **/
    
    public String getCustomerSubnetId() {
        return customerSubnetId;
    }

    /**
     * Current lifecycle state of the profile.
     **/
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Failed("FAILED"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Current lifecycle state of the profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

        /**
     * Current lifecycle state of the profile.
     * @return the value
     **/
    
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Latest validation state of the profile.
     **/
    public enum ValidationState implements com.oracle.bmc.http.internal.BmcEnum {
        Unknown("UNKNOWN"),
        Valid("VALID"),
        Invalid("INVALID"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(ValidationState.class);

        private final String value;
        private static java.util.Map<String, ValidationState> map;

        static {
            map = new java.util.HashMap<>();
            for (ValidationState v : ValidationState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValidationState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValidationState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'ValidationState', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Latest validation state of the profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("validationState")
    private final ValidationState validationState;

        /**
     * Latest validation state of the profile.
     * @return the value
     **/
    
    public ValidationState getValidationState() {
        return validationState;
    }


        /**
     * Time at which the profile was last validated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastValidated")
    private final java.util.Date timeLastValidated;

        /**
     * Time at which the profile was last validated.
     * @return the value
     **/
    
    public java.util.Date getTimeLastValidated() {
        return timeLastValidated;
    }


        /**
     * Non-sensitive code for the latest validation failure.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lastValidationErrorCode")
    private final String lastValidationErrorCode;

        /**
     * Non-sensitive code for the latest validation failure.
     * @return the value
     **/
    
    public String getLastValidationErrorCode() {
        return lastValidationErrorCode;
    }


        /**
     * Non-sensitive message for the latest validation failure.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("lastValidationErrorMessage")
    private final String lastValidationErrorMessage;

        /**
     * Non-sensitive message for the latest validation failure.
     * @return the value
     **/
    
    public String getLastValidationErrorMessage() {
        return lastValidationErrorMessage;
    }


        /**
     * Time at which the profile was created.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * Time at which the profile was created.
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }


        /**
     * Time at which the profile was last updated.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

        /**
     * Time at which the profile was last updated.
     * @return the value
     **/
    
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }


        /**
     * Identifier of the user who created the profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * Identifier of the user who created the profile.
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * Display name of the user who created the profile.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    private final String createdByName;

        /**
     * Display name of the user who created the profile.
     * @return the value
     **/
    
    public String getCreatedByName() {
        return createdByName;
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
        sb.append("PrivateNetworkProfile(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", customerCompartmentId=").append(String.valueOf(this.customerCompartmentId));
        sb.append(", customerVcnId=").append(String.valueOf(this.customerVcnId));
        sb.append(", customerSubnetId=").append(String.valueOf(this.customerSubnetId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", validationState=").append(String.valueOf(this.validationState));
        sb.append(", timeLastValidated=").append(String.valueOf(this.timeLastValidated));
        sb.append(", lastValidationErrorCode=").append(String.valueOf(this.lastValidationErrorCode));
        sb.append(", lastValidationErrorMessage=").append(String.valueOf(this.lastValidationErrorMessage));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", createdByName=").append(String.valueOf(this.createdByName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivateNetworkProfile)) {
            return false;
        }

        PrivateNetworkProfile other = (PrivateNetworkProfile) o;
        return java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.customerCompartmentId, other.customerCompartmentId) &&
            java.util.Objects.equals(this.customerVcnId, other.customerVcnId) &&
            java.util.Objects.equals(this.customerSubnetId, other.customerSubnetId) &&
            java.util.Objects.equals(this.lifecycleState, other.lifecycleState) &&
            java.util.Objects.equals(this.validationState, other.validationState) &&
            java.util.Objects.equals(this.timeLastValidated, other.timeLastValidated) &&
            java.util.Objects.equals(this.lastValidationErrorCode, other.lastValidationErrorCode) &&
            java.util.Objects.equals(this.lastValidationErrorMessage, other.lastValidationErrorMessage) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated) &&
            java.util.Objects.equals(this.timeUpdated, other.timeUpdated) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.createdByName, other.createdByName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.customerCompartmentId == null ? 43 : this.customerCompartmentId.hashCode());
        result = (result * PRIME) + (this.customerVcnId == null ? 43 : this.customerVcnId.hashCode());
        result = (result * PRIME) + (this.customerSubnetId == null ? 43 : this.customerSubnetId.hashCode());
        result = (result * PRIME) + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.validationState == null ? 43 : this.validationState.hashCode());
        result = (result * PRIME) + (this.timeLastValidated == null ? 43 : this.timeLastValidated.hashCode());
        result = (result * PRIME) + (this.lastValidationErrorCode == null ? 43 : this.lastValidationErrorCode.hashCode());
        result = (result * PRIME) + (this.lastValidationErrorMessage == null ? 43 : this.lastValidationErrorMessage.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.createdByName == null ? 43 : this.createdByName.hashCode());
        return result;
    }


}
