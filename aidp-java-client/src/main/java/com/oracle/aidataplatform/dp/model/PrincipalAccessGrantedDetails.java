// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Access checks for one subject.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=PrincipalAccessGrantedDetails.Builder.class)

public final class PrincipalAccessGrantedDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"principal", "principalType", "iamCheckAccessType", "authCheckRequestCollection"})
    public PrincipalAccessGrantedDetails(String principal, PrincipalType principalType, String iamCheckAccessType, AccessGrantedForRequestCollection authCheckRequestCollection) {
        super();
        this.principal = principal;
        this.principalType = principalType;
        this.iamCheckAccessType = iamCheckAccessType;
        this.authCheckRequestCollection = authCheckRequestCollection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Base64-encoded serialized OCI principal for an explicit subject. If omitted, use the resolved request
* identity. With principalType SIGNED, any supplied principal must match that identity.
* Base64 is a transport encoding, not proof of caller authorization.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("principal")
private String principal;

        /**
         * Base64-encoded serialized OCI principal for an explicit subject. If omitted, use the resolved request
* identity. With principalType SIGNED, any supplied principal must match that identity.
* Base64 is a transport encoding, not proof of caller authorization.
* 
         * @param principal the value to set
         * @return this builder
         **/
        

public Builder principal(String principal) {
    this.principal = principal;
    return this;
}
            /**
     * SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("principalType")
private PrincipalType principalType;

        /**
         * SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity.
         * @param principalType the value to set
         * @return this builder
         **/
        

public Builder principalType(PrincipalType principalType) {
    this.principalType = principalType;
    return this;
}
            /**
     * Optional IAM access check passed unchanged to Lakeproxy.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("iamCheckAccessType")
private String iamCheckAccessType;

        /**
         * Optional IAM access check passed unchanged to Lakeproxy.
         * @param iamCheckAccessType the value to set
         * @return this builder
         **/
        

public Builder iamCheckAccessType(String iamCheckAccessType) {
    this.iamCheckAccessType = iamCheckAccessType;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("authCheckRequestCollection")
private AccessGrantedForRequestCollection authCheckRequestCollection;



public Builder authCheckRequestCollection(AccessGrantedForRequestCollection authCheckRequestCollection) {
    this.authCheckRequestCollection = authCheckRequestCollection;
    return this;
}


        public PrincipalAccessGrantedDetails build() {
            PrincipalAccessGrantedDetails model = new PrincipalAccessGrantedDetails(this.principal
                , this.principalType
                , this.iamCheckAccessType
                , this.authCheckRequestCollection);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrincipalAccessGrantedDetails model) {
                this.principal(model.getPrincipal());
    this.principalType(model.getPrincipalType());
    this.iamCheckAccessType(model.getIamCheckAccessType());
    this.authCheckRequestCollection(model.getAuthCheckRequestCollection());
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
     * Base64-encoded serialized OCI principal for an explicit subject. If omitted, use the resolved request
* identity. With principalType SIGNED, any supplied principal must match that identity.
* Base64 is a transport encoding, not proof of caller authorization.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("principal")
    private final String principal;

        /**
     * Base64-encoded serialized OCI principal for an explicit subject. If omitted, use the resolved request
* identity. With principalType SIGNED, any supplied principal must match that identity.
* Base64 is a transport encoding, not proof of caller authorization.
* 
     * @return the value
     **/
    
    public String getPrincipal() {
        return principal;
    }

    /**
     * SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity.
     **/
    public enum PrincipalType implements com.oracle.bmc.http.internal.BmcEnum {
        Signed("SIGNED"),
        Unsigned("UNSIGNED"),
        ;

        

        private final String value;
        private static java.util.Map<String, PrincipalType> map;

        static {
            map = new java.util.HashMap<>();
            for (PrincipalType v : PrincipalType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        PrincipalType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PrincipalType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PrincipalType: " + key);
        }
    };
        /**
     * SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("principalType")
    private final PrincipalType principalType;

        /**
     * SIGNED selects the resolved request identity; UNSIGNED selects an explicit Base64 principal or falls back to the resolved identity.
     * @return the value
     **/
    
    public PrincipalType getPrincipalType() {
        return principalType;
    }


        /**
     * Optional IAM access check passed unchanged to Lakeproxy.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("iamCheckAccessType")
    private final String iamCheckAccessType;

        /**
     * Optional IAM access check passed unchanged to Lakeproxy.
     * @return the value
     **/
    
    public String getIamCheckAccessType() {
        return iamCheckAccessType;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("authCheckRequestCollection")
    private final AccessGrantedForRequestCollection authCheckRequestCollection;

    
    public AccessGrantedForRequestCollection getAuthCheckRequestCollection() {
        return authCheckRequestCollection;
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
        sb.append("PrincipalAccessGrantedDetails(");
        sb.append("principal=").append(String.valueOf(this.principal));
        sb.append(", principalType=").append(String.valueOf(this.principalType));
        sb.append(", iamCheckAccessType=").append(String.valueOf(this.iamCheckAccessType));
        sb.append(", authCheckRequestCollection=").append(String.valueOf(this.authCheckRequestCollection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrincipalAccessGrantedDetails)) {
            return false;
        }

        PrincipalAccessGrantedDetails other = (PrincipalAccessGrantedDetails) o;
        return java.util.Objects.equals(this.principal, other.principal) &&
            java.util.Objects.equals(this.principalType, other.principalType) &&
            java.util.Objects.equals(this.iamCheckAccessType, other.iamCheckAccessType) &&
            java.util.Objects.equals(this.authCheckRequestCollection, other.authCheckRequestCollection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.principal == null ? 43 : this.principal.hashCode());
        result = (result * PRIME) + (this.principalType == null ? 43 : this.principalType.hashCode());
        result = (result * PRIME) + (this.iamCheckAccessType == null ? 43 : this.iamCheckAccessType.hashCode());
        result = (result * PRIME) + (this.authCheckRequestCollection == null ? 43 : this.authCheckRequestCollection.hashCode());
        return result;
    }


}
