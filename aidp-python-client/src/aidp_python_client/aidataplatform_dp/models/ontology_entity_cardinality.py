# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyEntityCardinality(object):
    """
    Cardinality resolved from a relationship domain class restriction.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyEntityCardinality object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param min_cardinality:
            The value to assign to the min_cardinality property of this OntologyEntityCardinality.
        :type min_cardinality: int

        :param max_cardinality:
            The value to assign to the max_cardinality property of this OntologyEntityCardinality.
        :type max_cardinality: int

        """
        self.swagger_types = {
            'min_cardinality': 'int',
            'max_cardinality': 'int'
        }

        self.attribute_map = {
            'min_cardinality': 'minCardinality',
            'max_cardinality': 'maxCardinality'
        }

        self._min_cardinality = None
        self._max_cardinality = None

    @property
    def min_cardinality(self):
        """
        **[Required]** Gets the min_cardinality of this OntologyEntityCardinality.

        :return: The min_cardinality of this OntologyEntityCardinality.
        :rtype: int
        """
        return self._min_cardinality

    @min_cardinality.setter
    def min_cardinality(self, min_cardinality):
        """
        Sets the min_cardinality of this OntologyEntityCardinality.

        :param min_cardinality: The min_cardinality of this OntologyEntityCardinality.
        :type: int
        """
        self._min_cardinality = min_cardinality

    @property
    def max_cardinality(self):
        """
        Gets the max_cardinality of this OntologyEntityCardinality.

        :return: The max_cardinality of this OntologyEntityCardinality.
        :rtype: int
        """
        return self._max_cardinality

    @max_cardinality.setter
    def max_cardinality(self, max_cardinality):
        """
        Sets the max_cardinality of this OntologyEntityCardinality.

        :param max_cardinality: The max_cardinality of this OntologyEntityCardinality.
        :type: int
        """
        self._max_cardinality = max_cardinality

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
