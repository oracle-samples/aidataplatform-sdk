// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Request payload for discovering sources into an existing ontology project.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DiscoverExistingOntologyProjectDetails.Builder.class)

public final class DiscoverExistingOntologyProjectDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"discovery"})
    public DiscoverExistingOntologyProjectDetails(StartDiscoveryDetails discovery) {
        super();
        this.discovery = discovery;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("discovery")
private StartDiscoveryDetails discovery;



public Builder discovery(StartDiscoveryDetails discovery) {
    this.discovery = discovery;
    return this;
}


        public DiscoverExistingOntologyProjectDetails build() {
            DiscoverExistingOntologyProjectDetails model = new DiscoverExistingOntologyProjectDetails(this.discovery);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoverExistingOntologyProjectDetails model) {
                this.discovery(model.getDiscovery());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("discovery")
    private final StartDiscoveryDetails discovery;

    
    public StartDiscoveryDetails getDiscovery() {
        return discovery;
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
        sb.append("DiscoverExistingOntologyProjectDetails(");
        sb.append("discovery=").append(String.valueOf(this.discovery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoverExistingOntologyProjectDetails)) {
            return false;
        }

        DiscoverExistingOntologyProjectDetails other = (DiscoverExistingOntologyProjectDetails) o;
        return java.util.Objects.equals(this.discovery, other.discovery);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.discovery == null ? 43 : this.discovery.hashCode());
        return result;
    }


}
