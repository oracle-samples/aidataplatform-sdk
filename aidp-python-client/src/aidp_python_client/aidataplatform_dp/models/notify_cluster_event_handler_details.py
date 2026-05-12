# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class NotifyClusterEventHandlerDetails(object):
    """
    Notifier API during cluster patching.
    """

    #: A constant which can be used with the phase property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "STARTED"
    PHASE_STARTED = "STARTED"

    #: A constant which can be used with the phase property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "COMPLETED"
    PHASE_COMPLETED = "COMPLETED"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "ACCEPTED"
    STATE_ACCEPTED = "ACCEPTED"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "CREATING"
    STATE_CREATING = "CREATING"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "ACTIVE"
    STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "DELETING"
    STATE_DELETING = "DELETING"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "DELETED"
    STATE_DELETED = "DELETED"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "FAILED"
    STATE_FAILED = "FAILED"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "STOPPING"
    STATE_STOPPING = "STOPPING"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "STOPPED"
    STATE_STOPPED = "STOPPED"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "UPDATING"
    STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "RESTARTING"
    STATE_RESTARTING = "RESTARTING"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "STARTING"
    STATE_STARTING = "STARTING"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"
    STATE_NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS = "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"
    STATE_NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL = "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_FAILED"
    STATE_NETWORK_CONFIGURATION_ATTACH_FAILED = "NETWORK_CONFIGURATION_ATTACH_FAILED"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"
    STATE_NETWORK_CONFIGURATION_DETACH_IN_PROGRESS = "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"
    STATE_NETWORK_CONFIGURATION_DETACH_SUCCESSFUL = "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"

    #: A constant which can be used with the state property of a NotifyClusterEventHandlerDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_FAILED"
    STATE_NETWORK_CONFIGURATION_DETACH_FAILED = "NETWORK_CONFIGURATION_DETACH_FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new NotifyClusterEventHandlerDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param cluster_name:
            The value to assign to the cluster_name property of this NotifyClusterEventHandlerDetails.
        :type cluster_name: str

        :param phase:
            The value to assign to the phase property of this NotifyClusterEventHandlerDetails.
            Allowed values for this property are: "STARTED", "COMPLETED"
        :type phase: str

        :param state:
            The value to assign to the state property of this NotifyClusterEventHandlerDetails.
            Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"
        :type state: str

        :param cluster_event:
            The value to assign to the cluster_event property of this NotifyClusterEventHandlerDetails.
        :type cluster_event: oci.aidataplatform_dp.models.ClusterEvent

        """
        self.swagger_types = {
            'cluster_name': 'str',
            'phase': 'str',
            'state': 'str',
            'cluster_event': 'ClusterEvent'
        }

        self.attribute_map = {
            'cluster_name': 'clusterName',
            'phase': 'phase',
            'state': 'state',
            'cluster_event': 'clusterEvent'
        }

        self._cluster_name = None
        self._phase = None
        self._state = None
        self._cluster_event = None

    @property
    def cluster_name(self):
        """
        **[Required]** Gets the cluster_name of this NotifyClusterEventHandlerDetails.
        A unique name for the job cluster.


        :return: The cluster_name of this NotifyClusterEventHandlerDetails.
        :rtype: str
        """
        return self._cluster_name

    @cluster_name.setter
    def cluster_name(self, cluster_name):
        """
        Sets the cluster_name of this NotifyClusterEventHandlerDetails.
        A unique name for the job cluster.


        :param cluster_name: The cluster_name of this NotifyClusterEventHandlerDetails.
        :type: str
        """
        self._cluster_name = cluster_name

    @property
    def phase(self):
        """
        Gets the phase of this NotifyClusterEventHandlerDetails.
        Phase

        Allowed values for this property are: "STARTED", "COMPLETED"


        :return: The phase of this NotifyClusterEventHandlerDetails.
        :rtype: str
        """
        return self._phase

    @phase.setter
    def phase(self, phase):
        """
        Sets the phase of this NotifyClusterEventHandlerDetails.
        Phase


        :param phase: The phase of this NotifyClusterEventHandlerDetails.
        :type: str
        """
        allowed_values = ["STARTED", "COMPLETED"]
        if not value_allowed_none_or_none_sentinel(phase, allowed_values):
            raise ValueError(
                "Invalid value for `phase`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._phase = phase

    @property
    def state(self):
        """
        Gets the state of this NotifyClusterEventHandlerDetails.
        State of cluster.

        Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"


        :return: The state of this NotifyClusterEventHandlerDetails.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this NotifyClusterEventHandlerDetails.
        State of cluster.


        :param state: The state of this NotifyClusterEventHandlerDetails.
        :type: str
        """
        allowed_values = ["ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"]
        if not value_allowed_none_or_none_sentinel(state, allowed_values):
            raise ValueError(
                "Invalid value for `state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._state = state

    @property
    def cluster_event(self):
        """
        Gets the cluster_event of this NotifyClusterEventHandlerDetails.

        :return: The cluster_event of this NotifyClusterEventHandlerDetails.
        :rtype: oci.aidataplatform_dp.models.ClusterEvent
        """
        return self._cluster_event

    @cluster_event.setter
    def cluster_event(self, cluster_event):
        """
        Sets the cluster_event of this NotifyClusterEventHandlerDetails.

        :param cluster_event: The cluster_event of this NotifyClusterEventHandlerDetails.
        :type: oci.aidataplatform_dp.models.ClusterEvent
        """
        self._cluster_event = cluster_event

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
