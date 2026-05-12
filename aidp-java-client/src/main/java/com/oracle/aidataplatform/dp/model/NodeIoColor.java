package com.oracle.aidataplatform.dp.model;



/**
 * Text and background color configuration for a node input/output.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=NodeIoColor.Builder.class)

public final class NodeIoColor  {
    @Deprecated
    @java.beans.ConstructorProperties({"textColor", "backgroundColor", "handleColor"})
    public NodeIoColor(TextColor textColor, String backgroundColor, String handleColor) {
        super();
        this.textColor = textColor;
        this.backgroundColor = backgroundColor;
        this.handleColor = handleColor;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Whether the text on badges should be dark or light for visibility.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("textColor")
private TextColor textColor;

        /**
         * Whether the text on badges should be dark or light for visibility.
         * @param textColor the value to set
         * @return this builder
         **/
        

public Builder textColor(TextColor textColor) {
    this.textColor = textColor;
    return this;
}
            /**
     * Input/output badge background color.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("backgroundColor")
private String backgroundColor;

        /**
         * Input/output badge background color.
         * @param backgroundColor the value to set
         * @return this builder
         **/
        

public Builder backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
}
            /**
     * Input/output connector handle color.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("handleColor")
private String handleColor;

        /**
         * Input/output connector handle color.
         * @param handleColor the value to set
         * @return this builder
         **/
        

public Builder handleColor(String handleColor) {
    this.handleColor = handleColor;
    return this;
}


        public NodeIoColor build() {
            NodeIoColor model = new NodeIoColor(this.textColor
                , this.backgroundColor
                , this.handleColor);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeIoColor model) {
                this.textColor(model.getTextColor());
    this.backgroundColor(model.getBackgroundColor());
    this.handleColor(model.getHandleColor());
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
     * Whether the text on badges should be dark or light for visibility.
     **/
    public enum TextColor implements com.oracle.bmc.http.internal.BmcEnum {
        Dark("DARK"),
        Light("LIGHT"),
        ;

        

        private final String value;
        private static java.util.Map<String, TextColor> map;

        static {
            map = new java.util.HashMap<>();
            for (TextColor v : TextColor.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        TextColor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TextColor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TextColor: " + key);
        }
    };
        /**
     * Whether the text on badges should be dark or light for visibility.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("textColor")
    private final TextColor textColor;

        /**
     * Whether the text on badges should be dark or light for visibility.
     * @return the value
     **/
    
    public TextColor getTextColor() {
        return textColor;
    }


        /**
     * Input/output badge background color.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("backgroundColor")
    private final String backgroundColor;

        /**
     * Input/output badge background color.
     * @return the value
     **/
    
    public String getBackgroundColor() {
        return backgroundColor;
    }


        /**
     * Input/output connector handle color.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("handleColor")
    private final String handleColor;

        /**
     * Input/output connector handle color.
     * @return the value
     **/
    
    public String getHandleColor() {
        return handleColor;
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
        sb.append("NodeIoColor(");
        sb.append("textColor=").append(String.valueOf(this.textColor));
        sb.append(", backgroundColor=").append(String.valueOf(this.backgroundColor));
        sb.append(", handleColor=").append(String.valueOf(this.handleColor));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeIoColor)) {
            return false;
        }

        NodeIoColor other = (NodeIoColor) o;
        return java.util.Objects.equals(this.textColor, other.textColor) &&
            java.util.Objects.equals(this.backgroundColor, other.backgroundColor) &&
            java.util.Objects.equals(this.handleColor, other.handleColor);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.textColor == null ? 43 : this.textColor.hashCode());
        result = (result * PRIME) + (this.backgroundColor == null ? 43 : this.backgroundColor.hashCode());
        result = (result * PRIME) + (this.handleColor == null ? 43 : this.handleColor.hashCode());
        return result;
    }


}
