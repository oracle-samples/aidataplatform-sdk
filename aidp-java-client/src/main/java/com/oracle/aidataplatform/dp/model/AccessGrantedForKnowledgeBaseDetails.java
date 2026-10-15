// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy KnowledgeBase resource details.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=AccessGrantedForKnowledgeBaseDetails.Builder.class)

public final class AccessGrantedForKnowledgeBaseDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"catalogName", "databaseName", "knowledgeBaseName"})
    public AccessGrantedForKnowledgeBaseDetails(String catalogName, String databaseName, String knowledgeBaseName) {
        super();
        this.catalogName = catalogName;
        this.databaseName = databaseName;
        this.knowledgeBaseName = knowledgeBaseName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Lakeproxy catalogName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("catalogName")
private String catalogName;

        /**
         * Lakeproxy catalogName.
         * @param catalogName the value to set
         * @return this builder
         **/
        

public Builder catalogName(String catalogName) {
    this.catalogName = catalogName;
    return this;
}
            /**
     * Lakeproxy databaseName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("databaseName")
private String databaseName;

        /**
         * Lakeproxy databaseName.
         * @param databaseName the value to set
         * @return this builder
         **/
        

public Builder databaseName(String databaseName) {
    this.databaseName = databaseName;
    return this;
}
            /**
     * Lakeproxy knowledgeBaseName.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseName")
private String knowledgeBaseName;

        /**
         * Lakeproxy knowledgeBaseName.
         * @param knowledgeBaseName the value to set
         * @return this builder
         **/
        

public Builder knowledgeBaseName(String knowledgeBaseName) {
    this.knowledgeBaseName = knowledgeBaseName;
    return this;
}


        public AccessGrantedForKnowledgeBaseDetails build() {
            AccessGrantedForKnowledgeBaseDetails model = new AccessGrantedForKnowledgeBaseDetails(this.catalogName
                , this.databaseName
                , this.knowledgeBaseName);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessGrantedForKnowledgeBaseDetails model) {
                this.catalogName(model.getCatalogName());
    this.databaseName(model.getDatabaseName());
    this.knowledgeBaseName(model.getKnowledgeBaseName());
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
     * Lakeproxy catalogName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogName")
    private final String catalogName;

        /**
     * Lakeproxy catalogName.
     * @return the value
     **/
    
    public String getCatalogName() {
        return catalogName;
    }


        /**
     * Lakeproxy databaseName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("databaseName")
    private final String databaseName;

        /**
     * Lakeproxy databaseName.
     * @return the value
     **/
    
    public String getDatabaseName() {
        return databaseName;
    }


        /**
     * Lakeproxy knowledgeBaseName.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("knowledgeBaseName")
    private final String knowledgeBaseName;

        /**
     * Lakeproxy knowledgeBaseName.
     * @return the value
     **/
    
    public String getKnowledgeBaseName() {
        return knowledgeBaseName;
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
        sb.append("AccessGrantedForKnowledgeBaseDetails(");
        sb.append("catalogName=").append(String.valueOf(this.catalogName));
        sb.append(", databaseName=").append(String.valueOf(this.databaseName));
        sb.append(", knowledgeBaseName=").append(String.valueOf(this.knowledgeBaseName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForKnowledgeBaseDetails)) {
            return false;
        }

        AccessGrantedForKnowledgeBaseDetails other = (AccessGrantedForKnowledgeBaseDetails) o;
        return java.util.Objects.equals(this.catalogName, other.catalogName) &&
            java.util.Objects.equals(this.databaseName, other.databaseName) &&
            java.util.Objects.equals(this.knowledgeBaseName, other.knowledgeBaseName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.catalogName == null ? 43 : this.catalogName.hashCode());
        result = (result * PRIME) + (this.databaseName == null ? 43 : this.databaseName.hashCode());
        result = (result * PRIME) + (this.knowledgeBaseName == null ? 43 : this.knowledgeBaseName.hashCode());
        return result;
    }


}
