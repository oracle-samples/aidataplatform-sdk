package com.oracle.aidataplatform.dp.model;



/**
 * The data to update a tool.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="toolType", defaultImpl=UpdateToolDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateCustomToolDetails.class, name = "CUSTOM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateHttpToolDetails.class, name = "HTTP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdatePromptToolDetails.class, name = "PROMPT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateRagToolDetails.class, name = "RAG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateSqlToolDetails.class, name = "SQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = UpdateNlToSqlToolDetails.class, name = "NL2SQL")
})

public class UpdateToolDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "description", "properties"})
    protected UpdateToolDetails(String displayName, String description, java.util.Map<String, Object> properties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.properties = properties;
    }




        /**
     * Tool name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * Tool name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * Tool description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Tool description.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * A list of key-value pairs to use for configuring the tool
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, Object> properties;

        /**
     * A list of key-value pairs to use for configuring the tool
     * @return the value
     **/
    
    public java.util.Map<String, Object> getProperties() {
        return properties;
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
        sb.append("UpdateToolDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateToolDetails)) {
            return false;
        }

        UpdateToolDetails other = (UpdateToolDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.properties, other.properties);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }


}
