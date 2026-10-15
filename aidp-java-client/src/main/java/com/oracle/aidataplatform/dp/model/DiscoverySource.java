// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * 
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DiscoverySource.Builder.class)

public final class DiscoverySource  {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceType", "kind", "key", "catalogType", "profiling", "location", "ontologyTtl", "mode", "validateOnly", "selection"})
    public DiscoverySource(SourceType sourceType, String kind, String key, CatalogType catalogType, Boolean profiling, DiscoveryLocation location, DiscoveryLocation ontologyTtl, Mode mode, Boolean validateOnly, DiscoverySelection selection) {
        super();
        this.sourceType = sourceType;
        this.kind = kind;
        this.key = key;
        this.catalogType = catalogType;
        this.profiling = profiling;
        this.location = location;
        this.ontologyTtl = ontologyTtl;
        this.mode = mode;
        this.validateOnly = validateOnly;
        this.selection = selection;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("sourceType")
private SourceType sourceType;



public Builder sourceType(SourceType sourceType) {
    this.sourceType = sourceType;
    return this;
}
            /**
     * Source kind forwarded to DFL; defaults per sourceType (catalog, credential_store, volume)
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("kind")
private String kind;

        /**
         * Source kind forwarded to DFL; defaults per sourceType (catalog, credential_store, volume)
         * @param kind the value to set
         * @return this builder
         **/
        

public Builder kind(String kind) {
    this.kind = kind;
    return this;
}
            /**
     * Connection or catalog key; volume key for DOCUMENTS and TTL sources
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("key")
private String key;

        /**
         * Connection or catalog key; volume key for DOCUMENTS and TTL sources
         * @param key the value to set
         * @return this builder
         **/
        

public Builder key(String key) {
    this.key = key;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("catalogType")
private CatalogType catalogType;



public Builder catalogType(CatalogType catalogType) {
    this.catalogType = catalogType;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("profiling")
private Boolean profiling;



public Builder profiling(Boolean profiling) {
    this.profiling = profiling;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("location")
private DiscoveryLocation location;



public Builder location(DiscoveryLocation location) {
    this.location = location;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("ontologyTtl")
private DiscoveryLocation ontologyTtl;



public Builder ontologyTtl(DiscoveryLocation ontologyTtl) {
    this.ontologyTtl = ontologyTtl;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("mode")
private Mode mode;



public Builder mode(Mode mode) {
    this.mode = mode;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("validateOnly")
private Boolean validateOnly;



public Builder validateOnly(Boolean validateOnly) {
    this.validateOnly = validateOnly;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("selection")
private DiscoverySelection selection;



public Builder selection(DiscoverySelection selection) {
    this.selection = selection;
    return this;
}


        public DiscoverySource build() {
            DiscoverySource model = new DiscoverySource(this.sourceType
                , this.kind
                , this.key
                , this.catalogType
                , this.profiling
                , this.location
                , this.ontologyTtl
                , this.mode
                , this.validateOnly
                , this.selection);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoverySource model) {
                this.sourceType(model.getSourceType());
    this.kind(model.getKind());
    this.key(model.getKey());
    this.catalogType(model.getCatalogType());
    this.profiling(model.getProfiling());
    this.location(model.getLocation());
    this.ontologyTtl(model.getOntologyTtl());
    this.mode(model.getMode());
    this.validateOnly(model.getValidateOnly());
    this.selection(model.getSelection());
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
     **/
    public enum SourceType implements com.oracle.bmc.http.internal.BmcEnum {
        CatalogConnection("CATALOG_CONNECTION"),
        CredStore("CRED_STORE"),
        Ttl("TTL"),
        Documents("DOCUMENTS"),
        ;

        

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SourceType: " + key);
        }
    };
    
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    
    public SourceType getSourceType() {
        return sourceType;
    }


        /**
     * Source kind forwarded to DFL; defaults per sourceType (catalog, credential_store, volume)
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final String kind;

        /**
     * Source kind forwarded to DFL; defaults per sourceType (catalog, credential_store, volume)
     * @return the value
     **/
    
    public String getKind() {
        return kind;
    }


        /**
     * Connection or catalog key; volume key for DOCUMENTS and TTL sources
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

        /**
     * Connection or catalog key; volume key for DOCUMENTS and TTL sources
     * @return the value
     **/
    
    public String getKey() {
        return key;
    }

    /**
     **/
    public enum CatalogType implements com.oracle.bmc.http.internal.BmcEnum {
        Internal("INTERNAL"),
        External("EXTERNAL"),
        ;

        

        private final String value;
        private static java.util.Map<String, CatalogType> map;

        static {
            map = new java.util.HashMap<>();
            for (CatalogType v : CatalogType.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        CatalogType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CatalogType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CatalogType: " + key);
        }
    };
    
    @com.fasterxml.jackson.annotation.JsonProperty("catalogType")
    private final CatalogType catalogType;

    
    public CatalogType getCatalogType() {
        return catalogType;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("profiling")
    private final Boolean profiling;

    
    public Boolean getProfiling() {
        return profiling;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final DiscoveryLocation location;

    
    public DiscoveryLocation getLocation() {
        return location;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("ontologyTtl")
    private final DiscoveryLocation ontologyTtl;

    
    public DiscoveryLocation getOntologyTtl() {
        return ontologyTtl;
    }

    /**
     **/
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        BuildFromScratch("BUILD_FROM_SCRATCH"),
        Enrich("ENRICH"),
        Discover("DISCOVER"),
        ;

        

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                    map.put(v.getValue(), v);
                
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Mode: " + key);
        }
    };
    
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    
    public Mode getMode() {
        return mode;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("validateOnly")
    private final Boolean validateOnly;

    
    public Boolean getValidateOnly() {
        return validateOnly;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("selection")
    private final DiscoverySelection selection;

    
    public DiscoverySelection getSelection() {
        return selection;
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
        sb.append("DiscoverySource(");
        sb.append("sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", kind=").append(String.valueOf(this.kind));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", catalogType=").append(String.valueOf(this.catalogType));
        sb.append(", profiling=").append(String.valueOf(this.profiling));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", ontologyTtl=").append(String.valueOf(this.ontologyTtl));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", validateOnly=").append(String.valueOf(this.validateOnly));
        sb.append(", selection=").append(String.valueOf(this.selection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiscoverySource)) {
            return false;
        }

        DiscoverySource other = (DiscoverySource) o;
        return java.util.Objects.equals(this.sourceType, other.sourceType) &&
            java.util.Objects.equals(this.kind, other.kind) &&
            java.util.Objects.equals(this.key, other.key) &&
            java.util.Objects.equals(this.catalogType, other.catalogType) &&
            java.util.Objects.equals(this.profiling, other.profiling) &&
            java.util.Objects.equals(this.location, other.location) &&
            java.util.Objects.equals(this.ontologyTtl, other.ontologyTtl) &&
            java.util.Objects.equals(this.mode, other.mode) &&
            java.util.Objects.equals(this.validateOnly, other.validateOnly) &&
            java.util.Objects.equals(this.selection, other.selection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.catalogType == null ? 43 : this.catalogType.hashCode());
        result = (result * PRIME) + (this.profiling == null ? 43 : this.profiling.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.ontologyTtl == null ? 43 : this.ontologyTtl.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.validateOnly == null ? 43 : this.validateOnly.hashCode());
        result = (result * PRIME) + (this.selection == null ? 43 : this.selection.hashCode());
        return result;
    }


}
