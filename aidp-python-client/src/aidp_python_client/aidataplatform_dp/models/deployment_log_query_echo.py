# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class DeploymentLogQueryEcho(object):
    """
    Echo of the executed query and its consistency.
    """

    #: A constant which can be used with the consistency property of a DeploymentLogQueryEcho.
    #: This constant has a value of "BEST_EFFORT"
    CONSISTENCY_BEST_EFFORT = "BEST_EFFORT"

    def __init__(self, **kwargs):
        """
        Initializes a new DeploymentLogQueryEcho object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param time_start:
            The value to assign to the time_start property of this DeploymentLogQueryEcho.
        :type time_start: datetime

        :param time_end:
            The value to assign to the time_end property of this DeploymentLogQueryEcho.
        :type time_end: datetime

        :param sort_by:
            The value to assign to the sort_by property of this DeploymentLogQueryEcho.
        :type sort_by: str

        :param sort_order:
            The value to assign to the sort_order property of this DeploymentLogQueryEcho.
        :type sort_order: str

        :param time_evaluated:
            The value to assign to the time_evaluated property of this DeploymentLogQueryEcho.
        :type time_evaluated: datetime

        :param consistency:
            The value to assign to the consistency property of this DeploymentLogQueryEcho.
            Allowed values for this property are: "BEST_EFFORT", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type consistency: str

        """
        self.swagger_types = {
            'time_start': 'datetime',
            'time_end': 'datetime',
            'sort_by': 'str',
            'sort_order': 'str',
            'time_evaluated': 'datetime',
            'consistency': 'str'
        }
        self.attribute_map = {
            'time_start': 'timeStart',
            'time_end': 'timeEnd',
            'sort_by': 'sortBy',
            'sort_order': 'sortOrder',
            'time_evaluated': 'timeEvaluated',
            'consistency': 'consistency'
        }
        self._time_start = None
        self._time_end = None
        self._sort_by = None
        self._sort_order = None
        self._time_evaluated = None
        self._consistency = None

    @property
    def time_start(self):
        """
        **[Required]** Gets the time_start of this DeploymentLogQueryEcho.
        Start of the publish-time window the query was evaluated against (RFC 3339, inclusive).


        :return: The time_start of this DeploymentLogQueryEcho.
        :rtype: datetime
        """
        return self._time_start

    @time_start.setter
    def time_start(self, time_start):
        """
        Sets the time_start of this DeploymentLogQueryEcho.
        Start of the publish-time window the query was evaluated against (RFC 3339, inclusive).


        :param time_start: The time_start of this DeploymentLogQueryEcho.
        :type: datetime
        """
        self._time_start = time_start

    @property
    def time_end(self):
        """
        **[Required]** Gets the time_end of this DeploymentLogQueryEcho.
        End of the publish-time window the query was evaluated against (RFC 3339, exclusive).


        :return: The time_end of this DeploymentLogQueryEcho.
        :rtype: datetime
        """
        return self._time_end

    @time_end.setter
    def time_end(self, time_end):
        """
        Sets the time_end of this DeploymentLogQueryEcho.
        End of the publish-time window the query was evaluated against (RFC 3339, exclusive).


        :param time_end: The time_end of this DeploymentLogQueryEcho.
        :type: datetime
        """
        self._time_end = time_end

    @property
    def sort_by(self):
        """
        Gets the sort_by of this DeploymentLogQueryEcho.
        Sort column applied to the results. Only TIMESTAMP is supported.


        :return: The sort_by of this DeploymentLogQueryEcho.
        :rtype: str
        """
        return self._sort_by

    @sort_by.setter
    def sort_by(self, sort_by):
        """
        Sets the sort_by of this DeploymentLogQueryEcho.
        Sort column applied to the results. Only TIMESTAMP is supported.


        :param sort_by: The sort_by of this DeploymentLogQueryEcho.
        :type: str
        """
        self._sort_by = sort_by

    @property
    def sort_order(self):
        """
        Gets the sort_order of this DeploymentLogQueryEcho.
        Sort order applied to the results. Only DESC is supported.


        :return: The sort_order of this DeploymentLogQueryEcho.
        :rtype: str
        """
        return self._sort_order

    @sort_order.setter
    def sort_order(self, sort_order):
        """
        Sets the sort_order of this DeploymentLogQueryEcho.
        Sort order applied to the results. Only DESC is supported.


        :param sort_order: The sort_order of this DeploymentLogQueryEcho.
        :type: str
        """
        self._sort_order = sort_order

    @property
    def time_evaluated(self):
        """
        **[Required]** Gets the time_evaluated of this DeploymentLogQueryEcho.
        Retrieval time. Not a claim that ingestion is complete through this instant.


        :return: The time_evaluated of this DeploymentLogQueryEcho.
        :rtype: datetime
        """
        return self._time_evaluated

    @time_evaluated.setter
    def time_evaluated(self, time_evaluated):
        """
        Sets the time_evaluated of this DeploymentLogQueryEcho.
        Retrieval time. Not a claim that ingestion is complete through this instant.


        :param time_evaluated: The time_evaluated of this DeploymentLogQueryEcho.
        :type: datetime
        """
        self._time_evaluated = time_evaluated

    @property
    def consistency(self):
        """
        **[Required]** Gets the consistency of this DeploymentLogQueryEcho.
        Consistency of the returned page. Always BEST_EFFORT for a live read of the log source.

        Allowed values for this property are: "BEST_EFFORT", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The consistency of this DeploymentLogQueryEcho.
        :rtype: str
        """
        return self._consistency

    @consistency.setter
    def consistency(self, consistency):
        """
        Sets the consistency of this DeploymentLogQueryEcho.
        Consistency of the returned page. Always BEST_EFFORT for a live read of the log source.


        :param consistency: The consistency of this DeploymentLogQueryEcho.
        :type: str
        """
        allowed_values = ["BEST_EFFORT"]
        if not value_allowed_none_or_none_sentinel(consistency, allowed_values):
            consistency = 'UNKNOWN_ENUM_VALUE'
        self._consistency = consistency

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
