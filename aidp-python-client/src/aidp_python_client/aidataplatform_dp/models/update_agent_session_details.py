# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class UpdateAgentSessionDetails(object):
    """
    Details required to update a new session of an agent.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new UpdateAgentSessionDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param display_name:
            The value to assign to the display_name property of this UpdateAgentSessionDetails.
        :type display_name: str

        :param time_started:
            The value to assign to the time_started property of this UpdateAgentSessionDetails.
        :type time_started: datetime

        :param time_ended:
            The value to assign to the time_ended property of this UpdateAgentSessionDetails.
        :type time_ended: datetime

        :param context:
            The value to assign to the context property of this UpdateAgentSessionDetails.
        :type context: oci.aidataplatform_dp.models.AgentSessionContext

        """
        self.swagger_types = {
            'display_name': 'str',
            'time_started': 'datetime',
            'time_ended': 'datetime',
            'context': 'AgentSessionContext'
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
        Gets the display_name of this UpdateAgentSessionDetails.
        Display name.


        :return: The display_name of this UpdateAgentSessionDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this UpdateAgentSessionDetails.
        Display name.


        :param display_name: The display_name of this UpdateAgentSessionDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def time_started(self):
        """
        Gets the time_started of this UpdateAgentSessionDetails.
        The date and time the session was started.


        :return: The time_started of this UpdateAgentSessionDetails.
        :rtype: datetime
        """
        return self._time_started

    @time_started.setter
    def time_started(self, time_started):
        """
        Sets the time_started of this UpdateAgentSessionDetails.
        The date and time the session was started.


        :param time_started: The time_started of this UpdateAgentSessionDetails.
        :type: datetime
        """
        self._time_started = time_started

    @property
    def time_ended(self):
        """
        Gets the time_ended of this UpdateAgentSessionDetails.
        The date and time the session was ended.


        :return: The time_ended of this UpdateAgentSessionDetails.
        :rtype: datetime
        """
        return self._time_ended

    @time_ended.setter
    def time_ended(self, time_ended):
        """
        Sets the time_ended of this UpdateAgentSessionDetails.
        The date and time the session was ended.


        :param time_ended: The time_ended of this UpdateAgentSessionDetails.
        :type: datetime
        """
        self._time_ended = time_ended

    @property
    def context(self):
        """
        Gets the context of this UpdateAgentSessionDetails.

        :return: The context of this UpdateAgentSessionDetails.
        :rtype: oci.aidataplatform_dp.models.AgentSessionContext
        """
        return self._context

    @context.setter
    def context(self, context):
        """
        Sets the context of this UpdateAgentSessionDetails.

        :param context: The context of this UpdateAgentSessionDetails.
        :type: oci.aidataplatform_dp.models.AgentSessionContext
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
