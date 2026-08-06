# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class ObjectLineage(object):
    """
    Lineage for an object.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new ObjectLineage object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param nodes:
            The value to assign to the nodes property of this ObjectLineage.
        :type nodes: list[oci.aidataplatform_dp.models.LineageObject]

        :param links:
            The value to assign to the links property of this ObjectLineage.
        :type links: list[oci.aidataplatform_dp.models.LineageRelationship]

        """
        self.swagger_types = {
            'nodes': 'list[LineageObject]',
            'links': 'list[LineageRelationship]'
        }

        self.attribute_map = {
            'nodes': 'nodes',
            'links': 'links'
        }

        self._nodes = None
        self._links = None

    @property
    def nodes(self):
        """
        **[Required]** Gets the nodes of this ObjectLineage.
        Set of links that are involved in the lineage.


        :return: The nodes of this ObjectLineage.
        :rtype: list[oci.aidataplatform_dp.models.LineageObject]
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes):
        """
        Sets the nodes of this ObjectLineage.
        Set of links that are involved in the lineage.


        :param nodes: The nodes of this ObjectLineage.
        :type: list[oci.aidataplatform_dp.models.LineageObject]
        """
        self._nodes = nodes

    @property
    def links(self):
        """
        **[Required]** Gets the links of this ObjectLineage.
        Set of links between the objects in the 'objects' set.


        :return: The links of this ObjectLineage.
        :rtype: list[oci.aidataplatform_dp.models.LineageRelationship]
        """
        return self._links

    @links.setter
    def links(self, links):
        """
        Sets the links of this ObjectLineage.
        Set of links between the objects in the 'objects' set.


        :param links: The links of this ObjectLineage.
        :type: list[oci.aidataplatform_dp.models.LineageRelationship]
        """
        self._links = links

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
