# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster_event import ClusterEvent
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DriverFailedAndRecoveredEvent(ClusterEvent):
    """
    The information about a Spark driver failure and subsequent recovery event.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new DriverFailedAndRecoveredEvent object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.DriverFailedAndRecoveredEvent.type` attribute
        of this class is ``DRIVER_FAILED_AND_RECOVERED_EVENT`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this DriverFailedAndRecoveredEvent.
            Allowed values for this property are: "CLUSTER_PATCH_EVENT", "CLUSTER_EXECUTION_CONTEXT_AVAILABILITY_EVENT", "CLUSTER_STATE_EVENT", "DRIVER_FAILED_AND_RECOVERED_EVENT"
        :type type: str

        :param time_driver_recovered:
            The value to assign to the time_driver_recovered property of this DriverFailedAndRecoveredEvent.
        :type time_driver_recovered: datetime

        :param failure_reason:
            The value to assign to the failure_reason property of this DriverFailedAndRecoveredEvent.
        :type failure_reason: str

        """
        self.swagger_types = {
            'type': 'str',
            'time_driver_recovered': 'datetime',
            'failure_reason': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'time_driver_recovered': 'timeDriverRecovered',
            'failure_reason': 'failureReason'
        }

        self._type = None
        self._time_driver_recovered = None
        self._failure_reason = None
        self._type = 'DRIVER_FAILED_AND_RECOVERED_EVENT'

    @property
    def time_driver_recovered(self):
        """
        **[Required]** Gets the time_driver_recovered of this DriverFailedAndRecoveredEvent.
        The date and time when the replacement Spark driver became ready, in RFC 3339 format.


        :return: The time_driver_recovered of this DriverFailedAndRecoveredEvent.
        :rtype: datetime
        """
        return self._time_driver_recovered

    @time_driver_recovered.setter
    def time_driver_recovered(self, time_driver_recovered):
        """
        Sets the time_driver_recovered of this DriverFailedAndRecoveredEvent.
        The date and time when the replacement Spark driver became ready, in RFC 3339 format.


        :param time_driver_recovered: The time_driver_recovered of this DriverFailedAndRecoveredEvent.
        :type: datetime
        """
        self._time_driver_recovered = time_driver_recovered

    @property
    def failure_reason(self):
        """
        **[Required]** Gets the failure_reason of this DriverFailedAndRecoveredEvent.
        The reason why the previous Spark driver failed.


        :return: The failure_reason of this DriverFailedAndRecoveredEvent.
        :rtype: str
        """
        return self._failure_reason

    @failure_reason.setter
    def failure_reason(self, failure_reason):
        """
        Sets the failure_reason of this DriverFailedAndRecoveredEvent.
        The reason why the previous Spark driver failed.


        :param failure_reason: The failure_reason of this DriverFailedAndRecoveredEvent.
        :type: str
        """
        self._failure_reason = failure_reason

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
