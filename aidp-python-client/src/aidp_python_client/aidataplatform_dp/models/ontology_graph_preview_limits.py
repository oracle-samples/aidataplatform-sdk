# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPreviewLimits(object):
    """
    Graph preview limits and whether they were reached.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPreviewLimits object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param max_nodes:
            The value to assign to the max_nodes property of this OntologyGraphPreviewLimits.
        :type max_nodes: int

        :param max_edges:
            The value to assign to the max_edges property of this OntologyGraphPreviewLimits.
        :type max_edges: int

        :param reached_node_limit:
            The value to assign to the reached_node_limit property of this OntologyGraphPreviewLimits.
        :type reached_node_limit: bool

        :param reached_edge_limit:
            The value to assign to the reached_edge_limit property of this OntologyGraphPreviewLimits.
        :type reached_edge_limit: bool

        """
        self.swagger_types = {
            'max_nodes': 'int',
            'max_edges': 'int',
            'reached_node_limit': 'bool',
            'reached_edge_limit': 'bool'
        }

        self.attribute_map = {
            'max_nodes': 'maxNodes',
            'max_edges': 'maxEdges',
            'reached_node_limit': 'reachedNodeLimit',
            'reached_edge_limit': 'reachedEdgeLimit'
        }

        self._max_nodes = None
        self._max_edges = None
        self._reached_node_limit = None
        self._reached_edge_limit = None

    @property
    def max_nodes(self):
        """
        **[Required]** Gets the max_nodes of this OntologyGraphPreviewLimits.

        :return: The max_nodes of this OntologyGraphPreviewLimits.
        :rtype: int
        """
        return self._max_nodes

    @max_nodes.setter
    def max_nodes(self, max_nodes):
        """
        Sets the max_nodes of this OntologyGraphPreviewLimits.

        :param max_nodes: The max_nodes of this OntologyGraphPreviewLimits.
        :type: int
        """
        self._max_nodes = max_nodes

    @property
    def max_edges(self):
        """
        **[Required]** Gets the max_edges of this OntologyGraphPreviewLimits.

        :return: The max_edges of this OntologyGraphPreviewLimits.
        :rtype: int
        """
        return self._max_edges

    @max_edges.setter
    def max_edges(self, max_edges):
        """
        Sets the max_edges of this OntologyGraphPreviewLimits.

        :param max_edges: The max_edges of this OntologyGraphPreviewLimits.
        :type: int
        """
        self._max_edges = max_edges

    @property
    def reached_node_limit(self):
        """
        **[Required]** Gets the reached_node_limit of this OntologyGraphPreviewLimits.

        :return: The reached_node_limit of this OntologyGraphPreviewLimits.
        :rtype: bool
        """
        return self._reached_node_limit

    @reached_node_limit.setter
    def reached_node_limit(self, reached_node_limit):
        """
        Sets the reached_node_limit of this OntologyGraphPreviewLimits.

        :param reached_node_limit: The reached_node_limit of this OntologyGraphPreviewLimits.
        :type: bool
        """
        self._reached_node_limit = reached_node_limit

    @property
    def reached_edge_limit(self):
        """
        **[Required]** Gets the reached_edge_limit of this OntologyGraphPreviewLimits.

        :return: The reached_edge_limit of this OntologyGraphPreviewLimits.
        :rtype: bool
        """
        return self._reached_edge_limit

    @reached_edge_limit.setter
    def reached_edge_limit(self, reached_edge_limit):
        """
        Sets the reached_edge_limit of this OntologyGraphPreviewLimits.

        :param reached_edge_limit: The reached_edge_limit of this OntologyGraphPreviewLimits.
        :type: bool
        """
        self._reached_edge_limit = reached_edge_limit

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
