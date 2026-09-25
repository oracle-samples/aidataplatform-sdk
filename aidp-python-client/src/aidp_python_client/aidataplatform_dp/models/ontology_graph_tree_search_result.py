# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphTreeSearchResult(object):
    """
    Search API envelope for design-time ontology tree traversal.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphTreeSearchResult object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param success:
            The value to assign to the success property of this OntologyGraphTreeSearchResult.
        :type success: bool

        :param response:
            The value to assign to the response property of this OntologyGraphTreeSearchResult.
        :type response: oci.aidataplatform_dp.models.OntologyGraphTreeSearchResultSet

        """
        self.swagger_types = {
            'success': 'bool',
            'response': 'OntologyGraphTreeSearchResultSet'
        }

        self.attribute_map = {
            'success': 'success',
            'response': 'response'
        }

        self._success = None
        self._response = None

    @property
    def success(self):
        """
        **[Required]** Gets the success of this OntologyGraphTreeSearchResult.

        :return: The success of this OntologyGraphTreeSearchResult.
        :rtype: bool
        """
        return self._success

    @success.setter
    def success(self, success):
        """
        Sets the success of this OntologyGraphTreeSearchResult.

        :param success: The success of this OntologyGraphTreeSearchResult.
        :type: bool
        """
        self._success = success

    @property
    def response(self):
        """
        **[Required]** Gets the response of this OntologyGraphTreeSearchResult.

        :return: The response of this OntologyGraphTreeSearchResult.
        :rtype: oci.aidataplatform_dp.models.OntologyGraphTreeSearchResultSet
        """
        return self._response

    @response.setter
    def response(self, response):
        """
        Sets the response of this OntologyGraphTreeSearchResult.

        :param response: The response of this OntologyGraphTreeSearchResult.
        :type: oci.aidataplatform_dp.models.OntologyGraphTreeSearchResultSet
        """
        self._response = response

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
