# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OntologyGraphPreviewModel(object):
    """
    Graph model rendered by the Ontology Manager UI.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OntologyGraphPreviewModel object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param nodes:
            The value to assign to the nodes property of this OntologyGraphPreviewModel.
        :type nodes: list[oci.aidataplatform_dp.models.OntologyGraphPreviewNode]

        :param edges:
            The value to assign to the edges property of this OntologyGraphPreviewModel.
        :type edges: list[oci.aidataplatform_dp.models.OntologyGraphPreviewEdge]

        """
        self.swagger_types = {
            'nodes': 'list[OntologyGraphPreviewNode]',
            'edges': 'list[OntologyGraphPreviewEdge]'
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
        **[Required]** Gets the nodes of this OntologyGraphPreviewModel.

        :return: The nodes of this OntologyGraphPreviewModel.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphPreviewNode]
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes):
        """
        Sets the nodes of this OntologyGraphPreviewModel.

        :param nodes: The nodes of this OntologyGraphPreviewModel.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphPreviewNode]
        """
        self._nodes = nodes

    @property
    def edges(self):
        """
        **[Required]** Gets the edges of this OntologyGraphPreviewModel.

        :return: The edges of this OntologyGraphPreviewModel.
        :rtype: list[oci.aidataplatform_dp.models.OntologyGraphPreviewEdge]
        """
        return self._edges

    @edges.setter
    def edges(self, edges):
        """
        Sets the edges of this OntologyGraphPreviewModel.

        :param edges: The edges of this OntologyGraphPreviewModel.
        :type: list[oci.aidataplatform_dp.models.OntologyGraphPreviewEdge]
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
