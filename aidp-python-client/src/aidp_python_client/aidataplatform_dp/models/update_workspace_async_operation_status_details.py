# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateWorkspaceAsyncOperationStatusDetails(object):
    """
    The data to update workspace async operation status.
    """

    #: A constant which can be used with the state property of a UpdateWorkspaceAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_CREATED"
    STATE_NETWORK_CONFIGURATION_CREATED = "NETWORK_CONFIGURATION_CREATED"

    #: A constant which can be used with the state property of a UpdateWorkspaceAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_UPDATED"
    STATE_NETWORK_CONFIGURATION_UPDATED = "NETWORK_CONFIGURATION_UPDATED"

    #: A constant which can be used with the state property of a UpdateWorkspaceAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_DELETED"
    STATE_NETWORK_CONFIGURATION_DELETED = "NETWORK_CONFIGURATION_DELETED"

    #: A constant which can be used with the state property of a UpdateWorkspaceAsyncOperationStatusDetails.
    #: This constant has a value of "NETWORK_CONFIGURATION_FAILED"
    STATE_NETWORK_CONFIGURATION_FAILED = "NETWORK_CONFIGURATION_FAILED"

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateWorkspaceAsyncOperationStatusDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param state_message:
            The value to assign to the state_message property of this UpdateWorkspaceAsyncOperationStatusDetails.
        :type state_message: str

        :param state:
            The value to assign to the state property of this UpdateWorkspaceAsyncOperationStatusDetails.
            Allowed values for this property are: "NETWORK_CONFIGURATION_CREATED", "NETWORK_CONFIGURATION_UPDATED", "NETWORK_CONFIGURATION_DELETED", "NETWORK_CONFIGURATION_FAILED"
        :type state: str

        :param external_id:
            The value to assign to the external_id property of this UpdateWorkspaceAsyncOperationStatusDetails.
        :type external_id: str

        :param properties:
            The value to assign to the properties property of this UpdateWorkspaceAsyncOperationStatusDetails.
        :type properties: dict(str, object)

        """
        self.swagger_types = {
            'state_message': 'str',
            'state': 'str',
            'external_id': 'str',
            'properties': 'dict(str, object)'
        }

        self.attribute_map = {
            'state_message': 'stateMessage',
            'state': 'state',
            'external_id': 'externalId',
            'properties': 'properties'
        }

        self._state_message = None
        self._state = None
        self._external_id = None
        self._properties = None

    @property
    def state_message(self):
        """
        Gets the state_message of this UpdateWorkspaceAsyncOperationStatusDetails.
        A descriptive message of the current state.


        :return: The state_message of this UpdateWorkspaceAsyncOperationStatusDetails.
        :rtype: str
        """
        return self._state_message

    @state_message.setter
    def state_message(self, state_message):
        """
        Sets the state_message of this UpdateWorkspaceAsyncOperationStatusDetails.
        A descriptive message of the current state.


        :param state_message: The state_message of this UpdateWorkspaceAsyncOperationStatusDetails.
        :type: str
        """
        self._state_message = state_message

    @property
    def state(self):
        """
        **[Required]** Gets the state of this UpdateWorkspaceAsyncOperationStatusDetails.
        Common lifecycle states for resources in a Compute Cluster:
        NETWORK_CONFIGURATION_CREATED       - The network configuration has been created.
        NETWORK_CONFIGURATION_UPDATED       - The network configuration has been updated.
        NETWORK_CONFIGURATION_DELETED       - The network configuration has been deleted.
        NETWORK_CONFIGURATION_FAILED        - The network configuration has been failed.

        Allowed values for this property are: "NETWORK_CONFIGURATION_CREATED", "NETWORK_CONFIGURATION_UPDATED", "NETWORK_CONFIGURATION_DELETED", "NETWORK_CONFIGURATION_FAILED"


        :return: The state of this UpdateWorkspaceAsyncOperationStatusDetails.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this UpdateWorkspaceAsyncOperationStatusDetails.
        Common lifecycle states for resources in a Compute Cluster:
        NETWORK_CONFIGURATION_CREATED       - The network configuration has been created.
        NETWORK_CONFIGURATION_UPDATED       - The network configuration has been updated.
        NETWORK_CONFIGURATION_DELETED       - The network configuration has been deleted.
        NETWORK_CONFIGURATION_FAILED        - The network configuration has been failed.


        :param state: The state of this UpdateWorkspaceAsyncOperationStatusDetails.
        :type: str
        """
        allowed_values = ["NETWORK_CONFIGURATION_CREATED", "NETWORK_CONFIGURATION_UPDATED", "NETWORK_CONFIGURATION_DELETED", "NETWORK_CONFIGURATION_FAILED"]
        if not value_allowed_none_or_none_sentinel(state, allowed_values):
            raise ValueError(
                "Invalid value for `state`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._state = state

    @property
    def external_id(self):
        """
        Gets the external_id of this UpdateWorkspaceAsyncOperationStatusDetails.
        The external work-request-id if applicable.


        :return: The external_id of this UpdateWorkspaceAsyncOperationStatusDetails.
        :rtype: str
        """
        return self._external_id

    @external_id.setter
    def external_id(self, external_id):
        """
        Sets the external_id of this UpdateWorkspaceAsyncOperationStatusDetails.
        The external work-request-id if applicable.


        :param external_id: The external_id of this UpdateWorkspaceAsyncOperationStatusDetails.
        :type: str
        """
        self._external_id = external_id

    @property
    def properties(self):
        """
        Gets the properties of this UpdateWorkspaceAsyncOperationStatusDetails.
        The properties of operation on workspace.


        :return: The properties of this UpdateWorkspaceAsyncOperationStatusDetails.
        :rtype: dict(str, object)
        """
        return self._properties

    @properties.setter
    def properties(self, properties):
        """
        Sets the properties of this UpdateWorkspaceAsyncOperationStatusDetails.
        The properties of operation on workspace.


        :param properties: The properties of this UpdateWorkspaceAsyncOperationStatusDetails.
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
