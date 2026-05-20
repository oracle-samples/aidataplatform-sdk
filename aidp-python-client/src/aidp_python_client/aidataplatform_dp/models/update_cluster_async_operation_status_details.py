# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateClusterAsyncOperationStatusDetails(object):
    """
    The data to update cluster async operation status.
    """

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "ACCEPTED"
    STATE_ACCEPTED = "ACCEPTED"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "CREATING"
    STATE_CREATING = "CREATING"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "ACTIVE"
    STATE_ACTIVE = "ACTIVE"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "DELETING"
    STATE_DELETING = "DELETING"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "DELETED"
    STATE_DELETED = "DELETED"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "FAILED"
    STATE_FAILED = "FAILED"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "STOPPING"
    STATE_STOPPING = "STOPPING"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "STOPPED"
    STATE_STOPPED = "STOPPED"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "UPDATING"
    STATE_UPDATING = "UPDATING"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "RESTARTING"
    STATE_RESTARTING = "RESTARTING"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "STARTING"
    STATE_STARTING = "STARTING"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"
    STATE_NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS = "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"
    STATE_NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL = "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_ATTACH_FAILED"
    STATE_NETWORK_CONFIGURATION_ATTACH_FAILED = "NETWORK_CONFIGURATION_ATTACH_FAILED"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"
    STATE_NETWORK_CONFIGURATION_DETACH_IN_PROGRESS = "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"
    STATE_NETWORK_CONFIGURATION_DETACH_SUCCESSFUL = "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL"

    #: A constant which can be used with the state property of a UpdateClusterAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_DETACH_FAILED"
    STATE_NETWORK_CONFIGURATION_DETACH_FAILED = "NETWORK_CONFIGURATION_DETACH_FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateClusterAsyncOperationStatusDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param state_message:
            The value to assign to the state_message property of this UpdateClusterAsyncOperationStatusDetails.
        :type state_message: str

        :param state:
            The value to assign to the state property of this UpdateClusterAsyncOperationStatusDetails.
            Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"
        :type state: str

        :param external_id:
            The value to assign to the external_id property of this UpdateClusterAsyncOperationStatusDetails.
        :type external_id: str

        :param metrics:
            The value to assign to the metrics property of this UpdateClusterAsyncOperationStatusDetails.
        :type metrics: dict(str, str)

        :param properties:
            The value to assign to the properties property of this UpdateClusterAsyncOperationStatusDetails.
        :type properties: dict(str, object)

        """
        self.swagger_types = {
            'state_message': 'str',
            'state': 'str',
            'external_id': 'str',
            'metrics': 'dict(str, str)',
            'properties': 'dict(str, object)'
        }

        self.attribute_map = {
            'state_message': 'stateMessage',
            'state': 'state',
            'external_id': 'externalId',
            'metrics': 'metrics',
            'properties': 'properties'
        }

        self._state_message = None
        self._state = None
        self._external_id = None
        self._metrics = None
        self._properties = None

    @property
    def state_message(self):
        """
        Gets the state_message of this UpdateClusterAsyncOperationStatusDetails.
        Descriptive message of the current state.


        :return: The state_message of this UpdateClusterAsyncOperationStatusDetails.
        :rtype: str
        """
        return self._state_message

    @state_message.setter
    def state_message(self, state_message):
        """
        Sets the state_message of this UpdateClusterAsyncOperationStatusDetails.
        Descriptive message of the current state.


        :param state_message: The state_message of this UpdateClusterAsyncOperationStatusDetails.
        :type: str
        """
        self._state_message = state_message

    @property
    def state(self):
        """
        **[Required]** Gets the state of this UpdateClusterAsyncOperationStatusDetails.
        Common lifecycle states for resources in a compute cluster.
        ACCEPTED        - The resource create request has been accepted.
        CREATING        - The resource is being created and might not be usable until the entire metadata is defined.
        ACTIVE          - The resource is valid and available for access.
        DELETING        - The resource is being deleted, and might require a deep clean of any children.
        DELETED         - The resource has been deleted, and isn't available.
        FAILED          - The resource is in a failed state due to validation or other errors.
        STOPPING        - The resource is being stopped.
        STOPPED         - The resource has been stopped.
        UPDATING        - The resource is being updated and might not be usable until all changes are commited.
        STARTING        - The resource is being started.
        RESTARTING      - The resource is being restarted.

        Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"


        :return: The state of this UpdateClusterAsyncOperationStatusDetails.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this UpdateClusterAsyncOperationStatusDetails.
        Common lifecycle states for resources in a compute cluster.
        ACCEPTED        - The resource create request has been accepted.
        CREATING        - The resource is being created and might not be usable until the entire metadata is defined.
        ACTIVE          - The resource is valid and available for access.
        DELETING        - The resource is being deleted, and might require a deep clean of any children.
        DELETED         - The resource has been deleted, and isn't available.
        FAILED          - The resource is in a failed state due to validation or other errors.
        STOPPING        - The resource is being stopped.
        STOPPED         - The resource has been stopped.
        UPDATING        - The resource is being updated and might not be usable until all changes are commited.
        STARTING        - The resource is being started.
        RESTARTING      - The resource is being restarted.


        :param state: The state of this UpdateClusterAsyncOperationStatusDetails.
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
    def external_id(self):
        """
        Gets the external_id of this UpdateClusterAsyncOperationStatusDetails.
        External work-request-id if applicable.


        :return: The external_id of this UpdateClusterAsyncOperationStatusDetails.
        :rtype: str
        """
        return self._external_id

    @external_id.setter
    def external_id(self, external_id):
        """
        Sets the external_id of this UpdateClusterAsyncOperationStatusDetails.
        External work-request-id if applicable.


        :param external_id: The external_id of this UpdateClusterAsyncOperationStatusDetails.
        :type: str
        """
        self._external_id = external_id

    @property
    def metrics(self):
        """
        Gets the metrics of this UpdateClusterAsyncOperationStatusDetails.
        Metrics for the cluster operation.


        :return: The metrics of this UpdateClusterAsyncOperationStatusDetails.
        :rtype: dict(str, str)
        """
        return self._metrics

    @metrics.setter
    def metrics(self, metrics):
        """
        Sets the metrics of this UpdateClusterAsyncOperationStatusDetails.
        Metrics for the cluster operation.


        :param metrics: The metrics of this UpdateClusterAsyncOperationStatusDetails.
        :type: dict(str, str)
        """
        self._metrics = metrics

    @property
    def properties(self):
        """
        Gets the properties of this UpdateClusterAsyncOperationStatusDetails.
        Properties of operation on cluster.


        :return: The properties of this UpdateClusterAsyncOperationStatusDetails.
        :rtype: dict(str, object)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this UpdateClusterAsyncOperationStatusDetails.
        Properties of operation on cluster.


        :param properties: The properties of this UpdateClusterAsyncOperationStatusDetails.
        :type: dict(str, object)
        """
        self._properties = properties

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
