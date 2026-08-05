// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Details for removing published ontology project artifacts.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=UnpublishOntologyProjectDetails.Builder.class)

public final class UnpublishOntologyProjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"comment", "deleteArtifacts"})
    public UnpublishOntologyProjectDetails(String comment, Boolean deleteArtifacts) {
        super();
        this.comment = comment;
        this.deleteArtifacts = deleteArtifacts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("comment")
private String comment;



public Builder comment(String comment) {
    this.comment = comment;
    return this;
}
            /**
     * Whether to delete stored publish artifacts such as compile reports. Defaults to true.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deleteArtifacts")
private Boolean deleteArtifacts;

        /**
         * Whether to delete stored publish artifacts such as compile reports. Defaults to true.
         * @param deleteArtifacts the value to set
         * @return this builder
         **/
        

public Builder deleteArtifacts(Boolean deleteArtifacts) {
    this.deleteArtifacts = deleteArtifacts;
    return this;
}


        public UnpublishOntologyProjectDetails build() {
            UnpublishOntologyProjectDetails model = new UnpublishOntologyProjectDetails(this.comment
                , this.deleteArtifacts);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnpublishOntologyProjectDetails model) {
                this.comment(model.getComment());
    this.deleteArtifacts(model.getDeleteArtifacts());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    
    public String getComment() {
        return comment;
    }


        /**
     * Whether to delete stored publish artifacts such as compile reports. Defaults to true.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deleteArtifacts")
    private final Boolean deleteArtifacts;

        /**
     * Whether to delete stored publish artifacts such as compile reports. Defaults to true.
     * @return the value
     **/
    
    public Boolean getDeleteArtifacts() {
        return deleteArtifacts;
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
        sb.append("UnpublishOntologyProjectDetails(");
        sb.append("comment=").append(String.valueOf(this.comment));
        sb.append(", deleteArtifacts=").append(String.valueOf(this.deleteArtifacts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnpublishOntologyProjectDetails)) {
            return false;
        }

        UnpublishOntologyProjectDetails other = (UnpublishOntologyProjectDetails) o;
        return java.util.Objects.equals(this.comment, other.comment) &&
            java.util.Objects.equals(this.deleteArtifacts, other.deleteArtifacts);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.deleteArtifacts == null ? 43 : this.deleteArtifacts.hashCode());
        return result;
    }


}
