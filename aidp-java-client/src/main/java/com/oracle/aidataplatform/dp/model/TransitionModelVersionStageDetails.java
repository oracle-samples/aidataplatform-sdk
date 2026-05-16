// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Transition details of the model version
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=TransitionModelVersionStageDetails.Builder.class)

public final class TransitionModelVersionStageDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "version", "stage", "archiveExistingVersions"})
    public TransitionModelVersionStageDetails(String name, String version, String stage, Boolean archiveExistingVersions) {
        super();
        this.name = name;
        this.version = version;
        this.stage = stage;
        this.archiveExistingVersions = archiveExistingVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of the registered model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the registered model.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Model\u2019s version number.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("version")
private String version;

        /**
         * Model\u2019s version number.
         * @param version the value to set
         * @return this builder
         **/
        

public Builder version(String version) {
    this.version = version;
    return this;
}
            /**
     * New stage for the model version.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("stage")
private String stage;

        /**
         * New stage for the model version.
         * @param stage the value to set
         * @return this builder
         **/
        

public Builder stage(String stage) {
    this.stage = stage;
    return this;
}
            /**
     * Whether to archive existing versions in the target stage.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("archive_existing_versions")
private Boolean archiveExistingVersions;

        /**
         * Whether to archive existing versions in the target stage.
         * @param archiveExistingVersions the value to set
         * @return this builder
         **/
        

public Builder archiveExistingVersions(Boolean archiveExistingVersions) {
    this.archiveExistingVersions = archiveExistingVersions;
    return this;
}


        public TransitionModelVersionStageDetails build() {
            TransitionModelVersionStageDetails model = new TransitionModelVersionStageDetails(this.name
                , this.version
                , this.stage
                , this.archiveExistingVersions);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransitionModelVersionStageDetails model) {
                this.name(model.getName());
    this.version(model.getVersion());
    this.stage(model.getStage());
    this.archiveExistingVersions(model.getArchiveExistingVersions());
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
     * Name of the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the registered model.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Model\u2019s version number.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

        /**
     * Model\u2019s version number.
     * @return the value
     **/
    
    public String getVersion() {
        return version;
    }


        /**
     * New stage for the model version.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("stage")
    private final String stage;

        /**
     * New stage for the model version.
     * @return the value
     **/
    
    public String getStage() {
        return stage;
    }


        /**
     * Whether to archive existing versions in the target stage.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("archive_existing_versions")
    private final Boolean archiveExistingVersions;

        /**
     * Whether to archive existing versions in the target stage.
     * @return the value
     **/
    
    public Boolean getArchiveExistingVersions() {
        return archiveExistingVersions;
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
        sb.append("TransitionModelVersionStageDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", stage=").append(String.valueOf(this.stage));
        sb.append(", archiveExistingVersions=").append(String.valueOf(this.archiveExistingVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransitionModelVersionStageDetails)) {
            return false;
        }

        TransitionModelVersionStageDetails other = (TransitionModelVersionStageDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.version, other.version) &&
            java.util.Objects.equals(this.stage, other.stage) &&
            java.util.Objects.equals(this.archiveExistingVersions, other.archiveExistingVersions);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.stage == null ? 43 : this.stage.hashCode());
        result = (result * PRIME) + (this.archiveExistingVersions == null ? 43 : this.archiveExistingVersions.hashCode());
        return result;
    }


}
