# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AnchorAwareNeighborColumnLinks(object):
    """
    Neighbor links and anchor-column associations for supplied columns.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AnchorAwareNeighborColumnLinks object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param nodes:
            The value to assign to the nodes property of this AnchorAwareNeighborColumnLinks.
        :type nodes: list[oci.aidataplatform_dp.models.LineageObject]

        :param neighbor_links:
            The value to assign to the neighbor_links property of this AnchorAwareNeighborColumnLinks.
        :type neighbor_links: list[oci.aidataplatform_dp.models.LineageRelationship]

        :param anchor_column_links:
            The value to assign to the anchor_column_links property of this AnchorAwareNeighborColumnLinks.
        :type anchor_column_links: list[oci.aidataplatform_dp.models.AnchorColumnLink]

        """
        self.swagger_types = {
            'nodes': 'list[LineageObject]',
            'neighbor_links': 'list[LineageRelationship]',
            'anchor_column_links': 'list[AnchorColumnLink]'
        }

        self.attribute_map = {
            'nodes': 'nodes',
            'neighbor_links': 'neighborLinks',
            'anchor_column_links': 'anchorColumnLinks'
        }

        self._nodes = None
        self._neighbor_links = None
        self._anchor_column_links = None

    @property
    def nodes(self):
        """
        **[Required]** Gets the nodes of this AnchorAwareNeighborColumnLinks.
        Nodes referenced by neighborLinks.


        :return: The nodes of this AnchorAwareNeighborColumnLinks.
        :rtype: list[oci.aidataplatform_dp.models.LineageObject]
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes):
        """
        Sets the nodes of this AnchorAwareNeighborColumnLinks.
        Nodes referenced by neighborLinks.


        :param nodes: The nodes of this AnchorAwareNeighborColumnLinks.
        :type: list[oci.aidataplatform_dp.models.LineageObject]
        """
        self._nodes = nodes

    @property
    def neighbor_links(self):
        """
        **[Required]** Gets the neighbor_links of this AnchorAwareNeighborColumnLinks.
        Immediate links adjacent to supplied columns, including proven toward-anchor links.


        :return: The neighbor_links of this AnchorAwareNeighborColumnLinks.
        :rtype: list[oci.aidataplatform_dp.models.LineageRelationship]
        """
        return self._neighbor_links

    @neighbor_links.setter
    def neighbor_links(self, neighbor_links):
        """
        Sets the neighbor_links of this AnchorAwareNeighborColumnLinks.
        Immediate links adjacent to supplied columns, including proven toward-anchor links.


        :param neighbor_links: The neighbor_links of this AnchorAwareNeighborColumnLinks.
        :type: list[oci.aidataplatform_dp.models.LineageRelationship]
        """
        self._neighbor_links = neighbor_links

    @property
    def anchor_column_links(self):
        """
        **[Required]** Gets the anchor_column_links of this AnchorAwareNeighborColumnLinks.
        Derived supplied-column to anchor-column associations.


        :return: The anchor_column_links of this AnchorAwareNeighborColumnLinks.
        :rtype: list[oci.aidataplatform_dp.models.AnchorColumnLink]
        """
        return self._anchor_column_links

    @anchor_column_links.setter
    def anchor_column_links(self, anchor_column_links):
        """
        Sets the anchor_column_links of this AnchorAwareNeighborColumnLinks.
        Derived supplied-column to anchor-column associations.


        :param anchor_column_links: The anchor_column_links of this AnchorAwareNeighborColumnLinks.
        :type: list[oci.aidataplatform_dp.models.AnchorColumnLink]
        """
        self._anchor_column_links = anchor_column_links

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
