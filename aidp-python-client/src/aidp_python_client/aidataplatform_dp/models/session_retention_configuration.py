# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SessionRetentionConfiguration(object):
    """
    Session data retention configuration for an Agent.
    """

    #: A constant which can be used with the breach_action property of a SessionRetentionConfiguration.
    #: This constant has a value of "DELETE_FIFO"
    BREACH_ACTION_DELETE_FIFO = "DELETE_FIFO"

    def __init__(self, **kwargs):
        """
        Initializes a new SessionRetentionConfiguration object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param is_retention_policy_enabled:
            The value to assign to the is_retention_policy_enabled property of this SessionRetentionConfiguration.
        :type is_retention_policy_enabled: bool

        :param breach_action:
            The value to assign to the breach_action property of this SessionRetentionConfiguration.
            Allowed values for this property are: "DELETE_FIFO", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type breach_action: str

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
            'is_retention_policy_enabled': 'bool',
            'breach_action': 'str',
            'retention_period_in_days': 'int',
            'session_size_limit': 'int',
            'thread_count_limit': 'int'
        }
        self.attribute_map = {
            'is_retention_policy_enabled': 'isRetentionPolicyEnabled',
            'breach_action': 'breachAction',
            'retention_period_in_days': 'retentionPeriodInDays',
            'session_size_limit': 'sessionSizeLimit',
            'thread_count_limit': 'threadCountLimit'
        }
        self._is_retention_policy_enabled = None
        self._breach_action = None
        self._retention_period_in_days = None
        self._session_size_limit = None
        self._thread_count_limit = None

    @property
    def is_retention_policy_enabled(self):
        """
        Gets the is_retention_policy_enabled of this SessionRetentionConfiguration.
        Whether session-message retention is enabled.


        :return: The is_retention_policy_enabled of this SessionRetentionConfiguration.
        :rtype: bool
        """
        return self._is_retention_policy_enabled

    @is_retention_policy_enabled.setter
    def is_retention_policy_enabled(self, is_retention_policy_enabled):
        """
        Sets the is_retention_policy_enabled of this SessionRetentionConfiguration.
        Whether session-message retention is enabled.


        :param is_retention_policy_enabled: The is_retention_policy_enabled of this SessionRetentionConfiguration.
        :type: bool
        """
        self._is_retention_policy_enabled = is_retention_policy_enabled

    @property
    def breach_action(self):
        """
        Gets the breach_action of this SessionRetentionConfiguration.
        Action taken when the enabled retention condition is breached.

        Allowed values for this property are: "DELETE_FIFO", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The breach_action of this SessionRetentionConfiguration.
        :rtype: str
        """
        return self._breach_action

    @breach_action.setter
    def breach_action(self, breach_action):
        """
        Sets the breach_action of this SessionRetentionConfiguration.
        Action taken when the enabled retention condition is breached.


        :param breach_action: The breach_action of this SessionRetentionConfiguration.
        :type: str
        """
        allowed_values = ["DELETE_FIFO"]
        if not value_allowed_none_or_none_sentinel(breach_action, allowed_values):
            breach_action = 'UNKNOWN_ENUM_VALUE'
        self._breach_action = breach_action

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
