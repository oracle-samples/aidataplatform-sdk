# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class KnowledgeBaseCollection(object):
    """
    Results of a knowledgebase search. Contains both KnowledgeBaseSummary items and other data.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new KnowledgeBaseCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this KnowledgeBaseCollection.
        :type items: list[oci.aidataplatform_dp.models.KnowledgeBaseSummary]

        :param next_start_page:
            The value to assign to the next_start_page property of this KnowledgeBaseCollection.
        :type next_start_page: str

        """
        self.swagger_types = {
            'items': 'list[KnowledgeBaseSummary]',
            'next_start_page': 'str'
        }

        self.attribute_map = {
            'items': 'items',
            'next_start_page': 'nextStartPage'
        }

        self._items = None
        self._next_start_page = None

    @property
    def items(self):
        """
        **[Required]** Gets the items of this KnowledgeBaseCollection.
        List of knowledgeBase Summaries.


        :return: The items of this KnowledgeBaseCollection.
        :rtype: list[oci.aidataplatform_dp.models.KnowledgeBaseSummary]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this KnowledgeBaseCollection.
        List of knowledgeBase Summaries.


        :param items: The items of this KnowledgeBaseCollection.
        :type: list[oci.aidataplatform_dp.models.KnowledgeBaseSummary]
        """
        self._items = items

    @property
    def next_start_page(self):
        """
        Gets the next_start_page of this KnowledgeBaseCollection.
        token for next opc page.


        :return: The next_start_page of this KnowledgeBaseCollection.
        :rtype: str
        """
        return self._next_start_page

    @next_start_page.setter
    def next_start_page(self, next_start_page):
        """
        Sets the next_start_page of this KnowledgeBaseCollection.
        token for next opc page.


        :param next_start_page: The next_start_page of this KnowledgeBaseCollection.
        :type: str
        """
        self._next_start_page = next_start_page

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
