// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * An output slot for a node, including type and requirements.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NodeOutput.Builder.class)

public final class NodeOutput  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "type", "portPosition", "description", "isRequired"})
    public NodeOutput(String name, NodeIo type, NodePortPosition portPosition, String description, Boolean isRequired) {
        super();
        this.name = name;
        this.type = type;
        this.portPosition = portPosition;
        this.description = description;
        this.isRequired = isRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Unique name for the output slot.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Unique name for the output slot.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("type")
private NodeIo type;



public Builder type(NodeIo type) {
    this.type = type;
    return this;
}
            /**
     * UI position of the output port on the node.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("portPosition")
private NodePortPosition portPosition;

        /**
         * UI position of the output port on the node.
         * @param portPosition the value to set
         * @return this builder
         **/
        

public Builder portPosition(NodePortPosition portPosition) {
    this.portPosition = portPosition;
    return this;
}
            /**
     * Documentation or tooltip shown in the UI.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Documentation or tooltip shown in the UI.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * True if this output is mandatory.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("isRequired")
private Boolean isRequired;

        /**
         * True if this output is mandatory.
         * @param isRequired the value to set
         * @return this builder
         **/
        

public Builder isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
}


        public NodeOutput build() {
            NodeOutput model = new NodeOutput(this.name
                , this.type
                , this.portPosition
                , this.description
                , this.isRequired);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeOutput model) {
                this.name(model.getName());
    this.type(model.getType());
    this.portPosition(model.getPortPosition());
    this.description(model.getDescription());
    this.isRequired(model.getIsRequired());
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
     * Unique name for the output slot.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Unique name for the output slot.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final NodeIo type;

    
    public NodeIo getType() {
        return type;
    }

    
        /**
     * UI position of the output port on the node.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("portPosition")
    private final NodePortPosition portPosition;

        /**
     * UI position of the output port on the node.
     * @return the value
     **/
    
    public NodePortPosition getPortPosition() {
        return portPosition;
    }


        /**
     * Documentation or tooltip shown in the UI.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Documentation or tooltip shown in the UI.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * True if this output is mandatory.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

        /**
     * True if this output is mandatory.
     * @return the value
     **/
    
    public Boolean getIsRequired() {
        return isRequired;
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
        sb.append("NodeOutput(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", portPosition=").append(String.valueOf(this.portPosition));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeOutput)) {
            return false;
        }

        NodeOutput other = (NodeOutput) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.portPosition, other.portPosition) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.isRequired, other.isRequired);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.portPosition == null ? 43 : this.portPosition.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        return result;
    }


}
