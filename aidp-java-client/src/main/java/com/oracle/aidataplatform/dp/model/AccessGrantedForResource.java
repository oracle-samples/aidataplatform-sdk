// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Lakeproxy resource selected by resourceType.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="resourceType", defaultImpl=AccessGrantedForResource.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForMasterCatalogResource.class, name = "CENTRIFYCATALOG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForTableResource.class, name = "TABLE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForFileResource.class, name = "FILE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForWorkspaceResource.class, name = "WORKSPACE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForCatalogResource.class, name = "CATALOG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForVolumeResource.class, name = "VOLUME"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForDeltaShareResource.class, name = "DELTASHARE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForDatabaseResource.class, name = "DATABASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForKnowledgeBaseResource.class, name = "KNOWLEDGE_BASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForDatalakeResource.class, name = "DATALAKE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForExternalCatalogResource.class, name = "EXTERNALCATALOG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForComputeResource.class, name = "COMPUTE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForWorkflowResource.class, name = "WORKFLOW"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForFolderResource.class, name = "FOLDER"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = AccessGrantedForCredentialResource.class, name = "CREDENTIAL")
})

public class AccessGrantedForResource  {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected AccessGrantedForResource() {
        super();
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
        sb.append("AccessGrantedForResource(");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessGrantedForResource)) {
            return false;
        }

        AccessGrantedForResource other = (AccessGrantedForResource) o;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        return result;
    }


}
