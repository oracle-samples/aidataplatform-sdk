# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Continuous(object):
    """
    The continuous property ensures that there is always one execution for this job.
    """

    #: A constant which can be used with the pause_status property of a Continuous.
    #: This constant has a value of "PAUSED"
    PAUSE_STATUS_PAUSED = "PAUSED"

    #: A constant which can be used with the pause_status property of a Continuous.
    #: This constant has a value of "UNPAUSED"
    PAUSE_STATUS_UNPAUSED = "UNPAUSED"

    def __init__(self, **kwargs):
        """
        Initializes a new Continuous object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param pause_status:
            The value to assign to the pause_status property of this Continuous.
            Allowed values for this property are: "PAUSED", "UNPAUSED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type pause_status: str

        """
        self.swagger_types = {
            'pause_status': 'str'
        }

        self.attribute_map = {
            'pause_status': 'pauseStatus'
        }

        self._pause_status = None

    @property
    def pause_status(self):
        """
        Gets the pause_status of this Continuous.
        Indicates whether the continuous execution of this job is paused or not.

        Allowed values for this property are: "PAUSED", "UNPAUSED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The pause_status of this Continuous.
        :rtype: str
        """
        return self._pause_status

    @pause_status.setter
    def pause_status(self, pause_status):
        """
        Sets the pause_status of this Continuous.
        Indicates whether the continuous execution of this job is paused or not.


        :param pause_status: The pause_status of this Continuous.
        :type: str
        """
        allowed_values = ["PAUSED", "UNPAUSED"]
        if not value_allowed_none_or_none_sentinel(pause_status, allowed_values):
            pause_status = 'UNKNOWN_ENUM_VALUE'
        self._pause_status = pause_status

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
