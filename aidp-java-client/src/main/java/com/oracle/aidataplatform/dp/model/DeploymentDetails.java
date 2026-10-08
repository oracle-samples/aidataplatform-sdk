// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp.model;



/**
 * Deployment configuration snapshot stored with an activity, recording the configuration the operation left behind. Every property is optional; a null value means the value is not available from any upstream system. Working out which values changed -- by comparing an activity against the one before it -- is left to the consumer.
**/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder=DeploymentDetails.Builder.class)

public final class DeploymentDetails  {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "modelName", "deploymentTargets", "status", "endpoint", "tags", "workspaceKey", "workspaceName", "computeKey", "computeName", "ocpus", "memoryInGbs", "autoscaling", "minInstances", "maxInstances", "instances", "concurrency", "cpuTarget", "cooldown", "metric", "authorizeUsing", "audienceClaim", "issuerClaim", "jwksUri"})
    public DeploymentDetails(String name, String description, String modelName, java.util.List<DeploymentTarget> deploymentTargets, DeploymentStatus status, String endpoint, java.util.Map<String, String> tags, String workspaceKey, String workspaceName, String computeKey, String computeName, Double ocpus, Double memoryInGbs, Boolean autoscaling, Integer minInstances, Integer maxInstances, Integer instances, Integer concurrency, Integer cpuTarget, Integer cooldown, String metric, String authorizeUsing, java.util.List<String> audienceClaim, String issuerClaim, String jwksUri) {
        super();
        this.name = name;
        this.description = description;
        this.modelName = modelName;
        this.deploymentTargets = deploymentTargets;
        this.status = status;
        this.endpoint = endpoint;
        this.tags = tags;
        this.workspaceKey = workspaceKey;
        this.workspaceName = workspaceName;
        this.computeKey = computeKey;
        this.computeName = computeName;
        this.ocpus = ocpus;
        this.memoryInGbs = memoryInGbs;
        this.autoscaling = autoscaling;
        this.minInstances = minInstances;
        this.maxInstances = maxInstances;
        this.instances = instances;
        this.concurrency = concurrency;
        this.cpuTarget = cpuTarget;
        this.cooldown = cooldown;
        this.metric = metric;
        this.authorizeUsing = authorizeUsing;
        this.audienceClaim = audienceClaim;
        this.issuerClaim = issuerClaim;
        this.jwksUri = jwksUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
                /**
     * Name of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("name")
private String name;

        /**
         * Name of the deployment.
         * @param name the value to set
         * @return this builder
         **/
        

public Builder name(String name) {
    this.name = name;
    return this;
}
            /**
     * Description of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("description")
private String description;

        /**
         * Description of the deployment.
         * @param description the value to set
         * @return this builder
         **/
        

public Builder description(String description) {
    this.description = description;
    return this;
}
            /**
     * Name of the registered model.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("model_name")
private String modelName;

        /**
         * Name of the registered model.
         * @param modelName the value to set
         * @return this builder
         **/
        

public Builder modelName(String modelName) {
    this.modelName = modelName;
    return this;
}
            /**
     * Deployment targets of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
private java.util.List<DeploymentTarget> deploymentTargets;

        /**
         * Deployment targets of the deployment.
         * @param deploymentTargets the value to set
         * @return this builder
         **/
        

public Builder deploymentTargets(java.util.List<DeploymentTarget> deploymentTargets) {
    this.deploymentTargets = deploymentTargets;
    return this;
}
            /**
     * Status of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("status")
private DeploymentStatus status;

        /**
         * Status of the deployment.
         * @param status the value to set
         * @return this builder
         **/
        

public Builder status(DeploymentStatus status) {
    this.status = status;
    return this;
}
            /**
     * Serving endpoint of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("endpoint")
private String endpoint;

        /**
         * Serving endpoint of the deployment.
         * @param endpoint the value to set
         * @return this builder
         **/
        

public Builder endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
}
            /**
     * Tags of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("tags")
private java.util.Map<String, String> tags;

        /**
         * Tags of the deployment.
         * @param tags the value to set
         * @return this builder
         **/
        

public Builder tags(java.util.Map<String, String> tags) {
    this.tags = tags;
    return this;
}
            /**
     * Workspace key of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
private String workspaceKey;

        /**
         * Workspace key of the deployment.
         * @param workspaceKey the value to set
         * @return this builder
         **/
        

public Builder workspaceKey(String workspaceKey) {
    this.workspaceKey = workspaceKey;
    return this;
}
            /**
     * Display name of the deployment's workspace.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("workspaceName")
private String workspaceName;

        /**
         * Display name of the deployment's workspace.
         * @param workspaceName the value to set
         * @return this builder
         **/
        

public Builder workspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
}
            /**
     * Compute key of the deployment.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("computeKey")
private String computeKey;

        /**
         * Compute key of the deployment.
         * @param computeKey the value to set
         * @return this builder
         **/
        

public Builder computeKey(String computeKey) {
    this.computeKey = computeKey;
    return this;
}
            /**
     * Display name of the compute cluster the deployment targets.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("computeName")
private String computeName;

        /**
         * Display name of the compute cluster the deployment targets.
         * @param computeName the value to set
         * @return this builder
         **/
        

public Builder computeName(String computeName) {
    this.computeName = computeName;
    return this;
}
            /**
     * OCPUs of the compute cluster shape.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("ocpus")
private Double ocpus;

        /**
         * OCPUs of the compute cluster shape.
         * @param ocpus the value to set
         * @return this builder
         **/
        

public Builder ocpus(Double ocpus) {
    this.ocpus = ocpus;
    return this;
}
            /**
     * Memory in GB of the compute cluster shape.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("memory_in_gbs")
private Double memoryInGbs;

        /**
         * Memory in GB of the compute cluster shape.
         * @param memoryInGbs the value to set
         * @return this builder
         **/
        

public Builder memoryInGbs(Double memoryInGbs) {
    this.memoryInGbs = memoryInGbs;
    return this;
}
            /**
     * Whether the compute cluster autoscales.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("autoscaling")
private Boolean autoscaling;

        /**
         * Whether the compute cluster autoscales.
         * @param autoscaling the value to set
         * @return this builder
         **/
        

public Builder autoscaling(Boolean autoscaling) {
    this.autoscaling = autoscaling;
    return this;
}
            /**
     * Minimum number of compute replicas.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("min_instances")
private Integer minInstances;

        /**
         * Minimum number of compute replicas.
         * @param minInstances the value to set
         * @return this builder
         **/
        

public Builder minInstances(Integer minInstances) {
    this.minInstances = minInstances;
    return this;
}
            /**
     * Maximum number of compute replicas.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("max_instances")
private Integer maxInstances;

        /**
         * Maximum number of compute replicas.
         * @param maxInstances the value to set
         * @return this builder
         **/
        

public Builder maxInstances(Integer maxInstances) {
    this.maxInstances = maxInstances;
    return this;
}
            /**
     * Number of replicas running. Not reported by AI Compute today, so always null.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("instances")
private Integer instances;

        /**
         * Number of replicas running. Not reported by AI Compute today, so always null.
         * @param instances the value to set
         * @return this builder
         **/
        

public Builder instances(Integer instances) {
    this.instances = instances;
    return this;
}
            /**
     * Request concurrency. Not modelled by AI Compute today, so always null.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("concurrency")
private Integer concurrency;

        /**
         * Request concurrency. Not modelled by AI Compute today, so always null.
         * @param concurrency the value to set
         * @return this builder
         **/
        

public Builder concurrency(Integer concurrency) {
    this.concurrency = concurrency;
    return this;
}
            /**
     * Autoscaling CPU target percentage. Not modelled by AI Compute today, so always null.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("cpu_target")
private Integer cpuTarget;

        /**
         * Autoscaling CPU target percentage. Not modelled by AI Compute today, so always null.
         * @param cpuTarget the value to set
         * @return this builder
         **/
        

public Builder cpuTarget(Integer cpuTarget) {
    this.cpuTarget = cpuTarget;
    return this;
}
            /**
     * Autoscaling cooldown in minutes. Not modelled by AI Compute today, so always null.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("cooldown")
private Integer cooldown;

        /**
         * Autoscaling cooldown in minutes. Not modelled by AI Compute today, so always null.
         * @param cooldown the value to set
         * @return this builder
         **/
        

public Builder cooldown(Integer cooldown) {
    this.cooldown = cooldown;
    return this;
}
            /**
     * Autoscaling metric. Not modelled by AI Compute today, so always null.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("metric")
private String metric;

        /**
         * Autoscaling metric. Not modelled by AI Compute today, so always null.
         * @param metric the value to set
         * @return this builder
         **/
        

public Builder metric(String metric) {
    this.metric = metric;
    return this;
}
            /**
     * Endpoint authorization mode: the deployment's authType (OAUTH or AIDP).
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("authorize_using")
private String authorizeUsing;

        /**
         * Endpoint authorization mode: the deployment's authType (OAUTH or AIDP).
         * @param authorizeUsing the value to set
         * @return this builder
         **/
        

public Builder authorizeUsing(String authorizeUsing) {
    this.authorizeUsing = authorizeUsing;
    return this;
}
            /**
     * OAuth audience claims (aud). Set for OAUTH deployments; null otherwise.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("audience_claim")
private java.util.List<String> audienceClaim;

        /**
         * OAuth audience claims (aud). Set for OAUTH deployments; null otherwise.
         * @param audienceClaim the value to set
         * @return this builder
         **/
        

public Builder audienceClaim(java.util.List<String> audienceClaim) {
    this.audienceClaim = audienceClaim;
    return this;
}
            /**
     * OAuth issuer claim (iss). Set for OAUTH deployments; null otherwise.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("issuer_claim")
private String issuerClaim;

        /**
         * OAuth issuer claim (iss). Set for OAUTH deployments; null otherwise.
         * @param issuerClaim the value to set
         * @return this builder
         **/
        

public Builder issuerClaim(String issuerClaim) {
    this.issuerClaim = issuerClaim;
    return this;
}
            /**
     * URI to retrieve the JWKS. Set for OAUTH deployments; null otherwise.
     **/
    
@com.fasterxml.jackson.annotation.JsonProperty("jwks_uri")
private String jwksUri;

        /**
         * URI to retrieve the JWKS. Set for OAUTH deployments; null otherwise.
         * @param jwksUri the value to set
         * @return this builder
         **/
        

public Builder jwksUri(String jwksUri) {
    this.jwksUri = jwksUri;
    return this;
}


        public DeploymentDetails build() {
            DeploymentDetails model = new DeploymentDetails(this.name
                , this.description
                , this.modelName
                , this.deploymentTargets
                , this.status
                , this.endpoint
                , this.tags
                , this.workspaceKey
                , this.workspaceName
                , this.computeKey
                , this.computeName
                , this.ocpus
                , this.memoryInGbs
                , this.autoscaling
                , this.minInstances
                , this.maxInstances
                , this.instances
                , this.concurrency
                , this.cpuTarget
                , this.cooldown
                , this.metric
                , this.authorizeUsing
                , this.audienceClaim
                , this.issuerClaim
                , this.jwksUri);            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeploymentDetails model) {
                this.name(model.getName());
    this.description(model.getDescription());
    this.modelName(model.getModelName());
    this.deploymentTargets(model.getDeploymentTargets());
    this.status(model.getStatus());
    this.endpoint(model.getEndpoint());
    this.tags(model.getTags());
    this.workspaceKey(model.getWorkspaceKey());
    this.workspaceName(model.getWorkspaceName());
    this.computeKey(model.getComputeKey());
    this.computeName(model.getComputeName());
    this.ocpus(model.getOcpus());
    this.memoryInGbs(model.getMemoryInGbs());
    this.autoscaling(model.getAutoscaling());
    this.minInstances(model.getMinInstances());
    this.maxInstances(model.getMaxInstances());
    this.instances(model.getInstances());
    this.concurrency(model.getConcurrency());
    this.cpuTarget(model.getCpuTarget());
    this.cooldown(model.getCooldown());
    this.metric(model.getMetric());
    this.authorizeUsing(model.getAuthorizeUsing());
    this.audienceClaim(model.getAudienceClaim());
    this.issuerClaim(model.getIssuerClaim());
    this.jwksUri(model.getJwksUri());
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
     * Name of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

        /**
     * Name of the deployment.
     * @return the value
     **/
    
    public String getName() {
        return name;
    }


        /**
     * Description of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

        /**
     * Description of the deployment.
     * @return the value
     **/
    
    public String getDescription() {
        return description;
    }


        /**
     * Name of the registered model.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("model_name")
    private final String modelName;

        /**
     * Name of the registered model.
     * @return the value
     **/
    
    public String getModelName() {
        return modelName;
    }


        /**
     * Deployment targets of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("deployment_targets")
    private final java.util.List<DeploymentTarget> deploymentTargets;

        /**
     * Deployment targets of the deployment.
     * @return the value
     **/
    
    public java.util.List<DeploymentTarget> getDeploymentTargets() {
        return deploymentTargets;
    }

    
        /**
     * Status of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final DeploymentStatus status;

        /**
     * Status of the deployment.
     * @return the value
     **/
    
    public DeploymentStatus getStatus() {
        return status;
    }


        /**
     * Serving endpoint of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

        /**
     * Serving endpoint of the deployment.
     * @return the value
     **/
    
    public String getEndpoint() {
        return endpoint;
    }


        /**
     * Tags of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.Map<String, String> tags;

        /**
     * Tags of the deployment.
     * @return the value
     **/
    
    public java.util.Map<String, String> getTags() {
        return tags;
    }


        /**
     * Workspace key of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceKey")
    private final String workspaceKey;

        /**
     * Workspace key of the deployment.
     * @return the value
     **/
    
    public String getWorkspaceKey() {
        return workspaceKey;
    }


        /**
     * Display name of the deployment's workspace.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceName")
    private final String workspaceName;

        /**
     * Display name of the deployment's workspace.
     * @return the value
     **/
    
    public String getWorkspaceName() {
        return workspaceName;
    }


        /**
     * Compute key of the deployment.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("computeKey")
    private final String computeKey;

        /**
     * Compute key of the deployment.
     * @return the value
     **/
    
    public String getComputeKey() {
        return computeKey;
    }


        /**
     * Display name of the compute cluster the deployment targets.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("computeName")
    private final String computeName;

        /**
     * Display name of the compute cluster the deployment targets.
     * @return the value
     **/
    
    public String getComputeName() {
        return computeName;
    }


        /**
     * OCPUs of the compute cluster shape.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Double ocpus;

        /**
     * OCPUs of the compute cluster shape.
     * @return the value
     **/
    
    public Double getOcpus() {
        return ocpus;
    }


        /**
     * Memory in GB of the compute cluster shape.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("memory_in_gbs")
    private final Double memoryInGbs;

        /**
     * Memory in GB of the compute cluster shape.
     * @return the value
     **/
    
    public Double getMemoryInGbs() {
        return memoryInGbs;
    }


        /**
     * Whether the compute cluster autoscales.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("autoscaling")
    private final Boolean autoscaling;

        /**
     * Whether the compute cluster autoscales.
     * @return the value
     **/
    
    public Boolean getAutoscaling() {
        return autoscaling;
    }


        /**
     * Minimum number of compute replicas.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("min_instances")
    private final Integer minInstances;

        /**
     * Minimum number of compute replicas.
     * @return the value
     **/
    
    public Integer getMinInstances() {
        return minInstances;
    }


        /**
     * Maximum number of compute replicas.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("max_instances")
    private final Integer maxInstances;

        /**
     * Maximum number of compute replicas.
     * @return the value
     **/
    
    public Integer getMaxInstances() {
        return maxInstances;
    }


        /**
     * Number of replicas running. Not reported by AI Compute today, so always null.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("instances")
    private final Integer instances;

        /**
     * Number of replicas running. Not reported by AI Compute today, so always null.
     * @return the value
     **/
    
    public Integer getInstances() {
        return instances;
    }


        /**
     * Request concurrency. Not modelled by AI Compute today, so always null.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("concurrency")
    private final Integer concurrency;

        /**
     * Request concurrency. Not modelled by AI Compute today, so always null.
     * @return the value
     **/
    
    public Integer getConcurrency() {
        return concurrency;
    }


        /**
     * Autoscaling CPU target percentage. Not modelled by AI Compute today, so always null.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("cpu_target")
    private final Integer cpuTarget;

        /**
     * Autoscaling CPU target percentage. Not modelled by AI Compute today, so always null.
     * @return the value
     **/
    
    public Integer getCpuTarget() {
        return cpuTarget;
    }


        /**
     * Autoscaling cooldown in minutes. Not modelled by AI Compute today, so always null.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("cooldown")
    private final Integer cooldown;

        /**
     * Autoscaling cooldown in minutes. Not modelled by AI Compute today, so always null.
     * @return the value
     **/
    
    public Integer getCooldown() {
        return cooldown;
    }


        /**
     * Autoscaling metric. Not modelled by AI Compute today, so always null.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    private final String metric;

        /**
     * Autoscaling metric. Not modelled by AI Compute today, so always null.
     * @return the value
     **/
    
    public String getMetric() {
        return metric;
    }


        /**
     * Endpoint authorization mode: the deployment's authType (OAUTH or AIDP).
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("authorize_using")
    private final String authorizeUsing;

        /**
     * Endpoint authorization mode: the deployment's authType (OAUTH or AIDP).
     * @return the value
     **/
    
    public String getAuthorizeUsing() {
        return authorizeUsing;
    }


        /**
     * OAuth audience claims (aud). Set for OAUTH deployments; null otherwise.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("audience_claim")
    private final java.util.List<String> audienceClaim;

        /**
     * OAuth audience claims (aud). Set for OAUTH deployments; null otherwise.
     * @return the value
     **/
    
    public java.util.List<String> getAudienceClaim() {
        return audienceClaim;
    }


        /**
     * OAuth issuer claim (iss). Set for OAUTH deployments; null otherwise.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("issuer_claim")
    private final String issuerClaim;

        /**
     * OAuth issuer claim (iss). Set for OAUTH deployments; null otherwise.
     * @return the value
     **/
    
    public String getIssuerClaim() {
        return issuerClaim;
    }


        /**
     * URI to retrieve the JWKS. Set for OAUTH deployments; null otherwise.
     **/
    
    @com.fasterxml.jackson.annotation.JsonProperty("jwks_uri")
    private final String jwksUri;

        /**
     * URI to retrieve the JWKS. Set for OAUTH deployments; null otherwise.
     * @return the value
     **/
    
    public String getJwksUri() {
        return jwksUri;
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
        sb.append("DeploymentDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", modelName=").append(String.valueOf(this.modelName));
        sb.append(", deploymentTargets=").append(String.valueOf(this.deploymentTargets));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(", workspaceKey=").append(String.valueOf(this.workspaceKey));
        sb.append(", workspaceName=").append(String.valueOf(this.workspaceName));
        sb.append(", computeKey=").append(String.valueOf(this.computeKey));
        sb.append(", computeName=").append(String.valueOf(this.computeName));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGbs=").append(String.valueOf(this.memoryInGbs));
        sb.append(", autoscaling=").append(String.valueOf(this.autoscaling));
        sb.append(", minInstances=").append(String.valueOf(this.minInstances));
        sb.append(", maxInstances=").append(String.valueOf(this.maxInstances));
        sb.append(", instances=").append(String.valueOf(this.instances));
        sb.append(", concurrency=").append(String.valueOf(this.concurrency));
        sb.append(", cpuTarget=").append(String.valueOf(this.cpuTarget));
        sb.append(", cooldown=").append(String.valueOf(this.cooldown));
        sb.append(", metric=").append(String.valueOf(this.metric));
        sb.append(", authorizeUsing=").append(String.valueOf(this.authorizeUsing));
        sb.append(", audienceClaim=").append(String.valueOf(this.audienceClaim));
        sb.append(", issuerClaim=").append(String.valueOf(this.issuerClaim));
        sb.append(", jwksUri=").append(String.valueOf(this.jwksUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeploymentDetails)) {
            return false;
        }

        DeploymentDetails other = (DeploymentDetails) o;
        return java.util.Objects.equals(this.name, other.name) &&
            java.util.Objects.equals(this.description, other.description) &&
            java.util.Objects.equals(this.modelName, other.modelName) &&
            java.util.Objects.equals(this.deploymentTargets, other.deploymentTargets) &&
            java.util.Objects.equals(this.status, other.status) &&
            java.util.Objects.equals(this.endpoint, other.endpoint) &&
            java.util.Objects.equals(this.tags, other.tags) &&
            java.util.Objects.equals(this.workspaceKey, other.workspaceKey) &&
            java.util.Objects.equals(this.workspaceName, other.workspaceName) &&
            java.util.Objects.equals(this.computeKey, other.computeKey) &&
            java.util.Objects.equals(this.computeName, other.computeName) &&
            java.util.Objects.equals(this.ocpus, other.ocpus) &&
            java.util.Objects.equals(this.memoryInGbs, other.memoryInGbs) &&
            java.util.Objects.equals(this.autoscaling, other.autoscaling) &&
            java.util.Objects.equals(this.minInstances, other.minInstances) &&
            java.util.Objects.equals(this.maxInstances, other.maxInstances) &&
            java.util.Objects.equals(this.instances, other.instances) &&
            java.util.Objects.equals(this.concurrency, other.concurrency) &&
            java.util.Objects.equals(this.cpuTarget, other.cpuTarget) &&
            java.util.Objects.equals(this.cooldown, other.cooldown) &&
            java.util.Objects.equals(this.metric, other.metric) &&
            java.util.Objects.equals(this.authorizeUsing, other.authorizeUsing) &&
            java.util.Objects.equals(this.audienceClaim, other.audienceClaim) &&
            java.util.Objects.equals(this.issuerClaim, other.issuerClaim) &&
            java.util.Objects.equals(this.jwksUri, other.jwksUri);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.deploymentTargets == null ? 43 : this.deploymentTargets.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + (this.workspaceKey == null ? 43 : this.workspaceKey.hashCode());
        result = (result * PRIME) + (this.workspaceName == null ? 43 : this.workspaceName.hashCode());
        result = (result * PRIME) + (this.computeKey == null ? 43 : this.computeKey.hashCode());
        result = (result * PRIME) + (this.computeName == null ? 43 : this.computeName.hashCode());
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGbs == null ? 43 : this.memoryInGbs.hashCode());
        result = (result * PRIME) + (this.autoscaling == null ? 43 : this.autoscaling.hashCode());
        result = (result * PRIME) + (this.minInstances == null ? 43 : this.minInstances.hashCode());
        result = (result * PRIME) + (this.maxInstances == null ? 43 : this.maxInstances.hashCode());
        result = (result * PRIME) + (this.instances == null ? 43 : this.instances.hashCode());
        result = (result * PRIME) + (this.concurrency == null ? 43 : this.concurrency.hashCode());
        result = (result * PRIME) + (this.cpuTarget == null ? 43 : this.cpuTarget.hashCode());
        result = (result * PRIME) + (this.cooldown == null ? 43 : this.cooldown.hashCode());
        result = (result * PRIME) + (this.metric == null ? 43 : this.metric.hashCode());
        result = (result * PRIME) + (this.authorizeUsing == null ? 43 : this.authorizeUsing.hashCode());
        result = (result * PRIME) + (this.audienceClaim == null ? 43 : this.audienceClaim.hashCode());
        result = (result * PRIME) + (this.issuerClaim == null ? 43 : this.issuerClaim.hashCode());
        result = (result * PRIME) + (this.jwksUri == null ? 43 : this.jwksUri.hashCode());
        return result;
    }


}
