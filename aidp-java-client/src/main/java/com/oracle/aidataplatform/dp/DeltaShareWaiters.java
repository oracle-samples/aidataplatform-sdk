// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of DeltaShare.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")

public class DeltaShareWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final DeltaShare client;

    public DeltaShareWaiters(java.util.concurrent.ExecutorService executorService, DeltaShare client) {
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
    public com.oracle.bmc.waiter.Waiter<GetRecipientRequest, GetRecipientResponse> forRecipient(GetRecipientRequest request, com.oracle.aidataplatform.dp.model.RecipientLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forRecipient(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetRecipientRequest, GetRecipientResponse> forRecipient(GetRecipientRequest request, com.oracle.aidataplatform.dp.model.RecipientLifecycleState targetState, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(targetState, "The targetState cannot be null");

        return forRecipient(com.oracle.bmc.waiter.Waiters.newWaiter(
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
    public com.oracle.bmc.waiter.Waiter<GetRecipientRequest, GetRecipientResponse> forRecipient(GetRecipientRequest request, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy, com.oracle.aidataplatform.dp.model.RecipientLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forRecipient(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetStates);
    }

    // Helper method to create a new Waiter for Recipient.
    private com.oracle.bmc.waiter.Waiter<GetRecipientRequest, GetRecipientResponse> forRecipient(com.oracle.bmc.waiter.BmcGenericWaiter waiter, final GetRecipientRequest request, final com.oracle.aidataplatform.dp.model.RecipientLifecycleState... targetStates) {
        final java.util.Set<com.oracle.aidataplatform.dp.model.RecipientLifecycleState> targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(executorService,
            waiter
            .toCallable(
                    () -> request,
                    new java.util.function.Function<GetRecipientRequest, GetRecipientResponse>() {
                        @Override
                        public GetRecipientResponse apply(GetRecipientRequest request) {
                            return client.getRecipient(request);
                        }
                    },
                    new java.util.function.Predicate<GetRecipientResponse>() {
                        @Override
                        public boolean test(GetRecipientResponse response) {
                            return targetStatesSet.contains(response.getRecipient().getLifecycleState());
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
    public com.oracle.bmc.waiter.Waiter<GetShareRequest, GetShareResponse> forShare(GetShareRequest request, com.oracle.aidataplatform.dp.model.ShareLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forShare(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetShareRequest, GetShareResponse> forShare(GetShareRequest request, com.oracle.aidataplatform.dp.model.ShareLifecycleState targetState, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(targetState, "The targetState cannot be null");

        return forShare(com.oracle.bmc.waiter.Waiters.newWaiter(
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
    public com.oracle.bmc.waiter.Waiter<GetShareRequest, GetShareResponse> forShare(GetShareRequest request, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy, com.oracle.aidataplatform.dp.model.ShareLifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forShare(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetStates);
    }

    // Helper method to create a new Waiter for Share.
    private com.oracle.bmc.waiter.Waiter<GetShareRequest, GetShareResponse> forShare(com.oracle.bmc.waiter.BmcGenericWaiter waiter, final GetShareRequest request, final com.oracle.aidataplatform.dp.model.ShareLifecycleState... targetStates) {
        final java.util.Set<com.oracle.aidataplatform.dp.model.ShareLifecycleState> targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(executorService,
            waiter
            .toCallable(
                    () -> request,
                    new java.util.function.Function<GetShareRequest, GetShareResponse>() {
                        @Override
                        public GetShareResponse apply(GetShareRequest request) {
                            return client.getShare(request);
                        }
                    },
                    new java.util.function.Predicate<GetShareResponse>() {
                        @Override
                        public boolean test(GetShareResponse response) {
                            return targetStatesSet.contains(response.getShare().getLifecycleState());
                        }
                    },
                    false), request);
    }

}
