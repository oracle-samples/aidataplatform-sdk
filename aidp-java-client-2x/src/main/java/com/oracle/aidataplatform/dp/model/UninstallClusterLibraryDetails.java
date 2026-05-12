package com.oracle.aidataplatform.dp.model;


/**
 * Details required to uninstall a library from a cluster.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UninstallClusterLibraryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="operation")

public final class UninstallClusterLibraryDetails extends ClusterLibraryDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

            public Builder type(Type type) {
            this.type = type;
            return this;
            }
            /**
     * Name of the library to uninstall.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Name of the library to uninstall.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }


        public UninstallClusterLibraryDetails build() {
            UninstallClusterLibraryDetails model = new UninstallClusterLibraryDetails(this.type
                    , this.name);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UninstallClusterLibraryDetails model) {
                this.type(model.getType());
    this.name(model.getName());
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
    public UninstallClusterLibraryDetails(Type type, String name) {
        super(type);
        this.name = name;
    }


        /**
     * Name of the library to uninstall.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the library to uninstall.
     * @return the value
     **/
    
    public String getName() {
        return name;
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
        sb.append("UninstallClusterLibraryDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UninstallClusterLibraryDetails)) {
            return false;
        }

        UninstallClusterLibraryDetails other = (UninstallClusterLibraryDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        return result;
    }


}
