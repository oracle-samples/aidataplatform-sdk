# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphExpansion(object):
    """
    Nodes and edges returned by graph exploration.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphExpansion object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param nodes:
            The value to assign to the nodes property of this OntologyGraphExpansion.
        :type nodes: list[oci.aidataplatform_dp.models.OntologyGraphNode]

        :param edges:
            The value to assign to the edges property of this OntologyGraphExpansion.
        :type edges: list[oci.aidataplatform_dp.models.OntologyGraphEdge]

        :param truncated:
            The value to assign to the truncated property of this OntologyGraphExpansion.
        :type truncated: bool

        """
        self.swagger_types = {
            'nodes': 'list[OntologyGraphNode]',
            'edges': 'list[OntologyGraphEdge]',
            'truncated': 'bool'
        }

        self.attribute_map = {
            'nodes': 'nodes',
            'edges': 'edges',
            'truncated': 'truncated'
        }

        self._nodes = None
        self._edges = None
        self._truncated = None

    @property
    def nodes(self):
        """
        **[Required]** Gets the nodes of this OntologyGraphExpansion.

        :return: The nodes of this OntologyGraphExpansion.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphNode]
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes):
        """
        Sets the nodes of this OntologyGraphExpansion.

        :param nodes: The nodes of this OntologyGraphExpansion.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphNode]
        """
        self._nodes = nodes

    @property
    def edges(self):
        """
        **[Required]** Gets the edges of this OntologyGraphExpansion.

        :return: The edges of this OntologyGraphExpansion.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphEdge]
        """
        return self._edges

    @edges.setter
    def edges(self, edges):
        """
        Sets the edges of this OntologyGraphExpansion.

        :param edges: The edges of this OntologyGraphExpansion.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphEdge]
        """
        self._edges = edges

    @property
    def truncated(self):
        """
        Gets the truncated of this OntologyGraphExpansion.

        :return: The truncated of this OntologyGraphExpansion.
        :rtype: bool
        """
        return self._truncated

    @truncated.setter
    def truncated(self, truncated):
        """
        Sets the truncated of this OntologyGraphExpansion.

        :param truncated: The truncated of this OntologyGraphExpansion.
        :type: bool
        """
        self._truncated = truncated

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
