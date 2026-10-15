// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy Credential resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForCredentialDetails.Builder.class)

public final class AccessGrantedForCredentialDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"credentialOperationTarget", "credentialDetails"})
    public AccessGrantedForCredentialDetails(CredentialOperationTarget credentialOperationTarget, String credentialDetails) {
        super();
        this.credentialOperationTarget = credentialOperationTarget;
        this.credentialDetails = credentialDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Lakeproxy credentialOperationTarget.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialOperationTarget")
private CredentialOperationTarget credentialOperationTarget;

        /**
         * Lakeproxy credentialOperationTarget.
         * @param credentialOperationTarget the value to set
         * @return this builder
         **/
        

public Builder credentialOperationTarget(CredentialOperationTarget credentialOperationTarget) {
    this.credentialOperationTarget = credentialOperationTarget;
    return this;
}
            /**
     * Lakeproxy credentialDetails.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
private String credentialDetails;

        /**
         * Lakeproxy credentialDetails.
         * @param credentialDetails the value to set
         * @return this builder
         **/
        

public Builder credentialDetails(String credentialDetails) {
    this.credentialDetails = credentialDetails;
    return this;
}


        public AccessGrantedForCredentialDetails build() {
            AccessGrantedForCredentialDetails model = new AccessGrantedForCredentialDetails(this.credentialOperationTarget
                , this.credentialDetails);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForCredentialDetails model) {
                this.credentialOperationTarget(model.getCredentialOperationTarget());
    this.credentialDetails(model.getCredentialDetails());
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
     * Lakeproxy credentialOperationTarget.
     **/
    public enum CredentialOperationTarget implements com.oracle.bmc.http.internal.BmcEnum {
        CentrifyCatalog("CENTRIFY_CATALOG"),
        Credential("CREDENTIAL"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(CredentialOperationTarget.class);

        private final String value;
        private static java.util.Map<String, CredentialOperationTarget> map;

        static {
            map = new java.util.HashMap<>();
            for (CredentialOperationTarget v : CredentialOperationTarget.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CredentialOperationTarget(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CredentialOperationTarget create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'CredentialOperationTarget', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Lakeproxy credentialOperationTarget.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialOperationTarget")
    private final CredentialOperationTarget credentialOperationTarget;

        /**
     * Lakeproxy credentialOperationTarget.
     * @return the value
     **/
    
    public CredentialOperationTarget getCredentialOperationTarget() {
        return credentialOperationTarget;
    }


        /**
     * Lakeproxy credentialDetails.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final String credentialDetails;

        /**
     * Lakeproxy credentialDetails.
     * @return the value
     **/
    
    public String getCredentialDetails() {
        return credentialDetails;
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
        sb.append("AccessGrantedForCredentialDetails(");
        sb.append("credentialOperationTarget=").append(String.valueOf(this.credentialOperationTarget));
        sb.append(", credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForCredentialDetails)) {
            return false;
        }

        AccessGrantedForCredentialDetails other = (AccessGrantedForCredentialDetails) o;
        return java.util.Objects.equals(this.credentialOperationTarget, other.credentialOperationTarget) &&
            java.util.Objects.equals(this.credentialDetails, other.credentialDetails);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.credentialOperationTarget == null ? 43 : this.credentialOperationTarget.hashCode());
        result = (result * PRIME) + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        return result;
    }


}
