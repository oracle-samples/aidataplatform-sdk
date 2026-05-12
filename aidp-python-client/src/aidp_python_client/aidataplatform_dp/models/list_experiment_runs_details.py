# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ListExperimentRunsDetails(object):
    """
    Details of Experiment Runs to fetch.
    """

    #: A constant which can be used with the run_view_type property of a ListExperimentRunsDetails.
    #: This constant has a value of "ACTIVE_ONLY"
    RUN_VIEW_TYPE_ACTIVE_ONLY = "ACTIVE_ONLY"

    #: A constant which can be used with the run_view_type property of a ListExperimentRunsDetails.
    #: This constant has a value of "DELETED_ONLY"
    RUN_VIEW_TYPE_DELETED_ONLY = "DELETED_ONLY"

    #: A constant which can be used with the run_view_type property of a ListExperimentRunsDetails.
    #: This constant has a value of "ALL"
    RUN_VIEW_TYPE_ALL = "ALL"

    def __init__(self, **kwargs):
        """
        Initializes a new ListExperimentRunsDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param experiment_ids:
            The value to assign to the experiment_ids property of this ListExperimentRunsDetails.
        :type experiment_ids: list[str]

        :param max_results:
            The value to assign to the max_results property of this ListExperimentRunsDetails.
        :type max_results: int

        :param page_token:
            The value to assign to the page_token property of this ListExperimentRunsDetails.
        :type page_token: str

        :param filter:
            The value to assign to the filter property of this ListExperimentRunsDetails.
        :type filter: str

        :param order_by:
            The value to assign to the order_by property of this ListExperimentRunsDetails.
        :type order_by: list[str]

        :param run_view_type:
            The value to assign to the run_view_type property of this ListExperimentRunsDetails.
            Allowed values for this property are: "ACTIVE_ONLY", "DELETED_ONLY", "ALL"
        :type run_view_type: str

        """
        self.swagger_types = {
            'experiment_ids': 'list[str]',
            'max_results': 'int',
            'page_token': 'str',
            'filter': 'str',
            'order_by': 'list[str]',
            'run_view_type': 'str'
        }

        self.attribute_map = {
            'experiment_ids': 'experiment_ids',
            'max_results': 'max_results',
            'page_token': 'page_token',
            'filter': 'filter',
            'order_by': 'order_by',
            'run_view_type': 'run_view_type'
        }

        self._experiment_ids = None
        self._max_results = None
        self._page_token = None
        self._filter = None
        self._order_by = None
        self._run_view_type = None

    @property
    def experiment_ids(self):
        """
        Gets the experiment_ids of this ListExperimentRunsDetails.
        List of experiment IDs to search over


        :return: The experiment_ids of this ListExperimentRunsDetails.
        :rtype: list[str]
        """
        return self._experiment_ids

    @experiment_ids.setter
    def experiment_ids(self, experiment_ids):
        """
        Sets the experiment_ids of this ListExperimentRunsDetails.
        List of experiment IDs to search over


        :param experiment_ids: The experiment_ids of this ListExperimentRunsDetails.
        :type: list[str]
        """
        self._experiment_ids = experiment_ids

    @property
    def max_results(self):
        """
        Gets the max_results of this ListExperimentRunsDetails.
        Maximum number of runs desired. If unspecified, defaults to 1000. All servers are guaranteed to
        support a max_results threshold of at least 50,000 but may support more. Callers are encouraged to
        pass max_results explicitly and leverage page_token to iterate.


        :return: The max_results of this ListExperimentRunsDetails.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results):
        """
        Sets the max_results of this ListExperimentRunsDetails.
        Maximum number of runs desired. If unspecified, defaults to 1000. All servers are guaranteed to
        support a max_results threshold of at least 50,000 but may support more. Callers are encouraged to
        pass max_results explicitly and leverage page_token to iterate.


        :param max_results: The max_results of this ListExperimentRunsDetails.
        :type: int
        """
        self._max_results = max_results

    @property
    def page_token(self):
        """
        Gets the page_token of this ListExperimentRunsDetails.
        Token indicating the page of experiment runs to fetch


        :return: The page_token of this ListExperimentRunsDetails.
        :rtype: str
        """
        return self._page_token

    @page_token.setter
    def page_token(self, page_token):
        """
        Sets the page_token of this ListExperimentRunsDetails.
        Token indicating the page of experiment runs to fetch


        :param page_token: The page_token of this ListExperimentRunsDetails.
        :type: str
        """
        self._page_token = page_token

    @property
    def filter(self):
        """
        Gets the filter of this ListExperimentRunsDetails.
        A filter expression over params, metrics, and tags, that allows returning a subset of runs. The syntax is
        a subset of SQL that supports ANDing together binary operations between a param, metric, or tag and a constant.
        Example: metrics.rmse < 1 and params.model_class = 'LogisticRegression'
        You can select columns with special characters (hyphen, space, period, etc.) by using
        double quotes: metrics.\"model class\" = 'LinearRegression' and tags.\"user-name\" = 'Tomas'
        Supported operators are =, !=, >, >=, <, and <=.


        :return: The filter of this ListExperimentRunsDetails.
        :rtype: str
        """
        return self._filter

    @filter.setter
    def filter(self, filter):
        """
        Sets the filter of this ListExperimentRunsDetails.
        A filter expression over params, metrics, and tags, that allows returning a subset of runs. The syntax is
        a subset of SQL that supports ANDing together binary operations between a param, metric, or tag and a constant.
        Example: metrics.rmse < 1 and params.model_class = 'LogisticRegression'
        You can select columns with special characters (hyphen, space, period, etc.) by using
        double quotes: metrics.\"model class\" = 'LinearRegression' and tags.\"user-name\" = 'Tomas'
        Supported operators are =, !=, >, >=, <, and <=.


        :param filter: The filter of this ListExperimentRunsDetails.
        :type: str
        """
        self._filter = filter

    @property
    def order_by(self):
        """
        Gets the order_by of this ListExperimentRunsDetails.
        List of columns to be ordered by, including attributes, params, metrics, and tags with an
        optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default.
        Example: [\"params.input DESC\", \"metrics.alpha ASC\", \"metrics.rmse\"]
        Tiebreaks are done by start_time DESC followed by run_id for runs with the same start time (and this is
        the default ordering criterion if order_by is not provided).


        :return: The order_by of this ListExperimentRunsDetails.
        :rtype: list[str]
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by):
        """
        Sets the order_by of this ListExperimentRunsDetails.
        List of columns to be ordered by, including attributes, params, metrics, and tags with an
        optional \"DESC\" or \"ASC\" annotation, where \"ASC\" is the default.
        Example: [\"params.input DESC\", \"metrics.alpha ASC\", \"metrics.rmse\"]
        Tiebreaks are done by start_time DESC followed by run_id for runs with the same start time (and this is
        the default ordering criterion if order_by is not provided).


        :param order_by: The order_by of this ListExperimentRunsDetails.
        :type: list[str]
        """
        self._order_by = order_by

    @property
    def run_view_type(self):
        """
        Gets the run_view_type of this ListExperimentRunsDetails.
        Qualifier for type of runs to be returned. If unspecified, returns only active runs.

        Allowed values for this property are: "ACTIVE_ONLY", "DELETED_ONLY", "ALL"


        :return: The run_view_type of this ListExperimentRunsDetails.
        :rtype: str
        """
        return self._run_view_type

    @run_view_type.setter
    def run_view_type(self, run_view_type):
        """
        Sets the run_view_type of this ListExperimentRunsDetails.
        Qualifier for type of runs to be returned. If unspecified, returns only active runs.


        :param run_view_type: The run_view_type of this ListExperimentRunsDetails.
        :type: str
        """
        allowed_values = ["ACTIVE_ONLY", "DELETED_ONLY", "ALL"]
        if not value_allowed_none_or_none_sentinel(run_view_type, allowed_values):
            raise ValueError(
                "Invalid value for `run_view_type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._run_view_type = run_view_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
