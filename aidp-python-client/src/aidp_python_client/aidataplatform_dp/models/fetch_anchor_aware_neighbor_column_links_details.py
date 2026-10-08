# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class FetchAnchorAwareNeighborColumnLinksDetails(object):
    """
    Details for anchor-aware neighbor column links.
    """

    #: A constant which can be used with the direction property of a FetchAnchorAwareNeighborColumnLinksDetails.
    #: This constant has a value of "UPSTREAM"
    DIRECTION_UPSTREAM = "UPSTREAM"

    #: A constant which can be used with the direction property of a FetchAnchorAwareNeighborColumnLinksDetails.
    #: This constant has a value of "DOWNSTREAM"
    DIRECTION_DOWNSTREAM = "DOWNSTREAM"

    def __init__(self, **kwargs):
        """
        Initializes a new FetchAnchorAwareNeighborColumnLinksDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param anchor_node_id:
            The value to assign to the anchor_node_id property of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type anchor_node_id: str

        :param node_id:
            The value to assign to the node_id property of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type node_id: str

        :param node_depth:
            The value to assign to the node_depth property of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type node_depth: int

        :param direction:
            The value to assign to the direction property of this FetchAnchorAwareNeighborColumnLinksDetails.
            Allowed values for this property are: "UPSTREAM", "DOWNSTREAM"
        :type direction: str

        :param node_columns:
            The value to assign to the node_columns property of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type node_columns: list[str]

        :param entity_path_node_ids:
            The value to assign to the entity_path_node_ids property of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type entity_path_node_ids: list[str]

        """
        self.swagger_types = {
            'anchor_node_id': 'str',
            'node_id': 'str',
            'node_depth': 'int',
            'direction': 'str',
            'node_columns': 'list[str]',
            'entity_path_node_ids': 'list[str]'
        }

        self.attribute_map = {
            'anchor_node_id': 'anchorNodeId',
            'node_id': 'nodeId',
            'node_depth': 'nodeDepth',
            'direction': 'direction',
            'node_columns': 'nodeColumns',
            'entity_path_node_ids': 'entityPathNodeIds'
        }

        self._anchor_node_id = None
        self._node_id = None
        self._node_depth = None
        self._direction = None
        self._node_columns = None
        self._entity_path_node_ids = None

    @property
    def anchor_node_id(self):
        """
        **[Required]** Gets the anchor_node_id of this FetchAnchorAwareNeighborColumnLinksDetails.
        ID of the active anchor entity.


        :return: The anchor_node_id of this FetchAnchorAwareNeighborColumnLinksDetails.
        :rtype: str
        """
        return self._anchor_node_id

    @anchor_node_id.setter
    def anchor_node_id(self, anchor_node_id):
        """
        Sets the anchor_node_id of this FetchAnchorAwareNeighborColumnLinksDetails.
        ID of the active anchor entity.


        :param anchor_node_id: The anchor_node_id of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type: str
        """
        self._anchor_node_id = anchor_node_id

    @property
    def node_id(self):
        """
        **[Required]** Gets the node_id of this FetchAnchorAwareNeighborColumnLinksDetails.
        ID of the expanded non-anchor entity.


        :return: The node_id of this FetchAnchorAwareNeighborColumnLinksDetails.
        :rtype: str
        """
        return self._node_id

    @node_id.setter
    def node_id(self, node_id):
        """
        Sets the node_id of this FetchAnchorAwareNeighborColumnLinksDetails.
        ID of the expanded non-anchor entity.


        :param node_id: The node_id of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type: str
        """
        self._node_id = node_id

    @property
    def node_depth(self):
        """
        **[Required]** Gets the node_depth of this FetchAnchorAwareNeighborColumnLinksDetails.
        Lineage depth of the node from the anchor, used to bound traversal.


        :return: The node_depth of this FetchAnchorAwareNeighborColumnLinksDetails.
        :rtype: int
        """
        return self._node_depth

    @node_depth.setter
    def node_depth(self, node_depth):
        """
        Sets the node_depth of this FetchAnchorAwareNeighborColumnLinksDetails.
        Lineage depth of the node from the anchor, used to bound traversal.


        :param node_depth: The node_depth of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type: int
        """
        self._node_depth = node_depth

    @property
    def direction(self):
        """
        **[Required]** Gets the direction of this FetchAnchorAwareNeighborColumnLinksDetails.
        Direction of the non-anchor entity relative to the anchor.

        Allowed values for this property are: "UPSTREAM", "DOWNSTREAM"


        :return: The direction of this FetchAnchorAwareNeighborColumnLinksDetails.
        :rtype: str
        """
        return self._direction

    @direction.setter
    def direction(self, direction):
        """
        Sets the direction of this FetchAnchorAwareNeighborColumnLinksDetails.
        Direction of the non-anchor entity relative to the anchor.


        :param direction: The direction of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type: str
        """
        allowed_values = ["UPSTREAM", "DOWNSTREAM"]
        if not value_allowed_none_or_none_sentinel(direction, allowed_values):
            raise ValueError(
                "Invalid value for `direction`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._direction = direction

    @property
    def node_columns(self):
        """
        **[Required]** Gets the node_columns of this FetchAnchorAwareNeighborColumnLinksDetails.
        Column IDs to include in both response link collections.


        :return: The node_columns of this FetchAnchorAwareNeighborColumnLinksDetails.
        :rtype: list[str]
        """
        return self._node_columns

    @node_columns.setter
    def node_columns(self, node_columns):
        """
        Sets the node_columns of this FetchAnchorAwareNeighborColumnLinksDetails.
        Column IDs to include in both response link collections.


        :param node_columns: The node_columns of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type: list[str]
        """
        self._node_columns = node_columns

    @property
    def entity_path_node_ids(self):
        """
        **[Required]** Gets the entity_path_node_ids of this FetchAnchorAwareNeighborColumnLinksDetails.
        Entity IDs constraining the route; must include nodeId and anchorNodeId.


        :return: The entity_path_node_ids of this FetchAnchorAwareNeighborColumnLinksDetails.
        :rtype: list[str]
        """
        return self._entity_path_node_ids

    @entity_path_node_ids.setter
    def entity_path_node_ids(self, entity_path_node_ids):
        """
        Sets the entity_path_node_ids of this FetchAnchorAwareNeighborColumnLinksDetails.
        Entity IDs constraining the route; must include nodeId and anchorNodeId.


        :param entity_path_node_ids: The entity_path_node_ids of this FetchAnchorAwareNeighborColumnLinksDetails.
        :type: list[str]
        """
        self._entity_path_node_ids = entity_path_node_ids

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
