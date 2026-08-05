# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PassThroughNodeFilterPredicate(object):
    """
    Includes only lineage paths that pass through the specified intermediate node.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PassThroughNodeFilterPredicate object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param id:
            The value to assign to the id property of this PassThroughNodeFilterPredicate.
        :type id: str

        :param depth:
            The value to assign to the depth property of this PassThroughNodeFilterPredicate.
        :type depth: int

        """
        self.swagger_types = {
            'id': 'str',
            'depth': 'int'
        }

        self.attribute_map = {
            'id': 'id',
            'depth': 'depth'
        }

        self._id = None
        self._depth = None

    @property
    def id(self):
        """
        Gets the id of this PassThroughNodeFilterPredicate.
        ID of the pass through node.


        :return: The id of this PassThroughNodeFilterPredicate.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id):
        """
        Sets the id of this PassThroughNodeFilterPredicate.
        ID of the pass through node.


        :param id: The id of this PassThroughNodeFilterPredicate.
        :type: str
        """
        self._id = id

    @property
    def depth(self):
        """
        Gets the depth of this PassThroughNodeFilterPredicate.
        Depth of the pass through node from anchor node.


        :return: The depth of this PassThroughNodeFilterPredicate.
        :rtype: int
        """
        return self._depth

    @depth.setter
    def depth(self, depth):
        """
        Sets the depth of this PassThroughNodeFilterPredicate.
        Depth of the pass through node from anchor node.


        :param depth: The depth of this PassThroughNodeFilterPredicate.
        :type: int
        """
        self._depth = depth

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
