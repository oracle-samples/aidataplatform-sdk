# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphTreeSearchResultSet(object):
    """
    Paginated design-time ontology tree search result set.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphTreeSearchResultSet object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param max_results:
            The value to assign to the max_results property of this OntologyGraphTreeSearchResultSet.
        :type max_results: int

        :param hits_per_page:
            The value to assign to the hits_per_page property of this OntologyGraphTreeSearchResultSet.
        :type hits_per_page: int

        :param page_index:
            The value to assign to the page_index property of this OntologyGraphTreeSearchResultSet.
        :type page_index: int

        :param results:
            The value to assign to the results property of this OntologyGraphTreeSearchResultSet.
        :type results: list[oci.aidataplatform_dp.models.OntologyGraphTreeSearchNode]

        """
        self.swagger_types = {
            'max_results': 'int',
            'hits_per_page': 'int',
            'page_index': 'int',
            'results': 'list[OntologyGraphTreeSearchNode]'
        }

        self.attribute_map = {
            'max_results': 'maxResults',
            'hits_per_page': 'hitsPerPage',
            'page_index': 'pageIndex',
            'results': 'results'
        }

        self._max_results = None
        self._hits_per_page = None
        self._page_index = None
        self._results = None

    @property
    def max_results(self):
        """
        **[Required]** Gets the max_results of this OntologyGraphTreeSearchResultSet.

        :return: The max_results of this OntologyGraphTreeSearchResultSet.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results):
        """
        Sets the max_results of this OntologyGraphTreeSearchResultSet.

        :param max_results: The max_results of this OntologyGraphTreeSearchResultSet.
        :type: int
        """
        self._max_results = max_results

    @property
    def hits_per_page(self):
        """
        **[Required]** Gets the hits_per_page of this OntologyGraphTreeSearchResultSet.

        :return: The hits_per_page of this OntologyGraphTreeSearchResultSet.
        :rtype: int
        """
        return self._hits_per_page

    @hits_per_page.setter
    def hits_per_page(self, hits_per_page):
        """
        Sets the hits_per_page of this OntologyGraphTreeSearchResultSet.

        :param hits_per_page: The hits_per_page of this OntologyGraphTreeSearchResultSet.
        :type: int
        """
        self._hits_per_page = hits_per_page

    @property
    def page_index(self):
        """
        **[Required]** Gets the page_index of this OntologyGraphTreeSearchResultSet.

        :return: The page_index of this OntologyGraphTreeSearchResultSet.
        :rtype: int
        """
        return self._page_index

    @page_index.setter
    def page_index(self, page_index):
        """
        Sets the page_index of this OntologyGraphTreeSearchResultSet.

        :param page_index: The page_index of this OntologyGraphTreeSearchResultSet.
        :type: int
        """
        self._page_index = page_index

    @property
    def results(self):
        """
        **[Required]** Gets the results of this OntologyGraphTreeSearchResultSet.

        :return: The results of this OntologyGraphTreeSearchResultSet.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphTreeSearchNode]
        """
        return self._results

    @results.setter
    def results(self, results):
        """
        Sets the results of this OntologyGraphTreeSearchResultSet.

        :param results: The results of this OntologyGraphTreeSearchResultSet.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphTreeSearchNode]
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
