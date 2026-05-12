# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ClusterLogsSummary(object):
    """
    Response payload containing search results and metadata.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ClusterLogsSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param fields:
            The value to assign to the fields property of this ClusterLogsSummary.
        :type fields: list[oci.aidataplatform_dp.models.FieldInfo]

        :param results:
            The value to assign to the results property of this ClusterLogsSummary.
        :type results: list[oci.aidataplatform_dp.models.SearchResult]

        :param summary:
            The value to assign to the summary property of this ClusterLogsSummary.
        :type summary: oci.aidataplatform_dp.models.SearchResultSummary

        """
        self.swagger_types = {
            'fields': 'list[FieldInfo]',
            'results': 'list[SearchResult]',
            'summary': 'SearchResultSummary'
        }

        self.attribute_map = {
            'fields': 'fields',
            'results': 'results',
            'summary': 'summary'
        }

        self._fields = None
        self._results = None
        self._summary = None

    @property
    def fields(self):
        """
        Gets the fields of this ClusterLogsSummary.
        List of log field schema information.


        :return: The fields of this ClusterLogsSummary.
        :rtype: list[oci.aidataplatform_dp.models.FieldInfo]
        """
        return self._fields

    @fields.setter
    def fields(self, fields):
        """
        Sets the fields of this ClusterLogsSummary.
        List of log field schema information.


        :param fields: The fields of this ClusterLogsSummary.
        :type: list[oci.aidataplatform_dp.models.FieldInfo]
        """
        self._fields = fields

    @property
    def results(self):
        """
        **[Required]** Gets the results of this ClusterLogsSummary.
        List of search results.


        :return: The results of this ClusterLogsSummary.
        :rtype: list[oci.aidataplatform_dp.models.SearchResult]
        """
        return self._results

    @results.setter
    def results(self, results):
        """
        Sets the results of this ClusterLogsSummary.
        List of search results.


        :param results: The results of this ClusterLogsSummary.
        :type: list[oci.aidataplatform_dp.models.SearchResult]
        """
        self._results = results

    @property
    def summary(self):
        """
        **[Required]** Gets the summary of this ClusterLogsSummary.

        :return: The summary of this ClusterLogsSummary.
        :rtype: oci.aidataplatform_dp.models.SearchResultSummary
        """
        return self._summary

    @summary.setter
    def summary(self, summary):
        """
        Sets the summary of this ClusterLogsSummary.

        :param summary: The summary of this ClusterLogsSummary.
        :type: oci.aidataplatform_dp.models.SearchResultSummary
        """
        self._summary = summary

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
