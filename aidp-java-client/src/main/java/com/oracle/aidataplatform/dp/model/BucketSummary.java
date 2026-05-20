// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Summary information about a Bucket.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=BucketSummary.Builder.class)

public final class BucketSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"namespace", "name", "compartmentId", "createdBy", "timeCreated"})
    public BucketSummary(String namespace, String name, String compartmentId, String createdBy, java.util.Date timeCreated) {
        super();
        this.namespace = namespace;
        this.name = name;
        this.compartmentId = compartmentId;
        this.createdBy = createdBy;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;

        /**
         * The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.
         * @param namespace the value to set
         * @return this builder
         **/
        

public Builder namespace(String namespace) {
    this.namespace = namespace;
    return this;
}
            /**
     * Bucket name
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Bucket name
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
private String compartmentId;

        /**
         * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder
         **/
        

public Builder compartmentId(String compartmentId) {
    this.compartmentId = compartmentId;
    return this;
}
            /**
     * The ID of the user who created the schema
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("createdBy")
private String createdBy;

        /**
         * The ID of the user who created the schema
* 
         * @param createdBy the value to set
         * @return this builder
         **/
        

public Builder createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
}
            /**
     * The date and time the Data Lake Schema was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
private java.util.Date timeCreated;

        /**
         * The date and time the Data Lake Schema was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
         * @param timeCreated the value to set
         * @return this builder
         **/
        

public Builder timeCreated(java.util.Date timeCreated) {
    this.timeCreated = timeCreated;
    return this;
}


        public BucketSummary build() {
            BucketSummary model = new BucketSummary(this.namespace
                , this.name
                , this.compartmentId
                , this.createdBy
                , this.timeCreated);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BucketSummary model) {
                this.namespace(model.getNamespace());
    this.name(model.getName());
    this.compartmentId(model.getCompartmentId());
    this.createdBy(model.getCreatedBy());
    this.timeCreated(model.getTimeCreated());
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
     * The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

        /**
     * The namespace for the specified Oracle Object storage resource. You can find the namespace under Object Storage Settings in the Console.
     * @return the value
     **/
    
    public String getNamespace() {
        return namespace;
    }


        /**
     * Bucket name
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Bucket name
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

        /**
     * The [OCID]({{DOC_SERVER_URL}}/iaas/Content/General/Concepts/identifiers.htm) of the compartment in which to list resources.
     * @return the value
     **/
    
    public String getCompartmentId() {
        return compartmentId;
    }


        /**
     * The ID of the user who created the schema
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

        /**
     * The ID of the user who created the schema
* 
     * @return the value
     **/
    
    public String getCreatedBy() {
        return createdBy;
    }


        /**
     * The date and time the Data Lake Schema was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

        /**
     * The date and time the Data Lake Schema was created, in the format defined by [RFC 3339](https://tools.ietf.org/html/rfc3339).
* Example: {@code 2016-08-25T21:10:29.600Z}
* 
     * @return the value
     **/
    
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("BucketSummary(");
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BucketSummary)) {
            return false;
        }

        BucketSummary other = (BucketSummary) o;
        return java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.compartmentId, other.compartmentId) &&
            java.util.Objects.equals(this.createdBy, other.createdBy) &&
            java.util.Objects.equals(this.timeCreated, other.timeCreated);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        return result;
    }


}
