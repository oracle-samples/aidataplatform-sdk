// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy DeltaShare resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForDeltaShareDetails.Builder.class)

public final class AccessGrantedForDeltaShareDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"deltaShareOperationTarget", "shareName", "recipientName"})
    public AccessGrantedForDeltaShareDetails(DeltaShareOperationTarget deltaShareOperationTarget, String shareName, String recipientName) {
        super();
        this.deltaShareOperationTarget = deltaShareOperationTarget;
        this.shareName = shareName;
        this.recipientName = recipientName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Lakeproxy deltaShareOperationTarget.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deltaShareOperationTarget")
private DeltaShareOperationTarget deltaShareOperationTarget;

        /**
         * Lakeproxy deltaShareOperationTarget.
         * @param deltaShareOperationTarget the value to set
         * @return this builder
         **/
        

public Builder deltaShareOperationTarget(DeltaShareOperationTarget deltaShareOperationTarget) {
    this.deltaShareOperationTarget = deltaShareOperationTarget;
    return this;
}
            /**
     * Lakeproxy shareName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("shareName")
private String shareName;

        /**
         * Lakeproxy shareName.
         * @param shareName the value to set
         * @return this builder
         **/
        

public Builder shareName(String shareName) {
    this.shareName = shareName;
    return this;
}
            /**
     * Lakeproxy recipientName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("recipientName")
private String recipientName;

        /**
         * Lakeproxy recipientName.
         * @param recipientName the value to set
         * @return this builder
         **/
        

public Builder recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
}


        public AccessGrantedForDeltaShareDetails build() {
            AccessGrantedForDeltaShareDetails model = new AccessGrantedForDeltaShareDetails(this.deltaShareOperationTarget
                , this.shareName
                , this.recipientName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForDeltaShareDetails model) {
                this.deltaShareOperationTarget(model.getDeltaShareOperationTarget());
    this.shareName(model.getShareName());
    this.recipientName(model.getRecipientName());
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
     * Lakeproxy deltaShareOperationTarget.
     **/
    public enum DeltaShareOperationTarget implements com.oracle.bmc.http.internal.BmcEnum {
        CentrifyCatalog("CENTRIFY_CATALOG"),
        Share("SHARE"),
        Recipient("RECIPIENT"),
        

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(DeltaShareOperationTarget.class);

        private final String value;
        private static java.util.Map<String, DeltaShareOperationTarget> map;

        static {
            map = new java.util.HashMap<>();
            for (DeltaShareOperationTarget v : DeltaShareOperationTarget.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeltaShareOperationTarget(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeltaShareOperationTarget create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn("Received unknown value '{}' for enum 'DeltaShareOperationTarget', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
        /**
     * Lakeproxy deltaShareOperationTarget.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deltaShareOperationTarget")
    private final DeltaShareOperationTarget deltaShareOperationTarget;

        /**
     * Lakeproxy deltaShareOperationTarget.
     * @return the value
     **/
    
    public DeltaShareOperationTarget getDeltaShareOperationTarget() {
        return deltaShareOperationTarget;
    }


        /**
     * Lakeproxy shareName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("shareName")
    private final String shareName;

        /**
     * Lakeproxy shareName.
     * @return the value
     **/
    
    public String getShareName() {
        return shareName;
    }


        /**
     * Lakeproxy recipientName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("recipientName")
    private final String recipientName;

        /**
     * Lakeproxy recipientName.
     * @return the value
     **/
    
    public String getRecipientName() {
        return recipientName;
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
        sb.append("AccessGrantedForDeltaShareDetails(");
        sb.append("deltaShareOperationTarget=").append(String.valueOf(this.deltaShareOperationTarget));
        sb.append(", shareName=").append(String.valueOf(this.shareName));
        sb.append(", recipientName=").append(String.valueOf(this.recipientName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForDeltaShareDetails)) {
            return false;
        }

        AccessGrantedForDeltaShareDetails other = (AccessGrantedForDeltaShareDetails) o;
        return java.util.Objects.equals(this.deltaShareOperationTarget, other.deltaShareOperationTarget) &&
            java.util.Objects.equals(this.shareName, other.shareName) &&
            java.util.Objects.equals(this.recipientName, other.recipientName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.deltaShareOperationTarget == null ? 43 : this.deltaShareOperationTarget.hashCode());
        result = (result * PRIME) + (this.shareName == null ? 43 : this.shareName.hashCode());
        result = (result * PRIME) + (this.recipientName == null ? 43 : this.recipientName.hashCode());
        return result;
    }


}
