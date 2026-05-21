// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Schema.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")

public class SchemaWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Schema client;

    public SchemaWaiters(java.util.concurrent.ExecutorService executorService, Schema client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSchemaRequest, GetSchemaResponse> forSchema(GetSchemaRequest request, com.oracle.aidataplatform.dp.model.SchemaLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forSchema(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSchemaRequest, GetSchemaResponse> forSchema(GetSchemaRequest request, com.oracle.aidataplatform.dp.model.SchemaLifecycleState targetState, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(targetState, "The targetState cannot be null");

        return forSchema(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetSchemaRequest, GetSchemaResponse> forSchema(GetSchemaRequest request, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy, com.oracle.aidataplatform.dp.model.SchemaLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forSchema(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetStates);
    }

    // Helper method to create a new Waiter for Schema.
    private com.oracle.bmc.waiter.Waiter<GetSchemaRequest, GetSchemaResponse> forSchema(com.oracle.bmc.waiter.BmcGenericWaiter waiter, final GetSchemaRequest request, final com.oracle.aidataplatform.dp.model.SchemaLifecycleState... targetStates) {
        final java.util.Set<com.oracle.aidataplatform.dp.model.SchemaLifecycleState> targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(executorService,
            waiter
            .toCallable(
                    () -> request,
                    new java.util.function.Function<GetSchemaRequest, GetSchemaResponse>() {
                        @Override
                        public GetSchemaResponse apply(GetSchemaRequest request) {
                            return client.getSchema(request);
                        }
                    },
                    new java.util.function.Predicate<GetSchemaResponse>() {
                        @Override
                        public boolean test(GetSchemaResponse response) {
                            return targetStatesSet.contains(response.getSchema().getLifecycleState());
                        }
                    },
                    false), request);
    }


    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTableRequest, GetTableResponse> forTable(GetTableRequest request, com.oracle.aidataplatform.dp.model.TableLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forTable(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTableRequest, GetTableResponse> forTable(GetTableRequest request, com.oracle.aidataplatform.dp.model.TableLifecycleState targetState, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(targetState, "The targetState cannot be null");

        return forTable(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetTableRequest, GetTableResponse> forTable(GetTableRequest request, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy, com.oracle.aidataplatform.dp.model.TableLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forTable(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetStates);
    }

    // Helper method to create a new Waiter for Table.
    private com.oracle.bmc.waiter.Waiter<GetTableRequest, GetTableResponse> forTable(com.oracle.bmc.waiter.BmcGenericWaiter waiter, final GetTableRequest request, final com.oracle.aidataplatform.dp.model.TableLifecycleState... targetStates) {
        final java.util.Set<com.oracle.aidataplatform.dp.model.TableLifecycleState> targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(executorService,
            waiter
            .toCallable(
                    () -> request,
                    new java.util.function.Function<GetTableRequest, GetTableResponse>() {
                        @Override
                        public GetTableResponse apply(GetTableRequest request) {
                            return client.getTable(request);
                        }
                    },
                    new java.util.function.Predicate<GetTableResponse>() {
                        @Override
                        public boolean test(GetTableResponse response) {
                            return targetStatesSet.contains(response.getTable().getLifecycleState());
                        }
                    },
                    false), request);
    }


    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetState the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetViewRequest, GetViewResponse> forView(GetViewRequest request, com.oracle.aidataplatform.dp.model.ViewLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forView(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetViewRequest, GetViewResponse> forView(GetViewRequest request, com.oracle.aidataplatform.dp.model.ViewLifecycleState targetState, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(targetState, "The targetState cannot be null");

        return forView(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetViewRequest, GetViewResponse> forView(GetViewRequest request, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy, com.oracle.aidataplatform.dp.model.ViewLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forView(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetStates);
    }

    // Helper method to create a new Waiter for View.
    private com.oracle.bmc.waiter.Waiter<GetViewRequest, GetViewResponse> forView(com.oracle.bmc.waiter.BmcGenericWaiter waiter, final GetViewRequest request, final com.oracle.aidataplatform.dp.model.ViewLifecycleState... targetStates) {
        final java.util.Set<com.oracle.aidataplatform.dp.model.ViewLifecycleState> targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(executorService,
            waiter
            .toCallable(
                    () -> request,
                    new java.util.function.Function<GetViewRequest, GetViewResponse>() {
                        @Override
                        public GetViewResponse apply(GetViewRequest request) {
                            return client.getView(request);
                        }
                    },
                    new java.util.function.Predicate<GetViewResponse>() {
                        @Override
                        public boolean test(GetViewResponse response) {
                            return targetStatesSet.contains(response.getView().getLifecycleState());
                        }
                    },
                    false), request);
    }

}
