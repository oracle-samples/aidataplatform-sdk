# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowValidationSummary(object):
    """
    Summary counts for Agent Flow diagram validation issues.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowValidationSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param total_issues:
            The value to assign to the total_issues property of this AgentFlowValidationSummary.
        :type total_issues: int

        :param error_count:
            The value to assign to the error_count property of this AgentFlowValidationSummary.
        :type error_count: int

        :param warning_count:
            The value to assign to the warning_count property of this AgentFlowValidationSummary.
        :type warning_count: int

        :param info_count:
            The value to assign to the info_count property of this AgentFlowValidationSummary.
        :type info_count: int

        :param phase_counts:
            The value to assign to the phase_counts property of this AgentFlowValidationSummary.
        :type phase_counts: dict(str, int)

        """
        self.swagger_types = {
            'total_issues': 'int',
            'error_count': 'int',
            'warning_count': 'int',
            'info_count': 'int',
            'phase_counts': 'dict(str, int)'
        }

        self.attribute_map = {
            'total_issues': 'totalIssues',
            'error_count': 'errorCount',
            'warning_count': 'warningCount',
            'info_count': 'infoCount',
            'phase_counts': 'phaseCounts'
        }

        self._total_issues = None
        self._error_count = None
        self._warning_count = None
        self._info_count = None
        self._phase_counts = None

    @property
    def total_issues(self):
        """
        Gets the total_issues of this AgentFlowValidationSummary.
        Total number of validation issues.


        :return: The total_issues of this AgentFlowValidationSummary.
        :rtype: int
        """
        return self._total_issues

    @total_issues.setter
    def total_issues(self, total_issues):
        """
        Sets the total_issues of this AgentFlowValidationSummary.
        Total number of validation issues.


        :param total_issues: The total_issues of this AgentFlowValidationSummary.
        :type: int
        """
        self._total_issues = total_issues

    @property
    def error_count(self):
        """
        Gets the error_count of this AgentFlowValidationSummary.
        Number of error severity validation issues.


        :return: The error_count of this AgentFlowValidationSummary.
        :rtype: int
        """
        return self._error_count

    @error_count.setter
    def error_count(self, error_count):
        """
        Sets the error_count of this AgentFlowValidationSummary.
        Number of error severity validation issues.


        :param error_count: The error_count of this AgentFlowValidationSummary.
        :type: int
        """
        self._error_count = error_count

    @property
    def warning_count(self):
        """
        Gets the warning_count of this AgentFlowValidationSummary.
        Number of warning severity validation issues.


        :return: The warning_count of this AgentFlowValidationSummary.
        :rtype: int
        """
        return self._warning_count

    @warning_count.setter
    def warning_count(self, warning_count):
        """
        Sets the warning_count of this AgentFlowValidationSummary.
        Number of warning severity validation issues.


        :param warning_count: The warning_count of this AgentFlowValidationSummary.
        :type: int
        """
        self._warning_count = warning_count

    @property
    def info_count(self):
        """
        Gets the info_count of this AgentFlowValidationSummary.
        Number of informational validation issues.


        :return: The info_count of this AgentFlowValidationSummary.
        :rtype: int
        """
        return self._info_count

    @info_count.setter
    def info_count(self, info_count):
        """
        Sets the info_count of this AgentFlowValidationSummary.
        Number of informational validation issues.


        :param info_count: The info_count of this AgentFlowValidationSummary.
        :type: int
        """
        self._info_count = info_count

    @property
    def phase_counts(self):
        """
        Gets the phase_counts of this AgentFlowValidationSummary.
        Counts of validation issues by validation phase.


        :return: The phase_counts of this AgentFlowValidationSummary.
        :rtype: dict(str, int)
        """
        return self._phase_counts

    @phase_counts.setter
    def phase_counts(self, phase_counts):
        """
        Sets the phase_counts of this AgentFlowValidationSummary.
        Counts of validation issues by validation phase.


        :param phase_counts: The phase_counts of this AgentFlowValidationSummary.
        :type: dict(str, int)
        """
        self._phase_counts = phase_counts

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
