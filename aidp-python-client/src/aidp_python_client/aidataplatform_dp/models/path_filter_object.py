# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PathFilterObject(object):
    """
    Filtering parameter that lets the user control how far the lineage is traversed.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PathFilterObject object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param predicates:
            The value to assign to the predicates property of this PathFilterObject.
        :type predicates: oci.aidataplatform_dp.models.PathFilterPredicates

        """
        self.swagger_types = {
            'predicates': 'PathFilterPredicates'
        }

        self.attribute_map = {
            'predicates': 'predicates'
        }

        self._predicates = None

    @property
    def predicates(self):
        """
        **[Required]** Gets the predicates of this PathFilterObject.

        :return: The predicates of this PathFilterObject.
        :rtype: oci.aidataplatform_dp.models.PathFilterPredicates
        """
        return self._predicates

    @predicates.setter
    def predicates(self, predicates):
        """
        Sets the predicates of this PathFilterObject.

        :param predicates: The predicates of this PathFilterObject.
        :type: oci.aidataplatform_dp.models.PathFilterPredicates
        """
        self._predicates = predicates

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
