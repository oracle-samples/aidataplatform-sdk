# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class SummarizeMetricsResponse(object):
    """
    Response payload containing summarized metric data.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new SummarizeMetricsResponse object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param results:
            The value to assign to the results property of this SummarizeMetricsResponse.
        :type results: list[oci.aidataplatform_dp.models.MetricsSummary]

        """
        self.swagger_types = {
            'results': 'list[MetricsSummary]'
        }

        self.attribute_map = {
            'results': 'results'
        }

        self._results = None

    @property
    def results(self):
        """
        **[Required]** Gets the results of this SummarizeMetricsResponse.
        List of computed metric summary results.


        :return: The results of this SummarizeMetricsResponse.
        :rtype: list[oci.aidataplatform_dp.models.MetricsSummary]
        """
        return self._results

    @results.setter
    def results(self, results):
        """
        Sets the results of this SummarizeMetricsResponse.
        List of computed metric summary results.


        :param results: The results of this SummarizeMetricsResponse.
        :type: list[oci.aidataplatform_dp.models.MetricsSummary]
        """
        self._results = results

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
