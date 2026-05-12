package com.oracle.aidataplatform.dp.model;



/**
 * A summarized metric result containing aggregated data points.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=MetricsSummary.Builder.class)

public final class MetricsSummary  {
    @Deprecated
    @java.beans.ConstructorProperties({"namespace", "compartmentId", "name", "dimensions", "metadata", "resolution", "resourceGroup", "aggregatedDataPoints"})
    public MetricsSummary(String namespace, String compartmentId, String name, Object dimensions, Object metadata, String resolution, String resourceGroup, java.util.List<AggregatedDataPoint> aggregatedDataPoints) {
        super();
        this.namespace = namespace;
        this.compartmentId = compartmentId;
        this.name = name;
        this.dimensions = dimensions;
        this.metadata = metadata;
        this.resolution = resolution;
        this.resourceGroup = resourceGroup;
        this.aggregatedDataPoints = aggregatedDataPoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * The source service or application that emitted the metric.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("namespace")
private String namespace;

        /**
         * The source service or application that emitted the metric.
         * @param namespace the value to set
         * @return this builder
         **/
        

public Builder namespace(String namespace) {
    this.namespace = namespace;
    return this;
}
            /**
     * The OCID of the compartment containing the resources that the aggregated data was returned from.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
private String compartmentId;

        /**
         * The OCID of the compartment containing the resources that the aggregated data was returned from.
         * @param compartmentId the value to set
         * @return this builder
         **/
        

public Builder compartmentId(String compartmentId) {
    this.compartmentId = compartmentId;
    return this;
}
            /**
     * The name of the metric.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * The name of the metric.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Key-value pairs that provide context for the metric.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("dimensions")
private Object dimensions;

        /**
         * Key-value pairs that provide context for the metric.
         * @param dimensions the value to set
         * @return this builder
         **/
        

public Builder dimensions(Object dimensions) {
    this.dimensions = dimensions;
    return this;
}
            /**
     * Additional references provided in the metric definition.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metadata")
private Object metadata;

        /**
         * Additional references provided in the metric definition.
         * @param metadata the value to set
         * @return this builder
         **/
        

public Builder metadata(Object metadata) {
    this.metadata = metadata;
    return this;
}
            /**
     * The time between calculated aggregation windows.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("resolution")
private String resolution;

        /**
         * The time between calculated aggregation windows.
         * @param resolution the value to set
         * @return this builder
         **/
        

public Builder resolution(String resolution) {
    this.resolution = resolution;
    return this;
}
            /**
     * A custom string used for grouping related metrics.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
private String resourceGroup;

        /**
         * A custom string used for grouping related metrics.
         * @param resourceGroup the value to set
         * @return this builder
         **/
        

public Builder resourceGroup(String resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
}
            /**
     * List of timestamp-value pairs for the metric.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("aggregatedDataPoints")
private java.util.List<AggregatedDataPoint> aggregatedDataPoints;

        /**
         * List of timestamp-value pairs for the metric.
         * @param aggregatedDataPoints the value to set
         * @return this builder
         **/
        

public Builder aggregatedDataPoints(java.util.List<AggregatedDataPoint> aggregatedDataPoints) {
    this.aggregatedDataPoints = aggregatedDataPoints;
    return this;
}


        public MetricsSummary build() {
            MetricsSummary model = new MetricsSummary(this.namespace
                , this.compartmentId
                , this.name
                , this.dimensions
                , this.metadata
                , this.resolution
                , this.resourceGroup
                , this.aggregatedDataPoints);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MetricsSummary model) {
                this.namespace(model.getNamespace());
    this.compartmentId(model.getCompartmentId());
    this.name(model.getName());
    this.dimensions(model.getDimensions());
    this.metadata(model.getMetadata());
    this.resolution(model.getResolution());
    this.resourceGroup(model.getResourceGroup());
    this.aggregatedDataPoints(model.getAggregatedDataPoints());
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
     * The source service or application that emitted the metric.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

        /**
     * The source service or application that emitted the metric.
     * @return the value
     **/
    
    public String getNamespace() {
        return namespace;
    }


        /**
     * The OCID of the compartment containing the resources that the aggregated data was returned from.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

        /**
     * The OCID of the compartment containing the resources that the aggregated data was returned from.
     * @return the value
     **/
    
    public String getCompartmentId() {
        return compartmentId;
    }


        /**
     * The name of the metric.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * The name of the metric.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Key-value pairs that provide context for the metric.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final Object dimensions;

        /**
     * Key-value pairs that provide context for the metric.
     * @return the value
     **/
    
    public Object getDimensions() {
        return dimensions;
    }


        /**
     * Additional references provided in the metric definition.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final Object metadata;

        /**
     * Additional references provided in the metric definition.
     * @return the value
     **/
    
    public Object getMetadata() {
        return metadata;
    }


        /**
     * The time between calculated aggregation windows.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resolution")
    private final String resolution;

        /**
     * The time between calculated aggregation windows.
     * @return the value
     **/
    
    public String getResolution() {
        return resolution;
    }


        /**
     * A custom string used for grouping related metrics.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("resourceGroup")
    private final String resourceGroup;

        /**
     * A custom string used for grouping related metrics.
     * @return the value
     **/
    
    public String getResourceGroup() {
        return resourceGroup;
    }


        /**
     * List of timestamp-value pairs for the metric.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedDataPoints")
    private final java.util.List<AggregatedDataPoint> aggregatedDataPoints;

        /**
     * List of timestamp-value pairs for the metric.
     * @return the value
     **/
    
    public java.util.List<AggregatedDataPoint> getAggregatedDataPoints() {
        return aggregatedDataPoints;
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
        sb.append("MetricsSummary(");
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", resolution=").append(String.valueOf(this.resolution));
        sb.append(", resourceGroup=").append(String.valueOf(this.resourceGroup));
        sb.append(", aggregatedDataPoints=").append(String.valueOf(this.aggregatedDataPoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MetricsSummary)) {
            return false;
        }

        MetricsSummary other = (MetricsSummary) o;
        return java.util.Objects.equals(this.namespace, other.namespace) &&
            java.util.Objects.equals(this.compartmentId, other.compartmentId) &&
            java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.dimensions, other.dimensions) &&
            java.util.Objects.equals(this.metadata, other.metadata) &&
            java.util.Objects.equals(this.resolution, other.resolution) &&
            java.util.Objects.equals(this.resourceGroup, other.resourceGroup) &&
            java.util.Objects.equals(this.aggregatedDataPoints, other.aggregatedDataPoints);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.resolution == null ? 43 : this.resolution.hashCode());
        result = (result * PRIME) + (this.resourceGroup == null ? 43 : this.resourceGroup.hashCode());
        result = (result * PRIME) + (this.aggregatedDataPoints == null ? 43 : this.aggregatedDataPoints.hashCode());
        return result;
    }


}
