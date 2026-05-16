// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Configuration associated with the notebook being attached to the created cluster.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AttachToNotebookConfig.Builder.class)

public final class AttachToNotebookConfig  {
    @Deprecated
    @java.beans.ConstructorProperties({"notebookPath"})
    public AttachToNotebookConfig(String notebookPath) {
        super();
        this.notebookPath = notebookPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Notebook URI path.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("notebookPath")
private String notebookPath;

        /**
         * Notebook URI path.
         * @param notebookPath the value to set
         * @return this builder
         **/
        

public Builder notebookPath(String notebookPath) {
    this.notebookPath = notebookPath;
    return this;
}


        public AttachToNotebookConfig build() {
            AttachToNotebookConfig model = new AttachToNotebookConfig(this.notebookPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachToNotebookConfig model) {
                this.notebookPath(model.getNotebookPath());
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
     * Notebook URI path.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("notebookPath")
    private final String notebookPath;

        /**
     * Notebook URI path.
     * @return the value
     **/
    
    public String getNotebookPath() {
        return notebookPath;
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
        sb.append("AttachToNotebookConfig(");
        sb.append("notebookPath=").append(String.valueOf(this.notebookPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttachToNotebookConfig)) {
            return false;
        }

        AttachToNotebookConfig other = (AttachToNotebookConfig) o;
        return java.util.Objects.equals(this.notebookPath, other.notebookPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.notebookPath == null ? 43 : this.notebookPath.hashCode());
        return result;
    }


}
