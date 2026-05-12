package com.oracle.aidataplatform.dp.model;



/**
 * The path details of init script.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=InitScriptPath.Builder.class)

public final class InitScriptPath  {
    @Deprecated
    @java.beans.ConstructorProperties({"destination"})
    public InitScriptPath(String destination) {
        super();
        this.destination = destination;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Full path of the init script file. Example - /Workspace/Shared/Folder1/my-init.sh or /Volumes/catalogName/schemaName/volumeName/Shared/Folder1/my-init.sh.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("destination")
private String destination;

        /**
         * Full path of the init script file. Example - /Workspace/Shared/Folder1/my-init.sh or /Volumes/catalogName/schemaName/volumeName/Shared/Folder1/my-init.sh.
         * @param destination the value to set
         * @return this builder
         **/
        

public Builder destination(String destination) {
    this.destination = destination;
    return this;
}


        public InitScriptPath build() {
            InitScriptPath model = new InitScriptPath(this.destination);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InitScriptPath model) {
                this.destination(model.getDestination());
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
     * Full path of the init script file. Example - /Workspace/Shared/Folder1/my-init.sh or /Volumes/catalogName/schemaName/volumeName/Shared/Folder1/my-init.sh.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    private final String destination;

        /**
     * Full path of the init script file. Example - /Workspace/Shared/Folder1/my-init.sh or /Volumes/catalogName/schemaName/volumeName/Shared/Folder1/my-init.sh.
     * @return the value
     **/
    
    public String getDestination() {
        return destination;
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
        sb.append("InitScriptPath(");
        sb.append("destination=").append(String.valueOf(this.destination));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InitScriptPath)) {
            return false;
        }

        InitScriptPath other = (InitScriptPath) o;
        return java.util.Objects.equals(this.destination, other.destination);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.destination == null ? 43 : this.destination.hashCode());
        return result;
    }


}
