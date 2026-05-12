package com.oracle.aidataplatform.dp.model;



/**
 * The information about the If Else task.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=IfElseTask.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use=com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME, include=com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY, property="type")

public final class IfElseTask extends Task {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
    @com.fasterxml.jackson.annotation.JsonProperty("taskKey")
private String taskKey;

public Builder taskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("dependsOn")
private java.util.List<DependsOn> dependsOn;

public Builder dependsOn(java.util.List<DependsOn> dependsOn) {
    this.dependsOn = dependsOn;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("runIf")
private RunIf runIf;

public Builder runIf(RunIf runIf) {
    this.runIf = runIf;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("maxRetries")
private Integer maxRetries;

public Builder maxRetries(Integer maxRetries) {
    this.maxRetries = maxRetries;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("minRetryIntervalMillis")
private Integer minRetryIntervalMillis;

public Builder minRetryIntervalMillis(Integer minRetryIntervalMillis) {
    this.minRetryIntervalMillis = minRetryIntervalMillis;
    return this;
}
@com.fasterxml.jackson.annotation.JsonProperty("isRetryOnTimeout")
private Boolean isRetryOnTimeout;

public Builder isRetryOnTimeout(Boolean isRetryOnTimeout) {
    this.isRetryOnTimeout = isRetryOnTimeout;
    return this;
}
            /**
     * List of expressions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("expressions")
private java.util.List<Expression> expressions;

        /**
         * List of expressions.
         * @param expressions the value to set
         * @return this builder
         **/
        

public Builder expressions(java.util.List<Expression> expressions) {
    this.expressions = expressions;
    return this;
}
            /**
     * The condition string which binds expressions from expressions list using AND, OR or NOT operator. Expression key should be used to bind the expressions.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("condition")
private String condition;

        /**
         * The condition string which binds expressions from expressions list using AND, OR or NOT operator. Expression key should be used to bind the expressions.
         * @param condition the value to set
         * @return this builder
         **/
        

public Builder condition(String condition) {
    this.condition = condition;
    return this;
}
            /**
     * An optional list of parameters.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("parameters")
private java.util.List<Parameter> parameters;

        /**
         * An optional list of parameters.
         * @param parameters the value to set
         * @return this builder
         **/
        

public Builder parameters(java.util.List<Parameter> parameters) {
    this.parameters = parameters;
    return this;
}


        public IfElseTask build() {
            IfElseTask model = new IfElseTask(this.taskKey
                , this.dependsOn
                , this.runIf
                , this.maxRetries
                , this.minRetryIntervalMillis
                , this.isRetryOnTimeout
                , this.expressions
                , this.condition
                , this.parameters);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IfElseTask model) {
                this.taskKey(model.getTaskKey());
    this.dependsOn(model.getDependsOn());
    this.runIf(model.getRunIf());
    this.maxRetries(model.getMaxRetries());
    this.minRetryIntervalMillis(model.getMinRetryIntervalMillis());
    this.isRetryOnTimeout(model.getIsRetryOnTimeout());
    this.expressions(model.getExpressions());
    this.condition(model.getCondition());
    this.parameters(model.getParameters());
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

    
    @Deprecated
    public IfElseTask(String taskKey, java.util.List<DependsOn> dependsOn, RunIf runIf, Integer maxRetries, Integer minRetryIntervalMillis, Boolean isRetryOnTimeout, java.util.List<Expression> expressions, String condition, java.util.List<Parameter> parameters) {
    super(taskKey, dependsOn, runIf, maxRetries, minRetryIntervalMillis, isRetryOnTimeout);
        this.expressions = expressions;
        this.condition = condition;
        this.parameters = parameters;
    }


        /**
     * List of expressions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("expressions")
    private final java.util.List<Expression> expressions;

        /**
     * List of expressions.
     * @return the value
     **/
    
    public java.util.List<Expression> getExpressions() {
        return expressions;
    }


        /**
     * The condition string which binds expressions from expressions list using AND, OR or NOT operator. Expression key should be used to bind the expressions.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

        /**
     * The condition string which binds expressions from expressions list using AND, OR or NOT operator. Expression key should be used to bind the expressions.
     * @return the value
     **/
    
    public String getCondition() {
        return condition;
    }


        /**
     * An optional list of parameters.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<Parameter> parameters;

        /**
     * An optional list of parameters.
     * @return the value
     **/
    
    public java.util.List<Parameter> getParameters() {
        return parameters;
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
        sb.append("IfElseTask(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", expressions=").append(String.valueOf(this.expressions));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IfElseTask)) {
            return false;
        }

        IfElseTask other = (IfElseTask) o;
        return java.util.Objects.equals(this.expressions, other.expressions) &&
            java.util.Objects.equals(this.condition, other.condition) &&
            java.util.Objects.equals(this.parameters, other.parameters) &&
            super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.expressions == null ? 43 : this.expressions.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        return result;
    }


}
