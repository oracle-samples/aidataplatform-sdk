# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectStatusCollection(object):
    """
    OntologyProjectStatusCollection model.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectStatusCollection object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param items:
            The value to assign to the items property of this OntologyProjectStatusCollection.
        :type items: list[oci.aidataplatform_dp.models.OntologyProjectStatus]

        :param next_page:
            The value to assign to the next_page property of this OntologyProjectStatusCollection.
        :type next_page: str

        """
        self.swagger_types = {
            'items': 'list[OntologyProjectStatus]',
            'next_page': 'str'
        }

        self.attribute_map = {
            'items': 'items',
            'next_page': 'nextPage'
        }

        self._items = None
        self._next_page = None

    @property
    def items(self):
        """
        **[Required]** Gets the items of this OntologyProjectStatusCollection.

        :return: The items of this OntologyProjectStatusCollection.
        :rtype: list[oci.aidataplatform_dp.models.OntologyProjectStatus]
        """
        return self._items

    @items.setter
    def items(self, items):
        """
        Sets the items of this OntologyProjectStatusCollection.

        :param items: The items of this OntologyProjectStatusCollection.
        :type: list[oci.aidataplatform_dp.models.OntologyProjectStatus]
        """
        self._items = items

    @property
    def next_page(self):
        """
        Gets the next_page of this OntologyProjectStatusCollection.

        :return: The next_page of this OntologyProjectStatusCollection.
        :rtype: str
        """
        return self._next_page

    @next_page.setter
    def next_page(self, next_page):
        """
        Sets the next_page of this OntologyProjectStatusCollection.

        :param next_page: The next_page of this OntologyProjectStatusCollection.
        :type: str
        """
        self._next_page = next_page

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
