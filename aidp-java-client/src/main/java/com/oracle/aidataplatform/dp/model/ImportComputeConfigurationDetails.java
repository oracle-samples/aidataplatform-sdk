// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Workspace YAML files to import into an active Spark Compute.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ImportComputeConfigurationDetails.Builder.class)

public final class ImportComputeConfigurationDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"yamlPaths"})
    public ImportComputeConfigurationDetails(java.util.List<String> yamlPaths) {
        super();
        this.yamlPaths = yamlPaths;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Non-empty, unique workspace or volume paths ending in .yaml. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("yamlPaths")
private java.util.List<String> yamlPaths;

        /**
         * Non-empty, unique workspace or volume paths ending in .yaml. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....
         * @param yamlPaths the value to set
         * @return this builder
         **/
        

public Builder yamlPaths(java.util.List<String> yamlPaths) {
    this.yamlPaths = yamlPaths;
    return this;
}


        public ImportComputeConfigurationDetails build() {
            ImportComputeConfigurationDetails model = new ImportComputeConfigurationDetails(this.yamlPaths);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportComputeConfigurationDetails model) {
                this.yamlPaths(model.getYamlPaths());
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
     * Non-empty, unique workspace or volume paths ending in .yaml. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("yamlPaths")
    private final java.util.List<String> yamlPaths;

        /**
     * Non-empty, unique workspace or volume paths ending in .yaml. Use a workspace-relative path, /Workspace/..., or /Volumes/<catalog>/<schema>/<volume>/....
     * @return the value
     **/
    
    public java.util.List<String> getYamlPaths() {
        return yamlPaths;
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
        sb.append("ImportComputeConfigurationDetails(");
        sb.append("yamlPaths=").append(String.valueOf(this.yamlPaths));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportComputeConfigurationDetails)) {
            return false;
        }

        ImportComputeConfigurationDetails other = (ImportComputeConfigurationDetails) o;
        return java.util.Objects.equals(this.yamlPaths, other.yamlPaths);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.yamlPaths == null ? 43 : this.yamlPaths.hashCode());
        return result;
    }


}
