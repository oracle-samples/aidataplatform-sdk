# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ExperimentRunMetricHistoryCollection(object):
    """
    Result of history of ExperimentRun metrics.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ExperimentRunMetricHistoryCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param metrics:
            The value to assign to the metrics property of this ExperimentRunMetricHistoryCollection.
        :type metrics: list[oci.aidataplatform_dp.models.ExperimentRunMetric]

        :param next_page_token:
            The value to assign to the next_page_token property of this ExperimentRunMetricHistoryCollection.
        :type next_page_token: str

        """
        self.swagger_types = {
            'metrics': 'list[ExperimentRunMetric]',
            'next_page_token': 'str'
        }

        self.attribute_map = {
            'metrics': 'metrics',
            'next_page_token': 'next_page_token'
        }

        self._metrics = None
        self._next_page_token = None

    @property
    def metrics(self):
        """
        Gets the metrics of this ExperimentRunMetricHistoryCollection.
        Logged values for the metric.


        :return: The metrics of this ExperimentRunMetricHistoryCollection.
        :rtype: list[oci.aidataplatform_dp.models.ExperimentRunMetric]
        """
        return self._metrics

    @metrics.setter
    def metrics(self, metrics):
        """
        Sets the metrics of this ExperimentRunMetricHistoryCollection.
        Logged values for the metric.


        :param metrics: The metrics of this ExperimentRunMetricHistoryCollection.
        :type: list[oci.aidataplatform_dp.models.ExperimentRunMetric]
        """
        self._metrics = metrics

    @property
    def next_page_token(self):
        """
        Gets the next_page_token of this ExperimentRunMetricHistoryCollection.
        Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval.


        :return: The next_page_token of this ExperimentRunMetricHistoryCollection.
        :rtype: str
        """
        return self._next_page_token

    @next_page_token.setter
    def next_page_token(self, next_page_token):
        """
        Sets the next_page_token of this ExperimentRunMetricHistoryCollection.
        Token that can be used to retrieve the next page of metric history. An empty token means that no more metric history are available for retrieval.


        :param next_page_token: The next_page_token of this ExperimentRunMetricHistoryCollection.
        :type: str
        """
        self._next_page_token = next_page_token

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
