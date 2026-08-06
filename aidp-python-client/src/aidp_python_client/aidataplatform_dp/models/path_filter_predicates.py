# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class PathFilterPredicates(object):
    """
    List of conditions
    """

    def __init__(self, **kwargs):
        """
        Initializes a new PathFilterPredicates object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param pass_through_node:
            The value to assign to the pass_through_node property of this PathFilterPredicates.
        :type pass_through_node: oci.aidataplatform_dp.models.PassThroughNodeFilterPredicate

        :param anchor_node_columns_in:
            The value to assign to the anchor_node_columns_in property of this PathFilterPredicates.
        :type anchor_node_columns_in: list[str]

        :param parent_id_in:
            The value to assign to the parent_id_in property of this PathFilterPredicates.
        :type parent_id_in: list[str]

        """
        self.swagger_types = {
            'pass_through_node': 'PassThroughNodeFilterPredicate',
            'anchor_node_columns_in': 'list[str]',
            'parent_id_in': 'list[str]'
        }

        self.attribute_map = {
            'pass_through_node': 'passThroughNode',
            'anchor_node_columns_in': 'anchorNodeColumnsIn',
            'parent_id_in': 'parentIdIn'
        }

        self._pass_through_node = None
        self._anchor_node_columns_in = None
        self._parent_id_in = None

    @property
    def pass_through_node(self):
        """
        Gets the pass_through_node of this PathFilterPredicates.

        :return: The pass_through_node of this PathFilterPredicates.
        :rtype: oci.aidataplatform_dp.models.PassThroughNodeFilterPredicate
        """
        return self._pass_through_node

    @pass_through_node.setter
    def pass_through_node(self, pass_through_node):
        """
        Sets the pass_through_node of this PathFilterPredicates.

        :param pass_through_node: The pass_through_node of this PathFilterPredicates.
        :type: oci.aidataplatform_dp.models.PassThroughNodeFilterPredicate
        """
        self._pass_through_node = pass_through_node

    @property
    def anchor_node_columns_in(self):
        """
        Gets the anchor_node_columns_in of this PathFilterPredicates.
        Includes only lineage paths where the anchor node's column is one of the specified values, and column-level traversal starts only from these anchor columns.


        :return: The anchor_node_columns_in of this PathFilterPredicates.
        :rtype: list[str]
        """
        return self._anchor_node_columns_in

    @anchor_node_columns_in.setter
    def anchor_node_columns_in(self, anchor_node_columns_in):
        """
        Sets the anchor_node_columns_in of this PathFilterPredicates.
        Includes only lineage paths where the anchor node's column is one of the specified values, and column-level traversal starts only from these anchor columns.


        :param anchor_node_columns_in: The anchor_node_columns_in of this PathFilterPredicates.
        :type: list[str]
        """
        self._anchor_node_columns_in = anchor_node_columns_in

    @property
    def parent_id_in(self):
        """
        Gets the parent_id_in of this PathFilterPredicates.
        Includes only those lineage paths in which each node's parent ID is present in the specified list.


        :return: The parent_id_in of this PathFilterPredicates.
        :rtype: list[str]
        """
        return self._parent_id_in

    @parent_id_in.setter
    def parent_id_in(self, parent_id_in):
        """
        Sets the parent_id_in of this PathFilterPredicates.
        Includes only those lineage paths in which each node's parent ID is present in the specified list.


        :param parent_id_in: The parent_id_in of this PathFilterPredicates.
        :type: list[str]
        """
        self._parent_id_in = parent_id_in

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
