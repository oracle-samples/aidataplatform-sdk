# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPath(object):
    """
    Path between two ontology graph nodes.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPath object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param nodes:
            The value to assign to the nodes property of this OntologyGraphPath.
        :type nodes: list[oci.aidataplatform_dp.models.OntologyGraphNode]

        :param edges:
            The value to assign to the edges property of this OntologyGraphPath.
        :type edges: list[oci.aidataplatform_dp.models.OntologyGraphEdge]

        """
        self.swagger_types = {
            'nodes': 'list[OntologyGraphNode]',
            'edges': 'list[OntologyGraphEdge]'
        }

        self.attribute_map = {
            'nodes': 'nodes',
            'edges': 'edges'
        }

        self._nodes = None
        self._edges = None

    @property
    def nodes(self):
        """
        **[Required]** Gets the nodes of this OntologyGraphPath.

        :return: The nodes of this OntologyGraphPath.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphNode]
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes):
        """
        Sets the nodes of this OntologyGraphPath.

        :param nodes: The nodes of this OntologyGraphPath.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphNode]
        """
        self._nodes = nodes

    @property
    def edges(self):
        """
        **[Required]** Gets the edges of this OntologyGraphPath.

        :return: The edges of this OntologyGraphPath.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphEdge]
        """
        return self._edges

    @edges.setter
    def edges(self, edges):
        """
        Sets the edges of this OntologyGraphPath.

        :param edges: The edges of this OntologyGraphPath.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphEdge]
        """
        self._edges = edges

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
