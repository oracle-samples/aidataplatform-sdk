package com.oracle.aidataplatform.dp.model;



/**
 * Details of each Model Parameter
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=ModelParameterResponse.Builder.class)

public final class ModelParameterResponse  {
    @Deprecated
    @java.beans.ConstructorProperties({"maximumOutputTokens", "temperature", "topP", "topK", "frequencyPenalty", "presencePenalty", "seed", "reasoningEffort", "numberOfGenerations", "truncate", "preambleOverride", "safetyMode"})
    public ModelParameterResponse(ModelParameterDetail maximumOutputTokens, ModelParameterDetail temperature, ModelParameterDetail topP, ModelParameterDetail topK, ModelParameterDetail frequencyPenalty, ModelParameterDetail presencePenalty, ModelParameterDetail seed, ModelParameterDetail reasoningEffort, ModelParameterDetail numberOfGenerations, ModelParameterDetail truncate, ModelParameterDetail preambleOverride, ModelParameterDetail safetyMode) {
        super();
        this.maximumOutputTokens = maximumOutputTokens;
        this.temperature = temperature;
        this.topP = topP;
        this.topK = topK;
        this.frequencyPenalty = frequencyPenalty;
        this.presencePenalty = presencePenalty;
        this.seed = seed;
        this.reasoningEffort = reasoningEffort;
        this.numberOfGenerations = numberOfGenerations;
        this.truncate = truncate;
        this.preambleOverride = preambleOverride;
        this.safetyMode = safetyMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
            
@com.fasterxml.jackson.annotation.JsonProperty("maximumOutputTokens")
private ModelParameterDetail maximumOutputTokens;



public Builder maximumOutputTokens(ModelParameterDetail maximumOutputTokens) {
    this.maximumOutputTokens = maximumOutputTokens;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("temperature")
private ModelParameterDetail temperature;



public Builder temperature(ModelParameterDetail temperature) {
    this.temperature = temperature;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("topP")
private ModelParameterDetail topP;



public Builder topP(ModelParameterDetail topP) {
    this.topP = topP;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("topK")
private ModelParameterDetail topK;



public Builder topK(ModelParameterDetail topK) {
    this.topK = topK;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
private ModelParameterDetail frequencyPenalty;



public Builder frequencyPenalty(ModelParameterDetail frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
private ModelParameterDetail presencePenalty;



public Builder presencePenalty(ModelParameterDetail presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("seed")
private ModelParameterDetail seed;



public Builder seed(ModelParameterDetail seed) {
    this.seed = seed;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("reasoningEffort")
private ModelParameterDetail reasoningEffort;



public Builder reasoningEffort(ModelParameterDetail reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("numberOfGenerations")
private ModelParameterDetail numberOfGenerations;



public Builder numberOfGenerations(ModelParameterDetail numberOfGenerations) {
    this.numberOfGenerations = numberOfGenerations;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("truncate")
private ModelParameterDetail truncate;



public Builder truncate(ModelParameterDetail truncate) {
    this.truncate = truncate;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("preambleOverride")
private ModelParameterDetail preambleOverride;



public Builder preambleOverride(ModelParameterDetail preambleOverride) {
    this.preambleOverride = preambleOverride;
    return this;
}
        
@com.fasterxml.jackson.annotation.JsonProperty("safetyMode")
private ModelParameterDetail safetyMode;



public Builder safetyMode(ModelParameterDetail safetyMode) {
    this.safetyMode = safetyMode;
    return this;
}


        public ModelParameterResponse build() {
            ModelParameterResponse model = new ModelParameterResponse(this.maximumOutputTokens
                , this.temperature
                , this.topP
                , this.topK
                , this.frequencyPenalty
                , this.presencePenalty
                , this.seed
                , this.reasoningEffort
                , this.numberOfGenerations
                , this.truncate
                , this.preambleOverride
                , this.safetyMode);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelParameterResponse model) {
                this.maximumOutputTokens(model.getMaximumOutputTokens());
    this.temperature(model.getTemperature());
    this.topP(model.getTopP());
    this.topK(model.getTopK());
    this.frequencyPenalty(model.getFrequencyPenalty());
    this.presencePenalty(model.getPresencePenalty());
    this.seed(model.getSeed());
    this.reasoningEffort(model.getReasoningEffort());
    this.numberOfGenerations(model.getNumberOfGenerations());
    this.truncate(model.getTruncate());
    this.preambleOverride(model.getPreambleOverride());
    this.safetyMode(model.getSafetyMode());
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

    


    
    @com.fasterxml.jackson.annotation.JsonProperty("maximumOutputTokens")
    private final ModelParameterDetail maximumOutputTokens;

    
    public ModelParameterDetail getMaximumOutputTokens() {
        return maximumOutputTokens;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("temperature")
    private final ModelParameterDetail temperature;

    
    public ModelParameterDetail getTemperature() {
        return temperature;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("topP")
    private final ModelParameterDetail topP;

    
    public ModelParameterDetail getTopP() {
        return topP;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("topK")
    private final ModelParameterDetail topK;

    
    public ModelParameterDetail getTopK() {
        return topK;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("frequencyPenalty")
    private final ModelParameterDetail frequencyPenalty;

    
    public ModelParameterDetail getFrequencyPenalty() {
        return frequencyPenalty;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("presencePenalty")
    private final ModelParameterDetail presencePenalty;

    
    public ModelParameterDetail getPresencePenalty() {
        return presencePenalty;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("seed")
    private final ModelParameterDetail seed;

    
    public ModelParameterDetail getSeed() {
        return seed;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("reasoningEffort")
    private final ModelParameterDetail reasoningEffort;

    
    public ModelParameterDetail getReasoningEffort() {
        return reasoningEffort;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfGenerations")
    private final ModelParameterDetail numberOfGenerations;

    
    public ModelParameterDetail getNumberOfGenerations() {
        return numberOfGenerations;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("truncate")
    private final ModelParameterDetail truncate;

    
    public ModelParameterDetail getTruncate() {
        return truncate;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("preambleOverride")
    private final ModelParameterDetail preambleOverride;

    
    public ModelParameterDetail getPreambleOverride() {
        return preambleOverride;
    }


    
    @com.fasterxml.jackson.annotation.JsonProperty("safetyMode")
    private final ModelParameterDetail safetyMode;

    
    public ModelParameterDetail getSafetyMode() {
        return safetyMode;
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
        sb.append("ModelParameterResponse(");
        sb.append("maximumOutputTokens=").append(String.valueOf(this.maximumOutputTokens));
        sb.append(", temperature=").append(String.valueOf(this.temperature));
        sb.append(", topP=").append(String.valueOf(this.topP));
        sb.append(", topK=").append(String.valueOf(this.topK));
        sb.append(", frequencyPenalty=").append(String.valueOf(this.frequencyPenalty));
        sb.append(", presencePenalty=").append(String.valueOf(this.presencePenalty));
        sb.append(", seed=").append(String.valueOf(this.seed));
        sb.append(", reasoningEffort=").append(String.valueOf(this.reasoningEffort));
        sb.append(", numberOfGenerations=").append(String.valueOf(this.numberOfGenerations));
        sb.append(", truncate=").append(String.valueOf(this.truncate));
        sb.append(", preambleOverride=").append(String.valueOf(this.preambleOverride));
        sb.append(", safetyMode=").append(String.valueOf(this.safetyMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelParameterResponse)) {
            return false;
        }

        ModelParameterResponse other = (ModelParameterResponse) o;
        return java.util.Objects.equals(this.maximumOutputTokens, other.maximumOutputTokens) &&
            java.util.Objects.equals(this.temperature, other.temperature) &&
            java.util.Objects.equals(this.topP, other.topP) &&
            java.util.Objects.equals(this.topK, other.topK) &&
            java.util.Objects.equals(this.frequencyPenalty, other.frequencyPenalty) &&
            java.util.Objects.equals(this.presencePenalty, other.presencePenalty) &&
            java.util.Objects.equals(this.seed, other.seed) &&
            java.util.Objects.equals(this.reasoningEffort, other.reasoningEffort) &&
            java.util.Objects.equals(this.numberOfGenerations, other.numberOfGenerations) &&
            java.util.Objects.equals(this.truncate, other.truncate) &&
            java.util.Objects.equals(this.preambleOverride, other.preambleOverride) &&
            java.util.Objects.equals(this.safetyMode, other.safetyMode);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maximumOutputTokens == null ? 43 : this.maximumOutputTokens.hashCode());
        result = (result * PRIME) + (this.temperature == null ? 43 : this.temperature.hashCode());
        result = (result * PRIME) + (this.topP == null ? 43 : this.topP.hashCode());
        result = (result * PRIME) + (this.topK == null ? 43 : this.topK.hashCode());
        result = (result * PRIME) + (this.frequencyPenalty == null ? 43 : this.frequencyPenalty.hashCode());
        result = (result * PRIME) + (this.presencePenalty == null ? 43 : this.presencePenalty.hashCode());
        result = (result * PRIME) + (this.seed == null ? 43 : this.seed.hashCode());
        result = (result * PRIME) + (this.reasoningEffort == null ? 43 : this.reasoningEffort.hashCode());
        result = (result * PRIME) + (this.numberOfGenerations == null ? 43 : this.numberOfGenerations.hashCode());
        result = (result * PRIME) + (this.truncate == null ? 43 : this.truncate.hashCode());
        result = (result * PRIME) + (this.preambleOverride == null ? 43 : this.preambleOverride.hashCode());
        result = (result * PRIME) + (this.safetyMode == null ? 43 : this.safetyMode.hashCode());
        return result;
    }


}
