// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.bmc.util.internal.Validate;
import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

import java.util.Objects;

/**
* Async client implementation for OntologyManager service. <br/>
* There are two ways to use async client:
* 1. Use AsyncHandler: using AsyncHandler, if the response to the call is an {@link java.io.InputStream}, like
* getObject Api in object storage service, developers need to process the stream in AsyncHandler, and not anywhere else, 
* because the stream will be closed right after the AsyncHandler is invoked. <br/>
* 2. Use Java Future: using Java Future, developers need to close the stream after they are done with the Java Future.<br/>
* Accessing the result should be done in a mutually exclusive manner, either through the Future or the AsyncHandler,
* but not both.  If the Future is used, the caller should pass in null as the AsyncHandler.  If the AsyncHandler
* is used, it is still safe to use the Future to determine whether or not the request was completed via
* Future.isDone/isCancelled.<br/>
* Please refer to https://github.com/oracle/oci-java-sdk/blob/master/bmc-examples/src/main/java/ResteasyClientWithObjectStorageExample.java
*/
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")
public class OntologyManagerAsyncClient extends com.oracle.bmc.http.internal.BaseAsyncClient implements OntologyManagerAsync {
    /**
     * Service instance for OntologyManager.
     */
    public static final com.oracle.bmc.Service SERVICE = com.oracle.bmc.Services.serviceBuilder().serviceName("ONTOLOGYMANAGER").serviceEndpointPrefix("datahub-dp").serviceEndpointTemplate("https://datalake.{region}.oci.{secondLevelDomain}").build();

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(OntologyManagerAsyncClient.class);

    OntologyManagerAsyncClient (
            com.oracle.bmc.common.ClientBuilderBase<?, ?> builder,
            com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
        super(
            builder,
            authenticationDetailsProvider
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
    public static class Builder extends com.oracle.bmc.common.RegionalClientBuilder<Builder, OntologyManagerAsyncClient> {
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
        public OntologyManagerAsyncClient build(@jakarta.annotation.Nonnull com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider authenticationDetailsProvider) {
            return new OntologyManagerAsyncClient(this, authenticationDetailsProvider);
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
    
    public java.util.concurrent.Future<CreateOntologyProjectResponse> createOntologyProject(CreateOntologyProjectRequest request, final com.oracle.bmc.responses.AsyncHandler<CreateOntologyProjectRequest, CreateOntologyProjectResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.OntologyProject.class, CreateOntologyProjectResponse.Builder::ontologyProject)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<DeleteOntologyProjectResponse> deleteOntologyProject(DeleteOntologyProjectRequest request, final com.oracle.bmc.responses.AsyncHandler<DeleteOntologyProjectRequest, DeleteOntologyProjectResponse> handler) {
                
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
        
        
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<GetOntologyProjectResponse> getOntologyProject(GetOntologyProjectRequest request, final com.oracle.bmc.responses.AsyncHandler<GetOntologyProjectRequest, GetOntologyProjectResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.OntologyProject.class, GetOntologyProjectResponse.Builder::ontologyProject)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<ListOntologyProjectsResponse> listOntologyProjects(ListOntologyProjectsRequest request, final com.oracle.bmc.responses.AsyncHandler<ListOntologyProjectsRequest, ListOntologyProjectsResponse> handler) {
                
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
        
        
            .handleBody(com.oracle.aidataplatform.dp.model.OntologyProjectCollection.class, ListOntologyProjectsResponse.Builder::ontologyProjectCollection)
.callAsync(handler);
    }

    @Override
    
    public java.util.concurrent.Future<UpdateOntologyProjectResponse> updateOntologyProject(UpdateOntologyProjectRequest request, final com.oracle.bmc.responses.AsyncHandler<UpdateOntologyProjectRequest, UpdateOntologyProjectResponse> handler) {
                
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
        
        .hasBody()
            .handleBody(com.oracle.aidataplatform.dp.model.OntologyProject.class, UpdateOntologyProjectResponse.Builder::ontologyProject)
.callAsync(handler);
    }


    /**
     * Create a new client instance.
     *
     * @param authenticationDetailsProvider The authentication details (see {@link Builder#build})
     * @deprecated Use the {@link #builder() builder} instead.
     */
    @Deprecated
    public OntologyManagerAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
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
    public OntologyManagerAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration) {
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
    public OntologyManagerAsyncClient(com.oracle.bmc.auth.BasicAuthenticationDetailsProvider authenticationDetailsProvider, com.oracle.bmc.ClientConfiguration configuration, com.oracle.bmc.http.ClientConfigurator clientConfigurator) {
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
    public OntologyManagerAsyncClient(
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
    public OntologyManagerAsyncClient (
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
    public OntologyManagerAsyncClient (
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
    public OntologyManagerAsyncClient (
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
