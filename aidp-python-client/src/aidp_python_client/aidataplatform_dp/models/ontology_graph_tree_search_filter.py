# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphTreeSearchFilter(object):
    """
    Search filter for design-time ontology tree traversal.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphTreeSearchFilter object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param attribute:
            The value to assign to the attribute property of this OntologyGraphTreeSearchFilter.
        :type attribute: str

        :param operator:
            The value to assign to the operator property of this OntologyGraphTreeSearchFilter.
        :type operator: str

        :param values:
            The value to assign to the values property of this OntologyGraphTreeSearchFilter.
        :type values: list[str]

        """
        self.swagger_types = {
            'attribute': 'str',
            'operator': 'str',
            'values': 'list[str]'
        }

        self.attribute_map = {
            'attribute': 'attribute',
            'operator': 'operator',
            'values': 'values'
        }

        self._attribute = None
        self._operator = None
        self._values = None

    @property
    def attribute(self):
        """
        **[Required]** Gets the attribute of this OntologyGraphTreeSearchFilter.
        Filter attribute. Supported values include parentUid, type, name, hitsPerPage, sortField, sortOrder, and pageIndex.


        :return: The attribute of this OntologyGraphTreeSearchFilter.
        :rtype: str
        """
        return self._attribute

    @attribute.setter
    def attribute(self, attribute):
        """
        Sets the attribute of this OntologyGraphTreeSearchFilter.
        Filter attribute. Supported values include parentUid, type, name, hitsPerPage, sortField, sortOrder, and pageIndex.


        :param attribute: The attribute of this OntologyGraphTreeSearchFilter.
        :type: str
        """
        self._attribute = attribute

    @property
    def operator(self):
        """
        **[Required]** Gets the operator of this OntologyGraphTreeSearchFilter.
        Filter operator. The current search contract supports '='.


        :return: The operator of this OntologyGraphTreeSearchFilter.
        :rtype: str
        """
        return self._operator

    @operator.setter
    def operator(self, operator):
        """
        Sets the operator of this OntologyGraphTreeSearchFilter.
        Filter operator. The current search contract supports '='.


        :param operator: The operator of this OntologyGraphTreeSearchFilter.
        :type: str
        """
        self._operator = operator

    @property
    def values(self):
        """
        Gets the values of this OntologyGraphTreeSearchFilter.
        Filter values. Numeric pagination values may be sent as strings.


        :return: The values of this OntologyGraphTreeSearchFilter.
        :rtype: list[str]
        """
        return self._values

    @values.setter
    def values(self, values):
        """
        Sets the values of this OntologyGraphTreeSearchFilter.
        Filter values. Numeric pagination values may be sent as strings.


        :param values: The values of this OntologyGraphTreeSearchFilter.
        :type: list[str]
        """
        self._values = values

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
