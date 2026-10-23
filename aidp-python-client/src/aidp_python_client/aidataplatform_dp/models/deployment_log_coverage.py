# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentLogCoverage(object):
    """
    How completely the underlying log source can serve the requested window.
    """

    #: A constant which can be used with the state property of a DeploymentLogCoverage.
    #: This constant has a value of "UNKNOWN"
    STATE_UNKNOWN = "UNKNOWN"

    #: A constant which can be used with the state property of a DeploymentLogCoverage.
    #: This constant has a value of "PARTIAL"
    STATE_PARTIAL = "PARTIAL"

    #: A constant which can be used with the state property of a DeploymentLogCoverage.
    #: This constant has a value of "COMPLETE_WITHIN_RETENTION"
    STATE_COMPLETE_WITHIN_RETENTION = "COMPLETE_WITHIN_RETENTION"

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentLogCoverage object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param state:
            The value to assign to the state property of this DeploymentLogCoverage.
            Allowed values for this property are: "UNKNOWN", "PARTIAL", "COMPLETE_WITHIN_RETENTION", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type state: str

        :param retention_days:
            The value to assign to the retention_days property of this DeploymentLogCoverage.
        :type retention_days: int

        :param reasons:
            The value to assign to the reasons property of this DeploymentLogCoverage.
        :type reasons: list[str]

        """
        self.swagger_types = {
            'state': 'str',
            'retention_days': 'int',
            'reasons': 'list[str]'
        }
        self.attribute_map = {
            'state': 'state',
            'retention_days': 'retentionDays',
            'reasons': 'reasons'
        }
        self._state = None
        self._retention_days = None
        self._reasons = None

    @property
    def state(self):
        """
        **[Required]** Gets the state of this DeploymentLogCoverage.
        COMPLETE_WITHIN_RETENTION only when the window lies inside verified retention and the scan was not truncated. PARTIAL only with an affirmatively known gap. Otherwise UNKNOWN.

        Allowed values for this property are: "UNKNOWN", "PARTIAL", "COMPLETE_WITHIN_RETENTION", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The state of this DeploymentLogCoverage.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state):
        """
        Sets the state of this DeploymentLogCoverage.
        COMPLETE_WITHIN_RETENTION only when the window lies inside verified retention and the scan was not truncated. PARTIAL only with an affirmatively known gap. Otherwise UNKNOWN.


        :param state: The state of this DeploymentLogCoverage.
        :type: str
        """
        allowed_values = ["UNKNOWN", "PARTIAL", "COMPLETE_WITHIN_RETENTION"]
        if not value_allowed_none_or_none_sentinel(state, allowed_values):
            state = 'UNKNOWN_ENUM_VALUE'
        self._state = state

    @property
    def retention_days(self):
        """
        Gets the retention_days of this DeploymentLogCoverage.
        Configured retention of the current log object, when readable.


        :return: The retention_days of this DeploymentLogCoverage.
        :rtype: int
        """
        return self._retention_days

    @retention_days.setter
    def retention_days(self, retention_days):
        """
        Sets the retention_days of this DeploymentLogCoverage.
        Configured retention of the current log object, when readable.


        :param retention_days: The retention_days of this DeploymentLogCoverage.
        :type: int
        """
        self._retention_days = retention_days

    @property
    def reasons(self):
        """
        Gets the reasons of this DeploymentLogCoverage.
        Machine-readable reasons explaining why coverage is not complete, when applicable.


        :return: The reasons of this DeploymentLogCoverage.
        :rtype: list[str]
        """
        return self._reasons

    @reasons.setter
    def reasons(self, reasons):
        """
        Sets the reasons of this DeploymentLogCoverage.
        Machine-readable reasons explaining why coverage is not complete, when applicable.


        :param reasons: The reasons of this DeploymentLogCoverage.
        :type: list[str]
        """
        self._reasons = reasons

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
