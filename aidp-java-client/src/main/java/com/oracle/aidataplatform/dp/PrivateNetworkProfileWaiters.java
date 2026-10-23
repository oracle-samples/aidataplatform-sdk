// Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.

package com.oracle.aidataplatform.dp;

import com.oracle.aidataplatform.dp.requests.*;
import com.oracle.aidataplatform.dp.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of PrivateNetworkProfile.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260430")

public class PrivateNetworkProfileWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final PrivateNetworkProfile client;

    public PrivateNetworkProfileWaiters(java.util.concurrent.ExecutorService executorService, PrivateNetworkProfile client) {
        this.executorService = executorService;
        this.client = client;
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetPrivateNetworkProfileRequest, GetPrivateNetworkProfileResponse> forPrivateNetworkProfile(GetPrivateNetworkProfileRequest request, com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one targetState must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null targetState values are not permitted");

        return forPrivateNetworkProfile(com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
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
    public com.oracle.bmc.waiter.Waiter<GetPrivateNetworkProfileRequest, GetPrivateNetworkProfileResponse> forPrivateNetworkProfile(GetPrivateNetworkProfileRequest request, com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.LifecycleState targetState, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        com.oracle.bmc.util.internal.Validate.notNull(targetState, "The targetState cannot be null");

        return forPrivateNetworkProfile(com.oracle.bmc.waiter.Waiters.newWaiter(
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
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetPrivateNetworkProfileRequest, GetPrivateNetworkProfileResponse> forPrivateNetworkProfile(GetPrivateNetworkProfileRequest request, com.oracle.bmc.waiter.TerminationStrategy terminationStrategy, com.oracle.bmc.waiter.DelayStrategy delayStrategy, com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.LifecycleState... targetStates) {
        com.oracle.bmc.util.internal.Validate.notEmpty(targetStates, "At least one target state must be provided");
        com.oracle.bmc.util.internal.Validate.noNullElements(targetStates, "Null target states are not permitted");

        return forPrivateNetworkProfile(com.oracle.bmc.waiter.Waiters.newWaiter(
                    terminationStrategy,
                    delayStrategy),
                    request,
                    targetStates);
    }

    // Helper method to create a new Waiter for PrivateNetworkProfile.
    private com.oracle.bmc.waiter.Waiter<GetPrivateNetworkProfileRequest, GetPrivateNetworkProfileResponse> forPrivateNetworkProfile(com.oracle.bmc.waiter.BmcGenericWaiter waiter, final GetPrivateNetworkProfileRequest request, final com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.aidataplatform.dp.model.PrivateNetworkProfile.LifecycleState> targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(executorService,
            waiter
            .toCallable(
                    () -> request,
                    new java.util.function.Function<GetPrivateNetworkProfileRequest, GetPrivateNetworkProfileResponse>() {
                        @Override
                        public GetPrivateNetworkProfileResponse apply(GetPrivateNetworkProfileRequest request) {
                            return client.getPrivateNetworkProfile(request);
                        }
                    },
                    new java.util.function.Predicate<GetPrivateNetworkProfileResponse>() {
                        @Override
                        public boolean test(GetPrivateNetworkProfileResponse response) {
                            return targetStatesSet.contains(response.getPrivateNetworkProfile().getLifecycleState());
                        }
                    },
                    false), request);
    }

}
