// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.util.CircuitBreakerUtils;

import java.util.Objects;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class OntologyManagerClient extends com.oracle.bmc.http.internal.BaseSyncClient implements OntologyManager {
    /**
     * Service instance for OntologyManager.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("ONTOLOGYMANAGER").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(OntologyManagerClient.class);



    OntologyManagerClient(
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider
            ) {
        super(
            builder,
            authenticationDetailsProvider,
            CircuitBreakerUtils.DEFAULT_CIRCUIT_BREAKER_CONFIGURATION
            
        );

    }


    
    /**
     * Create a builder for this client.
     * @return builder
     */
    public static Builder builder() {
        return new Builder(SERVICE);
    }

    /**
     * Builder class for this client. The "authenticationDetailsProvider" is required and must be passed to the
     * {@link #build(AbstractAuthenticationDetailsProvider)} method.
     */
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OntologyManagerClient> {
        private Builder(com.oracle.bmc.Service service) {
            super(service);
            final String packageName = "dp";
com.oracle.bmc.internal.Alloy.throwDisabledServiceExceptionIfAppropriate(packageName);
            requestSignerFactory = new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        }

        /**
         * Build the client.
         * @param authenticationDetailsProvider authentication details provider
         * @return the client
         */
        public OntologyManagerClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new OntologyManagerClient(this, authenticationDetailsProvider);
        }
    }

    @Override
    public void setRegion(com.oracle.bmc.Region region) {
        super.setRegion(region);
    }

    @Override
    public void setRegion(String regionId) {
        super.setRegion(regionId);
    }

    @Override
    
    public CreateOntologyProjectResponse createOntologyProject(CreateOntologyProjectRequest request) {
                
        Validate.notBlank(request.getDataLakeId(), "dataLakeId must not be blank");
        Objects.requireNonNull(request.getCreateOntologyProjectDetails(), "createOntologyProjectDetails is required");
        


return clientCall(request, CreateOntologyProjectResponse::builder)
        .logger(LOG, "createOntologyProject")
        .serviceDetails("OntologyManager", "CreateOntologyProject", "")
        .method(com.oracle.bmc.http.client.Method.POST)
        .requestBuilder(CreateOntologyProjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("dataLakes").appendPathParam(request.getDataLakeId()).appendPathParam("ontologyManager").appendPathParam("projects")
        .accept("application/json")
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.OntologyProject.class, CreateOntologyProjectResponse.Builder::ontologyProject)

                .callSync();
    }

    @Override
    
    public DeleteOntologyProjectResponse deleteOntologyProject(DeleteOntologyProjectRequest request) {
                
        Validate.notBlank(request.getDataLakeId(), "dataLakeId must not be blank");
        
        Validate.notBlank(request.getProjectId(), "projectId must not be blank");


return clientCall(request, DeleteOntologyProjectResponse::builder)
        .logger(LOG, "deleteOntologyProject")
        .serviceDetails("OntologyManager", "DeleteOntologyProject", "")
        .method(com.oracle.bmc.http.client.Method.DELETE)
        .requestBuilder(DeleteOntologyProjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("dataLakes").appendPathParam(request.getDataLakeId()).appendPathParam("ontologyManager").appendPathParam("projects").appendPathParam(request.getProjectId())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        

                .callSync();
    }

    @Override
    
    public GetOntologyProjectResponse getOntologyProject(GetOntologyProjectRequest request) {
                
        Validate.notBlank(request.getDataLakeId(), "dataLakeId must not be blank");
        
        Validate.notBlank(request.getProjectId(), "projectId must not be blank");


return clientCall(request, GetOntologyProjectResponse::builder)
        .logger(LOG, "getOntologyProject")
        .serviceDetails("OntologyManager", "GetOntologyProject", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(GetOntologyProjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("dataLakes").appendPathParam(request.getDataLakeId()).appendPathParam("ontologyManager").appendPathParam("projects").appendPathParam(request.getProjectId())
        .accept("application/json")
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.OntologyProject.class, GetOntologyProjectResponse.Builder::ontologyProject)

                .callSync();
    }

    @Override
    
    public ListOntologyProjectsResponse listOntologyProjects(ListOntologyProjectsRequest request) {
                
        Validate.notBlank(request.getDataLakeId(), "dataLakeId must not be blank");


return clientCall(request, ListOntologyProjectsResponse::builder)
        .logger(LOG, "listOntologyProjects")
        .serviceDetails("OntologyManager", "ListOntologyProjects", "")
        .method(com.oracle.bmc.http.client.Method.GET)
        .requestBuilder(ListOntologyProjectsRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("dataLakes").appendPathParam(request.getDataLakeId()).appendPathParam("ontologyManager").appendPathParam("projects")
            
                
                    
                    .appendQueryParam("workspaceId", request.getWorkspaceId())
            
                
                    
                    .appendQueryParam("page", request.getPage())
            
                
                    
                    .appendQueryParam("limit", request.getLimit())
        .accept("application/json")
        .operationUsesDefaultRetries()
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.OntologyProjectCollection.class, ListOntologyProjectsResponse.Builder::ontologyProjectCollection)

                .callSync();
    }

    @Override
    
    public UpdateOntologyProjectResponse updateOntologyProject(UpdateOntologyProjectRequest request) {
                
        Validate.notBlank(request.getDataLakeId(), "dataLakeId must not be blank");
        
        Validate.notBlank(request.getProjectId(), "projectId must not be blank");
        Objects.requireNonNull(request.getUpdateOntologyProjectDetails(), "updateOntologyProjectDetails is required");
        


return clientCall(request, UpdateOntologyProjectResponse::builder)
        .logger(LOG, "updateOntologyProject")
        .serviceDetails("OntologyManager", "UpdateOntologyProject", "")
        .method(com.oracle.bmc.http.client.Method.PUT)
        .requestBuilder(UpdateOntologyProjectRequest::builder)
        
        
        .basePath("/20260430")
        .appendPathParam("dataLakes").appendPathParam(request.getDataLakeId()).appendPathParam("ontologyManager").appendPathParam("projects").appendPathParam(request.getProjectId())
        .accept("application/json")
                
                .appendHeader("if-match", request.getIfMatch())
        .operationUsesDefaultRetries()
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.OntologyProject.class, UpdateOntologyProjectResponse.Builder::ontologyProject)

                .callSync();
    }



    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OntologyManagerClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        this(
            builder(),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OntologyManagerClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
        this(
            builder()
                .configuration(configuration),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OntologyManagerClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OntologyManagerClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OntologyManagerClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OntologyManagerClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint),
            authenticationDetailsProvider
        );
    }

    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @param configuration {@link Builder#configuration}
     * @param clientConfigurator {@link Builder#clientConfigurator}
     * @param defaultRequestSignerFactory {@link Builder#requestSignerFactory}
     * @param additionalClientConfigurators {@link Builder#additionalClientConfigurators}
     * @param endpoint {@link Builder#endpoint}
     * @param signingStrategyRequestSignerFactories {@link Builder#signingStrategyRequestSignerFactories}
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OntologyManagerClient(
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider,
            com.oracle.bmc.ClientConfiguration configuration,
            com.oracle.bmc.http.ClientConfigurator clientConfigurator,
            com.oracle.bmc.http.signing.RequestSignerFactory defaultRequestSignerFactory,
            java.util.Map<com.oracle.bmc.http.signing.SigningStrategy, com.oracle.bmc.http.signing.RequestSignerFactory> signingStrategyRequestSignerFactories,
            java.util.List<com.oracle.bmc.http.ClientConfigurator> additionalClientConfigurators,
            String endpoint) {
        this(
            builder()
                .configuration(configuration)
                .clientConfigurator(clientConfigurator)
                .requestSignerFactory(defaultRequestSignerFactory)
                .additionalClientConfigurators(additionalClientConfigurators)
                .endpoint(endpoint)
                .signingStrategyRequestSignerFactories(signingStrategyRequestSignerFactories),
            authenticationDetailsProvider
        );
    }
}
