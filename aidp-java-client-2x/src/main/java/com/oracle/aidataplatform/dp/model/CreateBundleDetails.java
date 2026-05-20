// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;


/**
 * Request body to create a new bundle.
**/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=CreateBundleDetails.Builder.class)

public final class CreateBundleDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "path", "bundledResources"})
    public CreateBundleDetails(String name, String description, String path, java.util.List<BundledResource> bundledResources) {
        super();
        this.name = name;
        this.description = description;
        this.path = path;
        this.bundledResources = bundledResources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            /**
     * Name for the new bundle.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

                /**
         * Name for the new bundle.
         * @param name the value to set
         * @return this builder
         **/
        

        public Builder name(String name) {
        this.name = name;
        return this;
        }
            /**
     * Description for the bundle.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

                /**
         * Description for the bundle.
         * @param description the value to set
         * @return this builder
         **/
        

        public Builder description(String description) {
        this.description = description;
        return this;
        }
            /**
     * Target folder for the new bundle.
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

                /**
         * Target folder for the new bundle.
         * @param path the value to set
         * @return this builder
         **/
        

        public Builder path(String path) {
        this.path = path;
        return this;
        }
            /**
     * List of workspace resource descriptors (jobs, agentflows) to be included.
* Each has minimally resourceType and resourceKey.
* 
     **/
    
        @com.fasterxml.jackson.annotation.JsonProperty("bundledResources")
        private java.util.List<BundledResource> bundledResources;

                /**
         * List of workspace resource descriptors (jobs, agentflows) to be included.
* Each has minimally resourceType and resourceKey.
* 
         * @param bundledResources the value to set
         * @return this builder
         **/
        

        public Builder bundledResources(java.util.List<BundledResource> bundledResources) {
        this.bundledResources = bundledResources;
        return this;
        }


        public CreateBundleDetails build() {
            CreateBundleDetails model = new CreateBundleDetails(this.name
                    , this.description
                    , this.path
                    , this.bundledResources);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBundleDetails model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.path(model.getPath());
    this.bundledResources(model.getBundledResources());
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
     * Name for the new bundle.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name for the new bundle.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description for the bundle.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description for the bundle.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Target folder for the new bundle.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

        /**
     * Target folder for the new bundle.
     * @return the value
     **/
    
    public String getPath() {
        return path;
    }


        /**
     * List of workspace resource descriptors (jobs, agentflows) to be included.
* Each has minimally resourceType and resourceKey.
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("bundledResources")
    private final java.util.List<BundledResource> bundledResources;

        /**
     * List of workspace resource descriptors (jobs, agentflows) to be included.
* Each has minimally resourceType and resourceKey.
* 
     * @return the value
     **/
    
    public java.util.List<BundledResource> getBundledResources() {
        return bundledResources;
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
        sb.append("CreateBundleDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", bundledResources=").append(String.valueOf(this.bundledResources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBundleDetails)) {
            return false;
        }

        CreateBundleDetails other = (CreateBundleDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.path, other.path) &&
            java.util.Objects.equals(this.bundledResources, other.bundledResources);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.bundledResources == null ? 43 : this.bundledResources.hashCode());
        return result;
    }


}
