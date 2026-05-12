package com.oracle.aidataplatform.dp.model;



/**
 * Details to move a workspace object to a different location.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MoveWorkspaceObjectDetails.Builder.class)

public final class MoveWorkspaceObjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"fromPath", "toPath"})
    public MoveWorkspaceObjectDetails(String fromPath, String toPath) {
        super();
        this.fromPath = fromPath;
        this.toPath = toPath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The fully qualified path of the workspace object that should be moved.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fromPath")
private String fromPath;

        /**
         * The fully qualified path of the workspace object that should be moved.
         * @param fromPath the value to set
         * @return this builder
         **/
        

public Builder fromPath(String fromPath) {
    this.fromPath = fromPath;
    return this;
}
            /**
     * The fully qualified destination path to which the Workspace object should be moved.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("toPath")
private String toPath;

        /**
         * The fully qualified destination path to which the Workspace object should be moved.
         * @param toPath the value to set
         * @return this builder
         **/
        

public Builder toPath(String toPath) {
    this.toPath = toPath;
    return this;
}


        public MoveWorkspaceObjectDetails build() {
            MoveWorkspaceObjectDetails model = new MoveWorkspaceObjectDetails(this.fromPath
                , this.toPath);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MoveWorkspaceObjectDetails model) {
                this.fromPath(model.getFromPath());
    this.toPath(model.getToPath());
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
     * The fully qualified path of the workspace object that should be moved.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fromPath")
    private final String fromPath;

        /**
     * The fully qualified path of the workspace object that should be moved.
     * @return the value
     **/
    
    public String getFromPath() {
        return fromPath;
    }


        /**
     * The fully qualified destination path to which the Workspace object should be moved.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("toPath")
    private final String toPath;

        /**
     * The fully qualified destination path to which the Workspace object should be moved.
     * @return the value
     **/
    
    public String getToPath() {
        return toPath;
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
        sb.append("MoveWorkspaceObjectDetails(");
        sb.append("fromPath=").append(String.valueOf(this.fromPath));
        sb.append(", toPath=").append(String.valueOf(this.toPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MoveWorkspaceObjectDetails)) {
            return false;
        }

        MoveWorkspaceObjectDetails other = (MoveWorkspaceObjectDetails) o;
        return java.util.Objects.equals(this.fromPath, other.fromPath) &&
            java.util.Objects.equals(this.toPath, other.toPath);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fromPath == null ? 43 : this.fromPath.hashCode());
        result = (result * PRIME) + (this.toPath == null ? 43 : this.toPath.hashCode());
        return result;
    }


}
