# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyProjectBindings(object):
    """
    A page of ontology-project mapping bindings used to derive data sources.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyProjectBindings object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param binding:
            The value to assign to the binding property of this OntologyProjectBindings.
        :type binding: list[object]

        :param next_page:
            The value to assign to the next_page property of this OntologyProjectBindings.
        :type next_page: str

        """
        self.swagger_types = {
            'binding': 'list[object]',
            'next_page': 'str'
        }
        self.attribute_map = {
            'binding': 'binding',
            'next_page': 'nextPage'
        }
        self._binding = None
        self._next_page = None

    @property
    def binding(self):
        """
        **[Required]** Gets the binding of this OntologyProjectBindings.
        R2RML/RML bindings in the same shape returned by GetDataLakeOntologyEntity.


        :return: The binding of this OntologyProjectBindings.
        :rtype: list[object]
        """
        return self._binding

    @binding.setter
    def binding(self, binding):
        """
        Sets the binding of this OntologyProjectBindings.
        R2RML/RML bindings in the same shape returned by GetDataLakeOntologyEntity.


        :param binding: The binding of this OntologyProjectBindings.
        :type: list[object]
        """
        self._binding = binding

    @property
    def next_page(self):
        """
        Gets the next_page of this OntologyProjectBindings.
        Opaque offset token for the next page, omitted when this is the final page.


        :return: The next_page of this OntologyProjectBindings.
        :rtype: str
        """
        return self._next_page

    @next_page.setter
    def next_page(self, next_page):
        """
        Sets the next_page of this OntologyProjectBindings.
        Opaque offset token for the next page, omitted when this is the final page.


        :param next_page: The next_page of this OntologyProjectBindings.
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
