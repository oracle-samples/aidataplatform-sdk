# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentFlowSessionDetails(object):
    """
    Details required to update a new session of an Agent Flow.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentFlowSessionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateAgentFlowSessionDetails.
        :type display_name: str

        :param time_started:
            The value to assign to the time_started property of this UpdateAgentFlowSessionDetails.
        :type time_started: datetime

        :param time_ended:
            The value to assign to the time_ended property of this UpdateAgentFlowSessionDetails.
        :type time_ended: datetime

        :param context:
            The value to assign to the context property of this UpdateAgentFlowSessionDetails.
        :type context: oci.aidataplatform_dp.models.AgentFlowSessionContext

        """
        self.swagger_types = {
            'display_name': 'str',
            'time_started': 'datetime',
            'time_ended': 'datetime',
            'context': 'AgentFlowSessionContext'
        }

        self.attribute_map = {
            'display_name': 'displayName',
            'time_started': 'timeStarted',
            'time_ended': 'timeEnded',
            'context': 'context'
        }

        self._display_name = None
        self._time_started = None
        self._time_ended = None
        self._context = None

    @property
    def display_name(self):
        """
        Gets the display_name of this UpdateAgentFlowSessionDetails.
        Display name.


        :return: The display_name of this UpdateAgentFlowSessionDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateAgentFlowSessionDetails.
        Display name.


        :param display_name: The display_name of this UpdateAgentFlowSessionDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def time_started(self):
        """
        Gets the time_started of this UpdateAgentFlowSessionDetails.
        The date and time the session was started


        :return: The time_started of this UpdateAgentFlowSessionDetails.
        :rtype: datetime
        """
        return self._time_started

    @time_started.setter
    def time_started(self, time_started):
        """
        Sets the time_started of this UpdateAgentFlowSessionDetails.
        The date and time the session was started


        :param time_started: The time_started of this UpdateAgentFlowSessionDetails.
        :type: datetime
        """
        self._time_started = time_started

    @property
    def time_ended(self):
        """
        Gets the time_ended of this UpdateAgentFlowSessionDetails.
        The date and time the session was ended


        :return: The time_ended of this UpdateAgentFlowSessionDetails.
        :rtype: datetime
        """
        return self._time_ended

    @time_ended.setter
    def time_ended(self, time_ended):
        """
        Sets the time_ended of this UpdateAgentFlowSessionDetails.
        The date and time the session was ended


        :param time_ended: The time_ended of this UpdateAgentFlowSessionDetails.
        :type: datetime
        """
        self._time_ended = time_ended

    @property
    def context(self):
        """
        Gets the context of this UpdateAgentFlowSessionDetails.

        :return: The context of this UpdateAgentFlowSessionDetails.
        :rtype: oci.aidataplatform_dp.models.AgentFlowSessionContext
        """
        return self._context

    @context.setter
    def context(self, context):
        """
        Sets the context of this UpdateAgentFlowSessionDetails.

        :param context: The context of this UpdateAgentFlowSessionDetails.
        :type: oci.aidataplatform_dp.models.AgentFlowSessionContext
        """
        self._context = context

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
