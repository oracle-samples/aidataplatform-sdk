# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_event import ClusterEvent
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterStateEvent(ClusterEvent):
    """
    The information about the cluster state event. Workflow will use it to obtain the terminal state.
    """

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "ACCEPTED"
    STATE_ACCEPTED = "ACCEPTED"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "CREATING"
    STATE_CREATING = "CREATING"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "ACTIVE"
    STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "DELETING"
    STATE_DELETING = "DELETING"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "DELETED"
    STATE_DELETED = "DELETED"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "FAILED"
    STATE_FAILED = "FAILED"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "STOPPING"
    STATE_STOPPING = "STOPPING"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "STOPPED"
    STATE_STOPPED = "STOPPED"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "UPDATING"
    STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "RESTARTING"
    STATE_RESTARTING = "RESTARTING"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "STARTING"
    STATE_STARTING = "STARTING"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"
    STATE_NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS = "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"
    STATE_NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL = "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_FAILED"
    STATE_NETWORK_CONFIGURATION_ATTACH_FAILED = "NETWORK_CONFIGURATION_ATTACH_FAILED"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"
    STATE_NETWORK_CONFIGURATION_DETACH_IN_PROGRESS = "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"
    STATE_NETWORK_CONFIGURATION_DETACH_SUCCESSFUL = "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"

    #: A constant which can be used with the state property of a ClusterStateEvent.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_FAILED"
    STATE_NETWORK_CONFIGURATION_DETACH_FAILED = "NETWORK_CONFIGURATION_DETACH_FAILED"

    #: A constant which can be used with the phase property of a ClusterStateEvent.
    #: This constant has a value of "STARTED"
    PHASE_STARTED = "STARTED"

    #: A constant which can be used with the phase property of a ClusterStateEvent.
    #: This constant has a value of "COMPLETED"
    PHASE_COMPLETED = "COMPLETED"

    #: A constant which can be used with the source property of a ClusterStateEvent.
    #: This constant has a value of "USER"
    SOURCE_USER = "USER"

    #: A constant which can be used with the source property of a ClusterStateEvent.
    #: This constant has a value of "SYSTEM"
    SOURCE_SYSTEM = "SYSTEM"

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterStateEvent object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.ClusterStateEvent.type` attribute
        of this class is ``CLUSTER_STATE_EVENT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this ClusterStateEvent.
            Allowed values for this property are: "CLUSTER_PATCH_EVENT", "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT", "CLUSTER_STATE_EVENT"
        :type type: str

        :param state:
            The value to assign to the state property of this ClusterStateEvent.
            Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"
        :type state: str

        :param phase:
            The value to assign to the phase property of this ClusterStateEvent.
            Allowed values for this property are: "STARTED", "COMPLETED"
        :type phase: str

        :param source:
            The value to assign to the source property of this ClusterStateEvent.
            Allowed values for this property are: "USER", "SYSTEM"
        :type source: str

        :param state_message:
            The value to assign to the state_message property of this ClusterStateEvent.
        :type state_message: str

        """
        self.swagger_types = {
            'type': 'str',
            'state': 'str',
            'phase': 'str',
            'source': 'str',
            'state_message': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'state': 'state',
            'phase': 'phase',
            'source': 'source',
            'state_message': 'stateMessage'
        }

        self._type = None
        self._state = None
        self._phase = None
        self._source = None
        self._state_message = None
        self._type = 'CLUSTER_STATE_EVENT'

    @property
    def state(self):
        """
        Gets the state of this ClusterStateEvent.
        State of cluster.

        Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"


        :return: The state of this ClusterStateEvent.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this ClusterStateEvent.
        State of cluster.


        :param state: The state of this ClusterStateEvent.
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
    def phase(self):
        """
        Gets the phase of this ClusterStateEvent.
        Phase

        Allowed values for this property are: "STARTED", "COMPLETED"


        :return: The phase of this ClusterStateEvent.
        :rtype: str
        """
        return self._phase

    @phase.setter
    def phase(self, phase):
        """
        Sets the phase of this ClusterStateEvent.
        Phase


        :param phase: The phase of this ClusterStateEvent.
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
    def source(self):
        """
        Gets the source of this ClusterStateEvent.
        Cluster state change source. This can be either USER representing end user, or SYSTEM including maintenance and system error scenario

        Allowed values for this property are: "USER", "SYSTEM"


        :return: The source of this ClusterStateEvent.
        :rtype: str
        """
        return self._source

    @source.setter
    def source(self, source):
        """
        Sets the source of this ClusterStateEvent.
        Cluster state change source. This can be either USER representing end user, or SYSTEM including maintenance and system error scenario


        :param source: The source of this ClusterStateEvent.
        :type: str
        """
        allowed_values = ["USER", "SYSTEM"]
        if not value_allowed_none_or_none_sentinel(source, allowed_values):
            raise ValueError(
                "Invalid value for `source`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._source = source

    @property
    def state_message(self):
        """
        Gets the state_message of this ClusterStateEvent.
        In case of a failed state, this will capture the reason for error.


        :return: The state_message of this ClusterStateEvent.
        :rtype: str
        """
        return self._state_message

    @state_message.setter
    def state_message(self, state_message):
        """
        Sets the state_message of this ClusterStateEvent.
        In case of a failed state, this will capture the reason for error.


        :param state_message: The state_message of this ClusterStateEvent.
        :type: str
        """
        self._state_message = state_message

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
