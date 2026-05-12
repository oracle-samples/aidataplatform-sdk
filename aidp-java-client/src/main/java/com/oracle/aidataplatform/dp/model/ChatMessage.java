package com.oracle.aidataplatform.dp.model;



/**
 * The content of the chat query sent by the user.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ChatMessage.Builder.class)

public final class ChatMessage  {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "text", "imageUrl", "fileUrl"})
    public ChatMessage(Type type, String text, String imageUrl, String fileUrl) {
        super();
        this.type = type;
        this.text = text;
        this.imageUrl = imageUrl;
        this.fileUrl = fileUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Type of input.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("type")
private Type type;

        /**
         * Type of input.
         * @param type the value to set
         * @return this builder
         **/
        

public Builder type(Type type) {
    this.type = type;
    return this;
}
            /**
     * Text input from the user. Set this parameter when type is input_text.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("text")
private String text;

        /**
         * Text input from the user. Set this parameter when type is input_text.
         * @param text the value to set
         * @return this builder
         **/
        

public Builder text(String text) {
    this.text = text;
    return this;
}
            /**
     * Image URL for the image user intends to query. Set this parameter when type is input_image.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
private String imageUrl;

        /**
         * Image URL for the image user intends to query. Set this parameter when type is input_image.
         * @param imageUrl the value to set
         * @return this builder
         **/
        

public Builder imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
}
            /**
     * File URL for the image user intends to query. Set this parameter when type is input_file.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("fileUrl")
private String fileUrl;

        /**
         * File URL for the image user intends to query. Set this parameter when type is input_file.
         * @param fileUrl the value to set
         * @return this builder
         **/
        

public Builder fileUrl(String fileUrl) {
    this.fileUrl = fileUrl;
    return this;
}


        public ChatMessage build() {
            ChatMessage model = new ChatMessage(this.type
                , this.text
                , this.imageUrl
                , this.fileUrl);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChatMessage model) {
                this.type(model.getType());
    this.text(model.getText());
    this.imageUrl(model.getImageUrl());
    this.fileUrl(model.getFileUrl());
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
     * Type of input.
     **/
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        InputText("INPUT_TEXT"),
        InputImage("INPUT_IMAGE"),
        InputFile("INPUT_FILE"),
        ;

        

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
        /**
     * Type of input.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

        /**
     * Type of input.
     * @return the value
     **/
    
    public Type getType() {
        return type;
    }


        /**
     * Text input from the user. Set this parameter when type is input_text.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

        /**
     * Text input from the user. Set this parameter when type is input_text.
     * @return the value
     **/
    
    public String getText() {
        return text;
    }


        /**
     * Image URL for the image user intends to query. Set this parameter when type is input_image.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("imageUrl")
    private final String imageUrl;

        /**
     * Image URL for the image user intends to query. Set this parameter when type is input_image.
     * @return the value
     **/
    
    public String getImageUrl() {
        return imageUrl;
    }


        /**
     * File URL for the image user intends to query. Set this parameter when type is input_file.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("fileUrl")
    private final String fileUrl;

        /**
     * File URL for the image user intends to query. Set this parameter when type is input_file.
     * @return the value
     **/
    
    public String getFileUrl() {
        return fileUrl;
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
        sb.append("ChatMessage(");
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", text=").append(String.valueOf(this.text));
        sb.append(", imageUrl=").append(String.valueOf(this.imageUrl));
        sb.append(", fileUrl=").append(String.valueOf(this.fileUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatMessage)) {
            return false;
        }

        ChatMessage other = (ChatMessage) o;
        return java.util.Objects.equals(this.type, other.type) &&
            java.util.Objects.equals(this.text, other.text) &&
            java.util.Objects.equals(this.imageUrl, other.imageUrl) &&
            java.util.Objects.equals(this.fileUrl, other.fileUrl);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.imageUrl == null ? 43 : this.imageUrl.hashCode());
        result = (result * PRIME) + (this.fileUrl == null ? 43 : this.fileUrl.hashCode());
        return result;
    }


}
