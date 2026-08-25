// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Hierarchy level metadata for an Oracle Analytics hierarchical column.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=OacObjectHierarchyLevel.Builder.class)

public final class OacObjectHierarchyLevel  {
    @Deprecated
    @java.beans.ConstructorProperties({"levelID", "displayName", "desc"})
    public OacObjectHierarchyLevel(String levelID, String displayName, String desc) {
        super();
        this.levelID = levelID;
        this.displayName = displayName;
        this.desc = desc;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The Oracle Analytics hierarchy level identifier.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("levelID")
private String levelID;

        /**
         * The Oracle Analytics hierarchy level identifier.
         * @param levelID the value to set
         * @return this builder
         **/
        

public Builder levelID(String levelID) {
    this.levelID = levelID;
    return this;
}
            /**
     * The Oracle Analytics hierarchy level display name.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("displayName")
private String displayName;

        /**
         * The Oracle Analytics hierarchy level display name.
         * @param displayName the value to set
         * @return this builder
         **/
        

public Builder displayName(String displayName) {
    this.displayName = displayName;
    return this;
}
            /**
     * The Oracle Analytics hierarchy level description.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("desc")
private String desc;

        /**
         * The Oracle Analytics hierarchy level description.
         * @param desc the value to set
         * @return this builder
         **/
        

public Builder desc(String desc) {
    this.desc = desc;
    return this;
}


        public OacObjectHierarchyLevel build() {
            OacObjectHierarchyLevel model = new OacObjectHierarchyLevel(this.levelID
                , this.displayName
                , this.desc);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OacObjectHierarchyLevel model) {
                this.levelID(model.getLevelID());
    this.displayName(model.getDisplayName());
    this.desc(model.getDesc());
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
     * The Oracle Analytics hierarchy level identifier.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("levelID")
    private final String levelID;

        /**
     * The Oracle Analytics hierarchy level identifier.
     * @return the value
     **/
    
    public String getLevelID() {
        return levelID;
    }


        /**
     * The Oracle Analytics hierarchy level display name.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

        /**
     * The Oracle Analytics hierarchy level display name.
     * @return the value
     **/
    
    public String getDisplayName() {
        return displayName;
    }


        /**
     * The Oracle Analytics hierarchy level description.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("desc")
    private final String desc;

        /**
     * The Oracle Analytics hierarchy level description.
     * @return the value
     **/
    
    public String getDesc() {
        return desc;
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
        sb.append("OacObjectHierarchyLevel(");
        sb.append("levelID=").append(String.valueOf(this.levelID));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", desc=").append(String.valueOf(this.desc));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OacObjectHierarchyLevel)) {
            return false;
        }

        OacObjectHierarchyLevel other = (OacObjectHierarchyLevel) o;
        return java.util.Objects.equals(this.levelID, other.levelID) &&
            java.util.Objects.equals(this.displayName, other.displayName) &&
            java.util.Objects.equals(this.desc, other.desc);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.levelID == null ? 43 : this.levelID.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.desc == null ? 43 : this.desc.hashCode());
        return result;
    }


}
