// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary of one DFL connection registry entry.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OntologyDflConnection.Builder.class)

public final class OntologyDflConnection  {
    @Deprecated
    @java.beans.ConstructorProperties({"uri", "kind", "healthStatus"})
    public OntologyDflConnection(String uri, String kind, String healthStatus) {
        super();
        this.uri = uri;
        this.kind = kind;
        this.healthStatus = healthStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Exact DFL connection URI, for example {@code oracle://biairline}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("uri")
private String uri;

        /**
         * Exact DFL connection URI, for example {@code oracle://biairline}.
         * @param uri the value to set
         * @return this builder
         **/
        

public Builder uri(String uri) {
    this.uri = uri;
    return this;
}
            /**
     * DFL connection kind reported by the registry, for example {@code jdbc} or {@code duckdb}.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("kind")
private String kind;

        /**
         * DFL connection kind reported by the registry, for example {@code jdbc} or {@code duckdb}.
         * @param kind the value to set
         * @return this builder
         **/
        

public Builder kind(String kind) {
    this.kind = kind;
    return this;
}
            /**
     * DFL's verdict from its last probe of this connection, for example {@code healthy} or {@code degraded}.
* Registration succeeding does not mean the connection works; this is what says whether it does.
* Absent until DFL has probed the connection, which happens shortly after it is registered.
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("healthStatus")
private String healthStatus;

        /**
         * DFL's verdict from its last probe of this connection, for example {@code healthy} or {@code degraded}.
* Registration succeeding does not mean the connection works; this is what says whether it does.
* Absent until DFL has probed the connection, which happens shortly after it is registered.
* 
         * @param healthStatus the value to set
         * @return this builder
         **/
        

public Builder healthStatus(String healthStatus) {
    this.healthStatus = healthStatus;
    return this;
}


        public OntologyDflConnection build() {
            OntologyDflConnection model = new OntologyDflConnection(this.uri
                , this.kind
                , this.healthStatus);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OntologyDflConnection model) {
                this.uri(model.getUri());
    this.kind(model.getKind());
    this.healthStatus(model.getHealthStatus());
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
     * Exact DFL connection URI, for example {@code oracle://biairline}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

        /**
     * Exact DFL connection URI, for example {@code oracle://biairline}.
     * @return the value
     **/
    
    public String getUri() {
        return uri;
    }


        /**
     * DFL connection kind reported by the registry, for example {@code jdbc} or {@code duckdb}.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final String kind;

        /**
     * DFL connection kind reported by the registry, for example {@code jdbc} or {@code duckdb}.
     * @return the value
     **/
    
    public String getKind() {
        return kind;
    }


        /**
     * DFL's verdict from its last probe of this connection, for example {@code healthy} or {@code degraded}.
* Registration succeeding does not mean the connection works; this is what says whether it does.
* Absent until DFL has probed the connection, which happens shortly after it is registered.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("healthStatus")
    private final String healthStatus;

        /**
     * DFL's verdict from its last probe of this connection, for example {@code healthy} or {@code degraded}.
* Registration succeeding does not mean the connection works; this is what says whether it does.
* Absent until DFL has probed the connection, which happens shortly after it is registered.
* 
     * @return the value
     **/
    
    public String getHealthStatus() {
        return healthStatus;
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
        sb.append("OntologyDflConnection(");
        sb.append("uri=").append(String.valueOf(this.uri));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", healthStatus=").append(String.valueOf(this.healthStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OntologyDflConnection)) {
            return false;
        }

        OntologyDflConnection other = (OntologyDflConnection) o;
        return java.util.Objects.equals(this.uri, other.uri) &&
            java.util.Objects.equals(this.kind, other.kind) &&
            java.util.Objects.equals(this.healthStatus, other.healthStatus);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.healthStatus == null ? 43 : this.healthStatus.hashCode());
        return result;
    }


}
