# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphSummary(object):
    """
    Project-wide semantic counts, independent of the bounded graph slice.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphSummary object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param class_count:
            The value to assign to the class_count property of this OntologyGraphSummary.
        :type class_count: int

        :param property_count:
            The value to assign to the property_count property of this OntologyGraphSummary.
        :type property_count: int

        :param relationship_count:
            The value to assign to the relationship_count property of this OntologyGraphSummary.
        :type relationship_count: int

        """
        self.swagger_types = {
            'class_count': 'int',
            'property_count': 'int',
            'relationship_count': 'int'
        }
        self.attribute_map = {
            'class_count': 'classCount',
            'property_count': 'propertyCount',
            'relationship_count': 'relationshipCount'
        }
        self._class_count = None
        self._property_count = None
        self._relationship_count = None

    @property
    def class_count(self):
        """
        **[Required]** Gets the class_count of this OntologyGraphSummary.

        :return: The class_count of this OntologyGraphSummary.
        :rtype: int
        """
        return self._class_count

    @class_count.setter
    def class_count(self, class_count):
        """
        Sets the class_count of this OntologyGraphSummary.

        :param class_count: The class_count of this OntologyGraphSummary.
        :type: int
        """
        self._class_count = class_count

    @property
    def property_count(self):
        """
        **[Required]** Gets the property_count of this OntologyGraphSummary.

        :return: The property_count of this OntologyGraphSummary.
        :rtype: int
        """
        return self._property_count

    @property_count.setter
    def property_count(self, property_count):
        """
        Sets the property_count of this OntologyGraphSummary.

        :param property_count: The property_count of this OntologyGraphSummary.
        :type: int
        """
        self._property_count = property_count

    @property
    def relationship_count(self):
        """
        **[Required]** Gets the relationship_count of this OntologyGraphSummary.

        :return: The relationship_count of this OntologyGraphSummary.
        :rtype: int
        """
        return self._relationship_count

    @relationship_count.setter
    def relationship_count(self, relationship_count):
        """
        Sets the relationship_count of this OntologyGraphSummary.

        :param relationship_count: The relationship_count of this OntologyGraphSummary.
        :type: int
        """
        self._relationship_count = relationship_count

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
