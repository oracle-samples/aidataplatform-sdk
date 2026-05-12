package com.oracle.aidataplatform.dp.model;



/**
 * A 2D point for edge handles on diagram elements.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=Point.Builder.class)

public final class Point  {
    @Deprecated
    @java.beans.ConstructorProperties({"x", "y"})
    public Point(Float x, Float y) {
        super();
        this.x = x;
        this.y = y;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * X coordinate.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("x")
private Float x;

        /**
         * X coordinate.
         * @param x the value to set
         * @return this builder
         **/
        

public Builder x(Float x) {
    this.x = x;
    return this;
}
            /**
     * Y coordinate.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("y")
private Float y;

        /**
         * Y coordinate.
         * @param y the value to set
         * @return this builder
         **/
        

public Builder y(Float y) {
    this.y = y;
    return this;
}


        public Point build() {
            Point model = new Point(this.x
                , this.y);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Point model) {
                this.x(model.getX());
    this.y(model.getY());
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
     * X coordinate.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("x")
    private final Float x;

        /**
     * X coordinate.
     * @return the value
     **/
    
    public Float getX() {
        return x;
    }


        /**
     * Y coordinate.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("y")
    private final Float y;

        /**
     * Y coordinate.
     * @return the value
     **/
    
    public Float getY() {
        return y;
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
        sb.append("Point(");
        sb.append("x=").append(String.valueOf(this.x));
        sb.append(", y=").append(String.valueOf(this.y));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Point)) {
            return false;
        }

        Point other = (Point) o;
        return java.util.Objects.equals(this.x, other.x) &&
            java.util.Objects.equals(this.y, other.y);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.x == null ? 43 : this.x.hashCode());
        result = (result * PRIME) + (this.y == null ? 43 : this.y.hashCode());
        return result;
    }


}
