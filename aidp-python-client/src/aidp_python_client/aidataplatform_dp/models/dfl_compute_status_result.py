# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DflComputeStatusResult(object):
    """
    Status of DI Agent enablement and managed compute lifecycle for an AI Data Platform instance.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DflComputeStatusResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_enabled:
            The value to assign to the is_enabled property of this DflComputeStatusResult.
        :type is_enabled: bool

        :param lifecycle_state:
            The value to assign to the lifecycle_state property of this DflComputeStatusResult.
        :type lifecycle_state: str

        :param enablement_status:
            The value to assign to the enablement_status property of this DflComputeStatusResult.
        :type enablement_status: str

        :param status_details:
            The value to assign to the status_details property of this DflComputeStatusResult.
        :type status_details: str

        """
        self.swagger_types = {
            'is_enabled': 'bool',
            'lifecycle_state': 'str',
            'enablement_status': 'str',
            'status_details': 'str'
        }

        self.attribute_map = {
            'is_enabled': 'isEnabled',
            'lifecycle_state': 'lifecycleState',
            'enablement_status': 'enablementStatus',
            'status_details': 'statusDetails'
        }

        self._is_enabled = None
        self._lifecycle_state = None
        self._enablement_status = None
        self._status_details = None

    @property
    def is_enabled(self):
        """
        **[Required]** Gets the is_enabled of this DflComputeStatusResult.
        Whether DI Agent enablement is enabled for the AI Data Platform instance.


        :return: The is_enabled of this DflComputeStatusResult.
        :rtype: bool
        """
        return self._is_enabled

    @is_enabled.setter
    def is_enabled(self, is_enabled):
        """
        Sets the is_enabled of this DflComputeStatusResult.
        Whether DI Agent enablement is enabled for the AI Data Platform instance.


        :param is_enabled: The is_enabled of this DflComputeStatusResult.
        :type: bool
        """
        self._is_enabled = is_enabled

    @property
    def lifecycle_state(self):
        """
        Gets the lifecycle_state of this DflComputeStatusResult.
        The current DI Agent managed compute lifecycle state when compute exists.


        :return: The lifecycle_state of this DflComputeStatusResult.
        :rtype: str
        """
        return self._lifecycle_state

    @lifecycle_state.setter
    def lifecycle_state(self, lifecycle_state):
        """
        Sets the lifecycle_state of this DflComputeStatusResult.
        The current DI Agent managed compute lifecycle state when compute exists.


        :param lifecycle_state: The lifecycle_state of this DflComputeStatusResult.
        :type: str
        """
        self._lifecycle_state = lifecycle_state

    @property
    def enablement_status(self):
        """
        Gets the enablement_status of this DflComputeStatusResult.
        Durable DI Agent enablement state, such as InProgress, Succeeded, or Failed.


        :return: The enablement_status of this DflComputeStatusResult.
        :rtype: str
        """
        return self._enablement_status

    @enablement_status.setter
    def enablement_status(self, enablement_status):
        """
        Sets the enablement_status of this DflComputeStatusResult.
        Durable DI Agent enablement state, such as InProgress, Succeeded, or Failed.


        :param enablement_status: The enablement_status of this DflComputeStatusResult.
        :type: str
        """
        self._enablement_status = enablement_status

    @property
    def status_details(self):
        """
        Gets the status_details of this DflComputeStatusResult.
        Additional sanitized details for the durable enablement state, populated when available.


        :return: The status_details of this DflComputeStatusResult.
        :rtype: str
        """
        return self._status_details

    @status_details.setter
    def status_details(self, status_details):
        """
        Sets the status_details of this DflComputeStatusResult.
        Additional sanitized details for the durable enablement state, populated when available.


        :param status_details: The status_details of this DflComputeStatusResult.
        :type: str
        """
        self._status_details = status_details

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
