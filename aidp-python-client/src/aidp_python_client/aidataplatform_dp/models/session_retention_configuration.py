# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SessionRetentionConfiguration(object):
    """
    Session data retention configuration for agent flow
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SessionRetentionConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param retention_period_in_days:
            The value to assign to the retention_period_in_days property of this SessionRetentionConfiguration.
        :type retention_period_in_days: int

        :param session_size_limit:
            The value to assign to the session_size_limit property of this SessionRetentionConfiguration.
        :type session_size_limit: int

        :param thread_count_limit:
            The value to assign to the thread_count_limit property of this SessionRetentionConfiguration.
        :type thread_count_limit: int

        """
        self.swagger_types = {
            'retention_period_in_days': 'int',
            'session_size_limit': 'int',
            'thread_count_limit': 'int'
        }

        self.attribute_map = {
            'retention_period_in_days': 'retentionPeriodInDays',
            'session_size_limit': 'sessionSizeLimit',
            'thread_count_limit': 'threadCountLimit'
        }

        self._retention_period_in_days = None
        self._session_size_limit = None
        self._thread_count_limit = None

    @property
    def retention_period_in_days(self):
        """
        Gets the retention_period_in_days of this SessionRetentionConfiguration.
        No. of days session data will be kept


        :return: The retention_period_in_days of this SessionRetentionConfiguration.
        :rtype: int
        """
        return self._retention_period_in_days

    @retention_period_in_days.setter
    def retention_period_in_days(self, retention_period_in_days):
        """
        Sets the retention_period_in_days of this SessionRetentionConfiguration.
        No. of days session data will be kept


        :param retention_period_in_days: The retention_period_in_days of this SessionRetentionConfiguration.
        :type: int
        """
        self._retention_period_in_days = retention_period_in_days

    @property
    def session_size_limit(self):
        """
        Gets the session_size_limit of this SessionRetentionConfiguration.
        Max storage allocated to session data (in MB).


        :return: The session_size_limit of this SessionRetentionConfiguration.
        :rtype: int
        """
        return self._session_size_limit

    @session_size_limit.setter
    def session_size_limit(self, session_size_limit):
        """
        Sets the session_size_limit of this SessionRetentionConfiguration.
        Max storage allocated to session data (in MB).


        :param session_size_limit: The session_size_limit of this SessionRetentionConfiguration.
        :type: int
        """
        self._session_size_limit = session_size_limit

    @property
    def thread_count_limit(self):
        """
        Gets the thread_count_limit of this SessionRetentionConfiguration.
        Maximum no. of user prompt and agent response pairs per session


        :return: The thread_count_limit of this SessionRetentionConfiguration.
        :rtype: int
        """
        return self._thread_count_limit

    @thread_count_limit.setter
    def thread_count_limit(self, thread_count_limit):
        """
        Sets the thread_count_limit of this SessionRetentionConfiguration.
        Maximum no. of user prompt and agent response pairs per session


        :param thread_count_limit: The thread_count_limit of this SessionRetentionConfiguration.
        :type: int
        """
        self._thread_count_limit = thread_count_limit

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
