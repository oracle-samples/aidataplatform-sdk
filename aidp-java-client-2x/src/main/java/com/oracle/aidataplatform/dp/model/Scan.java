package com.oracle.aidataplatform.dp.model;


/**
 * Single Client Access Name (SCAN) is the object with a fully-qualified domain name and a port number.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Scan.Builder.class)

public final class Scan  {
    @Deprecated
    @java.beans.ConstructorProperties({"fqdn", "port"})
    public Scan(String fqdn, String port) {
        super();
        this.fqdn = fqdn;
        this.port = port;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * A fully-qualified domain name (FQDN).
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

                /**
         * A fully-qualified domain name (FQDN).
         * @param fqdn the value to set
         * @return this builder
         **/
        

        public Builder fqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
        }
            /**
     * Port number of the FQDN.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

                /**
         * Port number of the FQDN.
         * @param port the value to set
         * @return this builder
         **/
        

        public Builder port(String port) {
        this.port = port;
        return this;
        }


        public Scan build() {
            Scan model = new Scan(this.fqdn
                    , this.port);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Scan model) {
                this.fqdn(model.getFqdn());
    this.port(model.getPort());
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
     * A fully-qualified domain name (FQDN).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

        /**
     * A fully-qualified domain name (FQDN).
     * @return the value
     **/
    
    public String getFqdn() {
        return fqdn;
    }


        /**
     * Port number of the FQDN.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final String port;

        /**
     * Port number of the FQDN.
     * @return the value
     **/
    
    public String getPort() {
        return port;
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
        sb.append("Scan(");
        sb.append("fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Scan)) {
            return false;
        }

        Scan other = (Scan) o;
        return java.util.Objects.equals(this.fqdn, other.fqdn) &&
            java.util.Objects.equals(this.port, other.port);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        return result;
    }


}
