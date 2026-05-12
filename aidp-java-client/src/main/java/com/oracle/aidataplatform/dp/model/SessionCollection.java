package com.oracle.aidataplatform.dp.model;



/**
 * A list of session summaries related to a workspace.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=SessionCollection.Builder.class)

public final class SessionCollection  {
    @Deprecated
    @java.beans.ConstructorProperties({"items"})
    public SessionCollection(java.util.List<SessionSummary> items) {
        super();
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * List of sessions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("items")
private java.util.List<SessionSummary> items;

        /**
         * List of sessions.
         * @param items the value to set
         * @return this builder
         **/
        

public Builder items(java.util.List<SessionSummary> items) {
    this.items = items;
    return this;
}


        public SessionCollection build() {
            SessionCollection model = new SessionCollection(this.items);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SessionCollection model) {
                this.items(model.getItems());
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
     * List of sessions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<SessionSummary> items;

        /**
     * List of sessions.
     * @return the value
     **/
    
    public java.util.List<SessionSummary> getItems() {
        return items;
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
        sb.append("SessionCollection(");
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionCollection)) {
            return false;
        }

        SessionCollection other = (SessionCollection) o;
        return java.util.Objects.equals(this.items, other.items);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        return result;
    }


}
