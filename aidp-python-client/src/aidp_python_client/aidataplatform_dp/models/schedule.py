# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class Schedule(object):
    """
    The schedule configuration for the job.
    """

    #: A constant which can be used with the pause_status property of a Schedule.
    #: This constant has a value of "PAUSED"
    PAUSE_STATUS_PAUSED = "PAUSED"

    #: A constant which can be used with the pause_status property of a Schedule.
    #: This constant has a value of "UNPAUSED"
    PAUSE_STATUS_UNPAUSED = "UNPAUSED"

    def __init__(self, **kwargs):
        """
        Initializes a new Schedule object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param quartz_cron_expression:
            The value to assign to the quartz_cron_expression property of this Schedule.
        :type quartz_cron_expression: str

        :param timezone_id:
            The value to assign to the timezone_id property of this Schedule.
        :type timezone_id: str

        :param pause_status:
            The value to assign to the pause_status property of this Schedule.
            Allowed values for this property are: "PAUSED", "UNPAUSED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type pause_status: str

        """
        self.swagger_types = {
            'quartz_cron_expression': 'str',
            'timezone_id': 'str',
            'pause_status': 'str'
        }

        self.attribute_map = {
            'quartz_cron_expression': 'quartzCronExpression',
            'timezone_id': 'timezoneId',
            'pause_status': 'pauseStatus'
        }

        self._quartz_cron_expression = None
        self._timezone_id = None
        self._pause_status = None

    @property
    def quartz_cron_expression(self):
        """
        **[Required]** Gets the quartz_cron_expression of this Schedule.
        A cron expression using Quartz syntax that describes the schedule for a job.


        :return: The quartz_cron_expression of this Schedule.
        :rtype: str
        """
        return self._quartz_cron_expression

    @quartz_cron_expression.setter
    def quartz_cron_expression(self, quartz_cron_expression):
        """
        Sets the quartz_cron_expression of this Schedule.
        A cron expression using Quartz syntax that describes the schedule for a job.


        :param quartz_cron_expression: The quartz_cron_expression of this Schedule.
        :type: str
        """
        self._quartz_cron_expression = quartz_cron_expression

    @property
    def timezone_id(self):
        """
        **[Required]** Gets the timezone_id of this Schedule.
        A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.


        :return: The timezone_id of this Schedule.
        :rtype: str
        """
        return self._timezone_id

    @timezone_id.setter
    def timezone_id(self, timezone_id):
        """
        Sets the timezone_id of this Schedule.
        A Java timezone ID. The schedule of the job is resolved with respect to this timezone. Example - US/Pacific.


        :param timezone_id: The timezone_id of this Schedule.
        :type: str
        """
        self._timezone_id = timezone_id

    @property
    def pause_status(self):
        """
        Gets the pause_status of this Schedule.
        Indicates whether the schedule is paused or not.

        Allowed values for this property are: "PAUSED", "UNPAUSED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The pause_status of this Schedule.
        :rtype: str
        """
        return self._pause_status

    @pause_status.setter
    def pause_status(self, pause_status):
        """
        Sets the pause_status of this Schedule.
        Indicates whether the schedule is paused or not.


        :param pause_status: The pause_status of this Schedule.
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
